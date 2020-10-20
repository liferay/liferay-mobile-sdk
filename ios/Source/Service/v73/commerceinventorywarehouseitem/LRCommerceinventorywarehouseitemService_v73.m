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

#import "LRCommerceinventorywarehouseitemService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceinventorywarehouseitemService_v73

- (NSArray *)getCommerceInventoryWarehouseItemsWithCompanyId:(long long)companyId sku:(NSString *)sku start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"sku": [self checkNull: sku],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceInventoryWarehouseItemsWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceInventoryWarehouseItemWithUserId:(long long)userId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"sku": [self checkNull: sku],
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/add-commerce-inventory-warehouse-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceInventoryWarehouseItemWithUserId:(long long)userId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId externalReferenceCode:(NSString *)externalReferenceCode sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"sku": [self checkNull: sku],
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/add-commerce-inventory-warehouse-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseItemId": @(commerceInventoryWarehouseItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/delete-commerce-inventory-warehouse-item": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceInventoryWarehouseItemsWithCompanyId:(long long)companyId sku:(NSString *)sku error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"sku": [self checkNull: sku]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/delete-commerce-inventory-warehouse-items": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId sku:(NSString *)sku error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"sku": [self checkNull: sku]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/fetch-commerce-inventory-warehouse-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceInventoryWarehouseItemByReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/fetch-commerce-inventory-warehouse-item-by-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseItemId": @(commerceInventoryWarehouseItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceInventoryWarehouseItemByReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-item-by-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceInventoryWarehouseItemsByCompanyIdWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-by-company-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceInventoryWarehouseItemsByCompanyIdAndSkuWithCompanyId:(long long)companyId sku:(NSString *)sku start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"sku": [self checkNull: sku],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-by-company-id-and-sku": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryWarehouseItemsCountWithCompanyId:(long long)companyId sku:(NSString *)sku error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"sku": [self checkNull: sku]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryWarehouseItemsCountWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryWarehouseItemsCountByCompanyIdWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count-by-company-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryWarehouseItemsCountByModifiedDateWithCompanyId:(long long)companyId startDate:(long long)startDate endDate:(long long)endDate error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"startDate": @(startDate),
		@"endDate": @(endDate)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count-by-modified-date": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceInventoryWarehouseItemsCountByModifiedDateWithCompanyId:(long long)companyId startDate:(long long)startDate endDate:(long long)endDate start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"startDate": @(startDate),
		@"endDate": @(endDate),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count-by-modified-date": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)increaseCommerceInventoryWarehouseItemQuantityWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseItemId": @(commerceInventoryWarehouseItemId),
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/increase-commerce-inventory-warehouse-item-quantity": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)moveQuantitiesBetweenWarehousesWithFromCommerceInventoryWarehouseId:(long long)fromCommerceInventoryWarehouseId toCommerceInventoryWarehouseId:(long long)toCommerceInventoryWarehouseId sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fromCommerceInventoryWarehouseId": @(fromCommerceInventoryWarehouseId),
		@"toCommerceInventoryWarehouseId": @(toCommerceInventoryWarehouseId),
		@"sku": [self checkNull: sku],
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/move-quantities-between-warehouses": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId quantity:(int)quantity reservedQuantity:(int)reservedQuantity mvccVersion:(long long)mvccVersion error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseItemId": @(commerceInventoryWarehouseItemId),
		@"quantity": @(quantity),
		@"reservedQuantity": @(reservedQuantity),
		@"mvccVersion": @(mvccVersion)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/update-commerce-inventory-warehouse-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId quantity:(int)quantity mvccVersion:(long long)mvccVersion error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseItemId": @(commerceInventoryWarehouseItemId),
		@"quantity": @(quantity),
		@"mvccVersion": @(mvccVersion)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/update-commerce-inventory-warehouse-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceInventoryWarehouseItemWithCompanyId:(long long)companyId userId:(long long)userId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId externalReferenceCode:(NSString *)externalReferenceCode sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"sku": [self checkNull: sku],
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/upsert-commerce-inventory-warehouse-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceInventoryWarehouseItemWithUserId:(long long)userId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"sku": [self checkNull: sku],
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouseitem/upsert-commerce-inventory-warehouse-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end