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

#import "LRCommerceapplicationmodelcproductrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceapplicationmodelcproductrelService_v73

- (NSDictionary *)addCommerceApplicationModelCProductRelWithUserId:(long long)userId commerceApplicationModelId:(long long)commerceApplicationModelId cProductId:(long long)cProductId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceApplicationModelId": @(commerceApplicationModelId),
		@"cProductId": @(cProductId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodelcproductrel/add-commerce-application-model-c-product-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceApplicationModelCProductRelsWithCommerceApplicationModelId:(long long)commerceApplicationModelId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationModelId": @(commerceApplicationModelId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodelcproductrel/get-commerce-application-model-c-product-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceApplicationModelCProductRelsCountWithCommerceApplicationModelId:(long long)commerceApplicationModelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationModelId": @(commerceApplicationModelId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodelcproductrel/get-commerce-application-model-c-product-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceApplicationModelCProductRelWithCommerceApplicationModelCProductRelId:(long long)commerceApplicationModelCProductRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationModelCProductRelId": @(commerceApplicationModelCProductRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodelcproductrel/delete-commerce-application-model-c-product-rel": _params};

	[self.session invoke:_command error:error];
}

@end