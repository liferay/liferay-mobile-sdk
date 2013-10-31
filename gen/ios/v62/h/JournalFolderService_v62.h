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
@interface JournalFolderService_v62 : BaseService

- (NSArray *)getFolders:(long)groupId parentFolderId:(long)parentFolderId status:(int)status start:(int)start end:(int)end;
- (NSDictionary *)moveFolder:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getFoldersAndArticles:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSDictionary *)moveFolderFromTrash:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext;
- (void)restoreFolderFromTrash:(long)folderId;
- (void)deleteFolder:(long)folderId includeTrashedEntries:(BOOL)includeTrashedEntries;
- (NSDictionary *)updateFolder:(long)folderId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description mergeWithParentFolder:(BOOL)mergeWithParentFolder serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getSubfolderIds:(long)groupId folderId:(long)folderId recurse:(BOOL)recurse;
- (NSDictionary *)addFolder:(long)groupId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getFolder:(long)folderId;
- (int)getFoldersAndArticlesCount:(long)groupId folderIds:(NSArray *)folderIds status:(int)status;
- (NSDictionary *)moveFolderToTrash:(long)folderId;
- (NSArray *)getFolderIds:(long)groupId folderId:(long)folderId;
- (int)getFoldersCount:(long)groupId parentFolderId:(long)parentFolderId status:(int)status;

@end