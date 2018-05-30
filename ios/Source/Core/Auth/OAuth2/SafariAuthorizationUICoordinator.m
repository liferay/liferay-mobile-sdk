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

#import "SafariAuthorizationUICoordinator.h"

#if TARGET_OS_IOS || TARGET_OS_TV || TARGET_OS_WATCH
	#import <UIKit/UIKit.h>
#else
	#import <AppKit/AppKit.h>
#endif

@implementation SafariAuthorizationUICoordinator

- (BOOL)presentAuthorizationRequest:(OIDAuthorizationRequest *)request
	session:(id<OIDAuthorizationFlowSession>)session {

	NSURL *requestURL = [request authorizationRequestURL];

	#if TARGET_OS_IOS || TARGET_OS_TV
		return [[UIApplication sharedApplication] openURL:requestURL];
	#elif  TARGET_OS_WATCH
		return true;
	#else
		return [NSWorkspace.sharedWorkspace openURL:requestURL];
	#endif
}

- (void)dismissAuthorizationAnimated:(BOOL)animated
	completion:(void (^)(void))completion {

	completion();
}

@end
