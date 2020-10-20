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
@interface LRCommercetaxmethodService_v73 : LRBaseService

- (NSDictionary *)setActiveWithCommerceTaxMethodId:(long long)commerceTaxMethodId active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)addCommerceTaxMethodWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap engineKey:(NSString *)engineKey percentage:(BOOL)percentage active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceTaxMethodWithUserId:(long long)userId groupId:(long long)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap engineKey:(NSString *)engineKey percentage:(BOOL)percentage active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)createCommerceTaxMethodWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error;
- (NSDictionary *)getCommerceTaxMethodWithCommerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error;
- (NSDictionary *)fetchCommerceTaxMethodWithGroupId:(long long)groupId engineKey:(NSString *)engineKey error:(NSError **)error;
- (NSArray *)getCommerceTaxMethodsWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error;
- (NSArray *)getCommerceTaxMethodsWithGroupId:(long long)groupId error:(NSError **)error;
- (NSDictionary *)updateCommerceTaxMethodWithCommerceTaxMethodId:(long long)commerceTaxMethodId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap percentage:(BOOL)percentage active:(BOOL)active error:(NSError **)error;
- (void)deleteCommerceTaxMethodWithCommerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end