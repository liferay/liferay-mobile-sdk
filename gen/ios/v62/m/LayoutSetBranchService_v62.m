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

#import "LayoutSetBranchService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LayoutSetBranchService_v62

- (void)deleteLayoutSetBranch:(long)layoutSetBranchId {
	NSDictionary *_params = @{
		@"layoutSetBranchId": @(layoutSetBranchId)
	};

	NSDictionary *_command = @{@"/layoutsetbranch/delete-layout-set-branch": _params};

	[self.session invoke:_command];
}

- (NSArray *)getLayoutSetBranches:(long)groupId privateLayout:(BOOL)privateLayout {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout)
	};

	NSDictionary *_command = @{@"/layoutsetbranch/get-layout-set-branches": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)addLayoutSetBranch:(long)groupId privateLayout:(BOOL)privateLayout name:(NSString *)name description:(NSString *)description master:(BOOL)master copyLayoutSetBranchId:(long)copyLayoutSetBranchId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"privateLayout": @(privateLayout),
		@"name": name,
		@"description": description,
		@"master": @(master),
		@"copyLayoutSetBranchId": @(copyLayoutSetBranchId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layoutsetbranch/add-layout-set-branch": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updateLayoutSetBranch:(long)groupId layoutSetBranchId:(long)layoutSetBranchId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"layoutSetBranchId": @(layoutSetBranchId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layoutsetbranch/update-layout-set-branch": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)mergeLayoutSetBranch:(long)layoutSetBranchId mergeLayoutSetBranchId:(long)mergeLayoutSetBranchId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"layoutSetBranchId": @(layoutSetBranchId),
		@"mergeLayoutSetBranchId": @(mergeLayoutSetBranchId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layoutsetbranch/merge-layout-set-branch": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end