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

#import "LRCommerceorderService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceorderService_v73

- (NSDictionary *)updateUserWithCommerceOrderId:(long long)commerceOrderId userId:(long long)userId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"userId": @(userId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-user": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceOrderWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCustomFieldsWithCommerceOrderId:(long long)commerceOrderId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-custom-fields": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceOrderWithUserId:(long long)userId groupId:(long long)groupId commerceAccountId:(long long)commerceAccountId commerceCurrencyId:(long long)commerceCurrencyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"commerceCurrencyId": @(commerceCurrencyId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/add-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceOrderWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId commerceCurrencyId:(long long)commerceCurrencyId shippingAddressId:(long long)shippingAddressId purchaseOrderNumber:(NSString *)purchaseOrderNumber error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"commerceCurrencyId": @(commerceCurrencyId),
		@"shippingAddressId": @(shippingAddressId),
		@"purchaseOrderNumber": [self checkNull: purchaseOrderNumber]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/add-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceOrderWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId shippingAddressId:(long long)shippingAddressId purchaseOrderNumber:(NSString *)purchaseOrderNumber error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"shippingAddressId": @(shippingAddressId),
		@"purchaseOrderNumber": [self checkNull: purchaseOrderNumber]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/add-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)applyCouponCodeWithCommerceOrderId:(long long)commerceOrderId couponCode:(NSString *)couponCode commerceContext:(LRJSONObjectWrapper *)commerceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"couponCode": [self checkNull: couponCode],
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/apply-coupon-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceOrderWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/delete-commerce-order": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)executeWorkflowTransitionWithCommerceOrderId:(long long)commerceOrderId workflowTaskId:(long long)workflowTaskId transitionName:(NSString *)transitionName comment:(NSString *)comment error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"workflowTaskId": @(workflowTaskId),
		@"transitionName": [self checkNull: transitionName],
		@"comment": [self checkNull: comment]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/execute-workflow-transition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceOrderWithUuid:(NSString *)uuid groupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"uuid": [self checkNull: uuid],
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/fetch-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceOrderWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/fetch-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceOrderWithCommerceAccountId:(long long)commerceAccountId groupId:(long long)groupId orderStatus:(int)orderStatus error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"groupId": @(groupId),
		@"orderStatus": @(orderStatus)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/fetch-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceOrderWithCommerceAccountId:(long long)commerceAccountId groupId:(long long)groupId userId:(long long)userId orderStatus:(int)orderStatus error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"orderStatus": @(orderStatus)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/fetch-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceOrderByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"uuid": [self checkNull: uuid],
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-commerce-order-by-uuid-and-group-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceOrdersWithGroupId:(long long)groupId orderStatuses:(NSArray *)orderStatuses start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"orderStatuses": [self checkNull: orderStatuses],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-commerce-orders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceOrdersWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceOrder>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-commerce-orders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceOrdersWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceOrder>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-commerce-orders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceOrdersWithGroupId:(long long)groupId orderStatuses:(NSArray *)orderStatuses error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"orderStatuses": [self checkNull: orderStatuses]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-commerce-orders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceOrdersCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-commerce-orders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceOrdersCountWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-commerce-orders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getPendingCommerceOrdersWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId keywords:(NSString *)keywords start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-pending-commerce-orders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getPendingCommerceOrdersCountWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-pending-commerce-orders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getPendingCommerceOrdersCountWithCompanyId:(long long)companyId groupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-pending-commerce-orders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getPlacedCommerceOrdersWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId keywords:(NSString *)keywords start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-placed-commerce-orders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getPlacedCommerceOrdersWithCompanyId:(long long)companyId groupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-placed-commerce-orders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getPlacedCommerceOrdersCountWithCompanyId:(long long)companyId groupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-placed-commerce-orders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getPlacedCommerceOrdersCountWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-placed-commerce-orders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserPendingCommerceOrdersWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-user-pending-commerce-orders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getUserPendingCommerceOrdersCountWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-user-pending-commerce-orders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserPlacedCommerceOrdersWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-user-placed-commerce-orders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getUserPlacedCommerceOrdersCountWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/get-user-placed-commerce-orders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)mergeGuestCommerceOrderWithGuestCommerceOrderId:(long long)guestCommerceOrderId userCommerceOrderId:(long long)userCommerceOrderId commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"guestCommerceOrderId": @(guestCommerceOrderId),
		@"userCommerceOrderId": @(userCommerceOrderId),
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/merge-guest-commerce-order": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)recalculatePriceWithCommerceOrderId:(long long)commerceOrderId commerceContext:(LRJSONObjectWrapper *)commerceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/recalculate-price": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)reorderCommerceOrderWithCommerceOrderId:(long long)commerceOrderId commerceContext:(LRJSONObjectWrapper *)commerceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/reorder-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateBillingAddressWithCommerceOrderId:(long long)commerceOrderId billingAddressId:(long long)billingAddressId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"billingAddressId": @(billingAddressId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-billing-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateBillingAddressWithCommerceOrderId:(long long)commerceOrderId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionId": @(commerceRegionId),
		@"commerceCountryId": @(commerceCountryId),
		@"phoneNumber": [self checkNull: phoneNumber],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-billing-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderWithCommerceOrderId:(long long)commerceOrderId billingAddressId:(long long)billingAddressId shippingAddressId:(long long)shippingAddressId commercePaymentMethodKey:(NSString *)commercePaymentMethodKey commerceShippingMethodId:(long long)commerceShippingMethodId shippingOptionName:(NSString *)shippingOptionName purchaseOrderNumber:(NSString *)purchaseOrderNumber subtotal:(NSDictionary *)subtotal shippingAmount:(NSDictionary *)shippingAmount total:(NSDictionary *)total advanceStatus:(NSString *)advanceStatus externalReferenceCode:(NSString *)externalReferenceCode commerceContext:(LRJSONObjectWrapper *)commerceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"billingAddressId": @(billingAddressId),
		@"shippingAddressId": @(shippingAddressId),
		@"commercePaymentMethodKey": [self checkNull: commercePaymentMethodKey],
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"shippingOptionName": [self checkNull: shippingOptionName],
		@"purchaseOrderNumber": [self checkNull: purchaseOrderNumber],
		@"subtotal": [self checkNull: subtotal],
		@"shippingAmount": [self checkNull: shippingAmount],
		@"total": [self checkNull: total],
		@"advanceStatus": [self checkNull: advanceStatus],
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderWithCommerceOrderId:(long long)commerceOrderId billingAddressId:(long long)billingAddressId shippingAddressId:(long long)shippingAddressId commercePaymentMethodKey:(NSString *)commercePaymentMethodKey commerceShippingMethodId:(long long)commerceShippingMethodId shippingOptionName:(NSString *)shippingOptionName purchaseOrderNumber:(NSString *)purchaseOrderNumber subtotal:(NSDictionary *)subtotal shippingAmount:(NSDictionary *)shippingAmount total:(NSDictionary *)total subtotalWithTaxAmount:(NSDictionary *)subtotalWithTaxAmount shippingWithTaxAmount:(NSDictionary *)shippingWithTaxAmount totalWithTaxAmount:(NSDictionary *)totalWithTaxAmount advanceStatus:(NSString *)advanceStatus externalReferenceCode:(NSString *)externalReferenceCode commerceContext:(LRJSONObjectWrapper *)commerceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"billingAddressId": @(billingAddressId),
		@"shippingAddressId": @(shippingAddressId),
		@"commercePaymentMethodKey": [self checkNull: commercePaymentMethodKey],
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"shippingOptionName": [self checkNull: shippingOptionName],
		@"purchaseOrderNumber": [self checkNull: purchaseOrderNumber],
		@"subtotal": [self checkNull: subtotal],
		@"shippingAmount": [self checkNull: shippingAmount],
		@"total": [self checkNull: total],
		@"subtotalWithTaxAmount": [self checkNull: subtotalWithTaxAmount],
		@"shippingWithTaxAmount": [self checkNull: shippingWithTaxAmount],
		@"totalWithTaxAmount": [self checkNull: totalWithTaxAmount],
		@"advanceStatus": [self checkNull: advanceStatus],
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderWithCommerceOrder:(LRJSONObjectWrapper *)commerceOrder error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"commerceOrder" className:@"com.liferay.commerce.model.CommerceOrder" wrapper:commerceOrder];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderWithCommerceOrderId:(long long)commerceOrderId billingAddressId:(long long)billingAddressId shippingAddressId:(long long)shippingAddressId commercePaymentMethodKey:(NSString *)commercePaymentMethodKey commerceShippingMethodId:(long long)commerceShippingMethodId shippingOptionName:(NSString *)shippingOptionName purchaseOrderNumber:(NSString *)purchaseOrderNumber subtotal:(NSDictionary *)subtotal shippingAmount:(NSDictionary *)shippingAmount total:(NSDictionary *)total advanceStatus:(NSString *)advanceStatus commerceContext:(LRJSONObjectWrapper *)commerceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"billingAddressId": @(billingAddressId),
		@"shippingAddressId": @(shippingAddressId),
		@"commercePaymentMethodKey": [self checkNull: commercePaymentMethodKey],
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"shippingOptionName": [self checkNull: shippingOptionName],
		@"purchaseOrderNumber": [self checkNull: purchaseOrderNumber],
		@"subtotal": [self checkNull: subtotal],
		@"shippingAmount": [self checkNull: shippingAmount],
		@"total": [self checkNull: total],
		@"advanceStatus": [self checkNull: advanceStatus],
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderExternalReferenceCodeWithCommerceOrderId:(long long)commerceOrderId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-commerce-order-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderPricesWithCommerceOrderId:(long long)commerceOrderId subtotal:(NSDictionary *)subtotal subtotalDiscountAmount:(NSDictionary *)subtotalDiscountAmount subtotalDiscountPercentageLevel1:(NSDictionary *)subtotalDiscountPercentageLevel1 subtotalDiscountPercentageLevel2:(NSDictionary *)subtotalDiscountPercentageLevel2 subtotalDiscountPercentageLevel3:(NSDictionary *)subtotalDiscountPercentageLevel3 subtotalDiscountPercentageLevel4:(NSDictionary *)subtotalDiscountPercentageLevel4 shippingAmount:(NSDictionary *)shippingAmount shippingDiscountAmount:(NSDictionary *)shippingDiscountAmount shippingDiscountPercentageLevel1:(NSDictionary *)shippingDiscountPercentageLevel1 shippingDiscountPercentageLevel2:(NSDictionary *)shippingDiscountPercentageLevel2 shippingDiscountPercentageLevel3:(NSDictionary *)shippingDiscountPercentageLevel3 shippingDiscountPercentageLevel4:(NSDictionary *)shippingDiscountPercentageLevel4 taxAmount:(NSDictionary *)taxAmount total:(NSDictionary *)total totalDiscountAmount:(NSDictionary *)totalDiscountAmount totalDiscountPercentageLevel1:(NSDictionary *)totalDiscountPercentageLevel1 totalDiscountPercentageLevel2:(NSDictionary *)totalDiscountPercentageLevel2 totalDiscountPercentageLevel3:(NSDictionary *)totalDiscountPercentageLevel3 totalDiscountPercentageLevel4:(NSDictionary *)totalDiscountPercentageLevel4 error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"subtotal": [self checkNull: subtotal],
		@"subtotalDiscountAmount": [self checkNull: subtotalDiscountAmount],
		@"subtotalDiscountPercentageLevel1": [self checkNull: subtotalDiscountPercentageLevel1],
		@"subtotalDiscountPercentageLevel2": [self checkNull: subtotalDiscountPercentageLevel2],
		@"subtotalDiscountPercentageLevel3": [self checkNull: subtotalDiscountPercentageLevel3],
		@"subtotalDiscountPercentageLevel4": [self checkNull: subtotalDiscountPercentageLevel4],
		@"shippingAmount": [self checkNull: shippingAmount],
		@"shippingDiscountAmount": [self checkNull: shippingDiscountAmount],
		@"shippingDiscountPercentageLevel1": [self checkNull: shippingDiscountPercentageLevel1],
		@"shippingDiscountPercentageLevel2": [self checkNull: shippingDiscountPercentageLevel2],
		@"shippingDiscountPercentageLevel3": [self checkNull: shippingDiscountPercentageLevel3],
		@"shippingDiscountPercentageLevel4": [self checkNull: shippingDiscountPercentageLevel4],
		@"taxAmount": [self checkNull: taxAmount],
		@"total": [self checkNull: total],
		@"totalDiscountAmount": [self checkNull: totalDiscountAmount],
		@"totalDiscountPercentageLevel1": [self checkNull: totalDiscountPercentageLevel1],
		@"totalDiscountPercentageLevel2": [self checkNull: totalDiscountPercentageLevel2],
		@"totalDiscountPercentageLevel3": [self checkNull: totalDiscountPercentageLevel3],
		@"totalDiscountPercentageLevel4": [self checkNull: totalDiscountPercentageLevel4]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-commerce-order-prices": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceOrderPricesWithCommerceOrderId:(long long)commerceOrderId subtotal:(NSDictionary *)subtotal subtotalDiscountAmount:(NSDictionary *)subtotalDiscountAmount subtotalDiscountPercentageLevel1:(NSDictionary *)subtotalDiscountPercentageLevel1 subtotalDiscountPercentageLevel2:(NSDictionary *)subtotalDiscountPercentageLevel2 subtotalDiscountPercentageLevel3:(NSDictionary *)subtotalDiscountPercentageLevel3 subtotalDiscountPercentageLevel4:(NSDictionary *)subtotalDiscountPercentageLevel4 shippingAmount:(NSDictionary *)shippingAmount shippingDiscountAmount:(NSDictionary *)shippingDiscountAmount shippingDiscountPercentageLevel1:(NSDictionary *)shippingDiscountPercentageLevel1 shippingDiscountPercentageLevel2:(NSDictionary *)shippingDiscountPercentageLevel2 shippingDiscountPercentageLevel3:(NSDictionary *)shippingDiscountPercentageLevel3 shippingDiscountPercentageLevel4:(NSDictionary *)shippingDiscountPercentageLevel4 taxAmount:(NSDictionary *)taxAmount total:(NSDictionary *)total totalDiscountAmount:(NSDictionary *)totalDiscountAmount totalDiscountPercentageLevel1:(NSDictionary *)totalDiscountPercentageLevel1 totalDiscountPercentageLevel2:(NSDictionary *)totalDiscountPercentageLevel2 totalDiscountPercentageLevel3:(NSDictionary *)totalDiscountPercentageLevel3 totalDiscountPercentageLevel4:(NSDictionary *)totalDiscountPercentageLevel4 subtotalWithTaxAmount:(NSDictionary *)subtotalWithTaxAmount subtotalDiscountWithTaxAmount:(NSDictionary *)subtotalDiscountWithTaxAmount subtotalDiscountPercentageLevel1WithTaxAmount:(NSDictionary *)subtotalDiscountPercentageLevel1WithTaxAmount subtotalDiscountPercentageLevel2WithTaxAmount:(NSDictionary *)subtotalDiscountPercentageLevel2WithTaxAmount subtotalDiscountPercentageLevel3WithTaxAmount:(NSDictionary *)subtotalDiscountPercentageLevel3WithTaxAmount subtotalDiscountPercentageLevel4WithTaxAmount:(NSDictionary *)subtotalDiscountPercentageLevel4WithTaxAmount shippingWithTaxAmount:(NSDictionary *)shippingWithTaxAmount shippingDiscountWithTaxAmount:(NSDictionary *)shippingDiscountWithTaxAmount shippingDiscountPercentageLevel1WithTaxAmount:(NSDictionary *)shippingDiscountPercentageLevel1WithTaxAmount shippingDiscountPercentageLevel2WithTaxAmount:(NSDictionary *)shippingDiscountPercentageLevel2WithTaxAmount shippingDiscountPercentageLevel3WithTaxAmount:(NSDictionary *)shippingDiscountPercentageLevel3WithTaxAmount shippingDiscountPercentageLevel4WithTaxAmount:(NSDictionary *)shippingDiscountPercentageLevel4WithTaxAmount totalWithTaxAmount:(NSDictionary *)totalWithTaxAmount totalDiscountWithTaxAmount:(NSDictionary *)totalDiscountWithTaxAmount totalDiscountPercentageLevel1WithTaxAmount:(NSDictionary *)totalDiscountPercentageLevel1WithTaxAmount totalDiscountPercentageLevel2WithTaxAmount:(NSDictionary *)totalDiscountPercentageLevel2WithTaxAmount totalDiscountPercentageLevel3WithTaxAmount:(NSDictionary *)totalDiscountPercentageLevel3WithTaxAmount totalDiscountPercentageLevel4WithTaxAmount:(NSDictionary *)totalDiscountPercentageLevel4WithTaxAmount error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"subtotal": [self checkNull: subtotal],
		@"subtotalDiscountAmount": [self checkNull: subtotalDiscountAmount],
		@"subtotalDiscountPercentageLevel1": [self checkNull: subtotalDiscountPercentageLevel1],
		@"subtotalDiscountPercentageLevel2": [self checkNull: subtotalDiscountPercentageLevel2],
		@"subtotalDiscountPercentageLevel3": [self checkNull: subtotalDiscountPercentageLevel3],
		@"subtotalDiscountPercentageLevel4": [self checkNull: subtotalDiscountPercentageLevel4],
		@"shippingAmount": [self checkNull: shippingAmount],
		@"shippingDiscountAmount": [self checkNull: shippingDiscountAmount],
		@"shippingDiscountPercentageLevel1": [self checkNull: shippingDiscountPercentageLevel1],
		@"shippingDiscountPercentageLevel2": [self checkNull: shippingDiscountPercentageLevel2],
		@"shippingDiscountPercentageLevel3": [self checkNull: shippingDiscountPercentageLevel3],
		@"shippingDiscountPercentageLevel4": [self checkNull: shippingDiscountPercentageLevel4],
		@"taxAmount": [self checkNull: taxAmount],
		@"total": [self checkNull: total],
		@"totalDiscountAmount": [self checkNull: totalDiscountAmount],
		@"totalDiscountPercentageLevel1": [self checkNull: totalDiscountPercentageLevel1],
		@"totalDiscountPercentageLevel2": [self checkNull: totalDiscountPercentageLevel2],
		@"totalDiscountPercentageLevel3": [self checkNull: totalDiscountPercentageLevel3],
		@"totalDiscountPercentageLevel4": [self checkNull: totalDiscountPercentageLevel4],
		@"subtotalWithTaxAmount": [self checkNull: subtotalWithTaxAmount],
		@"subtotalDiscountWithTaxAmount": [self checkNull: subtotalDiscountWithTaxAmount],
		@"subtotalDiscountPercentageLevel1WithTaxAmount": [self checkNull: subtotalDiscountPercentageLevel1WithTaxAmount],
		@"subtotalDiscountPercentageLevel2WithTaxAmount": [self checkNull: subtotalDiscountPercentageLevel2WithTaxAmount],
		@"subtotalDiscountPercentageLevel3WithTaxAmount": [self checkNull: subtotalDiscountPercentageLevel3WithTaxAmount],
		@"subtotalDiscountPercentageLevel4WithTaxAmount": [self checkNull: subtotalDiscountPercentageLevel4WithTaxAmount],
		@"shippingWithTaxAmount": [self checkNull: shippingWithTaxAmount],
		@"shippingDiscountWithTaxAmount": [self checkNull: shippingDiscountWithTaxAmount],
		@"shippingDiscountPercentageLevel1WithTaxAmount": [self checkNull: shippingDiscountPercentageLevel1WithTaxAmount],
		@"shippingDiscountPercentageLevel2WithTaxAmount": [self checkNull: shippingDiscountPercentageLevel2WithTaxAmount],
		@"shippingDiscountPercentageLevel3WithTaxAmount": [self checkNull: shippingDiscountPercentageLevel3WithTaxAmount],
		@"shippingDiscountPercentageLevel4WithTaxAmount": [self checkNull: shippingDiscountPercentageLevel4WithTaxAmount],
		@"totalWithTaxAmount": [self checkNull: totalWithTaxAmount],
		@"totalDiscountWithTaxAmount": [self checkNull: totalDiscountWithTaxAmount],
		@"totalDiscountPercentageLevel1WithTaxAmount": [self checkNull: totalDiscountPercentageLevel1WithTaxAmount],
		@"totalDiscountPercentageLevel2WithTaxAmount": [self checkNull: totalDiscountPercentageLevel2WithTaxAmount],
		@"totalDiscountPercentageLevel3WithTaxAmount": [self checkNull: totalDiscountPercentageLevel3WithTaxAmount],
		@"totalDiscountPercentageLevel4WithTaxAmount": [self checkNull: totalDiscountPercentageLevel4WithTaxAmount]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-commerce-order-prices": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommercePaymentMethodKeyWithCommerceOrderId:(long long)commerceOrderId commercePaymentMethodKey:(NSString *)commercePaymentMethodKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"commercePaymentMethodKey": [self checkNull: commercePaymentMethodKey]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-commerce-payment-method-key": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateInfoWithCommerceOrderId:(long long)commerceOrderId printedNote:(NSString *)printedNote requestedDeliveryDateMonth:(int)requestedDeliveryDateMonth requestedDeliveryDateDay:(int)requestedDeliveryDateDay requestedDeliveryDateYear:(int)requestedDeliveryDateYear requestedDeliveryDateHour:(int)requestedDeliveryDateHour requestedDeliveryDateMinute:(int)requestedDeliveryDateMinute serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"printedNote": [self checkNull: printedNote],
		@"requestedDeliveryDateMonth": @(requestedDeliveryDateMonth),
		@"requestedDeliveryDateDay": @(requestedDeliveryDateDay),
		@"requestedDeliveryDateYear": @(requestedDeliveryDateYear),
		@"requestedDeliveryDateHour": @(requestedDeliveryDateHour),
		@"requestedDeliveryDateMinute": @(requestedDeliveryDateMinute),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateOrderDateWithCommerceOrderId:(long long)commerceOrderId orderDateMonth:(int)orderDateMonth orderDateDay:(int)orderDateDay orderDateYear:(int)orderDateYear orderDateHour:(int)orderDateHour orderDateMinute:(int)orderDateMinute serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"orderDateMonth": @(orderDateMonth),
		@"orderDateDay": @(orderDateDay),
		@"orderDateYear": @(orderDateYear),
		@"orderDateHour": @(orderDateHour),
		@"orderDateMinute": @(orderDateMinute),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-order-date": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePaymentStatusWithCommerceOrderId:(long long)commerceOrderId paymentStatus:(int)paymentStatus error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"paymentStatus": @(paymentStatus)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-payment-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePaymentStatusAndTransactionIdWithCommerceOrderId:(long long)commerceOrderId paymentStatus:(int)paymentStatus transactionId:(NSString *)transactionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"paymentStatus": @(paymentStatus),
		@"transactionId": [self checkNull: transactionId]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-payment-status-and-transaction-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePrintedNoteWithCommerceOrderId:(long long)commerceOrderId printedNote:(NSString *)printedNote error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"printedNote": [self checkNull: printedNote]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-printed-note": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePurchaseOrderNumberWithCommerceOrderId:(long long)commerceOrderId purchaseOrderNumber:(NSString *)purchaseOrderNumber error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"purchaseOrderNumber": [self checkNull: purchaseOrderNumber]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-purchase-order-number": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateShippingAddressWithCommerceOrderId:(long long)commerceOrderId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionId": @(commerceRegionId),
		@"commerceCountryId": @(commerceCountryId),
		@"phoneNumber": [self checkNull: phoneNumber],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-shipping-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateShippingAddressWithCommerceOrderId:(long long)commerceOrderId shippingAddressId:(long long)shippingAddressId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"shippingAddressId": @(shippingAddressId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-shipping-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateTransactionIdWithCommerceOrderId:(long long)commerceOrderId transactionId:(NSString *)transactionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"transactionId": [self checkNull: transactionId]
	}];

	NSDictionary *_command = @{@"/commerce.commerceorder/update-transaction-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceOrderWithUserId:(long long)userId groupId:(long long)groupId commerceAccountId:(long long)commerceAccountId commerceCurrencyId:(long long)commerceCurrencyId billingAddressId:(long long)billingAddressId shippingAddressId:(long long)shippingAddressId commercePaymentMethodKey:(NSString *)commercePaymentMethodKey commerceShippingMethodId:(long long)commerceShippingMethodId shippingOptionName:(NSString *)shippingOptionName purchaseOrderNumber:(NSString *)purchaseOrderNumber subtotal:(NSDictionary *)subtotal shippingAmount:(NSDictionary *)shippingAmount total:(NSDictionary *)total subtotalWithTaxAmount:(NSDictionary *)subtotalWithTaxAmount shippingWithTaxAmount:(NSDictionary *)shippingWithTaxAmount totalWithTaxAmount:(NSDictionary *)totalWithTaxAmount paymentStatus:(int)paymentStatus orderStatus:(int)orderStatus advanceStatus:(NSString *)advanceStatus externalReferenceCode:(NSString *)externalReferenceCode commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"commerceCurrencyId": @(commerceCurrencyId),
		@"billingAddressId": @(billingAddressId),
		@"shippingAddressId": @(shippingAddressId),
		@"commercePaymentMethodKey": [self checkNull: commercePaymentMethodKey],
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"shippingOptionName": [self checkNull: shippingOptionName],
		@"purchaseOrderNumber": [self checkNull: purchaseOrderNumber],
		@"subtotal": [self checkNull: subtotal],
		@"shippingAmount": [self checkNull: shippingAmount],
		@"total": [self checkNull: total],
		@"subtotalWithTaxAmount": [self checkNull: subtotalWithTaxAmount],
		@"shippingWithTaxAmount": [self checkNull: shippingWithTaxAmount],
		@"totalWithTaxAmount": [self checkNull: totalWithTaxAmount],
		@"paymentStatus": @(paymentStatus),
		@"orderStatus": @(orderStatus),
		@"advanceStatus": [self checkNull: advanceStatus],
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/upsert-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceOrderWithUserId:(long long)userId groupId:(long long)groupId commerceAccountId:(long long)commerceAccountId commerceCurrencyId:(long long)commerceCurrencyId billingAddressId:(long long)billingAddressId shippingAddressId:(long long)shippingAddressId commercePaymentMethodKey:(NSString *)commercePaymentMethodKey commerceShippingMethodId:(long long)commerceShippingMethodId shippingOptionName:(NSString *)shippingOptionName purchaseOrderNumber:(NSString *)purchaseOrderNumber subtotal:(NSDictionary *)subtotal shippingAmount:(NSDictionary *)shippingAmount total:(NSDictionary *)total paymentStatus:(int)paymentStatus orderStatus:(int)orderStatus advanceStatus:(NSString *)advanceStatus externalReferenceCode:(NSString *)externalReferenceCode commerceContext:(LRJSONObjectWrapper *)commerceContext serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"commerceCurrencyId": @(commerceCurrencyId),
		@"billingAddressId": @(billingAddressId),
		@"shippingAddressId": @(shippingAddressId),
		@"commercePaymentMethodKey": [self checkNull: commercePaymentMethodKey],
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"shippingOptionName": [self checkNull: shippingOptionName],
		@"purchaseOrderNumber": [self checkNull: purchaseOrderNumber],
		@"subtotal": [self checkNull: subtotal],
		@"shippingAmount": [self checkNull: shippingAmount],
		@"total": [self checkNull: total],
		@"paymentStatus": @(paymentStatus),
		@"orderStatus": @(orderStatus),
		@"advanceStatus": [self checkNull: advanceStatus],
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"commerceContext" className:@"com.liferay.commerce.context.CommerceContext" wrapper:commerceContext];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceorder/upsert-commerce-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end