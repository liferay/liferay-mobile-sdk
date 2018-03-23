//
//  LRAuthorizationFlow+LRAuthoriztionFlow_Private.h
//  Liferay iOS SDK
//
//  Created by Victor Galan on 19/03/2018.
//  Copyright © 2018 Liferay Inc. All rights reserved.
//

#import "LROAuth2AuthorizationFlow.h"
#import <AppAuth/AppAuth.h>

@interface LROAuth2AuthorizationFlow (Private)

- (instancetype)initWithExternalUserAgentSession:(id<OIDExternalUserAgentSession>)userAgentSession;

@end
