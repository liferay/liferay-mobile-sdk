/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#import "LRKbfolderService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRKbfolderService_v72

- (NSDictionary *)deleteKbFolderWithKbFolderId:(long long)kbFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbFolderId": @(kbFolderId)
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/delete-kb-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbFoldersWithGroupId:(long long)groupId parentKBFolderId:(long long)parentKBFolderId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentKBFolderId": @(parentKBFolderId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/get-kb-folders": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getKbFoldersCountWithGroupId:(long long)groupId parentKBFolderId:(long long)parentKBFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentKBFolderId": @(parentKBFolderId)
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/get-kb-folders-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addKbFolderWithGroupId:(long long)groupId parentResourceClassNameId:(long long)parentResourceClassNameId parentResourcePrimKey:(long long)parentResourcePrimKey name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentResourceClassNameId": @(parentResourceClassNameId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbfolder/add-kb-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateKbFolderWithParentResourceClassNameId:(long long)parentResourceClassNameId parentResourcePrimKey:(long long)parentResourcePrimKey kbFolderId:(long long)kbFolderId name:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"parentResourceClassNameId": @(parentResourceClassNameId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"kbFolderId": @(kbFolderId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description]
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/update-kb-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateKbFolderWithParentResourceClassNameId:(long long)parentResourceClassNameId parentResourcePrimKey:(long long)parentResourcePrimKey kbFolderId:(long long)kbFolderId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"parentResourceClassNameId": @(parentResourceClassNameId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"kbFolderId": @(kbFolderId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbfolder/update-kb-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchKbFolderWithKbFolderId:(long long)kbFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbFolderId": @(kbFolderId)
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/fetch-kb-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFirstChildKbFolderWithGroupId:(long long)groupId kbFolderId:(long long)kbFolderId obc:(LRJSONObjectWrapper *)obc error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"kbFolderId": @(kbFolderId),
	}];

	[self mangleWrapperWithParams:_params name:@"obc" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBFolder>" wrapper:obc];

	NSDictionary *_command = @{@"/kb.kbfolder/fetch-first-child-kb-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchFirstChildKbFolderWithGroupId:(long long)groupId kbFolderId:(long long)kbFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"kbFolderId": @(kbFolderId)
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/fetch-first-child-kb-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchKbFolderByUrlTitleWithGroupId:(long long)groupId parentKbFolderId:(long long)parentKbFolderId urlTitle:(NSString *)urlTitle error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentKbFolderId": @(parentKbFolderId),
		@"urlTitle": [self checkNull: urlTitle]
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/fetch-kb-folder-by-url-title": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getKbFolderByUrlTitleWithGroupId:(long long)groupId parentKbFolderId:(long long)parentKbFolderId urlTitle:(NSString *)urlTitle error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentKbFolderId": @(parentKbFolderId),
		@"urlTitle": [self checkNull: urlTitle]
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/get-kb-folder-by-url-title": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbFoldersAndKbArticlesWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbfolder/get-kb-folders-and-kb-articles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getKbFoldersAndKbArticlesCountWithGroupId:(long long)groupId parentResourcePrimKey:(long long)parentResourcePrimKey status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"parentResourcePrimKey": @(parentResourcePrimKey),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/get-kb-folders-and-kb-articles-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)moveKbFolderWithKbFolderId:(long long)kbFolderId parentKBFolderId:(long long)parentKBFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbFolderId": @(kbFolderId),
		@"parentKBFolderId": @(parentKBFolderId)
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/move-kb-folder": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getKbFolderWithKbFolderId:(long long)kbFolderId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbFolderId": @(kbFolderId)
	}];

	NSDictionary *_command = @{@"/kb.kbfolder/get-kb-folder": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end