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

#import "LRCommerceregionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceregionService_v73

- (NSDictionary *)setActiveWithCommerceRegionId:(long long)commerceRegionId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceRegionId": @(commerceRegionId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceregion/set-active": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceRegionWithCommerceRegionId:(long long)commerceRegionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceRegionId": @(commerceRegionId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceregion/get-commerce-region": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceRegionWithCommerceRegionId:(long long)commerceRegionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceRegionId": @(commerceRegionId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceregion/delete-commerce-region": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceRegionWithCommerceCountryId:(long long)commerceCountryId name:(NSString *)name code:(NSString *)code priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId),
		@"name": [self checkNull: name],
		@"code": [self checkNull: code],
		@"priority": @(priority),
		@"active": @(active),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceregion/add-commerce-region": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceRegionsWithCommerceCountryId:(long long)commerceCountryId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId),
		@"active": @(active),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceRegion>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceregion/get-commerce-regions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceRegionsWithCompanyId:(long long)companyId countryTwoLettersISOCode:(NSString *)countryTwoLettersISOCode active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"countryTwoLettersISOCode": [self checkNull: countryTwoLettersISOCode],
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceregion/get-commerce-regions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceRegionsWithCommerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceregion/get-commerce-regions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceRegionsWithCommerceCountryId:(long long)commerceCountryId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceRegion>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceregion/get-commerce-regions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceRegionsCountWithCommerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceregion/get-commerce-regions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceRegionsCountWithCommerceCountryId:(long long)commerceCountryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceregion/get-commerce-regions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceRegionWithCommerceRegionId:(long long)commerceRegionId name:(NSString *)name code:(NSString *)code priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceRegionId": @(commerceRegionId),
		@"name": [self checkNull: name],
		@"code": [self checkNull: code],
		@"priority": @(priority),
		@"active": @(active),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceregion/update-commerce-region": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end