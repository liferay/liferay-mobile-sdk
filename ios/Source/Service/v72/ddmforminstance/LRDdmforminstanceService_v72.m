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

#import "LRDdmforminstanceService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRDdmforminstanceService_v72

- (NSArray *)searchWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMFormInstance>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchWithCompanyId:(long long)companyId groupId:(long long)groupId names:(NSArray *)names descriptions:(NSArray *)descriptions andOperator:(BOOL)andOperator start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"names": [self checkNull: names],
		@"descriptions": [self checkNull: descriptions],
		@"andOperator": @(andOperator),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMFormInstance>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFormInstanceWithDdmFormInstanceId:(long long)ddmFormInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceId": @(ddmFormInstanceId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/get-form-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFormInstancesWithCompanyId:(long long)companyId groupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/get-form-instances": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFormInstancesCountWithCompanyId:(long long)companyId groupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/get-form-instances-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFormInstanceWithGroupId:(long long)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmForm:(LRJSONObjectWrapper *)ddmForm ddmFormLayout:(LRJSONObjectWrapper *)ddmFormLayout settingsDDMFormValues:(LRJSONObjectWrapper *)settingsDDMFormValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
	}];

	[self mangleWrapperWithParams:_params name:@"ddmForm" className:@"com.liferay.dynamic.data.mapping.model.DDMForm" wrapper:ddmForm];
	[self mangleWrapperWithParams:_params name:@"ddmFormLayout" className:@"com.liferay.dynamic.data.mapping.model.DDMFormLayout" wrapper:ddmFormLayout];
	[self mangleWrapperWithParams:_params name:@"settingsDDMFormValues" className:@"com.liferay.dynamic.data.mapping.storage.DDMFormValues" wrapper:settingsDDMFormValues];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/add-form-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFormInstanceWithGroupId:(long long)groupId ddmStructureId:(long long)ddmStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap settingsDDMFormValues:(LRJSONObjectWrapper *)settingsDDMFormValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"ddmStructureId": @(ddmStructureId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
	}];

	[self mangleWrapperWithParams:_params name:@"settingsDDMFormValues" className:@"com.liferay.dynamic.data.mapping.storage.DDMFormValues" wrapper:settingsDDMFormValues];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/add-form-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteFormInstanceWithDdmFormInstanceId:(long long)ddmFormInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceId": @(ddmFormInstanceId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/delete-form-instance": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFormInstanceWithDdmFormInstanceId:(long long)ddmFormInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceId": @(ddmFormInstanceId)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/fetch-form-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFormInstanceWithDdmFormInstanceId:(long long)ddmFormInstanceId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmForm:(LRJSONObjectWrapper *)ddmForm ddmFormLayout:(LRJSONObjectWrapper *)ddmFormLayout settingsDDMFormValues:(LRJSONObjectWrapper *)settingsDDMFormValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"ddmFormInstanceId": @(ddmFormInstanceId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
	}];

	[self mangleWrapperWithParams:_params name:@"ddmForm" className:@"com.liferay.dynamic.data.mapping.model.DDMForm" wrapper:ddmForm];
	[self mangleWrapperWithParams:_params name:@"ddmFormLayout" className:@"com.liferay.dynamic.data.mapping.model.DDMFormLayout" wrapper:ddmFormLayout];
	[self mangleWrapperWithParams:_params name:@"settingsDDMFormValues" className:@"com.liferay.dynamic.data.mapping.storage.DDMFormValues" wrapper:settingsDDMFormValues];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/update-form-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFormInstanceWithFormInstanceId:(long long)formInstanceId settingsDDMFormValues:(LRJSONObjectWrapper *)settingsDDMFormValues error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"formInstanceId": @(formInstanceId),
	}];

	[self mangleWrapperWithParams:_params name:@"settingsDDMFormValues" className:@"com.liferay.dynamic.data.mapping.storage.DDMFormValues" wrapper:settingsDDMFormValues];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/update-form-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCountWithCompanyId:(long long)companyId groupId:(long long)groupId names:(NSArray *)names descriptions:(NSArray *)descriptions andOperator:(BOOL)andOperator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"names": [self checkNull: names],
		@"descriptions": [self checkNull: descriptions],
		@"andOperator": @(andOperator)
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/search-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCountWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/ddm.ddmforminstance/search-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end