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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRSyncDLObjectService_v62 : LRBaseService

- (NSDictionary *)addFileEntryWithRepositoryId:(long)repositoryId folderId:(long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog file:(NSDictionary *)file checksum:(NSString *)checksum serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFolderWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)cancelCheckOutWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (NSDictionary *)checkInFileEntryWithFileEntryId:(long)fileEntryId majorVersion:(BOOL)majorVersion changeLog:(NSString *)changeLog serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long)fileEntryId owner:(NSString *)owner expirationTime:(long)expirationTime serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)getAllSyncDlObjectsWithRepositoryId:(long)repositoryId folderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)getFileEntrySyncDlObjectWithGroupId:(long)groupId folderId:(long)folderId title:(NSString *)title error:(NSError **)error;
- (NSArray *)getFileEntrySyncDlObjectsWithRepositoryId:(long)repositoryId folderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)getFolderSyncDlObjectWithFolderId:(long)folderId error:(NSError **)error;
- (NSArray *)getFolderSyncDlObjectsWithRepositoryId:(long)repositoryId parentFolderId:(long)parentFolderId error:(NSError **)error;
- (NSDictionary *)getGroupWithGroupId:(long)groupId error:(NSError **)error;
- (long)getLatestModifiedTime:(NSError **)error;
- (NSDictionary *)getSyncContextWithUuid:(NSString *)uuid error:(NSError **)error;
- (NSDictionary *)getSyncDlObjectUpdateWithCompanyId:(long)companyId repositoryId:(long)repositoryId lastAccessTime:(long)lastAccessTime error:(NSError **)error;
- (NSArray *)getUserSitesGroups:(NSError **)error;
- (NSDictionary *)moveFileEntryWithFileEntryId:(long)fileEntryId newFolderId:(long)newFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveFileEntryToTrashWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (NSDictionary *)moveFolderWithFolderId:(long)folderId parentFolderId:(long)parentFolderId serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveFolderToTrashWithFolderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)patchFileEntryWithFileEntryId:(long)fileEntryId sourceVersion:(NSString *)sourceVersion sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion deltaFile:(NSDictionary *)deltaFile checksum:(NSString *)checksum serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)restoreFileEntryFromTrashWithFileEntryId:(long)fileEntryId error:(NSError **)error;
- (NSDictionary *)restoreFolderFromTrashWithFolderId:(long)folderId error:(NSError **)error;
- (NSDictionary *)updateFileEntryWithFileEntryId:(long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(NSDictionary *)file checksum:(NSString *)checksum serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFolderWithFolderId:(long)folderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end