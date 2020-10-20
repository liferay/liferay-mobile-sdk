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

#import "LROauthuserService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LROauthuserService_v73

- (NSDictionary *)addOAuthUserWithConsumerKey:(NSString *)consumerKey serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"consumerKey": [self checkNull: consumerKey],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/oauth.oauthuser/add-o-auth-user": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteOAuthUserWithOAuthApplicationId:(long long)oAuthApplicationId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"oAuthApplicationId": @(oAuthApplicationId)
	}];

	NSDictionary *_command = @{@"/oauth.oauthuser/delete-o-auth-user": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end