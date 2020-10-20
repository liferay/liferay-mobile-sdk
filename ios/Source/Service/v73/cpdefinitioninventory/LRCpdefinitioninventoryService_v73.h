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
@interface LRCpdefinitioninventoryService_v73 : LRBaseService

- (NSDictionary *)addCpDefinitionInventoryWithUserId:(long long)userId cpDefinitionId:(long long)cpDefinitionId cpDefinitionInventoryEngine:(NSString *)cpDefinitionInventoryEngine lowStockActivity:(NSString *)lowStockActivity displayAvailability:(BOOL)displayAvailability displayStockQuantity:(BOOL)displayStockQuantity minStockQuantity:(int)minStockQuantity backOrders:(BOOL)backOrders minOrderQuantity:(int)minOrderQuantity maxOrderQuantity:(int)maxOrderQuantity allowedOrderQuantities:(NSString *)allowedOrderQuantities multipleOrderQuantity:(int)multipleOrderQuantity error:(NSError **)error;
- (void)deleteCpDefinitionInventoryWithCpDefinitionInventoryId:(long long)cpDefinitionInventoryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCpDefinitionInventoryByCpDefinitionIdWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionInventoryWithCpDefinitionInventoryId:(long long)cpDefinitionInventoryId cpDefinitionInventoryEngine:(NSString *)cpDefinitionInventoryEngine lowStockActivity:(NSString *)lowStockActivity displayAvailability:(BOOL)displayAvailability displayStockQuantity:(BOOL)displayStockQuantity minStockQuantity:(int)minStockQuantity backOrders:(BOOL)backOrders minOrderQuantity:(int)minOrderQuantity maxOrderQuantity:(int)maxOrderQuantity allowedOrderQuantities:(NSString *)allowedOrderQuantities multipleOrderQuantity:(int)multipleOrderQuantity error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionInventoryWithGroupId:(long long)groupId cpDefinitionInventoryId:(long long)cpDefinitionInventoryId cpDefinitionInventoryEngine:(NSString *)cpDefinitionInventoryEngine lowStockActivity:(NSString *)lowStockActivity displayAvailability:(BOOL)displayAvailability displayStockQuantity:(BOOL)displayStockQuantity minStockQuantity:(int)minStockQuantity backOrders:(BOOL)backOrders minOrderQuantity:(int)minOrderQuantity maxOrderQuantity:(int)maxOrderQuantity allowedOrderQuantities:(NSString *)allowedOrderQuantities multipleOrderQuantity:(int)multipleOrderQuantity error:(NSError **)error;

@end