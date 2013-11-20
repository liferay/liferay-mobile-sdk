/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import <Foundation/Foundation.h>
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface AssetTagService_v62 : BaseService

- (NSDictionary *)addTagWithName:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteTagWithTagId:(long)tagId error:(NSError **)error;
- (void)deleteTagsWithTagIds:(NSArray *)tagIds error:(NSError **)error;
- (NSArray *)getGroupTagsWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getGroupTagsWithGroupId:(long)groupId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getGroupTagsCountWithGroupId:(long)groupId error:(NSError **)error;
- (NSDictionary *)getGroupTagsDisplayWithGroupId:(long)groupId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGroupsTagsWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSDictionary *)getJsonGroupTagsWithGroupId:(long)groupId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)getTagWithTagId:(long)tagId error:(NSError **)error;
- (NSArray *)getTagsWithClassName:(NSString *)className classPK:(long)classPK error:(NSError **)error;
- (NSArray *)getTagsWithGroupId:(long)groupId classNameId:(long)classNameId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getTagsWithGroupId:(long)groupId name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getTagsWithGroupIds:(NSArray *)groupIds name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getTagsWithGroupId:(long)groupId classNameId:(long)classNameId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getTagsCountWithGroupId:(long)groupId name:(NSString *)name error:(NSError **)error;
- (int)getTagsCountWithGroupId:(long)groupId classNameId:(long)classNameId name:(NSString *)name error:(NSError **)error;
- (int)getTagsCountWithGroupId:(long)groupId name:(NSString *)name tagProperties:(NSArray *)tagProperties error:(NSError **)error;
- (void)mergeTagsWithFromTagId:(long)fromTagId toTagId:(long)toTagId overrideProperties:(BOOL)overrideProperties error:(NSError **)error;
- (void)mergeTagsWithFromTagIds:(NSArray *)fromTagIds toTagId:(long)toTagId overrideProperties:(BOOL)overrideProperties error:(NSError **)error;
- (NSDictionary *)searchWithGroupId:(long)groupId name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)searchWithGroupIds:(NSArray *)groupIds name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)updateTagWithTagId:(long)tagId name:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end