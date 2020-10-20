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

#import "LRCommerceinventoryreplenishmentitemService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceinventoryreplenishmentitemService_v73

- (NSDictionary *)addCommerceInventoryReplenishmentItemWithUserId:(long long)userId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId sku:(NSString *)sku availabilityDate:(long long)availabilityDate quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"sku": [self checkNull: sku],
		@"availabilityDate": @(availabilityDate),
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventoryreplenishmentitem/add-commerce-inventory-replenishment-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceInventoryReplenishmentItemsByCompanyIdAndSkuWithCompanyId:(long long)companyId sku:(NSString *)sku start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"sku": [self checkNull: sku],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-items-by-company-id-and-sku": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryReplenishmentItemsCountWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId sku:(NSString *)sku error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"sku": [self checkNull: sku]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryReplenishmentItemsCountByCompanyIdAndSkuWithCompanyId:(long long)companyId sku:(NSString *)sku error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"sku": [self checkNull: sku]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-items-count-by-company-id-and-sku": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceInventoryReplenishmentItemWithCommerceInventoryReplenishmentItemId:(long long)commerceInventoryReplenishmentItemId availabilityDate:(long long)availabilityDate quantity:(int)quantity mvccVersion:(long long)mvccVersion error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryReplenishmentItemId": @(commerceInventoryReplenishmentItemId),
		@"availabilityDate": @(availabilityDate),
		@"quantity": @(quantity),
		@"mvccVersion": @(mvccVersion)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventoryreplenishmentitem/update-commerce-inventory-replenishment-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceInventoryReplenishmentItemWithCommerceInventoryReplenishmentItemId:(long long)commerceInventoryReplenishmentItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryReplenishmentItemId": @(commerceInventoryReplenishmentItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventoryreplenishmentitem/delete-commerce-inventory-replenishment-item": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceInventoryReplenishmentItemWithCommerceInventoryReplenishmentItemId:(long long)commerceInventoryReplenishmentItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryReplenishmentItemId": @(commerceInventoryReplenishmentItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end