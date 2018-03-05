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
@interface LRDdmforminstanceService_v71 : LRBaseService

- (NSArray *)searchWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long long)companyId groupId:(long long)groupId names:(NSArray *)names descriptions:(NSArray *)descriptions andOperator:(BOOL)andOperator start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long long)companyId groupId:(long long)groupId names:(NSArray *)names descriptions:(NSArray *)descriptions andOperator:(BOOL)andOperator error:(NSError **)error;
- (NSDictionary *)getFormInstanceWithDdmFormInstanceId:(long long)ddmFormInstanceId error:(NSError **)error;
- (NSDictionary *)addFormInstanceWithGroupId:(long long)groupId ddmStructureId:(long long)ddmStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap settingsDDMFormValues:(LRJSONObjectWrapper *)settingsDDMFormValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteFormInstanceWithDdmFormInstanceId:(long long)ddmFormInstanceId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchFormInstanceWithDdmFormInstanceId:(long long)ddmFormInstanceId error:(NSError **)error;
- (NSArray *)getFormInstancesWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSDictionary *)updateFormInstanceWithFormInstanceId:(long long)formInstanceId settingsDDMFormValues:(LRJSONObjectWrapper *)settingsDDMFormValues error:(NSError **)error;
- (NSDictionary *)updateFormInstanceWithDdmFormInstanceId:(long long)ddmFormInstanceId ddmStructureId:(long long)ddmStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap settingsDDMFormValues:(LRJSONObjectWrapper *)settingsDDMFormValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end