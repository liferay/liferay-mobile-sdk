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
@interface LRLayoutSetBranchService_v73 : LRBaseService

- (NSDictionary *)addLayoutSetBranchWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout name:(NSString *)name description:(NSString *)description master:(BOOL)master copyLayoutSetBranchId:(long long)copyLayoutSetBranchId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLayoutSetBranchWithGroupId:(long long)groupId layoutSetBranchId:(long long)layoutSetBranchId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getLayoutSetBranchesWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (void)deleteLayoutSetBranchWithCurrentLayoutPlid:(long long)currentLayoutPlid layoutSetBranchId:(long long)layoutSetBranchId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteLayoutSetBranchWithLayoutSetBranchId:(long long)layoutSetBranchId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)mergeLayoutSetBranchWithLayoutSetBranchId:(long long)layoutSetBranchId mergeLayoutSetBranchId:(long long)mergeLayoutSetBranchId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end