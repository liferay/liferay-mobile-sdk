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

#import "LRDLAppService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRDLAppService_v62

- (NSDictionary *)addFileEntryWithRepositoryId:(long long)repositoryId folderId:(long long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog bytes:(NSArray *)bytes serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"bytes": bytes,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/add-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFileEntryWithRepositoryId:(long long)repositoryId folderId:(long long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
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

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFileShortcutWithRepositoryId:(long long)repositoryId folderId:(long long)folderId toFileEntryId:(long long)toFileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"toFileEntryId": @(toFileEntryId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/add-file-shortcut": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFolderWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/add-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addTempFileEntryWithGroupId:(long long)groupId folderId:(long long)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName file:(NSDictionary *)file mimeType:(NSString *)mimeType error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"fileName": fileName,
		@"tempFolderName": tempFolderName,
		@"file": file,
		@"mimeType": mimeType
	};

	NSDictionary *_command = @{@"/dlapp/add-temp-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)cancelCheckOutWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/cancel-check-out": _params};

	[self.session invoke:_command error:error];
}

- (void)checkInFileEntryWithFileEntryId:(long long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/check-in-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)checkInFileEntryWithFileEntryId:(long long)fileEntryId lockUuid:(NSString *)lockUuid serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/check-in-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)checkInFileEntryWithFileEntryId:(long long)fileEntryId majorVersion:(BOOL)majorVersion changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"majorVersion": @(majorVersion),
		@"changeLog": changeLog,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/check-in-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)checkOutFileEntryWithFileEntryId:(long long)fileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/check-out-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long long)fileEntryId owner:(NSString *)owner expirationTime:(long long)expirationTime serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"owner": owner,
		@"expirationTime": @(expirationTime),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)copyFolderWithRepositoryId:(long long)repositoryId sourceFolderId:(long long)sourceFolderId parentFolderId:(long long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"sourceFolderId": @(sourceFolderId),
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/copy-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteFileEntryWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteFileEntryByTitleWithRepositoryId:(long long)repositoryId folderId:(long long)folderId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"title": title
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-entry-by-title": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteFileShortcutWithFileShortcutId:(long long)fileShortcutId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId)
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-shortcut": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteFileVersionWithFileEntryId:(long long)fileEntryId version:(NSString *)version error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"version": version
	};

	NSDictionary *_command = @{@"/dlapp/delete-file-version": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteFolderWithFolderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/delete-folder": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteFolderWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId name:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"name": name
	};

	NSDictionary *_command = @{@"/dlapp/delete-folder": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteTempFileEntryWithGroupId:(long long)groupId folderId:(long long)folderId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"fileName": fileName,
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/dlapp/delete-temp-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithRepositoryId:(long long)repositoryId folderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithRepositoryId:(long long)repositoryId folderId:(long long)folderId fileEntryTypeId:(long long)fileEntryTypeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithRepositoryId:(long long)repositoryId folderId:(long long)folderId mimeTypes:(NSArray *)mimeTypes error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"mimeTypes": mimeTypes
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithRepositoryId:(long long)repositoryId folderId:(long long)folderId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithRepositoryId:(long long)repositoryId folderId:(long long)folderId fileEntryTypeId:(long long)fileEntryTypeId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"fileEntryTypeId": @(fileEntryTypeId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithRepositoryId:(long long)repositoryId folderId:(long long)folderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithRepositoryId:(long long)repositoryId folderId:(long long)folderId fileEntryTypeId:(long long)fileEntryTypeId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"fileEntryTypeId": @(fileEntryTypeId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesAndFileShortcutsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-and-file-shortcuts": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFileEntriesAndFileShortcutsCountWithRepositoryId:(long long)repositoryId folderId:(long long)folderId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-and-file-shortcuts-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFileEntriesAndFileShortcutsCountWithRepositoryId:(long long)repositoryId folderId:(long long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"mimeTypes": mimeTypes
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-and-file-shortcuts-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFileEntriesCountWithRepositoryId:(long long)repositoryId folderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFileEntriesCountWithRepositoryId:(long long)repositoryId folderId:(long long)folderId fileEntryTypeId:(long long)fileEntryTypeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntryWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntryWithGroupId:(long long)groupId folderId:(long long)folderId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"title": title
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntryByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"uuid": uuid,
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-entry-by-uuid-and-group-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileShortcutWithFileShortcutId:(long long)fileShortcutId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId)
	};

	NSDictionary *_command = @{@"/dlapp/get-file-shortcut": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFolderWithFolderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFolderWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId name:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"name": name
	};

	NSDictionary *_command = @{@"/dlapp/get-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"includeMountFolders": @(includeMountFolders)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"includeMountFolders": @(includeMountFolders),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"includeMountFolders": @(includeMountFolders),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId status:(int)status includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
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

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersAndFileEntriesAndFileShortcutsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId status:(int)status includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"includeMountFolders": @(includeMountFolders),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-and-file-entries-and-file-shortcuts": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersAndFileEntriesAndFileShortcutsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId status:(int)status includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"includeMountFolders": @(includeMountFolders),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-and-file-entries-and-file-shortcuts": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFoldersAndFileEntriesAndFileShortcutsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
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

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFoldersAndFileEntriesAndFileShortcutsCountWithRepositoryId:(long long)repositoryId folderId:(long long)folderId status:(int)status includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"includeMountFolders": @(includeMountFolders)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-and-file-entries-and-file-shortcuts-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFoldersAndFileEntriesAndFileShortcutsCountWithRepositoryId:(long long)repositoryId folderId:(long long)folderId status:(int)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"mimeTypes": mimeTypes,
		@"includeMountFolders": @(includeMountFolders)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-and-file-entries-and-file-shortcuts-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFoldersCountWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFoldersCountWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"includeMountFolders": @(includeMountFolders)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFoldersCountWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId status:(int)status includeMountFolders:(BOOL)includeMountFolders error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"status": @(status),
		@"includeMountFolders": @(includeMountFolders)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFoldersFileEntriesCountWithRepositoryId:(long long)repositoryId folderIds:(NSArray *)folderIds status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderIds": folderIds,
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlapp/get-folders-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupFileEntriesWithGroupId:(long long)groupId userId:(long long)userId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupFileEntriesWithGroupId:(long long)groupId userId:(long long)userId rootFolderId:(long long)rootFolderId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupFileEntriesWithGroupId:(long long)groupId userId:(long long)userId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupFileEntriesWithGroupId:(long long)groupId userId:(long long)userId rootFolderId:(long long)rootFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupFileEntriesWithGroupId:(long long)groupId userId:(long long)userId rootFolderId:(long long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
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

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupFileEntriesCountWithGroupId:(long long)groupId userId:(long long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupFileEntriesCountWithGroupId:(long long)groupId userId:(long long)userId rootFolderId:(long long)rootFolderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupFileEntriesCountWithGroupId:(long long)groupId userId:(long long)userId rootFolderId:(long long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"mimeTypes": mimeTypes,
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlapp/get-group-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getMountFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-mount-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getMountFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/get-mount-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getMountFoldersWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlapp/get-mount-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getMountFoldersCountWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-mount-folders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getSubfolderIdsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-subfolder-ids": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSubfolderIdsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId recurse:(BOOL)recurse error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"recurse": @(recurse)
	};

	NSDictionary *_command = @{@"/dlapp/get-subfolder-ids": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)getSubfolderIdsWithRepositoryId:(long long)repositoryId folderIds:(NSArray *)folderIds folderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderIds": folderIds,
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/get-subfolder-ids": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getTempFileEntryNamesWithGroupId:(long long)groupId folderId:(long long)folderId tempFolderName:(NSString *)tempFolderName error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/dlapp/get-temp-file-entry-names": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)lockFileEntryWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/lock-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)lockFileEntryWithFileEntryId:(long long)fileEntryId owner:(NSString *)owner expirationTime:(long long)expirationTime error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"owner": owner,
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlapp/lock-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)lockFolderWithRepositoryId:(long long)repositoryId folderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/lock-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)lockFolderWithRepositoryId:(long long)repositoryId folderId:(long long)folderId owner:(NSString *)owner inheritable:(BOOL)inheritable expirationTime:(long long)expirationTime error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"owner": owner,
		@"inheritable": @(inheritable),
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlapp/lock-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFileEntryWithFileEntryId:(long long)fileEntryId newFolderId:(long long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFileEntryFromTrashWithFileEntryId:(long long)fileEntryId newFolderId:(long long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-file-entry-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFileEntryToTrashWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/move-file-entry-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFileShortcutFromTrashWithFileShortcutId:(long long)fileShortcutId newFolderId:(long long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-file-shortcut-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFileShortcutToTrashWithFileShortcutId:(long long)fileShortcutId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId)
	};

	NSDictionary *_command = @{@"/dlapp/move-file-shortcut-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFolderWithFolderId:(long long)folderId parentFolderId:(long long)parentFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"parentFolderId": @(parentFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFolderFromTrashWithFolderId:(long long)folderId parentFolderId:(long long)parentFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"parentFolderId": @(parentFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/move-folder-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFolderToTrashWithFolderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/move-folder-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)refreshFileEntryLockWithLockUuid:(NSString *)lockUuid companyId:(long long)companyId expirationTime:(long long)expirationTime error:(NSError **)error {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": @(companyId),
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlapp/refresh-file-entry-lock": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)refreshFolderLockWithLockUuid:(NSString *)lockUuid companyId:(long long)companyId expirationTime:(long long)expirationTime error:(NSError **)error {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": @(companyId),
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlapp/refresh-folder-lock": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)restoreFileEntryFromTrashWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/restore-file-entry-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (void)restoreFileShortcutFromTrashWithFileShortcutId:(long long)fileShortcutId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId)
	};

	NSDictionary *_command = @{@"/dlapp/restore-file-shortcut-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (void)restoreFolderFromTrashWithFolderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/restore-folder-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (void)revertFileEntryWithFileEntryId:(long long)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"version": version,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/revert-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithRepositoryId:(long long)repositoryId searchContext:(NSDictionary *)searchContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"searchContext": searchContext
	};

	NSDictionary *_command = @{@"/dlapp/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithRepositoryId:(long long)repositoryId searchContext:(NSDictionary *)searchContext query:(NSDictionary *)query error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"searchContext": searchContext,
		@"query": query
	};

	NSDictionary *_command = @{@"/dlapp/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithRepositoryId:(long long)repositoryId creatorUserId:(long long)creatorUserId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"creatorUserId": @(creatorUserId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlapp/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithRepositoryId:(long long)repositoryId creatorUserId:(long long)creatorUserId folderId:(long long)folderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end error:(NSError **)error {
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

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)subscribeFileEntryTypeWithGroupId:(long long)groupId fileEntryTypeId:(long long)fileEntryTypeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlapp/subscribe-file-entry-type": _params};

	[self.session invoke:_command error:error];
}

