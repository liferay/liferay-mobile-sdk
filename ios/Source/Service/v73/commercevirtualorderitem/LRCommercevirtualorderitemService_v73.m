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

#import "LRCommercevirtualorderitemService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercevirtualorderitemService_v73

- (NSDictionary *)updateCommerceVirtualOrderItemWithCommerceVirtualOrderItemId:(long long)commerceVirtualOrderItemId fileEntryId:(long long)fileEntryId url:(NSString *)url activationStatus:(int)activationStatus duration:(long long)duration usages:(int)usages maxUsages:(int)maxUsages active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceVirtualOrderItemId": @(commerceVirtualOrderItemId),
		@"fileEntryId": @(fileEntryId),
		@"url": [self checkNull: url],
		@"activationStatus": @(activationStatus),
		@"duration": @(duration),
		@"usages": @(usages),
		@"maxUsages": @(maxUsages),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercevirtualorderitem/update-commerce-virtual-order-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileWithCommerceVirtualOrderItemId:(long long)commerceVirtualOrderItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceVirtualOrderItemId": @(commerceVirtualOrderItemId)
	}];

	NSDictionary *_command = @{@"/commerce.commercevirtualorderitem/get-file": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end