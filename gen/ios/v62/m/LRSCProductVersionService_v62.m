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

#import "LRSCProductVersionService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRSCProductVersionService_v62

- (NSDictionary *)addProductVersionWithProductEntryId:(long long)productEntryId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"productEntryId": @(productEntryId),
		@"version": version,
		@"changeLog": changeLog,
		@"downloadPageURL": downloadPageURL,
		@"directDownloadURL": directDownloadURL,
		@"testDirectDownloadURL": @(testDirectDownloadURL),
		@"repoStoreArtifact": @(repoStoreArtifact),
		@"frameworkVersionIds": frameworkVersionIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/scproductversion/add-product-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteProductVersionWithProductVersionId:(long long)productVersionId error:(NSError **)error {
	NSDictionary *_params = @{
		@"productVersionId": @(productVersionId)
	};

	NSDictionary *_command = @{@"/scproductversion/delete-product-version": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getProductVersionWithProductVersionId:(long long)productVersionId error:(NSError **)error {
	NSDictionary *_params = @{
		@"productVersionId": @(productVersionId)
	};

	NSDictionary *_command = @{@"/scproductversion/get-product-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getProductVersionsWithProductEntryId:(long long)productEntryId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"productEntryId": @(productEntryId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/scproductversion/get-product-versions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getProductVersionsCountWithProductEntryId:(long long)productEntryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"productEntryId": @(productEntryId)
	};

	NSDictionary *_command = @{@"/scproductversion/get-product-versions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateProductVersionWithProductVersionId:(long long)productVersionId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"productVersionId": @(productVersionId),
		@"version": version,
		@"changeLog": changeLog,
		@"downloadPageURL": downloadPageURL,
		@"directDownloadURL": directDownloadURL,
		@"testDirectDownloadURL": @(testDirectDownloadURL),
		@"repoStoreArtifact": @(repoStoreArtifact),
		@"frameworkVersionIds": frameworkVersionIds
	};

	NSDictionary *_command = @{@"/scproductversion/update-product-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end