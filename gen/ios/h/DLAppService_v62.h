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
@interface DLAppService_v62 : BaseService

- (NSArray *)getGroupFileEntries:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (int)getFoldersCount:(long)repositoryId parentFolderId:(long)parentFolderId status:(int)status includeMountFolders:(BOOL)includeMountFolders;
- (NSDictionary *)copyFolder:(long)repositoryId sourceFolderId:(long)sourceFolderId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)moveFileShortcutFromTrash:(long)fileShortcutId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext;
- (BOOL)verifyFileEntryCheckOut:(long)repositoryId fileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid;
- (NSDictionary *)updateFolder:(long)folderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)moveFileEntryToTrash:(long)fileEntryId;
- (NSDictionary *)moveFileEntry:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateFileEntry:(long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)moveFolderToTrash:(long)folderId;
- (void)revertFileEntry:(long)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getFoldersAndFileEntriesAndFileShortcuts:(long)repositoryId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (void)subscribeFileEntryType:(long)groupId fileEntryTypeId:(long)fileEntryTypeId;
- (NSDictionary *)search:(long)repositoryId creatorUserId:(long)creatorUserId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end;
- (void)restoreFileEntryFromTrash:(long)fileEntryId;
- (int)getFoldersFileEntriesCount:(long)repositoryId folderIds:(NSArray *)folderIds status:(int)status;
- (void)unlockFolder:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name lockUuid:(NSString *)lockUuid;
- (NSArray *)getMountFolders:(long)repositoryId parentFolderId:(long)parentFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSDictionary *)moveFileShortcutToTrash:(long)fileShortcutId;
- (NSDictionary *)moveFolder:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getFolders:(long)repositoryId parentFolderId:(long)parentFolderId status:(int)status includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (void)deleteFolder:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name;
- (void)deleteFileVersion:(long)fileEntryId version:(NSString *)version;
- (int)getFileEntriesAndFileShortcutsCount:(long)repositoryId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes;
- (NSDictionary *)getFolder:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name;
- (NSArray *)getFileEntriesAndFileShortcuts:(long)repositoryId folderId:(long)folderId status:(int)status start:(int)start end:(int)end;
- (NSDictionary *)checkOutFileEntry:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)lockFolder:(long)repositoryId folderId:(long)folderId owner:(NSString *)owner inheritable:(BOOL)inheritable expirationTime:(long)expirationTime;
- (NSDictionary *)addFileEntry:(long)repositoryId folderId:(long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext;
- (void)deleteTempFileEntry:(long)groupId folderId:(long)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName;
- (void)restoreFolderFromTrash:(long)folderId;
- (NSDictionary *)refreshFolderLock:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime;
- (NSDictionary *)lockFileEntry:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime;
- (NSDictionary *)addTempFileEntry:(long)groupId folderId:(long)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName file:(NSDictionary *)file mimeType:(NSString *)mimeType;
- (void)deleteFileShortcut:(long)fileShortcutId;
- (int)getFileEntriesCount:(long)repositoryId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId;
- (NSDictionary *)getFileShortcut:(long)fileShortcutId;
- (void)unsubscribeFolder:(long)groupId folderId:(long)folderId;
- (void)cancelCheckOut:(long)fileEntryId;
- (int)getFoldersAndFileEntriesAndFileShortcutsCount:(long)repositoryId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders;
- (NSArray *)getFileEntries:(long)repositoryId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (void)getSubfolderIds:(long)repositoryId folderIds:(NSArray *)folderIds folderId:(long)folderId;
- (void)restoreFileShortcutFromTrash:(long)fileShortcutId;
- (NSDictionary *)getFileEntryByUuidAndGroupId:(NSString *)uuid groupId:(long)groupId;
- (int)getGroupFileEntriesCount:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status;
- (NSDictionary *)refreshFileEntryLock:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime;
- (void)deleteFileEntry:(long)fileEntryId;
- (BOOL)verifyFileEntryLock:(long)repositoryId fileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid;
- (void)checkInFileEntry:(long)fileEntryId majorVersion:(BOOL)majorVersion changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)moveFolderFromTrash:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext;
- (void)unsubscribeFileEntryType:(long)groupId fileEntryTypeId:(long)fileEntryTypeId;
- (BOOL)verifyInheritableLock:(long)repositoryId folderId:(long)folderId lockUuid:(NSString *)lockUuid;
- (NSDictionary *)updateFileShortcut:(long)fileShortcutId folderId:(long)folderId toFileEntryId:(long)toFileEntryId serviceContext:(NSDictionary *)serviceContext;
- (void)unlockFileEntry:(long)fileEntryId lockUuid:(NSString *)lockUuid;
- (NSArray *)getTempFileEntryNames:(long)groupId folderId:(long)folderId tempFolderName:(NSString *)tempFolderName;
- (NSDictionary *)updateFileEntryAndCheckIn:(long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext;
- (int)getMountFoldersCount:(long)repositoryId parentFolderId:(long)parentFolderId;
- (NSDictionary *)addFolder:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addFileShortcut:(long)repositoryId folderId:(long)folderId toFileEntryId:(long)toFileEntryId serviceContext:(NSDictionary *)serviceContext;
- (void)deleteFileEntryByTitle:(long)repositoryId folderId:(long)folderId title:(NSString *)title;
- (NSDictionary *)moveFileEntryFromTrash:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext;
- (void)subscribeFolder:(long)groupId folderId:(long)folderId;
- (NSDictionary *)getFileEntry:(long)groupId folderId:(long)folderId title:(NSString *)title;

@end