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

- (NSArray *)getGroupFileEntries:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userId": userId,
		@"rootFolderId": rootFolderId,
		@"mimeTypes": mimeTypes,
		@"status": status,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getFoldersCount:(NSNumber *)repositoryId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status includeMountFolders:(BOOL)includeMountFolders {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"parentFolderId": parentFolderId,
		@"status": status,
		@"includeMountFolders": includeMountFolders
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)copyFolder:(NSNumber *)repositoryId sourceFolderId:(NSNumber *)sourceFolderId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"sourceFolderId": sourceFolderId,
		@"parentFolderId": parentFolderId,
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/copy-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveFileShortcutFromTrash:(NSNumber *)fileShortcutId newFolderId:(NSNumber *)newFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileShortcutId": fileShortcutId,
		@"newFolderId": newFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-file-shortcut-from-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (BOOL)verifyFileEntryCheckOut:(NSNumber *)repositoryId fileEntryId:(NSNumber *)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"fileEntryId": fileEntryId,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/verify-file-entry-check-out": _params};

	return (BOOL)[session invoke:_command];
}

- (NSDictionary *)updateFolder:(NSNumber *)folderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveFileEntryToTrash:(NSNumber *)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId
	};

	NSDictionary *_command = @{@"/dlapp/move-file-entry-to-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveFileEntry:(NSNumber *)fileEntryId newFolderId:(NSNumber *)newFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"newFolderId": newFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateFileEntry:(NSNumber *)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"majorVersion": majorVersion,
		@"file": file,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveFolderToTrash:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/dlapp/move-folder-to-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)revertFileEntry:(NSNumber *)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"version": version,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/revert-file-entry": _params};

	[session invoke:_command];
}

- (NSArray *)getFoldersAndFileEntriesAndFileShortcuts:(NSNumber *)repositoryId folderId:(NSNumber *)folderId status:(NSNumber *)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"status": status,
		@"mimeTypes": mimeTypes,
		@"includeMountFolders": includeMountFolders,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-and-file-entries-and-file-shortcuts": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)subscribeFileEntryType:(NSNumber *)groupId fileEntryTypeId:(NSNumber *)fileEntryTypeId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"fileEntryTypeId": fileEntryTypeId
	};

	NSDictionary *_command = @{@"/dlapp/subscribe-file-entry-type": _params};

	[session invoke:_command];
}

- (NSDictionary *)search:(NSNumber *)repositoryId creatorUserId:(NSNumber *)creatorUserId folderId:(NSNumber *)folderId mimeTypes:(NSArray *)mimeTypes status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"creatorUserId": creatorUserId,
		@"folderId": folderId,
		@"mimeTypes": mimeTypes,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/dlapp/search": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)restoreFileEntryFromTrash:(NSNumber *)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId
	};

	NSDictionary *_command = @{@"/dlapp/restore-file-entry-from-trash": _params};

	[session invoke:_command];
}

- (NSNumber *)getFoldersFileEntriesCount:(NSNumber *)repositoryId folderIds:(NSArray *)folderIds status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderIds": folderIds,
		@"status": status
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-file-entries-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)unlockFolder:(NSNumber *)repositoryId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"parentFolderId": parentFolderId,
		@"name": name,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/unlock-folder": _params};

	[session invoke:_command];
}

- (NSArray *)getMountFolders:(NSNumber *)repositoryId parentFolderId:(NSNumber *)parentFolderId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"parentFolderId": parentFolderId,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-mount-folders": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)moveFileShortcutToTrash:(NSNumber *)fileShortcutId {
	NSDictionary *_params = @{
		@"fileShortcutId": fileShortcutId
	};

	NSDictionary *_command = @{@"/dlapp/move-file-shortcut-to-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)moveFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"parentFolderId": parentFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getFolders:(NSNumber *)repositoryId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status includeMountFolders:(BOOL)includeMountFolders start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"parentFolderId": parentFolderId,
		@"status": status,
		@"includeMountFolders": includeMountFolders,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-folders": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)deleteFolder:(NSNumber *)repositoryId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"parentFolderId": parentFolderId,
		@"name": name
	};

	NSDictionary *_command = @{@"/dlapp/delete-folder": _params};

	[session invoke:_command];
}

- (void)deleteFileVersion:(NSNumber *)fileEntryId version:(NSString *)version {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"version": version
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-version": _params};

	[session invoke:_command];
}

