/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#import "LRBaseService.h"

/**
 * @author Bruno Farache
 */
@interface LRSyncDLObjectService_v62 : LRBaseService

- (NSDictionary *)addFileEntryWithRepositoryId:(long long)repositoryId folderId:(long long)folderId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog file:(LRUploadData *)file checksum:(NSString *)checksum serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addFolderWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)cancelCheckOutWithFileEntryId:(long long)fileEntryId error:(NSError **)error;
- (NSDictionary *)checkInFileEntryWithFileEntryId:(long long)fileEntryId majorVersion:(BOOL)majorVersion changeLog:(NSString *)changeLog serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long long)fileEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)checkOutFileEntryWithFileEntryId:(long long)fileEntryId owner:(NSString *)owner expirationTime:(long long)expirationTime serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)copyFileEntryWithSourceFileEntryId:(long long)sourceFileEntryId repositoryId:(long long)repositoryId folderId:(long long)folderId sourceFileName:(NSString *)sourceFileName title:(NSString *)title serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getAllFolderSyncDlObjectsWithRepositoryId:(long long)repositoryId error:(NSError **)error;
- (NSDictionary *)getFileEntrySyncDlObjectWithRepositoryId:(long long)repositoryId folderId:(long long)folderId title:(NSString *)title error:(NSError **)error;
- (NSArray *)getFileEntrySyncDlObjectsWithRepositoryId:(long long)repositoryId folderId:(long long)folderId error:(NSError **)error;
- (NSDictionary *)getFolderSyncDlObjectWithFolderId:(long long)folderId error:(NSError **)error;
- (NSDictionary *)getFolderSyncDlObjectWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getFolderSyncDlObjectsWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId error:(NSError **)error;
- (NSDictionary *)getGroupWithGroupId:(long long)groupId error:(NSError **)error;
- (NSNumber *)getLatestModifiedTime:(NSError **)error;
- (NSDictionary *)getSyncContext:(NSError **)error;
- (NSString *)getSyncDlObjectUpdateWithRepositoryId:(long long)repositoryId lastAccessTime:(long long)lastAccessTime max:(int)max error:(NSError **)error;
- (NSDictionary *)getSyncDlObjectUpdateWithRepositoryId:(long long)repositoryId parentFolderId:(long long)parentFolderId lastAccessTime:(long long)lastAccessTime error:(NSError **)error;
- (NSArray *)getUserSitesGroups:(NSError **)error;
- (NSDictionary *)moveFileEntryWithFileEntryId:(long long)fileEntryId newFolderId:(long long)newFolderId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveFileEntryToTrashWithFileEntryId:(long long)fileEntryId error:(NSError **)error;
- (NSDictionary *)moveFolderWithFolderId:(long long)folderId parentFolderId:(long long)parentFolderId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)moveFolderToTrashWithFolderId:(long long)folderId error:(NSError **)error;
- (NSDictionary *)patchFileEntryWithFileEntryId:(long long)fileEntryId sourceVersionId:(long long)sourceVersionId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion deltaFile:(LRUploadData *)deltaFile checksum:(NSString *)checksum serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)restoreFileEntryFromTrashWithFileEntryId:(long long)fileEntryId error:(NSError **)error;
- (NSDictionary *)restoreFolderFromTrashWithFolderId:(long long)folderId error:(NSError **)error;
- (NSDictionary *)updateFileEntriesWithZipFile:(LRUploadData *)zipFile error:(NSError **)error;
- (NSDictionary *)updateFileEntryWithFileEntryId:(long long)fileEntryId sourceFileName:(NSString *)sourceFileName mimeType:(NSString *)mimeType title:(NSString *)title description:(NSString *)description changeLog:(NSString *)changeLog majorVersion:(BOOL)majorVersion file:(LRUploadData *)file checksum:(NSString *)checksum serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateFolderWithFolderId:(long long)folderId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end