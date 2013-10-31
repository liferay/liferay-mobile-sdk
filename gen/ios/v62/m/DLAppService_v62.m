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

#import "DLAppService_v62.h"

/**
 * author Bruno Farache
 */
@implementation DLAppService_v62

- (NSArray *)getGroupFileEntries:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"mimeTypes": mimeTypes,
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getFoldersCount:(long)repositoryId parentFolderId:(long)parentFolderId status:(int)status includeMountFolders:(BOOL)includeMountFolders {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"status": @(status),
		@"includeMountFolders": @(includeMountFolders)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)copyFolder:(long)repositoryId sourceFolderId:(long)sourceFolderId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"sourceFolderId": @(sourceFolderId),
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/copy-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)moveFileShortcutFromTrash:(long)fileShortcutId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-file-shortcut-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (BOOL)verifyFileEntryCheckOut:(long)repositoryId fileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/verify-file-entry-check-out": _params};

	return (BOOL)[self.session invoke:_command];
}

- (NSDictionary *)updateFolder:(long)folderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)moveFileEntryToTrash:(long)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/move-file-entry-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)moveFileEntry:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updateFileEntry:(long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"majorVersion": @(majorVersion),
		@"file": file,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)moveFolderToTrash:(long)folderId {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/move-folder-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)revertFileEntry:(long)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"version": version,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/revert-file-entry": _params};

	[self.session invoke:_command];
}

- (NSArray *)getFoldersAndFileEntriesAndFileShortcuts:(long)repositoryId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"mimeTypes": mimeTypes,
		@"includeMountFolders": @(includeMountFolders),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-and-file-entries-and-file-shortcuts": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)subscribeFileEntryType:(long)groupId fileEntryTypeId:(long)fileEntryTypeId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlapp/subscribe-file-entry-type": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)search:(long)repositoryId creatorUserId:(long)creatorUserId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"creatorUserId": @(creatorUserId),
		@"folderId": @(folderId),
		@"mimeTypes": mimeTypes,
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/search": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)restoreFileEntryFromTrash:(long)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/restore-file-entry-from-trash": _params};

	[self.session invoke:_command];
}

- (int)getFoldersFileEntriesCount:(long)repositoryId folderIds:(NSArray *)folderIds status:(int)status {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderIds": folderIds,
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-file-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (void)unlockFolder:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/unlock-folder": _params};

	[self.session invoke:_command];
}

- (NSArray *)getMountFolders:(long)repositoryId parentFolderId:(long)parentFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-mount-folders": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)moveFileShortcutToTrash:(long)fileShortcutId {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId)
	};

	NSDictionary *_command = @{@"/dlapp/move-file-shortcut-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)moveFolder:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"parentFolderId": @(parentFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getFolders:(long)repositoryId parentFolderId:(long)parentFolderId status:(int)status includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"status": @(status),
		@"includeMountFolders": @(includeMountFolders),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-folders": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)deleteFolder:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"name": name
	};

	NSDictionary *_command = @{@"/dlapp/delete-folder": _params};

	[self.session invoke:_command];
}

- (void)deleteFileVersion:(long)fileEntryId version:(NSString *)version {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"version": version
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-version": _params};

	[self.session invoke:_command];
}

- (int)getFileEntriesAndFileShortcutsCount:(long)repositoryId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"mimeTypes": mimeTypes
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-and-file-shortcuts-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)getFolder:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"name": name
	};

	NSDictionary *_command = @{@"/dlapp/get-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getFileEntriesAndFileShortcuts:(long)repositoryId folderId:(long)folderId status:(int)status start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-and-file-shortcuts": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)checkOutFileEntry:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"owner": owner,
		@"expirationTime": @(expirationTime),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)lockFolder:(long)repositoryId folderId:(long)folderId owner:(NSString *)owner inheritable:(BOOL)inheritable expirationTime:(long)expirationTime {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"owner": owner,
		@"inheritable": @(inheritable),
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlapp/lock-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addFileEntry:(long)repositoryId folderId:(long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"file": file,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/add-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteTempFileEntry:(long)groupId folderId:(long)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"fileName": fileName,
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/dlapp/delete-temp-file-entry": _params};

	[self.session invoke:_command];
}

- (void)restoreFolderFromTrash:(long)folderId {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/restore-folder-from-trash": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)refreshFolderLock:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": @(companyId),
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlapp/refresh-folder-lock": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)lockFileEntry:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"owner": owner,
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlapp/lock-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addTempFileEntry:(long)groupId folderId:(long)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName file:(NSDictionary *)file mimeType:(NSString *)mimeType {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"fileName": fileName,
		@"tempFolderName": tempFolderName,
		@"file": file,
		@"mimeType": mimeType
	};

	NSDictionary *_command = @{@"/dlapp/add-temp-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteFileShortcut:(long)fileShortcutId {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId)
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-shortcut": _params};

	[self.session invoke:_command];
}

- (int)getFileEntriesCount:(long)repositoryId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)getFileShortcut:(long)fileShortcutId {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-shortcut": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)unsubscribeFolder:(long)groupId folderId:(long)folderId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/unsubscribe-folder": _params};

	[self.session invoke:_command];
}

