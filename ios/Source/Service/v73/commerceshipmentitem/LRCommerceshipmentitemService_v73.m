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

#import "LRCommerceshipmentitemService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceshipmentitemService_v73

- (NSArray *)getCommerceShipmentItemsWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/get-commerce-shipment-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShipmentItemsWithCommerceShipmentId:(long long)commerceShipmentId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceShipmentItem>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/get-commerce-shipment-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceShipmentItemWithCommerceShipmentId:(long long)commerceShipmentId commerceOrderItemId:(long long)commerceOrderItemId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId quantity:(int)quantity serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"quantity": @(quantity),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/add-commerce-shipment-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceShipmentItemWithCommerceShipmentId:(long long)commerceShipmentId commerceOrderItemId:(long long)commerceOrderItemId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"commerceOrderItemId": @(commerceOrderItemId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/fetch-commerce-shipment-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId restoreStockQuantity:(BOOL)restoreStockQuantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentItemId": @(commerceShipmentItemId),
		@"restoreStockQuantity": @(restoreStockQuantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/delete-commerce-shipment-item": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentItemId": @(commerceShipmentItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/delete-commerce-shipment-item": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShipmentItemsByCommerceOrderItemIdWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/get-commerce-shipment-items-by-commerce-order-item-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShipmentItemsCountWithCommerceShipmentId:(long long)commerceShipmentId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/get-commerce-shipment-items-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShipmentItemsCountByCommerceOrderItemIdWithCommerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceOrderItemId": @(commerceOrderItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/get-commerce-shipment-items-count-by-commerce-order-item-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShipmentOrderItemsQuantityWithCommerceShipmentId:(long long)commerceShipmentId commerceOrderItemId:(long long)commerceOrderItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentId": @(commerceShipmentId),
		@"commerceOrderItemId": @(commerceOrderItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/get-commerce-shipment-order-items-quantity": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentItemId": @(commerceShipmentItemId),
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/update-commerce-shipment-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentItemId": @(commerceShipmentItemId),
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/update-commerce-shipment-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceShipmentItemWithCommerceShipmentItemId:(long long)commerceShipmentItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShipmentItemId": @(commerceShipmentItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshipmentitem/get-commerce-shipment-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end