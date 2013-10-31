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

#import "DDMStructureService_v62.h"

/**
 * author Bruno Farache
 */
@implementation DDMStructureService_v62

- (NSArray *)getStructures:(NSArray *)groupIds {
	NSDictionary *_params = @{
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/ddmstructure/get-structures": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)search:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupIds": groupIds,
		@"classNameIds": classNameIds,
		@"keywords": keywords,
		@"start": @(start),
		@"end": @(end),
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/ddmstructure/search": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)updateStructure:(long)groupId parentStructureId:(long)parentStructureId classNameId:(long)classNameId structureKey:(NSString *)structureKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"parentStructureId": @(parentStructureId),
		@"classNameId": @(classNameId),
		@"structureKey": structureKey,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsd": xsd,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmstructure/update-structure": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addStructure:(long)userId groupId:(long)groupId classNameId:(long)classNameId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsd": xsd,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmstructure/add-structure": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)searchCount:(long)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds name:(NSString *)name description:(NSString *)description storageType:(NSString *)storageType type:(int)type andOperator:(BOOL)andOperator {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupIds": groupIds,
		@"classNameIds": classNameIds,
		@"name": name,
		@"description": description,
		@"storageType": storageType,
		@"type": @(type),
		@"andOperator": @(andOperator)
	};

	NSDictionary *_command = @{@"/ddmstructure/search-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)copyStructure:(long)structureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"structureId": @(structureId),
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmstructure/copy-structure": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getStructure:(long)groupId classNameId:(long)classNameId structureKey:(NSString *)structureKey includeGlobalStructures:(BOOL)includeGlobalStructures {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"structureKey": structureKey,
		@"includeGlobalStructures": @(includeGlobalStructures)
	};

	NSDictionary *_command = @{@"/ddmstructure/get-structure": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)fetchStructure:(long)groupId classNameId:(long)classNameId structureKey:(NSString *)structureKey {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"structureKey": structureKey
	};

	NSDictionary *_command = @{@"/ddmstructure/fetch-structure": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteStructure:(long)structureId {
	NSDictionary *_params = @{
		@"structureId": @(structureId)
	};

	NSDictionary *_command = @{@"/ddmstructure/delete-structure": _params};

	[self.session invoke:_command];
}

@end