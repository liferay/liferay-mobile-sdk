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
#import "LRBlockCookieCallback.h"

static dispatch_semaphore_t syncSemaphore;

@implementation LRCookieExpirationHandler

+ (void)initialize {
	syncSemaphore = dispatch_semaphore_create(1);
}

- (LRSession *)refreshAuthentication:(LRSession *)session
	handler:(LRSessionHandler)handler error:(NSError **)error {

	LRCookieAuthentication *auth = (LRCookieAuthentication *) session.authentication;

	dispatch_semaphore_wait(syncSemaphore, DISPATCH_TIME_FOREVER);
	if (auth.shouldHandleExpiration) {
		if ([self shouldCookieBeUpdated: session.authentication]) {
			if (handler == nil) {
				LRSession *cookieSession =  [LRCookieSignIn
					signInWithSession:session callback:nil error: error];
				session.authentication = cookieSession.authentication;

				dispatch_semaphore_signal(syncSemaphore);
				return session;
			}
			else {
				LRBlockCookieCallback *callback = [[LRBlockCookieCallback alloc]
					initWithSuccess:^(LRSession *cookieSession) {
					session.authentication = cookieSession.authentication;

						dispatch_semaphore_signal(syncSemaphore);
						handler(session, nil);
					} failure:^(NSError * error) {
						dispatch_semaphore_signal(syncSemaphore);
						handler(nil, error);
					}];

				[LRCookieSignIn signInWithSession:session
					callback:callback error:nil];

				return nil;
			}
		}
		else {
			dispatch_semaphore_signal(syncSemaphore);
		}
	}

	if (handler == nil) {
		return session;
	}
	else {
		handler(session, nil);
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

@end
