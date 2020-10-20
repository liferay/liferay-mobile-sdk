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
@interface LRCommerceinventorywarehouseService_v73 : LRBaseService

- (NSDictionary *)setActiveWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommerceInventoryWarehouseWithName:(NSString *)name description:(NSString *)description active:(BOOL)active street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionCode:(NSString *)commerceRegionCode commerceCountryCode:(NSString *)commerceCountryCode latitude:(double)latitude longitude:(double)longitude externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteCommerceInventoryWarehouseWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error;
- (NSDictionary *)geolocateCommerceInventoryWarehouseWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId latitude:(double)latitude longitude:(double)longitude error:(NSError **)error;
- (NSDictionary *)getCommerceInventoryWarehouseWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error;
- (NSArray *)getCommerceInventoryWarehousesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceInventoryWarehousesWithCompanyId:(long long)companyId groupId:(long long)groupId active:(BOOL)active error:(NSError **)error;
- (NSArray *)getCommerceInventoryWarehousesWithCompanyId:(long long)companyId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceInventoryWarehousesWithCompanyId:(long long)companyId active:(BOOL)active commerceCountryCode:(NSString *)commerceCountryCode start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceInventoryWarehousesCountWithCompanyId:(long long)companyId active:(BOOL)active commerceCountryCode:(NSString *)commerceCountryCode error:(NSError **)error;
- (NSNumber *)getCommerceInventoryWarehousesCountWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSArray *)searchCommerceInventoryWarehousesWithCompanyId:(long long)companyId active:(BOOL)active commerceCountryCode:(NSString *)commerceCountryCode keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSNumber *)searchCommerceInventoryWarehousesCountWithCompanyId:(long long)companyId active:(BOOL)active commerceCountryCode:(NSString *)commerceCountryCode keywords:(NSString *)keywords error:(NSError **)error;
- (NSDictionary *)updateCommerceInventoryWarehouseWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId name:(NSString *)name description:(NSString *)description active:(BOOL)active street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionCode:(NSString *)commerceRegionCode commerceCountryCode:(NSString *)commerceCountryCode latitude:(double)latitude longitude:(double)longitude mvccVersion:(long long)mvccVersion serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end