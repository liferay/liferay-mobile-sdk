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

/**
 * author Bruno Farache
 */
@interface DLFileEntryService_v62 : NSObject

- (NSDictionary *)refreshFileEntryLock:(NSString *)lockUuid companyId:(NSNumber *)companyId expirationTime:(NSNumber *)expirationTime;
- (NSNumber *)getFoldersFileEntriesCount:(NSNumber *)groupId folderIds:(NSArray *)folderIds status:(NSNumber *)status;
- (BOOL)isFileEntryCheckedOut:(NSNumber *)fileEntryId;
- (void)deleteFileVersion:(NSNumber *)fileEntryId version:(NSString *)version;
- (NSNumber *)getFileEntriesCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status;
- (NSDictionary *)getFileEntry:(NSNumber *)groupId folderId:(NSNumber *)folderId title:(NSString *)title;
- (NSArray *)getFileEntries:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSDictionary *)search:(NSNumber *)groupId creatorUserId:(NSNumber *)creatorUserId folderId:(NSNumber *)folderId mimeTypes:(NSArray *)mimeTypes status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (void)deleteFileEntry:(NSNumber *)groupId folderId:(NSNumber *)folderId title:(NSString *)title;
- (NSDictionary *)getFileEntryByUuidAndGroupId:(NSString *)uuid groupId:(NSNumber *)groupId;
- (NSNumber *)getGroupFileEntriesCount:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(NSNumber *)status;
- (NSDictionary *)checkOutFileEntry:(NSNumber *)fileEntryId owner:(NSString *)owner expirationTime:(NSNumber *)expirationTime serviceContext:(NSDictionary *)serviceContext;
- (BOOL)verifyFileEntryCheckOut:(NSNumber *)fileEntryId lockUuid:(NSString *)lockUuid;
- (NSArray *)getGroupFileEntries:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (void)revertFileEntry:(NSNumber *)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)fetchFileEntryByImageId:(NSNumber *)imageId;
- (void)checkInFileEntry:(NSNumber *)fileEntryId major:(BOOL)major changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext;
- (BOOL)hasFileEntryLock:(NSNumber *)fileEntryId;
- (NSDictionary *)moveFileEntry:(NSNumber *)fileEntryId newFolderId:(NSNumber *)newFolderId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getFileEntryLock:(NSNumber *)fileEntryId;
- (BOOL)verifyFileEntryLock:(NSNumber *)fileEntryId lockUuid:(NSString *)lockUuid;
- (NSDictionary *)copyFileEntry:(NSNumber *)groupId repositoryId:(NSNumber *)repositoryId fileEntryId:(NSNumber *)fileEntryId destFolderId:(NSNumber *)destFolderId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)cancelCheckOut:(NSNumber *)fileEntryId;

@end