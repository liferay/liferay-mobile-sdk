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

- (NSDictionary *)refreshFileEntryLock:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": @(companyId),
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlfileentry/refresh-file-entry-lock": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getFoldersFileEntriesCount:(long)groupId folderIds:(NSArray *)folderIds status:(int)status {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderIds": folderIds,
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-folders-file-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (BOOL)isFileEntryCheckedOut:(long)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/is-file-entry-checked-out": _params};

	return (BOOL)[self.session invoke:_command];
}

- (void)deleteFileVersion:(long)fileEntryId version:(NSString *)version {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"version": version
	};

	NSDictionary *_command = @{@"/dlfileentry/delete-file-version": _params};

	[self.session invoke:_command];
}

- (int)getFileEntriesCount:(long)groupId folderId:(long)folderId status:(int)status {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)getFileEntry:(long)groupId folderId:(long)folderId title:(NSString *)title {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"title": title
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getFileEntries:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)search:(long)groupId creatorUserId:(long)creatorUserId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"creatorUserId": @(creatorUserId),
		@"folderId": @(folderId),
		@"mimeTypes": mimeTypes,
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlfileentry/search": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteFileEntry:(long)groupId folderId:(long)folderId title:(NSString *)title {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"title": title
	};

	NSDictionary *_command = @{@"/dlfileentry/delete-file-entry": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getFileEntryByUuidAndGroupId:(NSString *)uuid groupId:(long)groupId {
	NSDictionary *_params = @{
		@"uuid": uuid,
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry-by-uuid-and-group-id": _params};

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

	NSDictionary *_command = @{@"/dlfileentry/get-group-file-entries-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)checkOutFileEntry:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"owner": owner,
		@"expirationTime": @(expirationTime),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (BOOL)verifyFileEntryCheckOut:(long)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlfileentry/verify-file-entry-check-out": _params};

	return (BOOL)[self.session invoke:_command];
}

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

	NSDictionary *_command = @{@"/dlfileentry/get-group-file-entries": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)revertFileEntry:(long)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"version": version,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/revert-file-entry": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)fetchFileEntryByImageId:(long)imageId {
	NSDictionary *_params = @{
		@"imageId": @(imageId)
	};

	NSDictionary *_command = @{@"/dlfileentry/fetch-file-entry-by-image-id": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)checkInFileEntry:(long)fileEntryId major:(BOOL)major changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"major": @(major),
		@"changeLog": changeLog,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/check-in-file-entry": _params};

	[self.session invoke:_command];
}

- (BOOL)hasFileEntryLock:(long)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/has-file-entry-lock": _params};

	return (BOOL)[self.session invoke:_command];
}

- (NSDictionary *)moveFileEntry:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/move-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getFileEntryLock:(long)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry-lock": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (BOOL)verifyFileEntryLock:(long)fileEntryId lockUuid:(NSString *)lockUuid {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlfileentry/verify-file-entry-lock": _params};

	return (BOOL)[self.session invoke:_command];
}

- (NSDictionary *)copyFileEntry:(long)groupId repositoryId:(long)repositoryId fileEntryId:(long)fileEntryId destFolderId:(long)destFolderId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"repositoryId": @(repositoryId),
		@"fileEntryId": @(fileEntryId),
		@"destFolderId": @(destFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/copy-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)cancelCheckOut:(long)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/cancel-check-out": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end