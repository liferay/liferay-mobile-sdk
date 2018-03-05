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

#import "LRDdmforminstancerecordversionService_v71.h"

/**
 * @author Bruno Farache
 */
@implementation LRDdmforminstancerecordversionService_v71

- (NSDictionary *)getFormInstanceRecordVersionWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId version:(NSString *)version error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceRecordId": @(ddmFormInstanceRecordId),
		@"version": [self checkNull: version]
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecordversion/get-form-instance-record-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFormInstanceRecordVersionWithDdmFormInstanceRecordVersionId:(long long)ddmFormInstanceRecordVersionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceRecordVersionId": @(ddmFormInstanceRecordVersionId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecordversion/get-form-instance-record-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFormInstanceRecordVersionsWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceRecordId": @(ddmFormInstanceRecordId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecordVersion>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecordversion/get-form-instance-record-versions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFormInstanceRecordVersionsWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceRecordId": @(ddmFormInstanceRecordId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecordversion/get-form-instance-record-versions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFormInstanceRecordVersionsCountWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceRecordId": @(ddmFormInstanceRecordId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecordversion/get-form-instance-record-versions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end