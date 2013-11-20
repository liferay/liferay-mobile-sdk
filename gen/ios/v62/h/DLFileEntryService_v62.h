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

- (NSDictionary *)cancelCheckOutWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (void)checkInFileEntryWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (void)checkInFileEntryWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)checkInFileEntryWithFileEntryId:(long)fileEntryId major:(BOOL)major changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime error:(NSError **)error;
- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyFileEntryWithGroupId:(long)groupId repositoryId:(long)repositoryId fileEntryId:(long)fileEntryId destFolderId:(long)destFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (void)deleteFileEntryWithGroupId:(long)groupId folderId:(long)folderId title:(NSString *)title error:(NSError **)error;
- (void)deleteFileVersionWithFileEntryId:(long)fileEntryId version:(NSString *)version error:(NSError **)error;
- (NSDictionary *)fetchFileEntryByImageIdWithImageId:(long)imageId error:(NSError **)error;
- (NSArray *)getFileEntriesWithGroupId:(long)groupId folderId:(long)folderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFileEntriesWithGroupId:(long)groupId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFileEntriesWithGroupId:(long)groupId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getFileEntriesWithGroupId:(long)groupId folderId:(long)folderId status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getFileEntriesCountWithGroupId:(long)groupId folderId:(long)folderId error:(NSError **)error;
- (int)getFileEntriesCountWithGroupId:(long)groupId folderId:(long)folderId fileEntryTypeId:(long)fileEntryTypeId error:(NSError **)error;
- (int)getFileEntriesCountWithGroupId:(long)groupId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes error:(NSError **)error;
- (int)getFileEntriesCountWithGroupId:(long)groupId folderId:(long)folderId status:(int)status error:(NSError **)error;
- (NSDictionary *)getFileEntryWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (NSDictionary *)getFileEntryWithGroupId:(long)groupId folderId:(long)folderId title:(NSString *)title error:(NSError **)error;
- (NSDictionary *)getFileEntryByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long)groupId error:(NSError **)error;
- (NSDictionary *)getFileEntryLockWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (int)getFoldersFileEntriesCountWithGroupId:(long)groupId folderIds:(NSArray *)folderIds status:(int)status error:(NSError **)error;
- (NSArray *)getGroupFileEntriesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (NSArray *)getGroupFileEntriesWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getGroupFileEntriesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId error:(NSError **)error;
- (int)getGroupFileEntriesCountWithGroupId:(long)groupId userId:(long)userId rootFolderId:(long)rootFolderId mimeTypes:(NSArray *)mimeTypes status:(int)status error:(NSError **)error;
- (BOOL)hasFileEntryLockWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (BOOL)isFileEntryCheckedOutWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (NSDictionary *)moveFileEntryWithFileEntryId:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)refreshFileEntryLockWithLockUuid:(NSString *)lockUuid companyId:(long)companyId expirationTime:(long)expirationTime error:(NSError **)error;
- (void)revertFileEntryWithFileEntryId:(long)fileEntryId version:(NSString *)version serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)searchWithGroupId:(long)groupId creatorUserId:(long)creatorUserId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)searchWithGroupId:(long)groupId creatorUserId:(long)creatorUserId folderId:(long)folderId mimeTypes:(NSArray *)mimeTypes status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (BOOL)verifyFileEntryCheckOutWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error;
- (BOOL)verifyFileEntryLockWithFileEntryId:(long)fileEntryId lockUuid:(NSString *)lockUuid error:(NSError **)error;

@end