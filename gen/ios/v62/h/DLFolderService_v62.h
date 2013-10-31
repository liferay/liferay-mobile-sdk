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
@interface DLFolderService_v62 : BaseService

- (int)getMountFoldersCount:(long)groupId parentFolderId:(long)parentFolderId;
- (NSArray *)getFoldersAndFileEntriesAndFileShortcuts:(long)groupId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSDictionary *)getFolder:(long)groupId parentFolderId:(long)parentFolderId name:(NSString *)name;
- (BOOL)hasInheritableLock:(long)folderId;
- (NSDictionary *)lockFolder:(long)folderId owner:(NSString *)owner inheritable:(BOOL)inheritable expirationTime:(long)expirationTime;
- (NSArray *)getFolders:(long)groupId parentFolderId:(long)parentFolderId status:(int)status includeMountfolders:(BOOL)includeMountfolders start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (BOOL)isFolderLocked:(long)folderId;
- (int)getFoldersCount:(long)groupId parentFolderId:(long)parentFolderId status:(int)status includeMountfolders:(BOOL)includeMountfolders;
- (void)unlockFolder:(long)groupId parentFolderId:(long)parentFolderId name:(NSString *)name lockUuid:(NSString *)lockUuid;
- (NSArray *)getMountFolders:(long)groupId parentFolderId:(long)parentFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (BOOL)hasFolderLock:(long)folderId;
- (int)getFileEntriesAndFileShortcutsCount:(long)groupId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes;
- (NSArray *)getFolderIds:(long)groupId folderId:(long)folderId;
- (BOOL)verifyInheritableLock:(long)folderId lockUuid:(NSString *)lockUuid;
- (NSDictionary *)moveFolder:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext;
- (int)getFoldersAndFileEntriesAndFileShortcutsCount:(long)groupId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders;
- (NSDictionary *)addFolder:(long)groupId repositoryId:(long)repositoryId mountPoint:(BOOL)mountPoint parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)refreshFolderLock:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime;
- (NSArray *)getSubfolderIds:(long)groupId folderId:(long)folderId recurse:(BOOL)recurse;
- (void)deleteFolder:(long)groupId parentFolderId:(long)parentFolderId name:(NSString *)name;
- (NSArray *)getFileEntriesAndFileShortcuts:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end;
- (NSDictionary *)updateFolder:(long)folderId name:(NSString *)name description:(NSString *)description defaultFileEntryTypeId:(long)defaultFileEntryTypeId fileEntryTypeIds:(NSArray *)fileEntryTypeIds overrideFileEntryTypes:(BOOL)overrideFileEntryTypes serviceContext:(NSDictionary *)serviceContext;

@end