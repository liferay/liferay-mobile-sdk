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

#import "LRCommerceavailabilityestimateService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceavailabilityestimateService_v73

- (NSDictionary *)addCommerceAvailabilityEstimateWithTitleMap:(NSDictionary *)titleMap priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"titleMap": [self checkNull: titleMap],
		@"priority": @(priority),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceavailabilityestimate/add-commerce-availability-estimate": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAvailabilityEstimateWithCommerceAvailabilityEstimateId:(long long)commerceAvailabilityEstimateId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAvailabilityEstimateId": @(commerceAvailabilityEstimateId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceavailabilityestimate/delete-commerce-availability-estimate": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAvailabilityEstimatesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceAvailabilityEstimate>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceavailabilityestimate/get-commerce-availability-estimates": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAvailabilityEstimatesCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceavailabilityestimate/get-commerce-availability-estimates-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceAvailabilityEstimateWithCommerceAvailabilityEstimateId:(long long)commerceAvailabilityEstimateId titleMap:(NSDictionary *)titleMap priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAvailabilityEstimateId": @(commerceAvailabilityEstimateId),
		@"titleMap": [self checkNull: titleMap],
		@"priority": @(priority),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceavailabilityestimate/update-commerce-availability-estimate": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceAvailabilityEstimateWithCommerceAvailabilityEstimateId:(long long)commerceAvailabilityEstimateId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAvailabilityEstimateId": @(commerceAvailabilityEstimateId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceavailabilityestimate/get-commerce-availability-estimate": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end