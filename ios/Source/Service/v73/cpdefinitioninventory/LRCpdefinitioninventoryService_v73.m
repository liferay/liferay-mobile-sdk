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

#import "LRCpdefinitioninventoryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdefinitioninventoryService_v73

- (NSDictionary *)addCpDefinitionInventoryWithUserId:(long long)userId cpDefinitionId:(long long)cpDefinitionId cpDefinitionInventoryEngine:(NSString *)cpDefinitionInventoryEngine lowStockActivity:(NSString *)lowStockActivity displayAvailability:(BOOL)displayAvailability displayStockQuantity:(BOOL)displayStockQuantity minStockQuantity:(int)minStockQuantity backOrders:(BOOL)backOrders minOrderQuantity:(int)minOrderQuantity maxOrderQuantity:(int)maxOrderQuantity allowedOrderQuantities:(NSString *)allowedOrderQuantities multipleOrderQuantity:(int)multipleOrderQuantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"cpDefinitionId": @(cpDefinitionId),
		@"cpDefinitionInventoryEngine": [self checkNull: cpDefinitionInventoryEngine],
		@"lowStockActivity": [self checkNull: lowStockActivity],
		@"displayAvailability": @(displayAvailability),
		@"displayStockQuantity": @(displayStockQuantity),
		@"minStockQuantity": @(minStockQuantity),
		@"backOrders": @(backOrders),
		@"minOrderQuantity": @(minOrderQuantity),
		@"maxOrderQuantity": @(maxOrderQuantity),
		@"allowedOrderQuantities": [self checkNull: allowedOrderQuantities],
		@"multipleOrderQuantity": @(multipleOrderQuantity)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitioninventory/add-cp-definition-inventory": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpDefinitionInventoryWithCpDefinitionInventoryId:(long long)cpDefinitionInventoryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionInventoryId": @(cpDefinitionInventoryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitioninventory/delete-cp-definition-inventory": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionInventoryByCpDefinitionIdWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitioninventory/fetch-cp-definition-inventory-by-cp-definition-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionInventoryWithCpDefinitionInventoryId:(long long)cpDefinitionInventoryId cpDefinitionInventoryEngine:(NSString *)cpDefinitionInventoryEngine lowStockActivity:(NSString *)lowStockActivity displayAvailability:(BOOL)displayAvailability displayStockQuantity:(BOOL)displayStockQuantity minStockQuantity:(int)minStockQuantity backOrders:(BOOL)backOrders minOrderQuantity:(int)minOrderQuantity maxOrderQuantity:(int)maxOrderQuantity allowedOrderQuantities:(NSString *)allowedOrderQuantities multipleOrderQuantity:(int)multipleOrderQuantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionInventoryId": @(cpDefinitionInventoryId),
		@"cpDefinitionInventoryEngine": [self checkNull: cpDefinitionInventoryEngine],
		@"lowStockActivity": [self checkNull: lowStockActivity],
		@"displayAvailability": @(displayAvailability),
		@"displayStockQuantity": @(displayStockQuantity),
		@"minStockQuantity": @(minStockQuantity),
		@"backOrders": @(backOrders),
		@"minOrderQuantity": @(minOrderQuantity),
		@"maxOrderQuantity": @(maxOrderQuantity),
		@"allowedOrderQuantities": [self checkNull: allowedOrderQuantities],
		@"multipleOrderQuantity": @(multipleOrderQuantity)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitioninventory/update-cp-definition-inventory": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionInventoryWithGroupId:(long long)groupId cpDefinitionInventoryId:(long long)cpDefinitionInventoryId cpDefinitionInventoryEngine:(NSString *)cpDefinitionInventoryEngine lowStockActivity:(NSString *)lowStockActivity displayAvailability:(BOOL)displayAvailability displayStockQuantity:(BOOL)displayStockQuantity minStockQuantity:(int)minStockQuantity backOrders:(BOOL)backOrders minOrderQuantity:(int)minOrderQuantity maxOrderQuantity:(int)maxOrderQuantity allowedOrderQuantities:(NSString *)allowedOrderQuantities multipleOrderQuantity:(int)multipleOrderQuantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"cpDefinitionInventoryId": @(cpDefinitionInventoryId),
		@"cpDefinitionInventoryEngine": [self checkNull: cpDefinitionInventoryEngine],
		@"lowStockActivity": [self checkNull: lowStockActivity],
		@"displayAvailability": @(displayAvailability),
		@"displayStockQuantity": @(displayStockQuantity),
		@"minStockQuantity": @(minStockQuantity),
		@"backOrders": @(backOrders),
		@"minOrderQuantity": @(minOrderQuantity),
		@"maxOrderQuantity": @(maxOrderQuantity),
		@"allowedOrderQuantities": [self checkNull: allowedOrderQuantities],
		@"multipleOrderQuantity": @(multipleOrderQuantity)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitioninventory/update-cp-definition-inventory": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end