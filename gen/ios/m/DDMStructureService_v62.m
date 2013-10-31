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

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)search:(NSNumber *)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds keywords:(NSString *)keywords start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupIds": groupIds,
		@"classNameIds": classNameIds,
		@"keywords": keywords,
		@"start": start,
		@"end": end,
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/ddmstructure/search": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateStructure:(NSNumber *)groupId parentStructureId:(NSNumber *)parentStructureId classNameId:(NSNumber *)classNameId structureKey:(NSString *)structureKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"parentStructureId": parentStructureId,
		@"classNameId": classNameId,
		@"structureKey": structureKey,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsd": xsd,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmstructure/update-structure": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addStructure:(NSNumber *)userId groupId:(NSNumber *)groupId classNameId:(NSNumber *)classNameId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"userId": userId,
		@"groupId": groupId,
		@"classNameId": classNameId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsd": xsd,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmstructure/add-structure": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)searchCount:(NSNumber *)companyId groupIds:(NSArray *)groupIds classNameIds:(NSArray *)classNameIds name:(NSString *)name description:(NSString *)description storageType:(NSString *)storageType type:(NSNumber *)type andOperator:(BOOL)andOperator {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupIds": groupIds,
		@"classNameIds": classNameIds,
		@"name": name,
		@"description": description,
		@"storageType": storageType,
		@"type": type,
		@"andOperator": andOperator
	};

	NSDictionary *_command = @{@"/ddmstructure/search-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)copyStructure:(NSNumber *)structureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"structureId": structureId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddmstructure/copy-structure": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getStructure:(NSNumber *)groupId classNameId:(NSNumber *)classNameId structureKey:(NSString *)structureKey includeGlobalStructures:(BOOL)includeGlobalStructures {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"classNameId": classNameId,
		@"structureKey": structureKey,
		@"includeGlobalStructures": includeGlobalStructures
	};

	NSDictionary *_command = @{@"/ddmstructure/get-structure": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)fetchStructure:(NSNumber *)groupId classNameId:(NSNumber *)classNameId structureKey:(NSString *)structureKey {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"classNameId": classNameId,
		@"structureKey": structureKey
	};

	NSDictionary *_command = @{@"/ddmstructure/fetch-structure": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteStructure:(NSNumber *)structureId {
	NSDictionary *_params = @{
		@"structureId": structureId
	};

	NSDictionary *_command = @{@"/ddmstructure/delete-structure": _params};

	[session invoke:_command];
}

@end