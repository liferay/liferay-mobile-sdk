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

#import "LRCommerceaccountorganizationrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceaccountorganizationrelService_v73

- (NSArray *)getCommerceAccountOrganizationRelsWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAccountOrganizationRelsWithCommerceAccountId:(long long)commerceAccountId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAccountOrganizationRelWithCommerceAccountId:(long long)commerceAccountId organizationId:(long long)organizationId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"organizationId": @(organizationId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/delete-commerce-account-organization-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAccountOrganizationRelWithCommerceAccountId:(long long)commerceAccountId organizationId:(long long)organizationId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"organizationId": @(organizationId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/add-commerce-account-organization-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)addCommerceAccountOrganizationRelsWithCommerceAccountId:(long long)commerceAccountId organizationIds:(NSArray *)organizationIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"organizationIds": [self checkNull: organizationIds],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/add-commerce-account-organization-rels": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceAccountOrganizationRelsWithCommerceAccountId:(long long)commerceAccountId organizationIds:(NSArray *)organizationIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"organizationIds": [self checkNull: organizationIds]
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/delete-commerce-account-organization-rels": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAccountOrganizationRelsByOrganizationIdWithOrganizationId:(long long)organizationId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"organizationId": @(organizationId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels-by-organization-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAccountOrganizationRelsByOrganizationIdCountWithOrganizationId:(long long)organizationId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"organizationId": @(organizationId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels-by-organization-id-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAccountOrganizationRelsCountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceAccountOrganizationRelWithCommerceAccountOrganizationRelPK:(LRJSONObjectWrapper *)commerceAccountOrganizationRelPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"commerceAccountOrganizationRelPK" className:@"com.liferay.commerce.account.service.persistence.CommerceAccountOrganizationRelPK" wrapper:commerceAccountOrganizationRelPK];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/fetch-commerce-account-organization-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceAccountOrganizationRelWithCommerceAccountOrganizationRelPK:(LRJSONObjectWrapper *)commerceAccountOrganizationRelPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"commerceAccountOrganizationRelPK" className:@"com.liferay.commerce.account.service.persistence.CommerceAccountOrganizationRelPK" wrapper:commerceAccountOrganizationRelPK];

	NSDictionary *_command = @{@"/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end