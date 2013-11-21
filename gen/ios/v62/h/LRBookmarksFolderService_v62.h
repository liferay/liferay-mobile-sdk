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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRBookmarksFolderService_v62 : LRBaseService

- (NSDictionary *)addFolderWithParentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteFolderWithFolderId:(long)folderId error:(NSError **)error;
- (void)deleteFolderWithFolderId:(long)folderId includeTrashedEntries:(BOOL)includeTrashedEntries error:(NSError **)error;
- (NSDictionary *)getFolderWithFolderId:(long)folderId error:(NSError **)error;
- (NSArray *)getFolderIdsWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (NSArray *)getFoldersWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getFoldersWithGroupId:(long)groupId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (NSArray *)getFoldersWithGroupId:(long)groupId parentFolderId:(long)parentFolderId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFoldersWithGroupId:(long)groupId parentFolderId:(long)parentFolderId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFoldersAndEntriesWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (NSArray *)getFoldersAndEntriesWithGroupId:(long)groupId folderId:(long)folderId status:(int)status error:(NSError **)error;
- (NSArray *)getFoldersAndEntriesWithGroupId:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (int)getFoldersAndEntriesCountWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (int)getFoldersAndEntriesCountWithGroupId:(long)groupId folderId:(long)folderId status:(int)status error:(NSError **)error;
- (int)getFoldersCountWithGroupId:(long)groupId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (int)getFoldersCountWithGroupId:(long)groupId parentFolderId:(long)parentFolderId status:(int)status error:(NSError **)error;
- (void)getSubfolderIdsWithFolderIds:(NSArray *)folderIds groupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (NSArray *)getSubfolderIdsWithGroupId:(long)groupId folderId:(long)folderId recurse:(BOOL)recurse error:(NSError **)error;
- (NSDictionary *)moveFolderWithFolderId:(long)folderId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (NSDictionary *)moveFolderFromTrashWithFolderId:(long)folderId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (NSDictionary *)moveFolderToTrashWithFolderId:(long)folderId error:(NSError **)error;
- (void)restoreFolderFromTrashWithFolderId:(long)folderId error:(NSError **)error;
- (void)subscribeFolderWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (void)unsubscribeFolderWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)updateFolderWithFolderId:(long)folderId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description mergeWithParentFolder:(BOOL)mergeWithParentFolder serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end