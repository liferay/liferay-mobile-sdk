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

#import "LRDepotentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRDepotentryService_v73

- (NSDictionary *)addDepotEntryWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/depot.depotentry/add-depot-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateDepotEntryWithDepotEntryId:(long long)depotEntryId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap depotAppCustomizationMap:(NSDictionary *)depotAppCustomizationMap typeSettingsUnicodeProperties:(NSDictionary *)typeSettingsUnicodeProperties serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"depotEntryId": @(depotEntryId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"depotAppCustomizationMap": [self checkNull: depotAppCustomizationMap],
		@"typeSettingsUnicodeProperties": [self checkNull: typeSettingsUnicodeProperties],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/depot.depotentry/update-depot-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupConnectedDepotEntriesWithGroupId:(long long)groupId ddmStructuresAvailable:(BOOL)ddmStructuresAvailable start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"ddmStructuresAvailable": @(ddmStructuresAvailable),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/depot.depotentry/get-group-connected-depot-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupConnectedDepotEntriesWithGroupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/depot.depotentry/get-group-connected-depot-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteDepotEntryWithDepotEntryId:(long long)depotEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"depotEntryId": @(depotEntryId)
	}];

	NSDictionary *_command = @{@"/depot.depotentry/delete-depot-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getDepotEntryWithDepotEntryId:(long long)depotEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"depotEntryId": @(depotEntryId)
	}];

	NSDictionary *_command = @{@"/depot.depotentry/get-depot-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupConnectedDepotEntriesCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/depot.depotentry/get-group-connected-depot-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getGroupDepotEntryWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/depot.depotentry/get-group-depot-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end