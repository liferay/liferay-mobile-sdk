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

#import "RepositoryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation RepositoryService_v62

- (NSDictionary *)getRepositoryImpl:(long)folderId fileEntryId:(long)fileEntryId fileVersionId:(long)fileVersionId {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"fileEntryId": @(fileEntryId),
		@"fileVersionId": @(fileVersionId)
	};

	NSDictionary *_command = @{@"/repository/get-repository-impl": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addRepository:(long)groupId classNameId:(long)classNameId parentFolderId:(long)parentFolderId name:(NSString *)name description:(NSString *)description portletId:(NSString *)portletId typeSettingsProperties:(NSDictionary *)typeSettingsProperties serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"parentFolderId": @(parentFolderId),
		@"name": name,
		@"description": description,
		@"portletId": portletId,
		@"typeSettingsProperties": typeSettingsProperties,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/repository/add-repository": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getLocalRepositoryImpl:(long)folderId fileEntryId:(long)fileEntryId fileVersionId:(long)fileVersionId {
	NSDictionary *_params = @{
		@"folderId": @(folderId),
		@"fileEntryId": @(fileEntryId),
		@"fileVersionId": @(fileVersionId)
	};

	NSDictionary *_command = @{@"/repository/get-local-repository-impl": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getRepository:(long)repositoryId {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId)
	};

	NSDictionary *_command = @{@"/repository/get-repository": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getSupportedParameters:(long)classNameId configuration:(NSString *)configuration {
	NSDictionary *_params = @{
		@"classNameId": @(classNameId),
		@"configuration": configuration
	};

	NSDictionary *_command = @{@"/repository/get-supported-parameters": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)updateRepository:(long)repositoryId name:(NSString *)name description:(NSString *)description {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId),
		@"name": name,
		@"description": description
	};

	NSDictionary *_command = @{@"/repository/update-repository": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getTypeSettingsProperties:(long)repositoryId {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId)
	};

	NSDictionary *_command = @{@"/repository/get-type-settings-properties": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteRepository:(long)repositoryId {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId)
	};

	NSDictionary *_command = @{@"/repository/delete-repository": _params};

	[self.session invoke:_command];
}

- (NSArray *)getSupportedConfigurations:(long)classNameId {
	NSDictionary *_params = @{
		@"classNameId": @(classNameId)
	};

	NSDictionary *_command = @{@"/repository/get-supported-configurations": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)checkRepository:(long)repositoryId {
	NSDictionary *_params = @{
		@"repositoryId": @(repositoryId)
	};

	NSDictionary *_command = @{@"/repository/check-repository": _params};

	[self.session invoke:_command];
}

@end