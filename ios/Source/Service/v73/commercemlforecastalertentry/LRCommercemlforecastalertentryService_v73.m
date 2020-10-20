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

#import "LRCommercemlforecastalertentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercemlforecastalertentryService_v73

- (NSDictionary *)updateStatusWithUserId:(long long)userId commerceMLForecastAlertEntryId:(long long)commerceMLForecastAlertEntryId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commerceMLForecastAlertEntryId": @(commerceMLForecastAlertEntryId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/commerce.commercemlforecastalertentry/update-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getAboveThresholdCommerceMlForecastAlertEntriesWithCompanyId:(long long)companyId userId:(long long)userId status:(int)status relativeChange:(double)relativeChange start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"status": @(status),
		@"relativeChange": @(relativeChange),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercemlforecastalertentry/get-above-threshold-commerce-ml-forecast-alert-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getAboveThresholdCommerceMlForecastAlertEntriesCountWithCompanyId:(long long)companyId userId:(long long)userId status:(int)status relativeChange:(double)relativeChange error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"status": @(status),
		@"relativeChange": @(relativeChange)
	}];

	NSDictionary *_command = @{@"/commerce.commercemlforecastalertentry/get-above-threshold-commerce-ml-forecast-alert-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getBelowThresholdCommerceMlForecastAlertEntriesWithCompanyId:(long long)companyId userId:(long long)userId status:(int)status relativeChange:(double)relativeChange start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"status": @(status),
		@"relativeChange": @(relativeChange),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercemlforecastalertentry/get-below-threshold-commerce-ml-forecast-alert-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getBelowThresholdCommerceMlForecastAlertEntriesCountWithCompanyId:(long long)companyId userId:(long long)userId status:(int)status relativeChange:(double)relativeChange error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"status": @(status),
		@"relativeChange": @(relativeChange)
	}];

	NSDictionary *_command = @{@"/commerce.commercemlforecastalertentry/get-below-threshold-commerce-ml-forecast-alert-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceMlForecastAlertEntriesCountWithCompanyId:(long long)companyId userId:(long long)userId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/commerce.commercemlforecastalertentry/get-commerce-ml-forecast-alert-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceMlForecastAlertEntriesWithCompanyId:(long long)companyId userId:(long long)userId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercemlforecastalertentry/get-commerce-ml-forecast-alert-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end