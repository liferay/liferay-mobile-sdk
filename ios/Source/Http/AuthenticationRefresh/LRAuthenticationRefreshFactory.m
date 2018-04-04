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

#import "LRAuthenticationRefreshFactory.h"
#import "LRAuthenticationRefreshHandler.h"
#import "LRCookieExpirationHandler.h"
#import "LRCookieAuthentication.h"
#import "LRBasicAuthRefreshHandler.h"
#import "LROAuth2Authentication.h"
#import "LROAuth2RefreshHandler.h"

@implementation LRAuthenticationRefreshFactory

- (id<LRAuthenticationRefreshHandler>)
	authenticationRefreshHandlerForAuthentication:(id<LRAuthentication>)authentication {

	if ([authentication isKindOfClass:[LRCookieAuthentication class]]) {
		return [[LRCookieExpirationHandler alloc] init];
	}

	if ([authentication isKindOfClass:[LROAuth2Authentication class]]) {
		return [[LROAuth2RefreshHandler alloc] init];
	}

	return [[LRBasicAuthRefreshHandler alloc] init];
}

@end
