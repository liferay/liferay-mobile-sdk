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
@interface LRKbfolderService_v73 : LRBaseService

- (NSDictionary *)getKbFolderWithKbFolderId:(long long)kbFolderId error:(NSError **)error;
- (NSNumber *)getKbFoldersCountWithGroupId:(long long)groupId parentKBFolderId:(long long)parentKBFolderId error:(NSError **)error;
- (NSDictionary *)addKbFolderWithGroupId:(long long)groupId parentResourceClassNameId:(long long)parentResourceClassNameId parentResourcePrimKey:(long long)parentResourcePrimKey name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateKbFolderWithParentResourceClassNameId:(long long)parentResourceClassNameId parentResourcePrimKey:(long long)parentResourcePrimKey kbFolderId:(long long)kbFolderId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchFirstChildKbFolderWithGroupId:(long long)groupId kbFolderId:(long long)kbFolderId error:(NSError **)error;
- (NSDictionary *)fetchFirstChildKbFolderWithGroupId:(long long)groupId kbFolderId:(long long)kbFolderId orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)fetchKbFolderWithKbFolderId:(long long)kbFolderId error:(NSError **)error;
- (NSDictionary *)deleteKbFolderWithKbFolderId:(long long)kbFolderId error:(NSError **)error;
- (NSDictionary *)fetchKbFolderByUrlTitleWithGroupId:(long long)groupId parentKbFolderId:(long long)parentKbFolderId urlTitle:(NSString *)urlTitle error:(NSError **)error;
- (NSDictionary *)getKbFolderByUrlTitleWithGroupId:(long long)groupId parentKbFolderId:(long long)parentKbFolderId urlTitle:(NSString *)urlTitle error:(NSError **)error;
- (NSArray *)getKbFoldersWithGroupId:(long long)groupId parentKBFolderId:(long long)parentKBFolderId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getKbFoldersAndKbArticlesWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getKbFoldersAndKbArticlesCountWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status error:(NSError **)error;
- (void)moveKbFolderWithKbFolderId:(long long)kbFolderId parentKBFolderId:(long long)parentKBFolderId error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end