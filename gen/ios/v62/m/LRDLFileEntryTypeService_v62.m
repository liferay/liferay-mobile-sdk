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

#import "LRDLFileEntryTypeService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRDLFileEntryTypeService_v62

- (NSDictionary *)addFileEntryTypeWithGroupId:(long long)groupId name:(NSString *)name description:(NSString *)description ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"description": description,
		@"ddmStructureIds": ddmStructureIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentrytype/add-file-entry-type": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addFileEntryTypeWithGroupId:(long long)groupId fileEntryTypeKey:(NSString *)fileEntryTypeKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"fileEntryTypeKey": fileEntryTypeKey,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"ddmStructureIds": ddmStructureIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentrytype/add-file-entry-type": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteFileEntryTypeWithFileEntryTypeId:(long long)fileEntryTypeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/delete-file-entry-type": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getFileEntryTypeWithFileEntryTypeId:(long long)fileEntryTypeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/get-file-entry-type": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntryTypesWithGroupIds:(NSArray *)groupIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/dlfileentrytype/get-file-entry-types": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getFileEntryTypesWithGroupIds:(NSArray *)groupIds start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/get-file-entry-types": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getFileEntryTypesCountWithGroupIds:(NSArray *)groupIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/dlfileentrytype/get-file-entry-types-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getFolderFileEntryTypesWithGroupIds:(NSArray *)groupIds folderId:(long long)folderId inherited:(BOOL)inherited error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds,
		@"folderId": @(folderId),
		@"inherited": @(inherited)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/get-folder-file-entry-types": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupIds": groupIds,
		@"keywords": keywords,
		@"includeBasicFileEntryType": @(includeBasicFileEntryType),
		@"start": @(start),
		@"end": @(end),
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/dlfileentrytype/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCountWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupIds": groupIds,
		@"keywords": keywords,
		@"includeBasicFileEntryType": @(includeBasicFileEntryType)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/search-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)updateFileEntryTypeWithFileEntryTypeId:(long long)fileEntryTypeId name:(NSString *)name description:(NSString *)description ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryTypeId": @(fileEntryTypeId),
		@"name": name,
		@"description": description,
		@"ddmStructureIds": ddmStructureIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentrytype/update-file-entry-type": _params};

	[self.session invoke:_command error:error];
}

- (void)updateFileEntryTypeWithFileEntryTypeId:(long long)fileEntryTypeId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"fileEntryTypeId": @(fileEntryTypeId),
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"ddmStructureIds": ddmStructureIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentrytype/update-file-entry-type": _params};

	[self.session invoke:_command error:error];
}

@end