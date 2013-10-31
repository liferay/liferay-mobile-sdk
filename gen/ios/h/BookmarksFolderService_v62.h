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
@interface BookmarksFolderService_v62 : BaseService

- (void)deleteFolder:(long)folderId includeTrashedEntries:(BOOL)includeTrashedEntries;
- (void)unsubscribeFolder:(long)groupId folderId:(long)folderId;
- (NSDictionary *)getFolder:(long)folderId;
- (int)getFoldersAndEntriesCount:(long)groupId folderId:(long)folderId status:(int)status;
- (void)subscribeFolder:(long)groupId folderId:(long)folderId;
- (NSArray *)getFoldersAndEntries:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end;
- (NSDictionary *)moveFolderToTrash:(long)folderId;
- (NSArray *)getFolderIds:(long)groupId folderId:(long)folderId;
- (NSDictionary *)updateFolder:(long)folderId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description mergeWithParentFolder:(BOOL)mergeWithParentFolder serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getSubfolderIds:(long)groupId folderId:(long)folderId recurse:(BOOL)recurse;
- (NSArray *)getFolders:(long)groupId parentFolderId:(long)parentFolderId status:(int)status start:(int)start end:(int)end;
- (void)restoreFolderFromTrash:(long)folderId;
- (NSDictionary *)moveFolder:(long)folderId parentFolderId:(long)parentFolderId;
- (int)getFoldersCount:(long)groupId parentFolderId:(long)parentFolderId status:(int)status;
- (NSDictionary *)addFolder:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)moveFolderFromTrash:(long)folderId parentFolderId:(long)parentFolderId;

@end