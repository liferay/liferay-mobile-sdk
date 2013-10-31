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

#import "StagingService_v62.h"

/**
 * author Bruno Farache
 */
@implementation StagingService_v62

- (NSDictionary *)validateStagingRequest:(long)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap {
	NSDictionary *_params = @{
		@"stagingRequestId": @(stagingRequestId),
		@"privateLayout": @(privateLayout),
		@"parameterMap": parameterMap
	};

	NSDictionary *_command = @{@"/staging/validate-staging-request": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (long)createStagingRequest:(long)groupId checksum:(NSString *)checksum {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"checksum": checksum
	};

	NSDictionary *_command = @{@"/staging/create-staging-request": _params};

	return (long)[self.session invoke:_command];
}

- (void)cleanUpStagingRequest:(long)stagingRequestId {
	NSDictionary *_params = @{
		@"stagingRequestId": @(stagingRequestId)
	};

	NSDictionary *_command = @{@"/staging/clean-up-staging-request": _params};

	[self.session invoke:_command];
}

- (void)updateStagingRequest:(long)stagingRequestId fileName:(NSString *)fileName bytes:(NSArray *)bytes {
	NSDictionary *_params = @{
		@"stagingRequestId": @(stagingRequestId),
		@"fileName": fileName,
		@"bytes": bytes
	};

	NSDictionary *_command = @{@"/staging/update-staging-request": _params};

	[self.session invoke:_command];
}

- (void)publishStagingRequest:(long)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap {
	NSDictionary *_params = @{
		@"stagingRequestId": @(stagingRequestId),
		@"privateLayout": @(privateLayout),
		@"parameterMap": parameterMap
	};

	NSDictionary *_command = @{@"/staging/publish-staging-request": _params};

	[self.session invoke:_command];
}

@end