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

#import "SCFrameworkVersionService_v62.h"

/**
 * author Bruno Farache
 */
@implementation SCFrameworkVersionService_v62

- (NSDictionary *)getFrameworkVersion:(NSNumber *)frameworkVersionId {
	NSDictionary *_params = @{
		@"frameworkVersionId": frameworkVersionId
	};

	NSDictionary *_command = @{@"/scframeworkversion/get-framework-version": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addFrameworkVersion:(NSString *)name url:(NSString *)url active:(BOOL)active priority:(NSNumber *)priority serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"name": name,
		@"url": url,
		@"active": active,
		@"priority": priority,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/scframeworkversion/add-framework-version": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateFrameworkVersion:(NSNumber *)frameworkVersionId name:(NSString *)name url:(NSString *)url active:(BOOL)active priority:(NSNumber *)priority {
	NSDictionary *_params = @{
		@"frameworkVersionId": frameworkVersionId,
		@"name": name,
		@"url": url,
		@"active": active,
		@"priority": priority
	};

	NSDictionary *_command = @{@"/scframeworkversion/update-framework-version": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getFrameworkVersions:(NSNumber *)groupId active:(BOOL)active start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"active": active,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/scframeworkversion/get-framework-versions": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)deleteFrameworkVersion:(NSNumber *)frameworkVersionId {
	NSDictionary *_params = @{
		@"frameworkVersionId": frameworkVersionId
	};

	NSDictionary *_command = @{@"/scframeworkversion/delete-framework-version": _params};

	[session invoke:_command];
}

@end