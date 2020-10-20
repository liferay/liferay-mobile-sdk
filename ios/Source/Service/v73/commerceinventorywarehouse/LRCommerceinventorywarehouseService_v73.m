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

#import "LRCommerceinventorywarehouseService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceinventorywarehouseService_v73

- (NSDictionary *)setActiveWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/set-active": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceInventoryWarehouseWithName:(NSString *)name description:(NSString *)description active:(BOOL)active street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionCode:(NSString *)commerceRegionCode commerceCountryCode:(NSString *)commerceCountryCode latitude:(double)latitude longitude:(double)longitude externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"active": @(active),
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionCode": [self checkNull: commerceRegionCode],
		@"commerceCountryCode": [self checkNull: commerceCountryCode],
		@"latitude": @(latitude),
		@"longitude": @(longitude),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/add-commerce-inventory-warehouse": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteCommerceInventoryWarehouseWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/delete-commerce-inventory-warehouse": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)geolocateCommerceInventoryWarehouseWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId latitude:(double)latitude longitude:(double)longitude error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"latitude": @(latitude),
		@"longitude": @(longitude)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/geolocate-commerce-inventory-warehouse": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceInventoryWarehouseWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouse": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceInventoryWarehousesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.inventory.model.CommerceInventoryWarehouse>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceInventoryWarehousesWithCompanyId:(long long)companyId groupId:(long long)groupId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceInventoryWarehousesWithCompanyId:(long long)companyId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.inventory.model.CommerceInventoryWarehouse>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceInventoryWarehousesWithCompanyId:(long long)companyId active:(BOOL)active commerceCountryCode:(NSString *)commerceCountryCode start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active),
		@"commerceCountryCode": [self checkNull: commerceCountryCode],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.inventory.model.CommerceInventoryWarehouse>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryWarehousesCountWithCompanyId:(long long)companyId active:(BOOL)active commerceCountryCode:(NSString *)commerceCountryCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active),
		@"commerceCountryCode": [self checkNull: commerceCountryCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryWarehousesCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)searchCommerceInventoryWarehousesWithCompanyId:(long long)companyId active:(BOOL)active commerceCountryCode:(NSString *)commerceCountryCode keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active),
		@"commerceCountryCode": [self checkNull: commerceCountryCode],
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/search-commerce-inventory-warehouses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCommerceInventoryWarehousesCountWithCompanyId:(long long)companyId active:(BOOL)active commerceCountryCode:(NSString *)commerceCountryCode keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active),
		@"commerceCountryCode": [self checkNull: commerceCountryCode],
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/search-commerce-inventory-warehouses-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceInventoryWarehouseWithCommerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId name:(NSString *)name description:(NSString *)description active:(BOOL)active street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionCode:(NSString *)commerceRegionCode commerceCountryCode:(NSString *)commerceCountryCode latitude:(double)latitude longitude:(double)longitude mvccVersion:(long long)mvccVersion serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceInventoryWarehouseId": @(commerceInventoryWarehouseId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"active": @(active),
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionCode": [self checkNull: commerceRegionCode],
		@"commerceCountryCode": [self checkNull: commerceCountryCode],
		@"latitude": @(latitude),
		@"longitude": @(longitude),
		@"mvccVersion": @(mvccVersion),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceinventorywarehouse/update-commerce-inventory-warehouse": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end