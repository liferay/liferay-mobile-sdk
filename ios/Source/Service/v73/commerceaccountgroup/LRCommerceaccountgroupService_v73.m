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

#import "LRCommerceaccountgroupService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceaccountgroupService_v73

- (NSDictionary *)getCommerceAccountGroupWithCommerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupId": @(commerceAccountGroupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroup/get-commerce-account-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroup/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAccountGroupWithCompanyId:(long long)companyId name:(NSString *)name type:(int)type externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroup/add-commerce-account-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAccountGroupWithCommerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupId": @(commerceAccountGroupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroup/delete-commerce-account-group": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAccountGroupsWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.account.model.CommerceAccountGroup>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroup/get-commerce-account-groups": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAccountGroupsCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroup/get-commerce-account-groups-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)searchCommerceAccountGroupsWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroup/search-commerce-account-groups": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCommerceAccountsGroupCountWithCompanyId:(long long)companyId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroup/search-commerce-accounts-group-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceAccountGroupWithCommerceAccountGroupId:(long long)commerceAccountGroupId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupId": @(commerceAccountGroupId),
		@"name": [self checkNull: name],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroup/update-commerce-account-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end