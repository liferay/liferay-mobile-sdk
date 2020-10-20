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

#import "LRCommercepricelistaccountrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercepricelistaccountrelService_v73

- (NSDictionary *)addCommercePriceListAccountRelWithCommercePriceListId:(long long)commercePriceListId commerceAccountId:(long long)commerceAccountId order:(int)order serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"commerceAccountId": @(commerceAccountId),
		@"order": @(order),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/add-commerce-price-list-account-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommercePriceListAccountRelWithCommercePriceListAccountRelId:(long long)commercePriceListAccountRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListAccountRelId": @(commercePriceListAccountRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/delete-commerce-price-list-account-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommercePriceListAccountRelWithCommercePriceListAccountRelId:(long long)commercePriceListAccountRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListAccountRelId": @(commercePriceListAccountRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommercePriceListAccountRelsByCommercePriceListIdWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/delete-commerce-price-list-account-rels-by-commerce-price-list-id": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommercePriceListAccountRelWithCommercePriceListId:(long long)commercePriceListId commerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/fetch-commerce-price-list-account-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceListAccountRelsWithCommercePriceListId:(long long)commercePriceListId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceListAccountRelsWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceListAccountRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceListAccountRelsWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceListAccountRelsCountWithCommercePriceListId:(long long)commercePriceListId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceListAccountRelsCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end