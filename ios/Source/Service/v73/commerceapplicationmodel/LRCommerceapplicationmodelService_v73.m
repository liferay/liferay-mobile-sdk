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

#import "LRCommerceapplicationmodelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceapplicationmodelService_v73

- (NSDictionary *)getCommerceApplicationModelWithCommerceApplicationModelId:(long long)commerceApplicationModelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationModelId": @(commerceApplicationModelId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodel/get-commerce-application-model": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceApplicationModelsWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationBrandId": @(commerceApplicationBrandId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodel/get-commerce-application-models": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceApplicationModelsCountWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationBrandId": @(commerceApplicationBrandId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodel/get-commerce-application-models-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceApplicationModelsCountByCompanyIdWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodel/get-commerce-application-models-count-by-company-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceApplicationModelsByCompanyIdWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodel/get-commerce-application-models-by-company-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceApplicationModelWithUserId:(long long)userId commerceApplicationBrandId:(long long)commerceApplicationBrandId name:(NSString *)name year:(NSString *)year error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceApplicationBrandId": @(commerceApplicationBrandId),
		@"name": [self checkNull: name],
		@"year": [self checkNull: year]
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodel/add-commerce-application-model": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceApplicationModelWithCommerceApplicationModelId:(long long)commerceApplicationModelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationModelId": @(commerceApplicationModelId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodel/delete-commerce-application-model": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceApplicationModelWithCommerceApplicationModelId:(long long)commerceApplicationModelId name:(NSString *)name year:(NSString *)year error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationModelId": @(commerceApplicationModelId),
		@"name": [self checkNull: name],
		@"year": [self checkNull: year]
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationmodel/update-commerce-application-model": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end