- (void)cancelCheckOut:(long)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/cancel-check-out": _params};

	[self.session invoke:_command];
}

- (int)getFoldersAndFileEntriesAndFileShortcutsCount:(long)repositoryId folderId:(long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"mimeTypes": mimeTypes,
		@"includeMountFolders": @(includeMountFolders)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-and-file-entries-and-file-shortcuts-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)getFileEntries:(long)repositoryId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"fileEntryTypeId": @(fileEntryTypeId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)getSubfolderIds:(long)repositoryId folderIds:(NSArray *)folderIds folderId:(long)folderId {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderIds": folderIds,
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-subfolder-ids": _params};

	[self.session invoke:_command];
}

- (void)restoreFileShortcutFromTrash:(long)fileShortcutId {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId)
	};

	NSDictionary *_command = @{@"/dlapp/restore-file-shortcut-from-trash": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getFileEntryByUuidAndGroupId:(NSString *)uuid groupId:(long)groupId {
	NSDictionary *_params = @{
		@"uuid": uuid,
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entry-by-uuid-and-group-id": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getGroupFileEntriesCount:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"mimeTypes": mimeTypes,
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)refreshFileEntryLock:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": @(companyId),
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlapp/refresh-file-entry-lock": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteFileEntry:(long)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-entry": _params};

	[self.session invoke:_command];
}

- (BOOL)verifyFileEntryLock:(long)repositoryId fileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/verify-file-entry-lock": _params};

	return (BOOL)[self.session invoke:_command];
}

- (void)checkInFileEntry:(long)fileEntryId majorVersion:(BOOL)majorVersion changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"majorVersion": @(majorVersion),
		@"changeLog": changeLog,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/check-in-file-entry": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)moveFolderFromTrash:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"parentFolderId": @(parentFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-folder-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)unsubscribeFileEntryType:(long)groupId fileEntryTypeId:(long)fileEntryTypeId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlapp/unsubscribe-file-entry-type": _params};

	[self.session invoke:_command];
}

- (BOOL)verifyInheritableLock:(long)repositoryId folderId:(long)folderId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/verify-inheritable-lock": _params};

	return (BOOL)[self.session invoke:_command];
}

- (NSDictionary *)updateFileShortcut:(long)fileShortcutId folderId:(long)folderId toFileEntryId:(long)toFileEntryId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId),
		@"folderId": @(folderId),
		@"toFileEntryId": @(toFileEntryId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-file-shortcut": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)unlockFileEntry:(long)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/unlock-file-entry": _params};

	[self.session invoke:_command];
}

- (NSArray *)getTempFileEntryNames:(long)groupId folderId:(long)folderId tempFolderName:(NSString *)tempFolderName {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/dlapp/get-temp-file-entry-names": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)updateFileEntryAndCheckIn:(long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"majorVersion": @(majorVersion),
		@"file": file,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-file-entry-and-check-in": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getMountFoldersCount:(long)repositoryId parentFolderId:(long)parentFolderId {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-mount-folders-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)addFolder:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/add-folder": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addFileShortcut:(long)repositoryId folderId:(long)folderId toFileEntryId:(long)toFileEntryId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"toFileEntryId": @(toFileEntryId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/add-file-shortcut": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteFileEntryByTitle:(long)repositoryId folderId:(long)folderId title:(NSString *)title {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"title": title
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-entry-by-title": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)moveFileEntryFromTrash:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-file-entry-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)subscribeFolder:(long)groupId folderId:(long)folderId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/subscribe-folder": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getFileEntry:(long)groupId folderId:(long)folderId title:(NSString *)title {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"title": title
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end