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

#import "SCProductVersionService_v62.h"

/**
 * author Bruno Farache
 */
@implementation SCProductVersionService_v62

- (NSNumber *)getProductVersionsCount:(NSNumber *)productEntryId {
	NSDictionary *_params = @{
		@"productEntryId": productEntryId
	};

	NSDictionary *_command = @{@"/scproductversion/get-product-versions-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)updateProductVersion:(NSNumber *)productVersionId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds {
	NSDictionary *_params = @{
		@"productVersionId": productVersionId,
		@"version": version,
		@"changeLog": changeLog,
		@"downloadPageURL": downloadPageURL,
		@"directDownloadURL": directDownloadURL,
		@"testDirectDownloadURL": testDirectDownloadURL,
		@"repoStoreArtifact": repoStoreArtifact,
		@"frameworkVersionIds": frameworkVersionIds
	};

	NSDictionary *_command = @{@"/scproductversion/update-product-version": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addProductVersion:(NSNumber *)productEntryId version:(NSString *)version changeLog:(NSString *)changeLog downloadPageURL:(NSString *)downloadPageURL directDownloadURL:(NSString *)directDownloadURL testDirectDownloadURL:(BOOL)testDirectDownloadURL repoStoreArtifact:(BOOL)repoStoreArtifact frameworkVersionIds:(NSArray *)frameworkVersionIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"productEntryId": productEntryId,
		@"version": version,
		@"changeLog": changeLog,
		@"downloadPageURL": downloadPageURL,
		@"directDownloadURL": directDownloadURL,
		@"testDirectDownloadURL": testDirectDownloadURL,
		@"repoStoreArtifact": repoStoreArtifact,
		@"frameworkVersionIds": frameworkVersionIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/scproductversion/add-product-version": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteProductVersion:(NSNumber *)productVersionId {
	NSDictionary *_params = @{
		@"productVersionId": productVersionId
	};

	NSDictionary *_command = @{@"/scproductversion/delete-product-version": _params};

	[session invoke:_command];
}

- (NSDictionary *)getProductVersion:(NSNumber *)productVersionId {
	NSDictionary *_params = @{
		@"productVersionId": productVersionId
	};

	NSDictionary *_command = @{@"/scproductversion/get-product-version": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getProductVersions:(NSNumber *)productEntryId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"productEntryId": productEntryId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/scproductversion/get-product-versions": _params};

	return (NSArray *)[session invoke:_command];
}

@end