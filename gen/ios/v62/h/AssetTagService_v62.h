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

- (NSDictionary *)getJsonGroupTags:(long)groupId name:(NSString *)name start:(int)start end:(int)end;
- (void)deleteTag:(long)tagId;
- (int)getGroupTagsCount:(long)groupId;
- (NSDictionary *)getTag:(long)tagId;
- (void)deleteTags:(NSArray *)tagIds;
- (void)mergeTags:(NSArray *)fromTagIds toTagId:(long)toTagId overrideProperties:(BOOL)overrideProperties;
- (NSArray *)getTags:(long)groupId classNameId:(long)classNameId name:(NSString *)name start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSDictionary *)updateTag:(long)tagId name:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getGroupsTags:(NSArray *)groupIds;
- (int)getTagsCount:(long)groupId name:(NSString *)name tagProperties:(NSArray *)tagProperties;
- (NSDictionary *)getGroupTagsDisplay:(long)groupId name:(NSString *)name start:(int)start end:(int)end;
- (NSArray *)getGroupTags:(long)groupId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSDictionary *)search:(NSArray *)groupIds name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(int)start end:(int)end;
- (NSDictionary *)addTag:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext;

@end