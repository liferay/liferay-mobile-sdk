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

#import "LRCommercepricelistcommerceaccountgrouprelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercepricelistcommerceaccountgrouprelService_v73

- (void)deleteCommercePriceListAccountGroupRelsByCommercePriceListIdWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/delete-commerce-price-list-account-group-rels-by-commerce-price-list-id": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommercePriceListCommerceAccountGroupRelWithCommercePriceListId:(long long)commercePriceListId commerceAccountGroupId:(long long)commerceAccountGroupId order:(int)order serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"commerceAccountGroupId": @(commerceAccountGroupId),
		@"order": @(order),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/add-commerce-price-list-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommercePriceListCommerceAccountGroupRelWithCommercePriceListCommerceAccountGroupRelId:(long long)commercePriceListCommerceAccountGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListCommerceAccountGroupRelId": @(commercePriceListCommerceAccountGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/delete-commerce-price-list-commerce-account-group-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommercePriceListCommerceAccountGroupRelWithCommercePriceListId:(long long)commercePriceListId commerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"commerceAccountGroupId": @(commerceAccountGroupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/fetch-commerce-price-list-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceListCommerceAccountGroupRelsWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceListCommerceAccountGroupRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceListCommerceAccountGroupRelsWithCommercePriceListId:(long long)commercePriceListId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceListCommerceAccountGroupRelsWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceListCommerceAccountGroupRelsCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceListCommerceAccountGroupRelsCountWithCommercePriceListId:(long long)commercePriceListId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommercePriceListCommerceAccountGroupRelWithCommercePriceListCommerceAccountGroupRelId:(long long)commercePriceListCommerceAccountGroupRelId order:(int)order serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListCommerceAccountGroupRelId": @(commercePriceListCommerceAccountGroupRelId),
		@"order": @(order),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/update-commerce-price-list-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommercePriceListCommerceAccountGroupRelWithCommercePriceListCommerceAccoungGroupRelId:(long long)commercePriceListCommerceAccoungGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListCommerceAccoungGroupRelId": @(commercePriceListCommerceAccoungGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end