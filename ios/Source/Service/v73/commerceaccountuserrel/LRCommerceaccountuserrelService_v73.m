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

#import "LRCommerceaccountuserrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceaccountuserrelService_v73

- (NSArray *)getCommerceAccountUserRelsWithCommerceAccountId:(long long)commerceAccountId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/get-commerce-account-user-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)addCommerceAccountUserRelsWithCommerceAccountId:(long long)commerceAccountId userIds:(NSArray *)userIds emailAddresses:(NSArray *)emailAddresses roleIds:(NSArray *)roleIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"userIds": [self checkNull: userIds],
		@"emailAddresses": [self checkNull: emailAddresses],
		@"roleIds": [self checkNull: roleIds],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/add-commerce-account-user-rels": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAccountUserRelWithCommerceAccountId:(long long)commerceAccountId commerceAccountUserId:(long long)commerceAccountUserId roleIds:(NSArray *)roleIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"commerceAccountUserId": @(commerceAccountUserId),
		@"roleIds": [self checkNull: roleIds],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/add-commerce-account-user-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)inviteUserWithCommerceAccountId:(long long)commerceAccountId emailAddress:(NSString *)emailAddress roleIds:(NSArray *)roleIds userExternalReferenceCode:(NSString *)userExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"emailAddress": [self checkNull: emailAddress],
		@"roleIds": [self checkNull: roleIds],
		@"userExternalReferenceCode": [self checkNull: userExternalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/invite-user": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAccountUserRelsWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/delete-commerce-account-user-rels": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceAccountUserRelsWithCommerceAccountId:(long long)commerceAccountId userIds:(NSArray *)userIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"userIds": [self checkNull: userIds]
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/delete-commerce-account-user-rels": _params};

	[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAccountUserRelsCountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/get-commerce-account-user-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAccountUserRelWithCommerceAccountId:(long long)commerceAccountId userId:(long long)userId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"userId": @(userId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/delete-commerce-account-user-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceAccountUserRelWithCommerceAccountUserRelPK:(LRJSONObjectWrapper *)commerceAccountUserRelPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"commerceAccountUserRelPK" className:@"com.liferay.commerce.account.service.persistence.CommerceAccountUserRelPK" wrapper:commerceAccountUserRelPK];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/fetch-commerce-account-user-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceAccountUserRelWithCommerceAccountUserRelPK:(LRJSONObjectWrapper *)commerceAccountUserRelPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"commerceAccountUserRelPK" className:@"com.liferay.commerce.account.service.persistence.CommerceAccountUserRelPK" wrapper:commerceAccountUserRelPK];

	NSDictionary *_command = @{@"/commerce.commerceaccountuserrel/get-commerce-account-user-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end