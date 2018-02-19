//
//  LRCookieExpirationHandler.m
//  Liferay iOS SDK
//
//  Created by Victor Galan on 16/02/2018.
//  Copyright © 2018 Liferay Inc. All rights reserved.
//

#import "LRCookieExpirationHandler.h"
#import "LRCookieAuthentication.h"
#import "LRCookieSignIn.h"
#import "LRBlockCallback.h"
#import "LRCookieAuthentication+Private.h"


@interface LRCookieExpirationHandler() {
	dispatch_semaphore_t syncSemaphore;
}

@end

@implementation LRCookieExpirationHandler

+ (LRCookieExpirationHandler *)shared {
	static LRCookieExpirationHandler *sharedCookieExpirationHandler;
	static dispatch_once_t onceToken;
	dispatch_once(&onceToken, ^{
		sharedCookieExpirationHandler = [[self alloc] init];
	});

	return sharedCookieExpirationHandler;
}

- (instancetype)init {
	self = [super init];

	if (self) {
		syncSemaphore = dispatch_semaphore_create(1);
	}

	return self;
}

- (LRSession *)reloadCookieLoginIfNeeded: (LRSession *) session
	withCompletionHandler:(void (^)(LRSession *))completionHandler {

	LRCookieAuthentication *auth = (LRCookieAuthentication *) session.authentication;

	// We have to deal only with Cookie authentication and expired
	if ([session.authentication isKindOfClass:[LRCookieAuthentication class]]
		&& auth.shouldHandleExpiration) {

		dispatch_semaphore_wait(syncSemaphore, DISPATCH_TIME_FOREVER);
		if ([self shouldCookieBeUpdated: session.authentication]) {
			if (completionHandler == nil) {
				LRSession *cookieSession =  [LRCookieSignIn
					signInWithSession:session callback:nil challengeBlock:nil];
				session.authentication = session.authentication;
				[self resetLastRefreshTimeAndUnlock: session.authentication];
				return session;
			}
			else {
				LRBlockCallback *callback = [[LRBlockCallback alloc]
					initWithSuccess:^(LRSession *cookieSession) {
					session.authentication = cookieSession.authentication;
					[self resetLastRefreshTimeAndUnlock: session.authentication];
					completionHandler((LRSession *) cookieSession);
				} failure:^(NSError * error) {
					[self resetLastRefreshTimeAndUnlock: session.authentication];
					completionHandler((LRSession *) session);
				}];

				[LRCookieSignIn signInWithSession:session
					callback:callback challengeBlock:nil];

				return nil;
			}
		}
		else {
			dispatch_semaphore_signal(syncSemaphore);
		}
	}

	if (completionHandler == nil) {
		return session;
	}
	else {
		completionHandler(session);
		return nil;
	}
}

- (BOOL)shouldCookieBeUpdated:(LRCookieAuthentication *)cookieAuth {
	NSTimeInterval now = [[NSDate date] timeIntervalSince1970];

	if (now - cookieAuth.lastCookieRefresh > cookieAuth.cookieExpirationTime) {
		return YES;
	}

	return NO;
}

- (void)resetLastRefreshTimeAndUnlock:(LRCookieAuthentication *)cookieAuth {
	cookieAuth.lastCookieRefresh = [[NSDate date] timeIntervalSince1970];
	dispatch_semaphore_signal(syncSemaphore);
}


@end
