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

#import "LRCommercediscountcommerceaccountgrouprelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercediscountcommerceaccountgrouprelService_v73

- (NSArray *)getCommerceDiscountCommerceAccountGroupRelsWithCommerceDiscountId:(long long)commerceDiscountId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.discount.model.CommerceDiscountCommerceAccountGroupRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceDiscountCommerceAccountGroupRelsWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceDiscountCommerceAccountGroupRelsByCommerceDiscountIdWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountcommerceaccountgrouprel/delete-commerce-discount-commerce-account-group-rels-by-commerce-discount-id": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceDiscountCommerceAccountGroupRelWithCommerceDiscountId:(long long)commerceDiscountId commerceAccountGroupId:(long long)commerceAccountGroupId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"commerceAccountGroupId": @(commerceAccountGroupId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscountcommerceaccountgrouprel/add-commerce-discount-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceDiscountCommerceAccountGroupRelWithCommerceDiscountCommerceAccountGroupRelId:(long long)commerceDiscountCommerceAccountGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountCommerceAccountGroupRelId": @(commerceDiscountCommerceAccountGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountcommerceaccountgrouprel/delete-commerce-discount-commerce-account-group-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceDiscountCommerceAccountGroupRelWithCommerceDiscountId:(long long)commerceDiscountId commerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"commerceAccountGroupId": @(commerceAccountGroupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountcommerceaccountgrouprel/fetch-commerce-discount-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceDiscountCommerceAccountGroupRelsCountWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceDiscountCommerceAccountGroupRelsCountWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceDiscountCommerceAccountGroupRelWithCommerceDiscountCommerceAccountGroupRelId:(long long)commerceDiscountCommerceAccountGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountCommerceAccountGroupRelId": @(commerceDiscountCommerceAccountGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end