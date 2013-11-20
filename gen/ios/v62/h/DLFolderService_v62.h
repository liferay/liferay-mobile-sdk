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

- (NSDictionary *)addFolderWithGroupId:(long)groupId repositoryId:(long)repositoryId mountPoint:(BOOL)mountPoint parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteFolderWithFolderId:(long)folderId error:(NSError **)error;
- (void)deleteFolderWithFolderId:(long)folderId includeTrashedEntries:(BOOL)includeTrashedEntries error:(NSError **)error;
- (void)deleteFolderWithGroupId:(long)groupId parentFolderId:(long)parentFolderId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getFileEntriesAndFileShortcutsWithGroupId:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (int)getFileEntriesAndFileShortcutsCountWithGroupId:(long)groupId folderId:(long)folderId status:(int)status error:(NSError **)error;
- (int)getFileEntriesAndFileShortcutsCountWithGroupId:(long)groupId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes error:(NSError **)error;
- (NSDictionary *)getFolderWithFolderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)getFolderWithGroupId:(long)groupId parentFolderId:(long)parentFolderId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getFolderIdsWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (NSArray *)getFoldersWithGroupId:(long)groupId parentFolderId:(long)parentFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFoldersWithGroupId:(long)groupId parentFolderId:(long)parentFolderId status:(int)status includeMountfolders:(BOOL)includeMountfolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFoldersAndFileEntriesAndFileShortcutsWithGroupId:(long)groupId folderId:(long)folderId status:(int)status includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFoldersAndFileEntriesAndFileShortcutsWithGroupId:(long)groupId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getFoldersAndFileEntriesAndFileShortcutsCountWithGroupId:(long)groupId folderId:(long)folderId status:(int)status includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error;
- (int)getFoldersAndFileEntriesAndFileShortcutsCountWithGroupId:(long)groupId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error;
- (int)getFoldersCountWithGroupId:(long)groupId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (int)getFoldersCountWithGroupId:(long)groupId parentFolderId:(long)parentFolderId status:(int)status includeMountfolders:(BOOL)includeMountfolders error:(NSError **)error;
- (NSArray *)getMountFoldersWithGroupId:(long)groupId parentFolderId:(long)parentFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getMountFoldersCountWithGroupId:(long)groupId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (void)getSubfolderIdsWithFolderIds:(NSArray *)folderIds groupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (NSArray *)getSubfolderIdsWithGroupId:(long)groupId folderId:(long)folderId recurse:(BOOL)recurse error:(NSError **)error;
- (BOOL)hasFolderLockWithFolderId:(long)folderId error:(NSError **)error;
- (BOOL)hasInheritableLockWithFolderId:(long)folderId error:(NSError **)error;
- (BOOL)isFolderLockedWithFolderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)lockFolderWithFolderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)lockFolderWithFolderId:(long)folderId owner:(NSString *)owner inheritable:(BOOL)inheritable expirationTime:(long)expirationTime error:(NSError **)error;
- (NSDictionary *)moveFolderWithFolderId:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)refreshFolderLockWithLockUuid:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime error:(NSError **)error;
- (void)unlockFolderWithFolderId:(long)folderId lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (void)unlockFolderWithGroupId:(long)groupId parentFolderId:(long)parentFolderId name:(NSString *)name lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (NSDictionary *)updateFolderWithFolderId:(long)folderId name:(NSString *)name description:(NSString *)description defaultFileEntryTypeId:(long)defaultFileEntryTypeId fileEntryTypeIds:(NSArray *)fileEntryTypeIds overrideFileEntryTypes:(BOOL)overrideFileEntryTypes serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (BOOL)verifyInheritableLockWithFolderId:(long)folderId lockUuid:(NSString *)lockUuid error:(NSError **)error;

@end