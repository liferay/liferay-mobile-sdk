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

#import "LRDLFileEntryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRDLFileEntryService_v62

- (NSDictionary *)cancelCheckOutWithFileEntryId:(long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/cancel-check-out": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)checkInFileEntryWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlfileentry/check-in-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)checkInFileEntryWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/check-in-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)checkInFileEntryWithFileEntryId:(long)fileEntryId major:(BOOL)major changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"major": @(major),
		@"changeLog": changeLog,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/check-in-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"owner": owner,
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlfileentry/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"owner": owner,
		@"expirationTime": @(expirationTime),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/check-out-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)copyFileEntryWithGroupId:(long)groupId repositoryId:(long)repositoryId fileEntryId:(long)fileEntryId destFolderId:(long)destFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"repositoryId": @(repositoryId),
		@"fileEntryId": @(fileEntryId),
		@"destFolderId": @(destFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/copy-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/delete-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteFileEntryWithGroupId:(long)groupId folderId:(long)folderId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"title": title
	};

	NSDictionary *_command = @{@"/dlfileentry/delete-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteFileVersionWithFileEntryId:(long)fileEntryId version:(NSString *)version error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"version": version
	};

	NSDictionary *_command = @{@"/dlfileentry/delete-file-version": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFileEntryByImageIdWithImageId:(long)imageId error:(NSError **)error {
	NSDictionary *_params = @{
		@"imageId": @(imageId)
	};

	NSDictionary *_command = @{@"/dlfileentry/fetch-file-entry-by-image-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithGroupId:(long)groupId folderId:(long)folderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithGroupId:(long)groupId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"fileEntryTypeId": @(fileEntryTypeId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithGroupId:(long)groupId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"mimeTypes": mimeTypes,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntriesWithGroupId:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFileEntriesCountWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFileEntriesCountWithGroupId:(long)groupId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFileEntriesCountWithGroupId:(long)groupId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"mimeTypes": mimeTypes
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFileEntriesCountWithGroupId:(long)groupId folderId:(long)folderId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntryWithGroupId:(long)groupId folderId:(long)folderId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderId": @(folderId),
		@"title": title
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntryByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"uuid": uuid,
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry-by-uuid-and-group-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntryLockWithFileEntryId:(long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-file-entry-lock": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFoldersFileEntriesCountWithGroupId:(long)groupId folderIds:(NSArray *)folderIds status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"folderIds": folderIds,
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-folders-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupFileEntriesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/dlfileentry/get-group-file-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupFileEntriesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
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

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupFileEntriesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-group-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupFileEntriesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"rootFolderId": @(rootFolderId),
		@"mimeTypes": mimeTypes,
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/dlfileentry/get-group-file-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (BOOL)hasFileEntryLockWithFileEntryId:(long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/has-file-entry-lock": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

- (BOOL)isFileEntryCheckedOutWithFileEntryId:(long)fileEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId)
	};

	NSDictionary *_command = @{@"/dlfileentry/is-file-entry-checked-out": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

- (NSDictionary *)moveFileEntryWithFileEntryId:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"newFolderId": @(newFolderId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/move-file-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)refreshFileEntryLockWithLockUuid:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime error:(NSError **)error {
	NSDictionary *_params = @{
		@"lockUuid": lockUuid,
		@"companyId": @(companyId),
		@"expirationTime": @(expirationTime)
	};

	NSDictionary *_command = @{@"/dlfileentry/refresh-file-entry-lock": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)revertFileEntryWithFileEntryId:(long)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"version": version,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentry/revert-file-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithGroupId:(long)groupId creatorUserId:(long)creatorUserId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"creatorUserId": @(creatorUserId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlfileentry/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithGroupId:(long)groupId creatorUserId:(long)creatorUserId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end error:(NSError **)error {
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

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (BOOL)verifyFileEntryCheckOutWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlfileentry/verify-file-entry-check-out": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

- (BOOL)verifyFileEntryLockWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryId": @(fileEntryId),
		@"lockUuid": lockUuid
	};

	NSDictionary *_command = @{@"/dlfileentry/verify-file-entry-lock": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

@end