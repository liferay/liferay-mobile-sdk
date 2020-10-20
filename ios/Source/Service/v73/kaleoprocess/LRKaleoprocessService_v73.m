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

#import "LRKaleoprocessService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRKaleoprocessService_v73

- (NSNumber *)searchCountWithGroupId:(long long)groupId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/kaleoforms.kaleoprocess/search-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getKaleoProcessWithKaleoProcessId:(long long)kaleoProcessId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kaleoProcessId": @(kaleoProcessId)
	}];

	NSDictionary *_command = @{@"/kaleoforms.kaleoprocess/get-kaleo-process": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addKaleoProcessWithGroupId:(long long)groupId ddmStructureId:(long long)ddmStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmTemplateId:(long long)ddmTemplateId workflowDefinitionName:(NSString *)workflowDefinitionName workflowDefinitionVersion:(int)workflowDefinitionVersion kaleoTaskFormPairs:(LRJSONObjectWrapper *)kaleoTaskFormPairs serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"ddmStructureId": @(ddmStructureId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"ddmTemplateId": @(ddmTemplateId),
		@"workflowDefinitionName": [self checkNull: workflowDefinitionName],
		@"workflowDefinitionVersion": @(workflowDefinitionVersion),
	}];

	[self mangleWrapperWithParams:_params name:@"kaleoTaskFormPairs" className:@"com.liferay.portal.workflow.kaleo.forms.model.KaleoTaskFormPairs" wrapper:kaleoTaskFormPairs];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kaleoforms.kaleoprocess/add-kaleo-process": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateKaleoProcessWithKaleoProcessId:(long long)kaleoProcessId ddmStructureId:(long long)ddmStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmTemplateId:(long long)ddmTemplateId workflowDefinitionName:(NSString *)workflowDefinitionName workflowDefinitionVersion:(int)workflowDefinitionVersion kaleoTaskFormPairs:(LRJSONObjectWrapper *)kaleoTaskFormPairs serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kaleoProcessId": @(kaleoProcessId),
		@"ddmStructureId": @(ddmStructureId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"ddmTemplateId": @(ddmTemplateId),
		@"workflowDefinitionName": [self checkNull: workflowDefinitionName],
		@"workflowDefinitionVersion": @(workflowDefinitionVersion),
	}];

	[self mangleWrapperWithParams:_params name:@"kaleoTaskFormPairs" className:@"com.liferay.portal.workflow.kaleo.forms.model.KaleoTaskFormPairs" wrapper:kaleoTaskFormPairs];
	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kaleoforms.kaleoprocess/update-kaleo-process": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteKaleoProcessWithKaleoProcessId:(long long)kaleoProcessId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kaleoProcessId": @(kaleoProcessId)
	}];

	NSDictionary *_command = @{@"/kaleoforms.kaleoprocess/delete-kaleo-process": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)searchWithGroupId:(long long)groupId keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.workflow.kaleo.forms.model.KaleoProcess>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kaleoforms.kaleoprocess/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end