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

#import "LRCommerceapplicationbrandService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceapplicationbrandService_v73

- (NSDictionary *)addCommerceApplicationBrandWithUserId:(long long)userId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"name": [self checkNull: name],
		@"logo": @(logo),
		@"logoBytes": [self toString:logoBytes]
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationbrand/add-commerce-application-brand": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceApplicationBrandWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationBrandId": @(commerceApplicationBrandId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationbrand/delete-commerce-application-brand": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceApplicationBrandWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationBrandId": @(commerceApplicationBrandId),
		@"name": [self checkNull: name],
		@"logo": @(logo),
		@"logoBytes": [self toString:logoBytes]
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationbrand/update-commerce-application-brand": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceApplicationBrandWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceApplicationBrandId": @(commerceApplicationBrandId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationbrand/get-commerce-application-brand": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceApplicationBrandsWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationbrand/get-commerce-application-brands": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceApplicationBrandsCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceapplicationbrand/get-commerce-application-brands-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end