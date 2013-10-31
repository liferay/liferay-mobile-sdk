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

#import "DLFolderService_v62.h"

/**
 * author Bruno Farache
 */
@implementation DLFolderService_v62

- (NSNumber *)getMountFoldersCount:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId
	};

	NSDictionary *_command = @{@"/dlfolder/get-mount-folders-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getFoldersAndFileEntriesAndFileShortcuts:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status,
		@"mimeTypes": mimeTypes,
		@"includeMountFolders": includeMountFolders,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfolder/get-folders-and-file-entries-and-file-shortcuts": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)getFolder:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"name": name
	};

	NSDictionary *_command = @{@"/dlfolder/get-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (BOOL)hasInheritableLock:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/dlfolder/has-inheritable-lock": _params};

	return (BOOL)[session invoke:_command];
}

- (NSDictionary *)lockFolder:(NSNumber *)folderId owner:(NSString *)owner inheritable:(BOOL)inheritable expirationTime:(NSNumber *)expirationTime {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"owner": owner,
		@"inheritable": inheritable,
		@"expirationTime": expirationTime
	};

	NSDictionary *_command = @{@"/dlfolder/lock-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getFolders:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status includeMountfolders:(BOOL)includeMountfolders start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"status": status,
		@"includeMountfolders": includeMountfolders,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfolder/get-folders": _params};

	return (NSArray *)[session invoke:_command];
}

- (BOOL)isFolderLocked:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/dlfolder/is-folder-locked": _params};

	return (BOOL)[session invoke:_command];
}

- (NSNumber *)getFoldersCount:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status includeMountfolders:(BOOL)includeMountfolders {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"status": status,
		@"includeMountfolders": includeMountfolders
	};

	NSDictionary *_command = @{@"/dlfolder/get-folders-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)unlockFolder:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"name": name,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlfolder/unlock-folder": _params};

	[session invoke:_command];
}

- (NSArray *)getMountFolders:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfolder/get-mount-folders": _params};

	return (NSArray *)[session invoke:_command];
}

- (BOOL)hasFolderLock:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/dlfolder/has-folder-lock": _params};

	return (BOOL)[session invoke:_command];
}

- (NSNumber *)getFileEntriesAndFileShortcutsCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status mimeTypes:(NSArray *)mimeTypes {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status,
		@"mimeTypes": mimeTypes
	};

	NSDictionary *_command = @{@"/dlfolder/get-file-entries-and-file-shortcuts-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getFolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId
	};

	NSDictionary *_command = @{@"/dlfolder/get-folder-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (BOOL)verifyInheritableLock:(NSNumber *)folderId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlfolder/verify-inheritable-lock": _params};

	return (BOOL)[session invoke:_command];
}

- (NSDictionary *)moveFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"parentFolderId": parentFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfolder/move-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getFoldersAndFileEntriesAndFileShortcutsCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status,
		@"mimeTypes": mimeTypes,
		@"includeMountFolders": includeMountFolders
	};

	NSDictionary *_command = @{@"/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)addFolder:(NSNumber *)groupId repositoryId:(NSNumber *)repositoryId mountPoint:(BOOL)mountPoint parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"repositoryId": repositoryId,
		@"mountPoint": mountPoint,
		@"parentFolderId": parentFolderId,
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfolder/add-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)refreshFolderLock:(NSString *)lockUuid companyId:(NSNumber *)companyId expirationTime:(NSNumber *)expirationTime {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": companyId,
		@"expirationTime": expirationTime
	};

	NSDictionary *_command = @{@"/dlfolder/refresh-folder-lock": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getSubfolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId recurse:(BOOL)recurse {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"recurse": recurse
	};

	NSDictionary *_command = @{@"/dlfolder/get-subfolder-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)deleteFolder:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentFolderId": parentFolderId,
		@"name": name
	};

	NSDictionary *_command = @{@"/dlfolder/delete-folder": _params};

	[session invoke:_command];
}

- (NSArray *)getFileEntriesAndFileShortcuts:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/dlfolder/get-file-entries-and-file-shortcuts": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateFolder:(NSNumber *)folderId name:(NSString *)name description:(NSString *)description defaultFileEntryTypeId:(NSNumber *)defaultFileEntryTypeId fileEntryTypeIds:(NSArray *)fileEntryTypeIds overrideFileEntryTypes:(BOOL)overrideFileEntryTypes serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"folderId": folderId,
		@"name": name,
		@"description": description,
		@"defaultFileEntryTypeId": defaultFileEntryTypeId,
		@"fileEntryTypeIds": fileEntryTypeIds,
		@"overrideFileEntryTypes": overrideFileEntryTypes,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfolder/update-folder": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end