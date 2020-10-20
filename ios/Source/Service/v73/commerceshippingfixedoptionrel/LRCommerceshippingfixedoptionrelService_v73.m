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

#import "LRCommerceshippingfixedoptionrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceshippingfixedoptionrelService_v73

- (void)deleteCommerceShippingFixedOptionRelWithCommerceShippingFixedOptionRelId:(long long)commerceShippingFixedOptionRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingFixedOptionRelId": @(commerceShippingFixedOptionRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoptionrel/delete-commerce-shipping-fixed-option-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceShippingFixedOptionRelWithCommerceShippingMethodId:(long long)commerceShippingMethodId commerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip weightFrom:(double)weightFrom weightTo:(double)weightTo fixedPrice:(NSDictionary *)fixedPrice rateUnitWeightPrice:(NSDictionary *)rateUnitWeightPrice ratePercentage:(double)ratePercentage serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"commerceShippingFixedOptionId": @(commerceShippingFixedOptionId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"commerceCountryId": @(commerceCountryId),
		@"commerceRegionId": @(commerceRegionId),
		@"zip": [self checkNull: zip],
		@"weightFrom": @(weightFrom),
		@"weightTo": @(weightTo),
		@"fixedPrice": [self checkNull: fixedPrice],
		@"rateUnitWeightPrice": [self checkNull: rateUnitWeightPrice],
		@"ratePercentage": @(ratePercentage),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoptionrel/add-commerce-shipping-fixed-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceShippingFixedOptionRelWithUserId:(long long)userId groupId:(long long)groupId commerceShippingMethodId:(long long)commerceShippingMethodId commerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip weightFrom:(double)weightFrom weightTo:(double)weightTo fixedPrice:(NSDictionary *)fixedPrice rateUnitWeightPrice:(NSDictionary *)rateUnitWeightPrice ratePercentage:(double)ratePercentage error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"commerceShippingFixedOptionId": @(commerceShippingFixedOptionId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"commerceCountryId": @(commerceCountryId),
		@"commerceRegionId": @(commerceRegionId),
		@"zip": [self checkNull: zip],
		@"weightFrom": @(weightFrom),
		@"weightTo": @(weightTo),
		@"fixedPrice": [self checkNull: fixedPrice],
		@"rateUnitWeightPrice": [self checkNull: rateUnitWeightPrice],
		@"ratePercentage": @(ratePercentage)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoptionrel/add-commerce-shipping-fixed-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceShippingFixedOptionRelWithCommerceShippingFixedOptionRelId:(long long)commerceShippingFixedOptionRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingFixedOptionRelId": @(commerceShippingFixedOptionRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoptionrel/fetch-commerce-shipping-fixed-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShippingMethodFixedOptionRelsWithCommerceShippingMethodId:(long long)commerceShippingMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.shipping.engine.fixed.model.CommerceShippingFixedOptionRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoptionrel/get-commerce-shipping-method-fixed-option-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShippingMethodFixedOptionRelsCountWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoptionrel/get-commerce-shipping-method-fixed-option-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceShippingFixedOptionRelWithCommerceShippingFixedOptionRelId:(long long)commerceShippingFixedOptionRelId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip weightFrom:(double)weightFrom weightTo:(double)weightTo fixedPrice:(NSDictionary *)fixedPrice rateUnitWeightPrice:(NSDictionary *)rateUnitWeightPrice ratePercentage:(double)ratePercentage error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingFixedOptionRelId": @(commerceShippingFixedOptionRelId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"commerceCountryId": @(commerceCountryId),
		@"commerceRegionId": @(commerceRegionId),
		@"zip": [self checkNull: zip],
		@"weightFrom": @(weightFrom),
		@"weightTo": @(weightTo),
		@"fixedPrice": [self checkNull: fixedPrice],
		@"rateUnitWeightPrice": [self checkNull: rateUnitWeightPrice],
		@"ratePercentage": @(ratePercentage)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoptionrel/update-commerce-shipping-fixed-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end