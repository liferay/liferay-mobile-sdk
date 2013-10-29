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

/**
 * author: Bruno Farache
 */
@interface SCProductVersionService_v62 : NSObject

- (NSNumber *)getProductVersionsCount:(NSNumber *)productEntryId;
- (NSDictionary *)updateProductVersion:(NSNumber *)productVersionId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds;
- (NSDictionary *)addProductVersion:(NSNumber *)productEntryId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds serviceContext:(NSDictionary *)serviceContext;
- (void)deleteProductVersion:(NSNumber *)productVersionId;
- (NSDictionary *)getProductVersion:(NSNumber *)productVersionId;
- (NSArray *)getProductVersions:(NSNumber *)productEntryId start:(NSNumber *)start end:(NSNumber *)end;

@end