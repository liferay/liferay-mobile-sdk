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

#import "LROAuth2RefreshHandler.h"
#import "LROAuth2SignIn.h"
#import "LROAuth2Authentication.h"

static const NSUInteger kExpiryTimeTolerance = 60;

static dispatch_semaphore_t syncSemaphore;

@implementation LROAuth2RefreshHandler

+ (void)initialize {
	syncSemaphore = dispatch_semaphore_create(1);
}

- (LRSession *)refreshAuthentication:(LRSession *)session
	handler:(LRSessionHandler)handler error:(NSError **)error {

	dispatch_semaphore_wait(syncSemaphore, DISPATCH_TIME_FOREVER);
	if ([self shouldTokenBeRefreshed: session.authentication]) {
		if (handler == nil) {
			LRSession *oauth2Session = [LROAuth2SignIn refreshTokenWithSession:session scopes:nil
				callback:nil error:error];
			dispatch_semaphore_signal(syncSemaphore);
			return oauth2Session;
		}
		else {
			[LROAuth2SignIn refreshTokenWithSession:session scopes:nil
				callback:^(LRSession *session, NSError *error) {
					dispatch_semaphore_signal(syncSemaphore);
					handler(session, error);
				} error:nil];
			return nil;
		}
	}
	else {
		dispatch_semaphore_signal(syncSemaphore);
	}

	if (handler == nil) {
		return session;
	}
	else {
		handler(session, nil);
		return nil;
	}
}

- (BOOL)shouldTokenBeRefreshed:(LROAuth2Authentication *)authentication {
	if ([authentication.accessTokenExpirationDate timeIntervalSinceNow] < kExpiryTimeTolerance) {
		return YES;
	}

	return NO;
}

@end
