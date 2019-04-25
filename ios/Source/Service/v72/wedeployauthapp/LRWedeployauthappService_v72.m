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

#import "LRWedeployauthappService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRWedeployauthappService_v72

- (NSDictionary *)addWeDeployAuthAppWithName:(NSString *)name redirectURI:(NSString *)redirectURI serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"redirectURI": [self checkNull: redirectURI],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/wedeployauth.wedeployauthapp/add-we-deploy-auth-app": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteWeDeployAuthAppWithWeDeployAuthAppId:(long long)weDeployAuthAppId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"weDeployAuthAppId": @(weDeployAuthAppId)
	}];

	NSDictionary *_command = @{@"/wedeployauth.wedeployauthapp/delete-we-deploy-auth-app": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end