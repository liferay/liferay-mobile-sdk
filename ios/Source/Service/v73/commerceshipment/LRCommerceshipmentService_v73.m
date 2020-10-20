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

#import "LRCommerceshipmentService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceshipmentService_v73

- (NSDictionary *)updateAddressWithCommerceShipmentId:(long long)commerceShipmentId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionId": @(commerceRegionId),
		@"commerceCountryId": @(commerceCountryId),
		@"phoneNumber": [self checkNull: phoneNumber]
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/update-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateStatusWithCommerceShipmentId:(long long)commerceShipmentId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/update-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/delete-commerce-shipment": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId restoreStockQuantity:(BOOL)restoreStockQuantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"restoreStockQuantity": @(restoreStockQuantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/delete-commerce-shipment": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceShipmentWithGroupId:(long long)groupId commerceAccountId:(long long)commerceAccountId commerceAddressId:(long long)commerceAddressId commerceShippingMethodId:(long long)commerceShippingMethodId commerceShippingOptionName:(NSString *)commerceShippingOptionName serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceAccountId": @(commerceAccountId),
		@"commerceAddressId": @(commerceAddressId),
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"commerceShippingOptionName": [self checkNull: commerceShippingOptionName],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceshipment/add-commerce-shipment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceShipmentWithCommerceOrderId:(long long)commerceOrderId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceshipment/add-commerce-shipment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShipmentsWithCompanyId:(long long)companyId commerceAddressId:(long long)commerceAddressId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"commerceAddressId": @(commerceAddressId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceShipment>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShipmentsWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds commerceAccountIds:(NSArray *)commerceAccountIds keywords:(NSString *)keywords shipmentStatuses:(NSArray *)shipmentStatuses excludeShipmentStatus:(BOOL)excludeShipmentStatus start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupIds": [self checkNull: groupIds],
		@"commerceAccountIds": [self checkNull: commerceAccountIds],
		@"keywords": [self checkNull: keywords],
		@"shipmentStatuses": [self checkNull: shipmentStatuses],
		@"excludeShipmentStatus": @(excludeShipmentStatus),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShipmentsWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceShipment>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShipmentsWithCompanyId:(long long)companyId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceShipment>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShipmentsCountWithCompanyId:(long long)companyId commerceAddressId:(long long)commerceAddressId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"commerceAddressId": @(commerceAddressId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShipmentsCountWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds commerceAccountIds:(NSArray *)commerceAccountIds keywords:(NSString *)keywords shipmentStatuses:(NSArray *)shipmentStatuses excludeShipmentStatus:(BOOL)excludeShipmentStatus error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupIds": [self checkNull: groupIds],
		@"commerceAccountIds": [self checkNull: commerceAccountIds],
		@"keywords": [self checkNull: keywords],
		@"shipmentStatuses": [self checkNull: shipmentStatuses],
		@"excludeShipmentStatus": @(excludeShipmentStatus)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShipmentsCountWithCompanyId:(long long)companyId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShipmentsCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCarrierDetailsWithCommerceShipmentId:(long long)commerceShipmentId carrier:(NSString *)carrier trackingNumber:(NSString *)trackingNumber error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"carrier": [self checkNull: carrier],
		@"trackingNumber": [self checkNull: trackingNumber]
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/update-carrier-details": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId carrier:(NSString *)carrier trackingNumber:(NSString *)trackingNumber status:(int)status shippingDateMonth:(int)shippingDateMonth shippingDateDay:(int)shippingDateDay shippingDateYear:(int)shippingDateYear shippingDateHour:(int)shippingDateHour shippingDateMinute:(int)shippingDateMinute expectedDateMonth:(int)expectedDateMonth expectedDateDay:(int)expectedDateDay expectedDateYear:(int)expectedDateYear expectedDateHour:(int)expectedDateHour expectedDateMinute:(int)expectedDateMinute error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"carrier": [self checkNull: carrier],
		@"trackingNumber": [self checkNull: trackingNumber],
		@"status": @(status),
		@"shippingDateMonth": @(shippingDateMonth),
		@"shippingDateDay": @(shippingDateDay),
		@"shippingDateYear": @(shippingDateYear),
		@"shippingDateHour": @(shippingDateHour),
		@"shippingDateMinute": @(shippingDateMinute),
		@"expectedDateMonth": @(expectedDateMonth),
		@"expectedDateDay": @(expectedDateDay),
		@"expectedDateYear": @(expectedDateYear),
		@"expectedDateHour": @(expectedDateHour),
		@"expectedDateMinute": @(expectedDateMinute)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/update-commerce-shipment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceShipmentWithCommerceShipmentId:(long long)commerceShipmentId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber carrier:(NSString *)carrier trackingNumber:(NSString *)trackingNumber status:(int)status shippingDateMonth:(int)shippingDateMonth shippingDateDay:(int)shippingDateDay shippingDateYear:(int)shippingDateYear shippingDateHour:(int)shippingDateHour shippingDateMinute:(int)shippingDateMinute expectedDateMonth:(int)expectedDateMonth expectedDateDay:(int)expectedDateDay expectedDateYear:(int)expectedDateYear expectedDateHour:(int)expectedDateHour expectedDateMinute:(int)expectedDateMinute error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
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
		@"carrier": [self checkNull: carrier],
		@"trackingNumber": [self checkNull: trackingNumber],
		@"status": @(status),
		@"shippingDateMonth": @(shippingDateMonth),
		@"shippingDateDay": @(shippingDateDay),
		@"shippingDateYear": @(shippingDateYear),
		@"shippingDateHour": @(shippingDateHour),
		@"shippingDateMinute": @(shippingDateMinute),
		@"expectedDateMonth": @(expectedDateMonth),
		@"expectedDateDay": @(expectedDateDay),
		@"expectedDateYear": @(expectedDateYear),
		@"expectedDateHour": @(expectedDateHour),
		@"expectedDateMinute": @(expectedDateMinute)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/update-commerce-shipment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateExpectedDateWithCommerceShipmentId:(long long)commerceShipmentId expectedDateMonth:(int)expectedDateMonth expectedDateDay:(int)expectedDateDay expectedDateYear:(int)expectedDateYear expectedDateHour:(int)expectedDateHour expectedDateMinute:(int)expectedDateMinute error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"expectedDateMonth": @(expectedDateMonth),
		@"expectedDateDay": @(expectedDateDay),
		@"expectedDateYear": @(expectedDateYear),
		@"expectedDateHour": @(expectedDateHour),
		@"expectedDateMinute": @(expectedDateMinute)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/update-expected-date": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateShippingDateWithCommerceShipmentId:(long long)commerceShipmentId shippingDateMonth:(int)shippingDateMonth shippingDateDay:(int)shippingDateDay shippingDateYear:(int)shippingDateYear shippingDateHour:(int)shippingDateHour shippingDateMinute:(int)shippingDateMinute error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"shippingDateMonth": @(shippingDateMonth),
		@"shippingDateDay": @(shippingDateDay),
		@"shippingDateYear": @(shippingDateYear),
		@"shippingDateHour": @(shippingDateHour),
		@"shippingDateMinute": @(shippingDateMinute)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/update-shipping-date": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShipmentsByOrderIdWithCommerceOrderId:(long long)commerceOrderId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments-by-order-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShipmentsCountByOrderIdWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderId": @(commerceOrderId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipment/get-commerce-shipments-count-by-order-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end