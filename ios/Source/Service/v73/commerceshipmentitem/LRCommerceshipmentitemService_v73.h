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
@interface LRCommerceshipmentitemService_v73 : LRBaseService

- (NSArray *)getCommerceShipmentItemsWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error;
- (NSArray *)getCommerceShipmentItemsWithCommerceShipmentId:(long long)commerceShipmentId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)addCommerceShipmentItemWithCommerceShipmentId:(long long)commerceShipmentId commerceOrderItemId:(long long)commerceOrderItemId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId quantity:(int)quantity serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchCommerceShipmentItemWithCommerceShipmentId:(long long)commerceShipmentId commerceOrderItemId:(long long)commerceOrderItemId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error;
- (void)deleteCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId restoreStockQuantity:(BOOL)restoreStockQuantity error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCommerceShipmentItemsByCommerceOrderItemIdWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error;
- (NSNumber *)getCommerceShipmentItemsCountWithCommerceShipmentId:(long long)commerceShipmentId error:(NSError **)error;
- (NSNumber *)getCommerceShipmentItemsCountByCommerceOrderItemIdWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error;
- (NSNumber *)getCommerceShipmentOrderItemsQuantityWithCommerceShipmentId:(long long)commerceShipmentId commerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error;
- (NSDictionary *)updateCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId quantity:(int)quantity error:(NSError **)error;
- (NSDictionary *)updateCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId quantity:(int)quantity error:(NSError **)error;
- (NSDictionary *)getCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId error:(NSError **)error;

@end