- (NSNumber *)getFileEntriesAndFileShortcutsCount:(NSNumber *)repositoryId folderId:(NSNumber *)folderId status:(NSNumber *)status mimeTypes:(NSArray *)mimeTypes {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"status": status,
		@"mimeTypes": mimeTypes
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-and-file-shortcuts-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)getFolder:(NSNumber *)repositoryId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"parentFolderId": parentFolderId,
		@"name": name
	};

	NSDictionary *_command = @{@"/dlapp/get-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getFileEntriesAndFileShortcuts:(NSNumber *)repositoryId folderId:(NSNumber *)folderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-and-file-shortcuts": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)checkOutFileEntry:(NSNumber *)fileEntryId owner:(NSString *)owner expirationTime:(NSNumber *)expirationTime serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"owner": owner,
		@"expirationTime": expirationTime,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/check-out-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)lockFolder:(NSNumber *)repositoryId folderId:(NSNumber *)folderId owner:(NSString *)owner inheritable:(BOOL)inheritable expirationTime:(NSNumber *)expirationTime {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"owner": owner,
		@"inheritable": inheritable,
		@"expirationTime": expirationTime
	};

	NSDictionary *_command = @{@"/dlapp/lock-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addFileEntry:(NSNumber *)repositoryId folderId:(NSNumber *)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"file": file,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/add-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteTempFileEntry:(NSNumber *)groupId folderId:(NSNumber *)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"fileName": fileName,
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/dlapp/delete-temp-file-entry": _params};

	[session invoke:_command];
}

- (void)restoreFolderFromTrash:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/dlapp/restore-folder-from-trash": _params};

	[session invoke:_command];
}

- (NSDictionary *)refreshFolderLock:(NSString *)lockUuid companyId:(NSNumber *)companyId expirationTime:(NSNumber *)expirationTime {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": companyId,
		@"expirationTime": expirationTime
	};

	NSDictionary *_command = @{@"/dlapp/refresh-folder-lock": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)lockFileEntry:(NSNumber *)fileEntryId owner:(NSString *)owner expirationTime:(NSNumber *)expirationTime {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"owner": owner,
		@"expirationTime": expirationTime
	};

	NSDictionary *_command = @{@"/dlapp/lock-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addTempFileEntry:(NSNumber *)groupId folderId:(NSNumber *)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName file:(NSDictionary *)file mimeType:(NSString *)mimeType {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"fileName": fileName,
		@"tempFolderName": tempFolderName,
		@"file": file,
		@"mimeType": mimeType
	};

	NSDictionary *_command = @{@"/dlapp/add-temp-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteFileShortcut:(NSNumber *)fileShortcutId {
	NSDictionary *_params = @{
		@"fileShortcutId": fileShortcutId
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-shortcut": _params};

	[session invoke:_command];
}

- (NSNumber *)getFileEntriesCount:(NSNumber *)repositoryId folderId:(NSNumber *)folderId fileEntryTypeId:(NSNumber *)fileEntryTypeId {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"fileEntryTypeId": fileEntryTypeId
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)getFileShortcut:(NSNumber *)fileShortcutId {
	NSDictionary *_params = @{
		@"fileShortcutId": fileShortcutId
	};

	NSDictionary *_command = @{@"/dlapp/get-file-shortcut": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)unsubscribeFolder:(NSNumber *)groupId folderId:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/dlapp/unsubscribe-folder": _params};

	[session invoke:_command];
}

- (void)cancelCheckOut:(NSNumber *)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId
	};

	NSDictionary *_command = @{@"/dlapp/cancel-check-out": _params};

	[session invoke:_command];
}

- (NSNumber *)getFoldersAndFileEntriesAndFileShortcutsCount:(NSNumber *)repositoryId folderId:(NSNumber *)folderId status:(NSNumber *)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"status": status,
		@"mimeTypes": mimeTypes,
		@"includeMountFolders": includeMountFolders
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-and-file-entries-and-file-shortcuts-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getFileEntries:(NSNumber *)repositoryId folderId:(NSNumber *)folderId fileEntryTypeId:(NSNumber *)fileEntryTypeId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"fileEntryTypeId": fileEntryTypeId,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)getSubfolderIds:(NSNumber *)repositoryId folderIds:(NSArray *)folderIds folderId:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderIds": folderIds,
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/dlapp/get-subfolder-ids": _params};

	[session invoke:_command];
}

