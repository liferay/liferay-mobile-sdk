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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRCommerceinventorywarehouseitemService_v73 : LRBaseService

- (NSArray *)getCommerceInventoryWarehouseItemsWithCompanyId:(long long)companyId sku:(NSString *)sku start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceInventoryWarehouseItemsWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)addCommerceInventoryWarehouseItemWithUserId:(long long)userId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error;
- (NSDictionary *)addCommerceInventoryWarehouseItemWithUserId:(long long)userId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId externalReferenceCode:(NSString *)externalReferenceCode sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error;
- (void)deleteCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceInventoryWarehouseItemsWithCompanyId:(long long)companyId sku:(NSString *)sku error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId sku:(NSString *)sku error:(NSError **)error;
- (NSDictionary *)fetchCommerceInventoryWarehouseItemByReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)getCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId error:(NSError **)error;
- (NSDictionary *)getCommerceInventoryWarehouseItemByReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSArray *)getCommerceInventoryWarehouseItemsByCompanyIdWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceInventoryWarehouseItemsByCompanyIdAndSkuWithCompanyId:(long long)companyId sku:(NSString *)sku start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommerceInventoryWarehouseItemsCountWithCompanyId:(long long)companyId sku:(NSString *)sku error:(NSError **)error;
- (NSNumber *)getCommerceInventoryWarehouseItemsCountWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error;
- (NSNumber *)getCommerceInventoryWarehouseItemsCountByCompanyIdWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSNumber *)getCommerceInventoryWarehouseItemsCountByModifiedDateWithCompanyId:(long long)companyId startDate:(long long)startDate endDate:(long long)endDate error:(NSError **)error;
- (NSArray *)getCommerceInventoryWarehouseItemsCountByModifiedDateWithCompanyId:(long long)companyId startDate:(long long)startDate endDate:(long long)endDate start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)increaseCommerceInventoryWarehouseItemQuantityWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId quantity:(int)quantity error:(NSError **)error;
- (void)moveQuantitiesBetweenWarehousesWithFromCommerceInventoryWarehouseId:(long long)fromCommerceInventoryWarehouseId toCommerceInventoryWarehouseId:(long long)toCommerceInventoryWarehouseId sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId quantity:(int)quantity reservedQuantity:(int)reservedQuantity mvccVersion:(long long)mvccVersion error:(NSError **)error;
- (NSDictionary *)updateCommerceInventoryWarehouseItemWithCommerceInventoryWarehouseItemId:(long long)commerceInventoryWarehouseItemId quantity:(int)quantity mvccVersion:(long long)mvccVersion error:(NSError **)error;
- (NSDictionary *)upsertCommerceInventoryWarehouseItemWithCompanyId:(long long)companyId userId:(long long)userId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId externalReferenceCode:(NSString *)externalReferenceCode sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error;
- (NSDictionary *)upsertCommerceInventoryWarehouseItemWithUserId:(long long)userId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId sku:(NSString *)sku quantity:(int)quantity error:(NSError **)error;

@end