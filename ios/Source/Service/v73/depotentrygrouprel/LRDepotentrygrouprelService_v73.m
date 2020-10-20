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

#import "LRDepotentrygrouprelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRDepotentrygrouprelService_v73

- (NSDictionary *)addDepotEntryGroupRelWithDepotEntryId:(long long)depotEntryId toGroupId:(long long)toGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"depotEntryId": @(depotEntryId),
		@"toGroupId": @(toGroupId)
	}];

	NSDictionary *_command = @{@"/depot.depotentrygrouprel/add-depot-entry-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteDepotEntryGroupRelWithDepotEntryGroupRelId:(long long)depotEntryGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"depotEntryGroupRelId": @(depotEntryGroupRelId)
	}];

	NSDictionary *_command = @{@"/depot.depotentrygrouprel/delete-depot-entry-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getDepotEntryGroupRelsCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/depot.depotentrygrouprel/get-depot-entry-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getDepotEntryGroupRelsCountWithDepotEntry:(LRJSONObjectWrapper *)depotEntry error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"depotEntry" className:@"com.liferay.depot.model.DepotEntry" wrapper:depotEntry];

	NSDictionary *_command = @{@"/depot.depotentrygrouprel/get-depot-entry-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateDdmStructuresAvailableWithDepotEntryGroupRelId:(long long)depotEntryGroupRelId ddmStructuresAvailable:(BOOL)ddmStructuresAvailable error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"depotEntryGroupRelId": @(depotEntryGroupRelId),
		@"ddmStructuresAvailable": @(ddmStructuresAvailable)
	}];

	NSDictionary *_command = @{@"/depot.depotentrygrouprel/update-ddm-structures-available": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getDepotEntryGroupRelsWithGroupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/depot.depotentrygrouprel/get-depot-entry-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSearchableWithDepotEntryGroupRelId:(long long)depotEntryGroupRelId searchable:(BOOL)searchable error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"depotEntryGroupRelId": @(depotEntryGroupRelId),
		@"searchable": @(searchable)
	}];

	NSDictionary *_command = @{@"/depot.depotentrygrouprel/update-searchable": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end