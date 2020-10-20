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

#import "LRCommerceaccountgroupcommerceaccountrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceaccountgroupcommerceaccountrelService_v73

- (NSDictionary *)addCommerceAccountGroupCommerceAccountRelWithCommerceAccountGroupId:(long long)commerceAccountGroupId commerceAccountId:(long long)commerceAccountId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupId": @(commerceAccountGroupId),
		@"commerceAccountId": @(commerceAccountId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroupcommerceaccountrel/add-commerce-account-group-commerce-account-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceAccountGroupCommerceAccountRelWithCommerceAccountGroupId:(long long)commerceAccountGroupId commerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupId": @(commerceAccountGroupId),
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroupcommerceaccountrel/get-commerce-account-group-commerce-account-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAccountGroupCommerceAccountRelsWithCommerceAccountGroupId:(long long)commerceAccountGroupId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupId": @(commerceAccountGroupId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroupcommerceaccountrel/get-commerce-account-group-commerce-account-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAccountGroupCommerceAccountRelsCountWithCommerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupId": @(commerceAccountGroupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroupcommerceaccountrel/get-commerce-account-group-commerce-account-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAccountGroupCommerceAccountRelWithCommerceAccountGroupCommerceAccountRelId:(long long)commerceAccountGroupCommerceAccountRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupCommerceAccountRelId": @(commerceAccountGroupCommerceAccountRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgroupcommerceaccountrel/delete-commerce-account-group-commerce-account-rel": _params};

	[self.session invoke:_command error:error];
}

@end