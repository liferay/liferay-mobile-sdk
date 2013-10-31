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

#import "DLFileVersionService_v62.h"

/**
 * author Bruno Farache
 */
@implementation DLFileVersionService_v62

- (NSDictionary *)getFileVersion:(NSNumber *)fileVersionId {
	NSDictionary *_params = @{
		@"fileVersionId": fileVersionId
	};

	NSDictionary *_command = @{@"/dlfileversion/get-file-version": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getLatestFileVersion:(NSNumber *)fileEntryId {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId
	};

	NSDictionary *_command = @{@"/dlfileversion/get-latest-file-version": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getFileVersions:(NSNumber *)fileEntryId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"status": status
	};

	NSDictionary *_command = @{@"/dlfileversion/get-file-versions": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getFileVersionsCount:(NSNumber *)fileEntryId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"fileEntryId": fileEntryId,
		@"status": status
	};

	NSDictionary *_command = @{@"/dlfileversion/get-file-versions-count": _params};

	return (NSNumber *)[session invoke:_command];
}

@end