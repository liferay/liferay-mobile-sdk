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

#import "LRCpdavailabilityestimateService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdavailabilityestimateService_v73

- (NSDictionary *)fetchCpdAvailabilityEstimateByCpDefinitionIdWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdavailabilityestimate/fetch-cpd-availability-estimate-by-cp-definition-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpdAvailabilityEstimateWithCpdAvailabilityEstimateId:(long long)cpdAvailabilityEstimateId cpDefinitionId:(long long)cpDefinitionId commerceAvailabilityEstimateId:(long long)commerceAvailabilityEstimateId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpdAvailabilityEstimateId": @(cpdAvailabilityEstimateId),
		@"cpDefinitionId": @(cpDefinitionId),
		@"commerceAvailabilityEstimateId": @(commerceAvailabilityEstimateId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdavailabilityestimate/update-cpd-availability-estimate": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end