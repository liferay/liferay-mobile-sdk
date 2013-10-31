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

#import "DLFileEntryTypeService_v62.h"

/**
 * author Bruno Farache
 */
@implementation DLFileEntryTypeService_v62

- (void)updateFileEntryType:(long)fileEntryTypeId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"fileEntryTypeId": @(fileEntryTypeId),
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"ddmStructureIds": ddmStructureIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentrytype/update-file-entry-type": _params};

	[self.session invoke:_command];
}

- (int)searchCount:(long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupIds": groupIds,
		@"keywords": keywords,
		@"includeBasicFileEntryType": @(includeBasicFileEntryType)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/search-count": _params};

	return (int)[self.session invoke:_command];
}

- (int)getFileEntryTypesCount:(NSArray *)groupIds {
	NSDictionary *_params = @{
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/dlfileentrytype/get-file-entry-types-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)search:(long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator {
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

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getFolderFileEntryTypes:(NSArray *)groupIds folderId:(long)folderId inherited:(BOOL)inherited {
	NSDictionary *_params = @{
		@"groupIds": groupIds,
		@"folderId": @(folderId),
		@"inherited": @(inherited)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/get-folder-file-entry-types": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)addFileEntryType:(long)groupId fileEntryTypeKey:(NSString *)fileEntryTypeKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"fileEntryTypeKey": fileEntryTypeKey,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"ddmStructureIds": ddmStructureIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/dlfileentrytype/add-file-entry-type": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getFileEntryTypes:(NSArray *)groupIds start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupIds": groupIds,
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/get-file-entry-types": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)getFileEntryType:(long)fileEntryTypeId {
	NSDictionary *_params = @{
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/get-file-entry-type": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteFileEntryType:(long)fileEntryTypeId {
	NSDictionary *_params = @{
		@"fileEntryTypeId": @(fileEntryTypeId)
	};

	NSDictionary *_command = @{@"/dlfileentrytype/delete-file-entry-type": _params};

	[self.session invoke:_command];
}

@end