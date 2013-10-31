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

#import "DLFileEntryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation DLFileEntryService_v62

- (NSDictionary *)refreshFileEntryLock:(NSString *)lockUuid companyId:(NSNumber *)companyId expirationTime:(NSNumber *)expirationTime {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": companyId,
		@"expirationTime": expirationTime
	};

	NSDictionary *_command = @{@"/dlfileentry/refresh-file-entry-lock": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getFoldersFileEntriesCount:(NSNumber *)groupId folderIds:(NSArray *)folderIds status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderIds": folderIds,
		@"status": status
	};

	NSDictionary *_command = @{@"/dlfileentry/get-folders-file-entries-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (BOOL)isFileEntryCheckedOut:(NSNumber *)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId
	};

	NSDictionary *_command = @{@"/dlfileentry/is-file-entry-checked-out": _params};

	return (BOOL)[session invoke:_command];
}

- (void)deleteFileVersion:(NSNumber *)fileEntryId version:(NSString *)version {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"version": version
	};

	NSDictionary *_command = @{@"/dlfileentry/delete-file-version": _params};

	[session invoke:_command];
}

- (NSNumber *)getFileEntriesCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)getFileEntry:(NSNumber *)groupId folderId:(NSNumber *)folderId title:(NSString *)title {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"title": title
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getFileEntries:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"status": status,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)search:(NSNumber *)groupId creatorUserId:(NSNumber *)creatorUserId folderId:(NSNumber *)folderId mimeTypes:(NSArray *)mimeTypes status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"creatorUserId": creatorUserId,
		@"folderId": folderId,
		@"mimeTypes": mimeTypes,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/dlfileentry/search": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteFileEntry:(NSNumber *)groupId folderId:(NSNumber *)folderId title:(NSString *)title {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"folderId": folderId,
		@"title": title
	};

	NSDictionary *_command = @{@"/dlfileentry/delete-file-entry": _params};

	[session invoke:_command];
}

- (NSDictionary *)getFileEntryByUuidAndGroupId:(NSString *)uuid groupId:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"uuid": uuid,
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry-by-uuid-and-group-id": _params};

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

	NSDictionary *_command = @{@"/dlfileentry/get-group-file-entries-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)checkOutFileEntry:(NSNumber *)fileEntryId owner:(NSString *)owner expirationTime:(NSNumber *)expirationTime serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"owner": owner,
		@"expirationTime": expirationTime,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/check-out-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (BOOL)verifyFileEntryCheckOut:(NSNumber *)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlfileentry/verify-file-entry-check-out": _params};

	return (BOOL)[session invoke:_command];
}

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

	NSDictionary *_command = @{@"/dlfileentry/get-group-file-entries": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)revertFileEntry:(NSNumber *)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"version": version,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/revert-file-entry": _params};

	[session invoke:_command];
}

- (NSDictionary *)fetchFileEntryByImageId:(NSNumber *)imageId {
	NSDictionary *_params = @{
		@"imageId": imageId
	};

	NSDictionary *_command = @{@"/dlfileentry/fetch-file-entry-by-image-id": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)checkInFileEntry:(NSNumber *)fileEntryId major:(BOOL)major changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"major": major,
		@"changeLog": changeLog,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/check-in-file-entry": _params};

	[session invoke:_command];
}

- (BOOL)hasFileEntryLock:(NSNumber *)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId
	};

	NSDictionary *_command = @{@"/dlfileentry/has-file-entry-lock": _params};

	return (BOOL)[session invoke:_command];
}

- (NSDictionary *)moveFileEntry:(NSNumber *)fileEntryId newFolderId:(NSNumber *)newFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"newFolderId": newFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/move-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getFileEntryLock:(NSNumber *)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry-lock": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (BOOL)verifyFileEntryLock:(NSNumber *)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlfileentry/verify-file-entry-lock": _params};

	return (BOOL)[session invoke:_command];
}

- (NSDictionary *)copyFileEntry:(NSNumber *)groupId repositoryId:(NSNumber *)repositoryId fileEntryId:(NSNumber *)fileEntryId destFolderId:(NSNumber *)destFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"repositoryId": repositoryId,
		@"fileEntryId": fileEntryId,
		@"destFolderId": destFolderId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/copy-file-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)cancelCheckOut:(NSNumber *)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId
	};

	NSDictionary *_command = @{@"/dlfileentry/cancel-check-out": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end