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
@interface LRCommerceorderitemService_v73 : LRBaseService

- (void)deleteCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId commerceContext:(LRJSONObjectWrapper *)commerceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCommerceOrderItemsWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId orderStatuses:(NSArray *)orderStatuses start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceOrderItemsWithCommerceOrderId:(long long)commerceOrderId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getChildCommerceOrderItemsWithParentCommerceOrderItemId:(long long)parentCommerceOrderItemId error:(NSError **)error;
- (NSNumber *)getCommerceOrderItemsCountWithCommerceOrderId:(long long)commerceOrderId cpInstanceId:(long long)cpInstanceId error:(NSError **)error;
- (NSNumber *)getCommerceOrderItemsCountWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId orderStatuses:(NSArray *)orderStatuses error:(NSError **)error;
- (NSNumber *)getCommerceOrderItemsCountWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error;
- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommerceOrderItemWithCommerceOrderId:(long long)commerceOrderId cpInstanceId:(long long)cpInstanceId quantity:(int)quantity shippedQuantity:(int)shippedQuantity json:(NSString *)json commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSNumber *)countSubscriptionCommerceOrderItemsWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error;
- (void)deleteCommerceOrderItemsWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error;
- (NSArray *)getAvailableForShipmentCommerceOrderItemsWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error;
- (NSNumber *)getCommerceInventoryWarehouseItemQuantityWithCommerceOrderItemId:(long long)commerceOrderItemId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error;
- (NSDictionary *)getCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error;
- (NSNumber *)getCommerceOrderItemsQuantityWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId quantity:(int)quantity json:(NSString *)json commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId quantity:(int)quantity commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemDeliveryDateWithCommerceOrderItemId:(long long)commerceOrderItemId requestedDeliveryDate:(long long)requestedDeliveryDate error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemInfoWithCommerceOrderItemId:(long long)commerceOrderItemId deliveryGroup:(NSString *)deliveryGroup shippingAddressId:(long long)shippingAddressId printedNote:(NSString *)printedNote requestedDeliveryDateMonth:(int)requestedDeliveryDateMonth requestedDeliveryDateDay:(int)requestedDeliveryDateDay requestedDeliveryDateYear:(int)requestedDeliveryDateYear error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemInfoWithCommerceOrderItemId:(long long)commerceOrderItemId deliveryGroup:(NSString *)deliveryGroup shippingAddressId:(long long)shippingAddressId printedNote:(NSString *)printedNote requestedDeliveryDateMonth:(int)requestedDeliveryDateMonth requestedDeliveryDateDay:(int)requestedDeliveryDateDay requestedDeliveryDateYear:(int)requestedDeliveryDateYear requestedDeliveryDateHour:(int)requestedDeliveryDateHour requestedDeliveryDateMinute:(int)requestedDeliveryDateMinute serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemInfoWithCommerceOrderItemId:(long long)commerceOrderItemId deliveryGroup:(NSString *)deliveryGroup shippingAddressId:(long long)shippingAddressId printedNote:(NSString *)printedNote error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemPricesWithCommerceOrderItemId:(long long)commerceOrderItemId unitPrice:(NSDictionary *)unitPrice promoPrice:(NSDictionary *)promoPrice discountAmount:(NSDictionary *)discountAmount finalPrice:(NSDictionary *)finalPrice discountPercentageLevel1:(NSDictionary *)discountPercentageLevel1 discountPercentageLevel2:(NSDictionary *)discountPercentageLevel2 discountPercentageLevel3:(NSDictionary *)discountPercentageLevel3 discountPercentageLevel4:(NSDictionary *)discountPercentageLevel4 error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemPricesWithCommerceOrderItemId:(long long)commerceOrderItemId unitPrice:(NSDictionary *)unitPrice promoPrice:(NSDictionary *)promoPrice discountAmount:(NSDictionary *)discountAmount finalPrice:(NSDictionary *)finalPrice discountPercentageLevel1:(NSDictionary *)discountPercentageLevel1 discountPercentageLevel2:(NSDictionary *)discountPercentageLevel2 discountPercentageLevel3:(NSDictionary *)discountPercentageLevel3 discountPercentageLevel4:(NSDictionary *)discountPercentageLevel4 unitPriceWithTaxAmount:(NSDictionary *)unitPriceWithTaxAmount promoPriceWithTaxAmount:(NSDictionary *)promoPriceWithTaxAmount discountAmountWithTaxAmount:(NSDictionary *)discountAmountWithTaxAmount finalPriceWithTaxAmount:(NSDictionary *)finalPriceWithTaxAmount discountPercentageLevel1WithTaxAmount:(NSDictionary *)discountPercentageLevel1WithTaxAmount discountPercentageLevel2WithTaxAmount:(NSDictionary *)discountPercentageLevel2WithTaxAmount discountPercentageLevel3WithTaxAmount:(NSDictionary *)discountPercentageLevel3WithTaxAmount discountPercentageLevel4WithTaxAmount:(NSDictionary *)discountPercentageLevel4WithTaxAmount error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemUnitPriceWithCommerceOrderItemId:(long long)commerceOrderItemId unitPrice:(NSDictionary *)unitPrice quantity:(int)quantity error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderItemUnitPriceWithCommerceOrderItemId:(long long)commerceOrderItemId unitPrice:(NSDictionary *)unitPrice error:(NSError **)error;
- (NSDictionary *)updateCustomFieldsWithCommerceOrderItemId:(long long)commerceOrderItemId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCommerceOrderItemWithCommerceOrderId:(long long)commerceOrderId cpInstanceId:(long long)cpInstanceId quantity:(int)quantity shippedQuantity:(int)shippedQuantity json:(NSString *)json commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)searchWithCommerceOrderId:(long long)commerceOrderId sku:(NSString *)sku name:(NSString *)name andOperator:(BOOL)andOperator start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)searchWithCommerceOrderId:(long long)commerceOrderId parentCommerceOrderItemId:(long long)parentCommerceOrderItemId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)searchWithCommerceOrderId:(long long)commerceOrderId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;

@end