- (void)subscribeFolderWithGroupId:(long long)groupId folderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/subscribe-folder": _params};

	[self.session invoke:_command error:error];
}

- (void)unlockFileEntryWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlapp/unlock-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)unlockFileEntryWithFileEntryId:(long long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/unlock-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)unlockFolderWithRepositoryId:(long long)repositoryId folderId:(long long)folderId lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/unlock-folder": _params};

	[self.session invoke:_command error:error];
}

- (void)unlockFolderWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId name:(NSString *)name lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/unlock-folder": _params};

	[self.session invoke:_command error:error];
}

- (void)unsubscribeFileEntryTypeWithGroupId:(long long)groupId fileEntryTypeId:(long long)fileEntryTypeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlapp/unsubscribe-file-entry-type": _params};

	[self.session invoke:_command error:error];
}

- (void)unsubscribeFolderWithGroupId:(long long)groupId folderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlapp/unsubscribe-folder": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFileEntryWithFileEntryId:(long long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion bytes:(NSArray *)bytes serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"majorVersion": @(majorVersion),
		@"bytes": bytes,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFileEntryWithFileEntryId:(long long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
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

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFileEntryAndCheckInWithFileEntryId:(long long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
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

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFileShortcutWithFileShortcutId:(long long)fileShortcutId folderId:(long long)folderId toFileEntryId:(long long)toFileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileShortcutId": @(fileShortcutId),
		@"folderId": @(folderId),
		@"toFileEntryId": @(toFileEntryId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-file-shortcut": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFolderWithFolderId:(long long)folderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlapp/update-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (BOOL)verifyFileEntryCheckOutWithRepositoryId:(long long)repositoryId fileEntryId:(long long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/verify-file-entry-check-out": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

- (BOOL)verifyFileEntryLockWithRepositoryId:(long long)repositoryId fileEntryId:(long long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/verify-file-entry-lock": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

- (BOOL)verifyInheritableLockWithRepositoryId:(long long)repositoryId folderId:(long long)folderId lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlapp/verify-inheritable-lock": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

@end