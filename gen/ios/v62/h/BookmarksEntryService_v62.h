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
@interface BookmarksEntryService_v62 : BaseService

- (NSDictionary *)moveEntryToTrash:(long)entryId;
- (NSDictionary *)search:(long)groupId creatorUserId:(long)creatorUserId status:(int)status start:(int)start end:(int)end;
- (NSArray *)getEntries:(long)groupId folderId:(long)folderId start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator;
- (void)restoreEntryFromTrash:(long)entryId;
- (int)getEntriesCount:(long)groupId folderId:(long)folderId status:(int)status;
- (NSDictionary *)moveEntryFromTrash:(long)entryId parentFolderId:(long)parentFolderId;
- (NSDictionary *)moveEntry:(long)entryId parentFolderId:(long)parentFolderId;
- (int)getFoldersEntriesCount:(long)groupId folderIds:(NSArray *)folderIds;
- (NSArray *)getGroupEntries:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId start:(int)start end:(int)end;
- (NSDictionary *)openEntry:(long)entryId;
- (NSDictionary *)addEntry:(long)groupId folderId:(long)folderId name:(NSString *)name url:(NSString *)url description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)deleteEntry:(long)entryId;
- (NSDictionary *)getEntry:(long)entryId;
- (int)getGroupEntriesCount:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId;
- (NSDictionary *)updateEntry:(long)entryId groupId:(long)groupId folderId:(long)folderId name:(NSString *)name url:(NSString *)url description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)subscribeEntry:(long)entryId;
- (void)unsubscribeEntry:(long)entryId;

@end