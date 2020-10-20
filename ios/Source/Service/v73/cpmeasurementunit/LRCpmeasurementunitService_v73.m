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

#import "LRCpmeasurementunitService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpmeasurementunitService_v73

- (void)deleteCpMeasurementUnitWithCpMeasurementUnitId:(long long)cpMeasurementUnitId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpMeasurementUnitId": @(cpMeasurementUnitId)
	}];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/delete-cp-measurement-unit": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpMeasurementUnitWithNameMap:(NSDictionary *)nameMap key:(NSString *)key rate:(double)rate primary:(BOOL)primary priority:(double)priority type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"nameMap": [self checkNull: nameMap],
		@"key": [self checkNull: key],
		@"rate": @(rate),
		@"primary": @(primary),
		@"priority": @(priority),
		@"type": @(type),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/add-cp-measurement-unit": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpMeasurementUnitsWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPMeasurementUnit>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/get-cp-measurement-units": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpMeasurementUnitsWithCompanyId:(long long)companyId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"type": @(type),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPMeasurementUnit>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/get-cp-measurement-units": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchPrimaryCpMeasurementUnitWithCompanyId:(long long)companyId type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/fetch-primary-cp-measurement-unit": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpMeasurementUnitsCountWithCompanyId:(long long)companyId type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/get-cp-measurement-units-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpMeasurementUnitsCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/get-cp-measurement-units-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpMeasurementUnitWithCpMeasurementUnitId:(long long)cpMeasurementUnitId nameMap:(NSDictionary *)nameMap key:(NSString *)key rate:(double)rate primary:(BOOL)primary priority:(double)priority type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpMeasurementUnitId": @(cpMeasurementUnitId),
		@"nameMap": [self checkNull: nameMap],
		@"key": [self checkNull: key],
		@"rate": @(rate),
		@"primary": @(primary),
		@"priority": @(priority),
		@"type": @(type),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/update-cp-measurement-unit": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpMeasurementUnitWithCpMeasurementUnitId:(long long)cpMeasurementUnitId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpMeasurementUnitId": @(cpMeasurementUnitId)
	}];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/get-cp-measurement-unit": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)setPrimaryWithCpMeasurementUnitId:(long long)cpMeasurementUnitId primary:(BOOL)primary error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpMeasurementUnitId": @(cpMeasurementUnitId),
		@"primary": @(primary)
	}];

	NSDictionary *_command = @{@"/commerce.cpmeasurementunit/set-primary": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end