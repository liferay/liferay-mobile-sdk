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

#import "LROAuth2AuthorizationFlow.h"
#import "LROAuth2AuthorizationFlow+Private.h"
#import <AppAuth/AppAuth.h>

@interface LROAuth2AuthorizationFlow ()

@property (nonatomic) id<OIDAuthorizationFlowSession> userAgentSession;

@end

@implementation LROAuth2AuthorizationFlow

- (instancetype)initWithExternalUserAgentSession:(id<OIDAuthorizationFlowSession>)userAgentSession {
	self = [super self];

	if (self) {
		self.userAgentSession = userAgentSession;
	}

	return self;
}

- (BOOL)resumeAuthorizationFlowWithURL:(NSURL *)URL {
	return [self.userAgentSession resumeAuthorizationFlowWithURL:URL];
}

- (void)cancel {
	[self.userAgentSession cancel];
}

@end
