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
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface DLFileEntryService_v62 : BaseService

- (NSDictionary *)refreshFileEntryLock:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime;
- (int)getFoldersFileEntriesCount:(long)groupId folderIds:(NSArray *)folderIds status:(int)status;
- (BOOL)isFileEntryCheckedOut:(long)fileEntryId;
- (void)deleteFileVersion:(long)fileEntryId version:(NSString *)version;
- (int)getFileEntriesCount:(long)groupId folderId:(long)folderId status:(int)status;
- (NSDictionary *)getFileEntry:(long)groupId folderId:(long)folderId title:(NSString *)title;
- (NSArray *)getFileEntries:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSDictionary *)search:(long)groupId creatorUserId:(long)creatorUserId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end;
- (void)deleteFileEntry:(long)groupId folderId:(long)folderId title:(NSString *)title;
- (NSDictionary *)getFileEntryByUuidAndGroupId:(NSString *)uuid groupId:(long)groupId;
- (int)getGroupFileEntriesCount:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status;
- (NSDictionary *)checkOutFileEntry:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime serviceContext:(NSDictionary *)serviceContext;
- (BOOL)verifyFileEntryCheckOut:(long)fileEntryId lockUuid:(NSString *)lockUuid;
- (NSArray *)getGroupFileEntries:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (void)revertFileEntry:(long)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)fetchFileEntryByImageId:(long)imageId;
- (void)checkInFileEntry:(long)fileEntryId major:(BOOL)major changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext;
- (BOOL)hasFileEntryLock:(long)fileEntryId;
- (NSDictionary *)moveFileEntry:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getFileEntryLock:(long)fileEntryId;
- (BOOL)verifyFileEntryLock:(long)fileEntryId lockUuid:(NSString *)lockUuid;
- (NSDictionary *)copyFileEntry:(long)groupId repositoryId:(long)repositoryId fileEntryId:(long)fileEntryId destFolderId:(long)destFolderId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)cancelCheckOut:(long)fileEntryId;

@end