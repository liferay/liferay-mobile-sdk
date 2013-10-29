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

/**
 * author: Bruno Farache
 */
@interface BookmarksEntryService_v62 : NSObject

- (NSDictionary *)moveEntryToTrash:(NSNumber *)entryId;
- (NSDictionary *)search:(NSNumber *)groupId creatorUserId:(NSNumber *)creatorUserId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (NSArray *)getEntries:(NSNumber *)groupId folderId:(NSNumber *)folderId start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator;
- (void)restoreEntryFromTrash:(NSNumber *)entryId;
- (NSNumber *)getEntriesCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status;
- (NSDictionary *)moveEntryFromTrash:(NSNumber *)entryId parentFolderId:(NSNumber *)parentFolderId;
- (NSDictionary *)moveEntry:(NSNumber *)entryId parentFolderId:(NSNumber *)parentFolderId;
- (NSNumber *)getFoldersEntriesCount:(NSNumber *)groupId folderIds:(NSArray *)folderIds;
- (NSArray *)getGroupEntries:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)openEntry:(NSNumber *)entryId;
- (NSDictionary *)addEntry:(NSNumber *)groupId folderId:(NSNumber *)folderId name:(NSString *)name url:(NSString *)url description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)deleteEntry:(NSNumber *)entryId;
- (NSDictionary *)getEntry:(NSNumber *)entryId;
- (NSNumber *)getGroupEntriesCount:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId;
- (NSDictionary *)updateEntry:(NSNumber *)entryId groupId:(NSNumber *)groupId folderId:(NSNumber *)folderId name:(NSString *)name url:(NSString *)url description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)subscribeEntry:(NSNumber *)entryId;
- (void)unsubscribeEntry:(NSNumber *)entryId;

@end