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
@interface LRAssetTagService_v71 : LRBaseService

- (NSArray *)searchWithGroupIds:(NSArray *)groupIds name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)searchWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (void)deleteTagsWithTagIds:(NSArray *)tagIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteTagWithTagId:(long long)tagId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getGroupsTagsWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSArray *)getGroupTagsWithGroupId:(long long)groupId start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSArray *)getGroupTagsWithGroupId:(long long)groupId error:(NSError **)error;
- (NSNumber *)getGroupTagsCountWithGroupId:(long long)groupId error:(NSError **)error;
- (void)mergeTagsWithFromTagIds:(NSArray *)fromTagIds toTagId:(long long)toTagId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)mergeTagsWithFromTagId:(long long)fromTagId toTagId:(long long)toTagId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateTagWithTagId:(long long)tagId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSNumber *)getVisibleAssetsTagsCountWithGroupId:(long long)groupId name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getVisibleAssetsTagsCountWithGroupId:(long long)groupId classNameId:(long long)classNameId name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getTagsCountWithGroupId:(long long)groupId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)getGroupTagsDisplayWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)getTagWithTagId:(long long)tagId error:(NSError **)error;
- (NSArray *)getTagsWithGroupIds:(NSArray *)groupIds name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getTagsWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSArray *)getTagsWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getTagsWithGroupId:(long long)groupId classNameId:(long long)classNameId name:(NSString *)name start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSArray *)getTagsWithGroupId:(long long)groupId classNameId:(long long)classNameId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getTagsWithGroupIds:(NSArray *)groupIds name:(NSString *)name start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSArray *)getTagsWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSDictionary *)addTagWithGroupId:(long long)groupId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end