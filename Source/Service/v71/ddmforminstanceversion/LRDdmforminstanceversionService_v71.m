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

#import "LRDdmforminstanceversionService_v71.h"

/**
 * @author Bruno Farache
 */
@implementation LRDdmforminstanceversionService_v71

- (NSDictionary *)getFormInstanceVersionWithDdmFormInstanceVersionId:(long long)ddmFormInstanceVersionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceVersionId": @(ddmFormInstanceVersionId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstanceversion/get-form-instance-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getLatestFormInstanceVersionWithDdmFormInstanceId:(long long)ddmFormInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceId": @(ddmFormInstanceId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstanceversion/get-latest-form-instance-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFormInstanceVersionsWithDdmFormInstanceId:(long long)ddmFormInstanceId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceId": @(ddmFormInstanceId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMFormInstanceVersion>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/ddm.ddmforminstanceversion/get-form-instance-versions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFormInstanceVersionsCountWithDdmFormInstanceId:(long long)ddmFormInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceId": @(ddmFormInstanceId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstanceversion/get-form-instance-versions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end