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

#import "LRDdmforminstancerecordService_v71.h"

/**
 * @author Bruno Farache
 */
@implementation LRDdmforminstancerecordService_v71

- (NSArray *)getFormInstanceRecordsWithDdmFormInstanceId:(long long)ddmFormInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceId": @(ddmFormInstanceId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecord/get-form-instance-records": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteFormInstanceRecordWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceRecordId": @(ddmFormInstanceRecordId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecord/delete-form-instance-record": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addFormInstanceRecordWithGroupId:(long long)groupId ddmFormInstanceId:(long long)ddmFormInstanceId ddmFormValues:(LRJSONObjectWrapper *)ddmFormValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"ddmFormInstanceId": @(ddmFormInstanceId),
	}];

	[self mangleWrapperWithParams:_params name:@"ddmFormValues" className:@"com.liferay.dynamic.data.mapping.storage.DDMFormValues" wrapper:ddmFormValues];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecord/add-form-instance-record": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFormInstanceRecordWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceRecordId": @(ddmFormInstanceRecordId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecord/get-form-instance-record": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)revertFormInstanceRecordWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId version:(NSString *)version serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceRecordId": @(ddmFormInstanceRecordId),
		@"version": [self checkNull: version],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecord/revert-form-instance-record": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFormInstanceRecordWithDdmFormInstanceRecordId:(long long)ddmFormInstanceRecordId majorVersion:(BOOL)majorVersion ddmFormValues:(LRJSONObjectWrapper *)ddmFormValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceRecordId": @(ddmFormInstanceRecordId),
		@"majorVersion": @(majorVersion),
	}];

	[self mangleWrapperWithParams:_params name:@"ddmFormValues" className:@"com.liferay.dynamic.data.mapping.storage.DDMFormValues" wrapper:ddmFormValues];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/ddm.ddmforminstancerecord/update-form-instance-record": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end