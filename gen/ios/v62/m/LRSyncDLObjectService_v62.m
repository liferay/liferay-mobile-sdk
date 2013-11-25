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

#import "LRSyncDLObjectService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRSyncDLObjectService_v62

- (NSDictionary *)addFileEntryWithRepositoryId:(long long)repositoryId folderId:(long long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog file:(NSDictionary *)file checksum:(NSString *)checksum serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"file": file,
		@"checksum": checksum,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/add-file-entry": _params};

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

	NSDictionary *_command = @{@"/sync-web/syncdlobject/add-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)cancelCheckOutWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/cancel-check-out": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)checkInFileEntryWithFileEntryId:(long long)fileEntryId majorVersion:(BOOL)majorVersion changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"majorVersion": @(majorVersion),
		@"changeLog": changeLog,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/check-in-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long long)fileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long long)fileEntryId owner:(NSString *)owner expirationTime:(long long)expirationTime serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"owner": owner,
		@"expirationTime": @(expirationTime),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getAllSyncDlObjectsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-all-sync-dl-objects": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntrySyncDlObjectWithGroupId:(long long)groupId folderId:(long long)folderId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"title": title
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-file-entry-sync-dl-object": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntrySyncDlObjectsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-file-entry-sync-dl-objects": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFolderSyncDlObjectWithFolderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-folder-sync-dl-object": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFolderSyncDlObjectsWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-folder-sync-dl-objects": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getGroupWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLatestModifiedTime:(NSError **)error {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-latest-modified-time": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getSyncContextWithUuid:(NSString *)uuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"uuid": uuid
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-sync-context": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getSyncDlObjectUpdateWithCompanyId:(long long)companyId repositoryId:(long long)repositoryId lastAccessTime:(long long)lastAccessTime error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"repositoryId": @(repositoryId),
		@"lastAccessTime": @(lastAccessTime)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-sync-dl-object-update": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserSitesGroups:(NSError **)error {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-user-sites-groups": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFileEntryWithFileEntryId:(long long)fileEntryId newFolderId:(long long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/move-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFileEntryToTrashWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/move-file-entry-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFolderWithFolderId:(long long)folderId parentFolderId:(long long)parentFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"parentFolderId": @(parentFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/move-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFolderToTrashWithFolderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/move-folder-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)patchFileEntryWithFileEntryId:(long long)fileEntryId sourceVersion:(NSString *)sourceVersion sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion deltaFile:(NSDictionary *)deltaFile checksum:(NSString *)checksum serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"sourceVersion": sourceVersion,
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"majorVersion": @(majorVersion),
		@"deltaFile": deltaFile,
		@"checksum": checksum,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/patch-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)restoreFileEntryFromTrashWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/restore-file-entry-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)restoreFolderFromTrashWithFolderId:(long long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/restore-folder-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFileEntryWithFileEntryId:(long long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file checksum:(NSString *)checksum serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"majorVersion": @(majorVersion),
		@"file": file,
		@"checksum": checksum,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/update-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFolderWithFolderId:(long long)folderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/sync-web/syncdlobject/update-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end