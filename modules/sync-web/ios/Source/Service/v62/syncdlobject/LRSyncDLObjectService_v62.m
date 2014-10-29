/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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
 * @author Bruno Farache
 */
@implementation LRSyncDLObjectService_v62

- (NSDictionary *)addFileEntryWithRepositoryId:(long long)repositoryId folderId:(long long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog file:(LRUploadData *)file checksum:(NSString *)checksum serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId),
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"file": file,
		@"checksum": checksum,
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/add-file-entry": _params};

	return (NSDictionary *)[self.session upload:_command error:error];
}

- (NSDictionary *)addFolderWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"description": description,
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/add-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)cancelCheckOutWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fileEntryId": @(fileEntryId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/cancel-check-out": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)checkInFileEntryWithFileEntryId:(long long)fileEntryId majorVersion:(BOOL)majorVersion changeLog:(NSString *)changeLog serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fileEntryId": @(fileEntryId),
		@"majorVersion": @(majorVersion),
		@"changeLog": changeLog,
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/check-in-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long long)fileEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fileEntryId": @(fileEntryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long long)fileEntryId owner:(NSString *)owner expirationTime:(long long)expirationTime serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fileEntryId": @(fileEntryId),
		@"owner": owner,
		@"expirationTime": @(expirationTime),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getAllSyncDlObjectsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-all-sync-dl-objects": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntrySyncDlObjectWithGroupId:(long long)groupId folderId:(long long)folderId title:(NSString *)title error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"title": title
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-file-entry-sync-dl-object": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntrySyncDlObjectsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"repositoryId": @(repositoryId),
		@"folderId": @(folderId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-file-entry-sync-dl-objects": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFolderSyncDlObjectWithFolderId:(long long)folderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"folderId": @(folderId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-folder-sync-dl-object": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFolderSyncDlObjectsWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"repositoryId": @(repositoryId),
		@"parentFolderId": @(parentFolderId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-folder-sync-dl-objects": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getGroupWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLatestModifiedTime:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-latest-modified-time": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getSyncContextWithUuid:(NSString *)uuid error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"uuid": uuid
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-sync-context": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getSyncDlObjectUpdateWithCompanyId:(long long)companyId repositoryId:(long long)repositoryId lastAccessTime:(long long)lastAccessTime error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"repositoryId": @(repositoryId),
		@"lastAccessTime": @(lastAccessTime)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-sync-dl-object-update": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserSitesGroups:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/get-user-sites-groups": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFileEntryWithFileEntryId:(long long)fileEntryId newFolderId:(long long)newFolderId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fileEntryId": @(fileEntryId),
		@"newFolderId": @(newFolderId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/move-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFileEntryToTrashWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fileEntryId": @(fileEntryId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/move-file-entry-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFolderWithFolderId:(long long)folderId parentFolderId:(long long)parentFolderId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"folderId": @(folderId),
		@"parentFolderId": @(parentFolderId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/move-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveFolderToTrashWithFolderId:(long long)folderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"folderId": @(folderId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/move-folder-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)patchFileEntryWithFileEntryId:(long long)fileEntryId sourceVersion:(NSString *)sourceVersion sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion deltaFile:(LRUploadData *)deltaFile checksum:(NSString *)checksum serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
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
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/patch-file-entry": _params};

	return (NSDictionary *)[self.session upload:_command error:error];
}

- (NSDictionary *)restoreFileEntryFromTrashWithFileEntryId:(long long)fileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fileEntryId": @(fileEntryId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/restore-file-entry-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)restoreFolderFromTrashWithFolderId:(long long)folderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"folderId": @(folderId)
	}];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/restore-folder-from-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateFileEntryWithFileEntryId:(long long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(LRUploadData *)file checksum:(NSString *)checksum serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"fileEntryId": @(fileEntryId),
		@"sourceFileName": sourceFileName,
		@"mimeType": mimeType,
		@"title": title,
		@"description": description,
		@"changeLog": changeLog,
		@"majorVersion": @(majorVersion),
		@"file": file,
		@"checksum": checksum,
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/update-file-entry": _params};

	return (NSDictionary *)[self.session upload:_command error:error];
}

- (NSDictionary *)updateFolderWithFolderId:(long long)folderId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"folderId": @(folderId),
		@"name": name,
		@"description": description,
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sync-web/syncdlobject/update-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end