- (void)restoreFileShortcutFromTrash:(NSNumber *)fileShortcutId {
	NSDictionary *_params = @{
		@"fileShortcutId": fileShortcutId
	};

	NSDictionary *_command = @{@"/dlapp/restore-file-shortcut-from-trash": _params};

	[session invoke:_command];
}

- (NSDictionary *)getFileEntryByUuidAndGroupId:(NSString *)uuid groupId:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"uuid": uuid,
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entry-by-uuid-and-group-id": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getGroupFileEntriesCount:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userId": userId,
		@"rootFolderId": rootFolderId,
		@"mimeTypes": mimeTypes,
		@"status": status
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)refreshFileEntryLock:(NSString *)lockUuid companyId:(NSNumber *)companyId expirationTime:(NSNumber *)expirationTime {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": companyId,
		@"expirationTime": expirationTime
	};

	NSDictionary *_command = @{@"/dlapp/refresh-file-entry-lock": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteFileEntry:(NSNumber *)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-entry": _params};

	[session invoke:_command];
}

- (BOOL)verifyFileEntryLock:(NSNumber *)repositoryId fileEntryId:(NSNumber *)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"fileEntryId": fileEntryId,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/verify-file-entry-lock": _params};

	return (BOOL)[session invoke:_command];
}

- (void)checkInFileEntry:(NSNumber *)fileEntryId majorVersion:(BOOL)majorVersion changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"majorVersion": majorVersion,
		@"changeLog": changeLog,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/check-in-file-entry": _params};

	[session invoke:_command];
}

- (NSDictionary *)moveFolderFromTrash:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"parentFolderId": parentFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-folder-from-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)unsubscribeFileEntryType:(NSNumber *)groupId fileEntryTypeId:(NSNumber *)fileEntryTypeId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"fileEntryTypeId": fileEntryTypeId
	};

	NSDictionary *_command = @{@"/dlapp/unsubscribe-file-entry-type": _params};

	[session invoke:_command];
}

- (BOOL)verifyInheritableLock:(NSNumber *)repositoryId folderId:(NSNumber *)folderId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/verify-inheritable-lock": _params};

	return (BOOL)[session invoke:_command];
}

- (NSDictionary *)updateFileShortcut:(NSNumber *)fileShortcutId folderId:(NSNumber *)folderId toFileEntryId:(NSNumber *)toFileEntryId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileShortcutId": fileShortcutId,
		@"folderId": folderId,
		@"toFileEntryId": toFileEntryId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-file-shortcut": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)unlockFileEntry:(NSNumber *)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/unlock-file-entry": _params};

	[session invoke:_command];
}

- (NSArray *)getTempFileEntryNames:(NSNumber *)groupId folderId:(NSNumber *)folderId tempFolderName:(NSString *)tempFolderName {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/dlapp/get-temp-file-entry-names": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateFileEntryAndCheckIn:(NSNumber *)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"majorVersion": majorVersion,
		@"file": file,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-file-entry-and-check-in": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getMountFoldersCount:(NSNumber *)repositoryId parentFolderId:(NSNumber *)parentFolderId {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"parentFolderId": parentFolderId
	};

	NSDictionary *_command = @{@"/dlapp/get-mount-folders-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)addFolder:(NSNumber *)repositoryId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"parentFolderId": parentFolderId,
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/add-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addFileShortcut:(NSNumber *)repositoryId folderId:(NSNumber *)folderId toFileEntryId:(NSNumber *)toFileEntryId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"toFileEntryId": toFileEntryId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/add-file-shortcut": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteFileEntryByTitle:(NSNumber *)repositoryId folderId:(NSNumber *)folderId title:(NSString *)title {
	NSDictionary *_params = @{
		@"repositoryId": repositoryId,
		@"folderId": folderId,
		@"title": title
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-entry-by-title": _params};

	[session invoke:_command];
}

- (NSDictionary *)moveFileEntryFromTrash:(NSNumber *)fileEntryId newFolderId:(NSNumber *)newFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"newFolderId": newFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-file-entry-from-trash": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)subscribeFolder:(NSNumber *)groupId folderId:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/dlapp/subscribe-folder": _params};

	[session invoke:_command];
}

- (NSDictionary *)getFileEntry:(NSNumber *)groupId folderId:(NSNumber *)folderId title:(NSString *)title {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"title": title
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end