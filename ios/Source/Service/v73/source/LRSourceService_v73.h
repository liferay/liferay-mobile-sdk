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
@interface LRSourceService_v73 : LRBaseService

- (NSArray *)getSourcesWithGroupId:(long long)groupId name:(NSString *)name driverUrl:(NSString *)driverUrl andSearch:(BOOL)andSearch start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)updateSourceWithSourceId:(long long)sourceId nameMap:(NSDictionary *)nameMap driverClassName:(NSString *)driverClassName driverUrl:(NSString *)driverUrl driverUserName:(NSString *)driverUserName driverPassword:(NSString *)driverPassword serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addSourceWithGroupId:(long long)groupId nameMap:(NSDictionary *)nameMap driverClassName:(NSString *)driverClassName driverUrl:(NSString *)driverUrl driverUserName:(NSString *)driverUserName driverPassword:(NSString *)driverPassword serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSNumber *)getSourcesCountWithGroupId:(long long)groupId name:(NSString *)name driverUrl:(NSString *)driverUrl andSearch:(BOOL)andSearch error:(NSError **)error;
- (NSDictionary *)getSourceWithSourceId:(long long)sourceId error:(NSError **)error;
- (NSDictionary *)deleteSourceWithSourceId:(long long)sourceId error:(NSError **)error;

@end