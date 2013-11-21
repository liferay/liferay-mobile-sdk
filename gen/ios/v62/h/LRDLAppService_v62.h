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
@interface LRDLAppService_v62 : BaseService

- (NSDictionary *)addFileEntryWithRepositoryId:(long)repositoryId folderId:(long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog bytes:(NSArray *)bytes serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFileEntryWithRepositoryId:(long)repositoryId folderId:(long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFileShortcutWithRepositoryId:(long)repositoryId folderId:(long)folderId toFileEntryId:(long)toFileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFolderWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addTempFileEntryWithGroupId:(long)groupId folderId:(long)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName file:(NSDictionary *)file mimeType:(NSString *)mimeType error:(NSError **)error;
- (void)cancelCheckOutWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (void)checkInFileEntryWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (void)checkInFileEntryWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)checkInFileEntryWithFileEntryId:(long)fileEntryId majorVersion:(BOOL)majorVersion changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)checkOutFileEntryWithFileEntryId:(long)fileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyFolderWithRepositoryId:(long)repositoryId sourceFolderId:(long)sourceFolderId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (void)deleteFileEntryByTitleWithRepositoryId:(long)repositoryId folderId:(long)folderId title:(NSString *)title error:(NSError **)error;
- (void)deleteFileShortcutWithFileShortcutId:(long)fileShortcutId error:(NSError **)error;
- (void)deleteFileVersionWithFileEntryId:(long)fileEntryId version:(NSString *)version error:(NSError **)error;
- (void)deleteFolderWithFolderId:(long)folderId error:(NSError **)error;
- (void)deleteFolderWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name error:(NSError **)error;
- (void)deleteTempFileEntryWithGroupId:(long)groupId folderId:(long)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName error:(NSError **)error;
- (NSArray *)getFileEntriesWithRepositoryId:(long)repositoryId folderId:(long)folderId error:(NSError **)error;
- (NSArray *)getFileEntriesWithRepositoryId:(long)repositoryId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId error:(NSError **)error;
- (NSArray *)getFileEntriesWithRepositoryId:(long)repositoryId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes error:(NSError **)error;
- (NSArray *)getFileEntriesWithRepositoryId:(long)repositoryId folderId:(long)folderId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFileEntriesWithRepositoryId:(long)repositoryId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFileEntriesWithRepositoryId:(long)repositoryId folderId:(long)folderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFileEntriesWithRepositoryId:(long)repositoryId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFileEntriesAndFileShortcutsWithRepositoryId:(long)repositoryId folderId:(long)folderId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (int)getFileEntriesAndFileShortcutsCountWithRepositoryId:(long)repositoryId folderId:(long)folderId status:(int)status error:(NSError **)error;
- (int)getFileEntriesAndFileShortcutsCountWithRepositoryId:(long)repositoryId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes error:(NSError **)error;
- (int)getFileEntriesCountWithRepositoryId:(long)repositoryId folderId:(long)folderId error:(NSError **)error;
- (int)getFileEntriesCountWithRepositoryId:(long)repositoryId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId error:(NSError **)error;
- (NSDictionary *)getFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (NSDictionary *)getFileEntryWithGroupId:(long)groupId folderId:(long)folderId title:(NSString *)title error:(NSError **)error;
- (NSDictionary *)getFileEntryByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long)groupId error:(NSError **)error;
- (NSDictionary *)getFileShortcutWithFileShortcutId:(long)fileShortcutId error:(NSError **)error;
- (NSDictionary *)getFolderWithFolderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)getFolderWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (NSArray *)getFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error;
- (NSArray *)getFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId status:(int)status includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFoldersAndFileEntriesAndFileShortcutsWithRepositoryId:(long)repositoryId folderId:(long)folderId status:(int)status includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getFoldersAndFileEntriesAndFileShortcutsWithRepositoryId:(long)repositoryId folderId:(long)folderId status:(int)status includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFoldersAndFileEntriesAndFileShortcutsWithRepositoryId:(long)repositoryId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getFoldersAndFileEntriesAndFileShortcutsCountWithRepositoryId:(long)repositoryId folderId:(long)folderId status:(int)status includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error;
- (int)getFoldersAndFileEntriesAndFileShortcutsCountWithRepositoryId:(long)repositoryId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error;
- (int)getFoldersCountWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (int)getFoldersCountWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error;
- (int)getFoldersCountWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId status:(int)status includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error;
- (int)getFoldersFileEntriesCountWithRepositoryId:(long)repositoryId folderIds:(NSArray *)folderIds status:(int)status error:(NSError **)error;
- (NSArray *)getGroupFileEntriesWithGroupId:(long)groupId userId:(long)userId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGroupFileEntriesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGroupFileEntriesWithGroupId:(long)groupId userId:(long)userId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getGroupFileEntriesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getGroupFileEntriesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getGroupFileEntriesCountWithGroupId:(long)groupId userId:(long)userId error:(NSError **)error;
- (int)getGroupFileEntriesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId error:(NSError **)error;
- (int)getGroupFileEntriesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status error:(NSError **)error;
- (NSArray *)getMountFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (NSArray *)getMountFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getMountFoldersWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getMountFoldersCountWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (NSArray *)getSubfolderIdsWithRepositoryId:(long)repositoryId folderId:(long)folderId error:(NSError **)error;
- (NSArray *)getSubfolderIdsWithRepositoryId:(long)repositoryId folderId:(long)folderId recurse:(BOOL)recurse error:(NSError **)error;
- (void)getSubfolderIdsWithRepositoryId:(long)repositoryId folderIds:(NSArray *)folderIds folderId:(long)folderId error:(NSError **)error;
- (NSArray *)getTempFileEntryNamesWithGroupId:(long)groupId folderId:(long)folderId tempFolderName:(NSString *)tempFolderName error:(NSError **)error;
- (NSDictionary *)lockFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (NSDictionary *)lockFileEntryWithFileEntryId:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime error:(NSError **)error;
- (NSDictionary *)lockFolderWithRepositoryId:(long)repositoryId folderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)lockFolderWithRepositoryId:(long)repositoryId folderId:(long)folderId owner:(NSString *)owner inheritable:(BOOL)inheritable expirationTime:(long)expirationTime error:(NSError **)error;
- (NSDictionary *)moveFileEntryWithFileEntryId:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveFileEntryFromTrashWithFileEntryId:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveFileEntryToTrashWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (NSDictionary *)moveFileShortcutFromTrashWithFileShortcutId:(long)fileShortcutId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveFileShortcutToTrashWithFileShortcutId:(long)fileShortcutId error:(NSError **)error;
- (NSDictionary *)moveFolderWithFolderId:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveFolderFromTrashWithFolderId:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveFolderToTrashWithFolderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)refreshFileEntryLockWithLockUuid:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime error:(NSError **)error;
- (NSDictionary *)refreshFolderLockWithLockUuid:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime error:(NSError **)error;
- (void)restoreFileEntryFromTrashWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (void)restoreFileShortcutFromTrashWithFileShortcutId:(long)fileShortcutId error:(NSError **)error;
- (void)restoreFolderFromTrashWithFolderId:(long)folderId error:(NSError **)error;
- (void)revertFileEntryWithFileEntryId:(long)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)searchWithRepositoryId:(long)repositoryId searchContext:(NSDictionary *)searchContext error:(NSError **)error;
- (NSDictionary *)searchWithRepositoryId:(long)repositoryId searchContext:(NSDictionary *)searchContext query:(NSDictionary *)query error:(NSError **)error;
- (NSDictionary *)searchWithRepositoryId:(long)repositoryId creatorUserId:(long)creatorUserId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)searchWithRepositoryId:(long)repositoryId creatorUserId:(long)creatorUserId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (void)subscribeFileEntryTypeWithGroupId:(long)groupId fileEntryTypeId:(long)fileEntryTypeId error:(NSError **)error;
- (void)subscribeFolderWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (void)unlockFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (void)unlockFileEntryWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (void)unlockFolderWithRepositoryId:(long)repositoryId folderId:(long)folderId lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (void)unlockFolderWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (void)unsubscribeFileEntryTypeWithGroupId:(long)groupId fileEntryTypeId:(long)fileEntryTypeId error:(NSError **)error;
- (void)unsubscribeFolderWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)updateFileEntryWithFileEntryId:(long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion bytes:(NSArray *)bytes serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFileEntryWithFileEntryId:(long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFileEntryAndCheckInWithFileEntryId:(long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFileShortcutWithFileShortcutId:(long)fileShortcutId folderId:(long)folderId toFileEntryId:(long)toFileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFolderWithFolderId:(long)folderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (BOOL)verifyFileEntryCheckOutWithRepositoryId:(long)repositoryId fileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (BOOL)verifyFileEntryLockWithRepositoryId:(long)repositoryId fileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (BOOL)verifyInheritableLockWithRepositoryId:(long)repositoryId folderId:(long)folderId lockUuid:(NSString *)lockUuid error:(NSError **)error;

@end