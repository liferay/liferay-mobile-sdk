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

#import "LayoutBranchService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LayoutBranchService_v62

- (NSDictionary *)addLayoutBranch:(NSNumber *)layoutRevisionId name:(NSString *)name description:(NSString *)description master:(BOOL)master serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"layoutRevisionId": layoutRevisionId,
		@"name": name,
		@"description": description,
		@"master": master,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layoutbranch/add-layout-branch": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateLayoutBranch:(NSNumber *)layoutBranchId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"layoutBranchId": layoutBranchId,
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layoutbranch/update-layout-branch": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteLayoutBranch:(NSNumber *)layoutBranchId {
	NSDictionary *_params = @{
		@"layoutBranchId": layoutBranchId
	};

	NSDictionary *_command = @{@"/layoutbranch/delete-layout-branch": _params};

	[session invoke:_command];
}

@end