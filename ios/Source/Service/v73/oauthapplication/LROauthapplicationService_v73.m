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

#import "LROauthapplicationService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LROauthapplicationService_v73

- (void)deleteLogoWithOAuthApplicationId:(long long)oAuthApplicationId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"oAuthApplicationId": @(oAuthApplicationId)
	}];

	NSDictionary *_command = @{@"/oauth.oauthapplication/delete-logo": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addOAuthApplicationWithName:(NSString *)name description:(NSString *)description accessLevel:(int)accessLevel shareableAccessToken:(BOOL)shareableAccessToken callbackURI:(NSString *)callbackURI websiteURL:(NSString *)websiteURL serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"accessLevel": @(accessLevel),
		@"shareableAccessToken": @(shareableAccessToken),
		@"callbackURI": [self checkNull: callbackURI],
		@"websiteURL": [self checkNull: websiteURL],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/oauth.oauthapplication/add-o-auth-application": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateOAuthApplicationWithOAuthApplicationId:(long long)oAuthApplicationId name:(NSString *)name description:(NSString *)description shareableAccessToken:(BOOL)shareableAccessToken callbackURI:(NSString *)callbackURI websiteURL:(NSString *)websiteURL serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"oAuthApplicationId": @(oAuthApplicationId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"shareableAccessToken": @(shareableAccessToken),
		@"callbackURI": [self checkNull: callbackURI],
		@"websiteURL": [self checkNull: websiteURL],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/oauth.oauthapplication/update-o-auth-application": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteOAuthApplicationWithOAuthApplicationId:(long long)oAuthApplicationId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"oAuthApplicationId": @(oAuthApplicationId)
	}];

	NSDictionary *_command = @{@"/oauth.oauthapplication/delete-o-auth-application": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end