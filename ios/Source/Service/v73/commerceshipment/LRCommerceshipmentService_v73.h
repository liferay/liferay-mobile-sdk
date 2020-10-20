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
@interface LRCommerceshipmentService_v73 : LRBaseService

- (NSDictionary *)updateAddressWithCommerceShipmentId:(long long)commerceShipmentId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber error:(NSError **)error;
- (NSDictionary *)updateStatusWithCommerceShipmentId:(long long)commerceShipmentId status:(int)status error:(NSError **)error;
- (void)deleteCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId restoreStockQuantity:(BOOL)restoreStockQuantity error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCommerceShipmentWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId commerceAddressId:(long long)commerceAddressId commerceShippingMethodId:(long long)commerceShippingMethodId commerceShippingOptionName:(NSString *)commerceShippingOptionName serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceShipmentWithCommerceOrderId:(long long)commerceOrderId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId error:(NSError **)error;
- (NSArray *)getCommerceShipmentsWithCompanyId:(long long)companyId commerceAddressId:(long long)commerceAddressId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceShipmentsWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds commerceAccountIds:(NSArray *)commerceAccountIds keywords:(NSString *)keywords shipmentStatuses:(NSArray *)shipmentStatuses excludeShipmentStatus:(BOOL)excludeShipmentStatus start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceShipmentsWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceShipmentsWithCompanyId:(long long)companyId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceShipmentsCountWithCompanyId:(long long)companyId commerceAddressId:(long long)commerceAddressId error:(NSError **)error;
- (NSNumber *)getCommerceShipmentsCountWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds commerceAccountIds:(NSArray *)commerceAccountIds keywords:(NSString *)keywords shipmentStatuses:(NSArray *)shipmentStatuses excludeShipmentStatus:(BOOL)excludeShipmentStatus error:(NSError **)error;
- (NSNumber *)getCommerceShipmentsCountWithCompanyId:(long long)companyId status:(int)status error:(NSError **)error;
- (NSNumber *)getCommerceShipmentsCountWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSDictionary *)updateCarrierDetailsWithCommerceShipmentId:(long long)commerceShipmentId carrier:(NSString *)carrier trackingNumber:(NSString *)trackingNumber error:(NSError **)error;
- (NSDictionary *)updateCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId carrier:(NSString *)carrier trackingNumber:(NSString *)trackingNumber status:(int)status shippingDateMonth:(int)shippingDateMonth shippingDateDay:(int)shippingDateDay shippingDateYear:(int)shippingDateYear shippingDateHour:(int)shippingDateHour shippingDateMinute:(int)shippingDateMinute expectedDateMonth:(int)expectedDateMonth expectedDateDay:(int)expectedDateDay expectedDateYear:(int)expectedDateYear expectedDateHour:(int)expectedDateHour expectedDateMinute:(int)expectedDateMinute error:(NSError **)error;
- (NSDictionary *)updateCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber carrier:(NSString *)carrier trackingNumber:(NSString *)trackingNumber status:(int)status shippingDateMonth:(int)shippingDateMonth shippingDateDay:(int)shippingDateDay shippingDateYear:(int)shippingDateYear shippingDateHour:(int)shippingDateHour shippingDateMinute:(int)shippingDateMinute expectedDateMonth:(int)expectedDateMonth expectedDateDay:(int)expectedDateDay expectedDateYear:(int)expectedDateYear expectedDateHour:(int)expectedDateHour expectedDateMinute:(int)expectedDateMinute error:(NSError **)error;
- (NSDictionary *)updateExpectedDateWithCommerceShipmentId:(long long)commerceShipmentId expectedDateMonth:(int)expectedDateMonth expectedDateDay:(int)expectedDateDay expectedDateYear:(int)expectedDateYear expectedDateHour:(int)expectedDateHour expectedDateMinute:(int)expectedDateMinute error:(NSError **)error;
- (NSDictionary *)updateShippingDateWithCommerceShipmentId:(long long)commerceShipmentId shippingDateMonth:(int)shippingDateMonth shippingDateDay:(int)shippingDateDay shippingDateYear:(int)shippingDateYear shippingDateHour:(int)shippingDateHour shippingDateMinute:(int)shippingDateMinute error:(NSError **)error;
- (NSArray *)getCommerceShipmentsByOrderIdWithCommerceOrderId:(long long)commerceOrderId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommerceShipmentsCountByOrderIdWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error;

@end