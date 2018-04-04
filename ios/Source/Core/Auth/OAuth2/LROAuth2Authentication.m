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

#import "LROAuth2Authentication.h"

@implementation LROAuth2Authentication

- (instancetype)initWithAccessToken:(NSString *)accessToken
	refreshToken:(NSString *)refreshToken scope:(NSString *)scope
	accessTokenExpirationDate:(NSDate *)accessTokenExpirationDate
	clientId:(NSString *)clientId clientSecret:(NSString *)clientSecret {

	self = [super init];

	if (self) {
		self.accessToken = accessToken;
		self.refreshToken = refreshToken;
		self.scope = scope;
		self.accessTokenExpirationDate = accessTokenExpirationDate;
		self.clientId = clientId;
		self.clientSecret = clientSecret;
	}

	return self;
}

- (void)authenticate:(NSMutableURLRequest *)request {
	NSString *header = [NSString stringWithFormat:@"Bearer %@", self.accessToken];

	[request setValue:header forHTTPHeaderField:@"Authorization"];
}

@end
