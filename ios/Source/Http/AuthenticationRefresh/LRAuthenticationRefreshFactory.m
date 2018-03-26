//
//  LRAuthenticationRefreshFactory.m
//  Liferay iOS SDK
//
//  Created by Victor Galan on 14/03/2018.
//  Copyright © 2018 Liferay Inc. All rights reserved.
//

#import "LRAuthenticationRefreshFactory.h"
#import "LRAuthenticationRefreshHandler.h"
#import "LRCookieExpirationHandler.h"
#import "LRCookieAuthentication.h"
#import "LRBasicAuthRefreshHandler.h"

@implementation LRAuthenticationRefreshFactory

- (id<LRAuthenticationRefreshHandler>)
	authenticationRefreshHandlerForAuthentication:(id<LRAuthentication>)authentication {

	if ([authentication isKindOfClass:[LRCookieAuthentication class]]) {
		return [[LRCookieExpirationHandler alloc] init];
	}

	return [[LRBasicAuthRefreshHandler alloc] init];
}

@end
