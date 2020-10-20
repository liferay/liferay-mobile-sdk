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

#import "LRCommercepricelistdiscountrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercepricelistdiscountrelService_v73

- (NSDictionary *)addCommercePriceListDiscountRelWithCommercePriceListId:(long long)commercePriceListId commerceDiscountId:(long long)commerceDiscountId order:(int)order serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"commerceDiscountId": @(commerceDiscountId),
		@"order": @(order),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepricelistdiscountrel/add-commerce-price-list-discount-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommercePriceListDiscountRelWithCommercePriceListDiscountRelId:(long long)commercePriceListDiscountRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListDiscountRelId": @(commercePriceListDiscountRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommercePriceListDiscountRelWithCommercePriceListDiscountRelId:(long long)commercePriceListDiscountRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListDiscountRelId": @(commercePriceListDiscountRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistdiscountrel/delete-commerce-price-list-discount-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommercePriceListDiscountRelWithCommercePriceListId:(long long)commercePriceListId commerceDiscountId:(long long)commerceDiscountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"commerceDiscountId": @(commerceDiscountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistdiscountrel/fetch-commerce-price-list-discount-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceListDiscountRelsWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceListDiscountRelsWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceListDiscountRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceListDiscountRelsCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end