/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

#import "LRCookieExpirationHandler.h"
#import "LRCookieAuthentication.h"
#import "LRCookieSignIn.h"
#import "LRBlockCallback.h"


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
				[self copyConfigurationValuesFromOldAuth:session.authentication
					toNewAuth:cookieSession.authentication];
				session.authentication = cookieSession.authentication;

				dispatch_semaphore_signal(syncSemaphore);
				return session;
			}
			else {
				LRBlockCallback *callback = [[LRBlockCallback alloc]
					initWithSuccess:^(LRSession *cookieSession) {
					[self copyConfigurationValuesFromOldAuth:session.authentication
						toNewAuth:cookieSession.authentication];
					session.authentication = cookieSession.authentication;

					dispatch_semaphore_signal(syncSemaphore);
					completionHandler((LRSession *) cookieSession);
				} failure:^(NSError * error) {
					dispatch_semaphore_signal(syncSemaphore);
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

- (void)copyConfigurationValuesFromOldAuth:(LRCookieAuthentication *)oldAuth
	toNewAuth:(LRCookieAuthentication *)newAuth {

	newAuth.lastCookieRefresh = oldAuth.lastCookieRefresh;
	newAuth.cookieExpirationTime = oldAuth.cookieExpirationTime;
	newAuth.shouldHandleExpiration = oldAuth.shouldHandleExpiration;
}

@end
