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

#import "LRCommerceorderitemService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceorderitemService_v73

- (void)deleteCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId commerceContext:(LRJSONObjectWrapper *)commerceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/delete-commerce-order-item": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/delete-commerce-order-item": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceOrderItemsWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId orderStatuses:(NSArray *)orderStatuses start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"orderStatuses": [self checkNull: orderStatuses],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-commerce-order-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceOrderItemsWithCommerceOrderId:(long long)commerceOrderId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-commerce-order-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getChildCommerceOrderItemsWithParentCommerceOrderItemId:(long long)parentCommerceOrderItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"parentCommerceOrderItemId": @(parentCommerceOrderItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-child-commerce-order-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceOrderItemsCountWithCommerceOrderId:(long long)commerceOrderId cpInstanceId:(long long)cpInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"cpInstanceId": @(cpInstanceId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-commerce-order-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceOrderItemsCountWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId orderStatuses:(NSArray *)orderStatuses error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"orderStatuses": [self checkNull: orderStatuses]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-commerce-order-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceOrderItemsCountWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-commerce-order-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceOrderItemWithCommerceOrderId:(long long)commerceOrderId cpInstanceId:(long long)cpInstanceId quantity:(int)quantity shippedQuantity:(int)shippedQuantity json:(NSString *)json commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"cpInstanceId": @(cpInstanceId),
		@"quantity": @(quantity),
		@"shippedQuantity": @(shippedQuantity),
		@"json": [self checkNull: json],
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/add-commerce-order-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)countSubscriptionCommerceOrderItemsWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/count-subscription-commerce-order-items": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceOrderItemsWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/delete-commerce-order-items": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/fetch-commerce-order-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getAvailableForShipmentCommerceOrderItemsWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-available-for-shipment-commerce-order-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryWarehouseItemQuantityWithCommerceOrderItemId:(long long)commerceOrderItemId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-commerce-inventory-warehouse-item-quantity": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-commerce-order-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceOrderItemsQuantityWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/get-commerce-order-items-quantity": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId quantity:(int)quantity json:(NSString *)json commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"quantity": @(quantity),
		@"json": [self checkNull: json],
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemWithCommerceOrderItemId:(long long)commerceOrderItemId quantity:(int)quantity commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"quantity": @(quantity),
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemDeliveryDateWithCommerceOrderItemId:(long long)commerceOrderItemId requestedDeliveryDate:(long long)requestedDeliveryDate error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"requestedDeliveryDate": @(requestedDeliveryDate)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item-delivery-date": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemInfoWithCommerceOrderItemId:(long long)commerceOrderItemId deliveryGroup:(NSString *)deliveryGroup shippingAddressId:(long long)shippingAddressId printedNote:(NSString *)printedNote requestedDeliveryDateMonth:(int)requestedDeliveryDateMonth requestedDeliveryDateDay:(int)requestedDeliveryDateDay requestedDeliveryDateYear:(int)requestedDeliveryDateYear error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"deliveryGroup": [self checkNull: deliveryGroup],
		@"shippingAddressId": @(shippingAddressId),
		@"printedNote": [self checkNull: printedNote],
		@"requestedDeliveryDateMonth": @(requestedDeliveryDateMonth),
		@"requestedDeliveryDateDay": @(requestedDeliveryDateDay),
		@"requestedDeliveryDateYear": @(requestedDeliveryDateYear)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemInfoWithCommerceOrderItemId:(long long)commerceOrderItemId deliveryGroup:(NSString *)deliveryGroup shippingAddressId:(long long)shippingAddressId printedNote:(NSString *)printedNote requestedDeliveryDateMonth:(int)requestedDeliveryDateMonth requestedDeliveryDateDay:(int)requestedDeliveryDateDay requestedDeliveryDateYear:(int)requestedDeliveryDateYear requestedDeliveryDateHour:(int)requestedDeliveryDateHour requestedDeliveryDateMinute:(int)requestedDeliveryDateMinute serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"deliveryGroup": [self checkNull: deliveryGroup],
		@"shippingAddressId": @(shippingAddressId),
		@"printedNote": [self checkNull: printedNote],
		@"requestedDeliveryDateMonth": @(requestedDeliveryDateMonth),
		@"requestedDeliveryDateDay": @(requestedDeliveryDateDay),
		@"requestedDeliveryDateYear": @(requestedDeliveryDateYear),
		@"requestedDeliveryDateHour": @(requestedDeliveryDateHour),
		@"requestedDeliveryDateMinute": @(requestedDeliveryDateMinute),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemInfoWithCommerceOrderItemId:(long long)commerceOrderItemId deliveryGroup:(NSString *)deliveryGroup shippingAddressId:(long long)shippingAddressId printedNote:(NSString *)printedNote error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"deliveryGroup": [self checkNull: deliveryGroup],
		@"shippingAddressId": @(shippingAddressId),
		@"printedNote": [self checkNull: printedNote]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemPricesWithCommerceOrderItemId:(long long)commerceOrderItemId unitPrice:(NSDictionary *)unitPrice promoPrice:(NSDictionary *)promoPrice discountAmount:(NSDictionary *)discountAmount finalPrice:(NSDictionary *)finalPrice discountPercentageLevel1:(NSDictionary *)discountPercentageLevel1 discountPercentageLevel2:(NSDictionary *)discountPercentageLevel2 discountPercentageLevel3:(NSDictionary *)discountPercentageLevel3 discountPercentageLevel4:(NSDictionary *)discountPercentageLevel4 error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"unitPrice": [self checkNull: unitPrice],
		@"promoPrice": [self checkNull: promoPrice],
		@"discountAmount": [self checkNull: discountAmount],
		@"finalPrice": [self checkNull: finalPrice],
		@"discountPercentageLevel1": [self checkNull: discountPercentageLevel1],
		@"discountPercentageLevel2": [self checkNull: discountPercentageLevel2],
		@"discountPercentageLevel3": [self checkNull: discountPercentageLevel3],
		@"discountPercentageLevel4": [self checkNull: discountPercentageLevel4]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item-prices": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemPricesWithCommerceOrderItemId:(long long)commerceOrderItemId unitPrice:(NSDictionary *)unitPrice promoPrice:(NSDictionary *)promoPrice discountAmount:(NSDictionary *)discountAmount finalPrice:(NSDictionary *)finalPrice discountPercentageLevel1:(NSDictionary *)discountPercentageLevel1 discountPercentageLevel2:(NSDictionary *)discountPercentageLevel2 discountPercentageLevel3:(NSDictionary *)discountPercentageLevel3 discountPercentageLevel4:(NSDictionary *)discountPercentageLevel4 unitPriceWithTaxAmount:(NSDictionary *)unitPriceWithTaxAmount promoPriceWithTaxAmount:(NSDictionary *)promoPriceWithTaxAmount discountAmountWithTaxAmount:(NSDictionary *)discountAmountWithTaxAmount finalPriceWithTaxAmount:(NSDictionary *)finalPriceWithTaxAmount discountPercentageLevel1WithTaxAmount:(NSDictionary *)discountPercentageLevel1WithTaxAmount discountPercentageLevel2WithTaxAmount:(NSDictionary *)discountPercentageLevel2WithTaxAmount discountPercentageLevel3WithTaxAmount:(NSDictionary *)discountPercentageLevel3WithTaxAmount discountPercentageLevel4WithTaxAmount:(NSDictionary *)discountPercentageLevel4WithTaxAmount error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"unitPrice": [self checkNull: unitPrice],
		@"promoPrice": [self checkNull: promoPrice],
		@"discountAmount": [self checkNull: discountAmount],
		@"finalPrice": [self checkNull: finalPrice],
		@"discountPercentageLevel1": [self checkNull: discountPercentageLevel1],
		@"discountPercentageLevel2": [self checkNull: discountPercentageLevel2],
		@"discountPercentageLevel3": [self checkNull: discountPercentageLevel3],
		@"discountPercentageLevel4": [self checkNull: discountPercentageLevel4],
		@"unitPriceWithTaxAmount": [self checkNull: unitPriceWithTaxAmount],
		@"promoPriceWithTaxAmount": [self checkNull: promoPriceWithTaxAmount],
		@"discountAmountWithTaxAmount": [self checkNull: discountAmountWithTaxAmount],
		@"finalPriceWithTaxAmount": [self checkNull: finalPriceWithTaxAmount],
		@"discountPercentageLevel1WithTaxAmount": [self checkNull: discountPercentageLevel1WithTaxAmount],
		@"discountPercentageLevel2WithTaxAmount": [self checkNull: discountPercentageLevel2WithTaxAmount],
		@"discountPercentageLevel3WithTaxAmount": [self checkNull: discountPercentageLevel3WithTaxAmount],
		@"discountPercentageLevel4WithTaxAmount": [self checkNull: discountPercentageLevel4WithTaxAmount]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item-prices": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemUnitPriceWithCommerceOrderItemId:(long long)commerceOrderItemId unitPrice:(NSDictionary *)unitPrice quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"unitPrice": [self checkNull: unitPrice],
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item-unit-price": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderItemUnitPriceWithCommerceOrderItemId:(long long)commerceOrderItemId unitPrice:(NSDictionary *)unitPrice error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"unitPrice": [self checkNull: unitPrice]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-commerce-order-item-unit-price": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCustomFieldsWithCommerceOrderItemId:(long long)commerceOrderItemId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/update-custom-fields": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceOrderItemWithCommerceOrderId:(long long)commerceOrderId cpInstanceId:(long long)cpInstanceId quantity:(int)quantity shippedQuantity:(int)shippedQuantity json:(NSString *)json commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"cpInstanceId": @(cpInstanceId),
		@"quantity": @(quantity),
		@"shippedQuantity": @(shippedQuantity),
		@"json": [self checkNull: json],
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/upsert-commerce-order-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithCommerceOrderId:(long long)commerceOrderId sku:(NSString *)sku name:(NSString *)name andOperator:(BOOL)andOperator start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"sku": [self checkNull: sku],
		@"name": [self checkNull: name],
		@"andOperator": @(andOperator),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithCommerceOrderId:(long long)commerceOrderId parentCommerceOrderItemId:(long long)parentCommerceOrderItemId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"parentCommerceOrderItemId": @(parentCommerceOrderItemId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithCommerceOrderId:(long long)commerceOrderId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commerceorderitem/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end