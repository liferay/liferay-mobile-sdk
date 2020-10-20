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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRKaleoprocessService_v73 : LRBaseService

- (NSNumber *)searchCountWithGroupId:(long long)groupId keywords:(NSString *)keywords error:(NSError **)error;
- (NSDictionary *)getKaleoProcessWithKaleoProcessId:(long long)kaleoProcessId error:(NSError **)error;
- (NSDictionary *)addKaleoProcessWithGroupId:(long long)groupId ddmStructureId:(long long)ddmStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmTemplateId:(long long)ddmTemplateId workflowDefinitionName:(NSString *)workflowDefinitionName workflowDefinitionVersion:(int)workflowDefinitionVersion kaleoTaskFormPairs:(LRJSONObjectWrapper *)kaleoTaskFormPairs serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateKaleoProcessWithKaleoProcessId:(long long)kaleoProcessId ddmStructureId:(long long)ddmStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmTemplateId:(long long)ddmTemplateId workflowDefinitionName:(NSString *)workflowDefinitionName workflowDefinitionVersion:(int)workflowDefinitionVersion kaleoTaskFormPairs:(LRJSONObjectWrapper *)kaleoTaskFormPairs serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteKaleoProcessWithKaleoProcessId:(long long)kaleoProcessId error:(NSError **)error;
- (NSArray *)searchWithGroupId:(long long)groupId keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;

@end