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
@interface LRSCProductVersionService_v62 : BaseService

- (NSDictionary *)addProductVersionWithProductEntryId:(long)productEntryId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteProductVersionWithProductVersionId:(long)productVersionId error:(NSError **)error;
- (NSDictionary *)getProductVersionWithProductVersionId:(long)productVersionId error:(NSError **)error;
- (NSArray *)getProductVersionsWithProductEntryId:(long)productEntryId start:(int)start end:(int)end error:(NSError **)error;
- (int)getProductVersionsCountWithProductEntryId:(long)productEntryId error:(NSError **)error;
- (NSDictionary *)updateProductVersionWithProductVersionId:(long)productVersionId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds error:(NSError **)error;

@end