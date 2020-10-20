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

#import "LRCommerceinventoryauditService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceinventoryauditService_v73

- (NSArray *)getCommerceInventoryAuditsWithCompanyId:(long long)companyId sku:(NSString *)sku start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"sku": [self checkNull: sku],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventoryaudit/get-commerce-inventory-audits": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceInventoryAuditsCountWithCompanyId:(long long)companyId sku:(NSString *)sku error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"sku": [self checkNull: sku]
	}];

	NSDictionary *_command = @{@"/commerce.commerceinventoryaudit/get-commerce-inventory-audits-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end