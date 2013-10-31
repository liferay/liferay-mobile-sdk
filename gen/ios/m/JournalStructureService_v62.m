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

#import "JournalStructureService_v62.h"

/**
 * author Bruno Farache
 */
@implementation JournalStructureService_v62

- (NSArray *)getStructures:(NSArray *)groupIds {
	NSDictionary *_params = @{
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/journalstructure/get-structures": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)searchCount:(NSNumber *)companyId groupIds:(NSArray *)groupIds structureId:(NSString *)structureId name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupIds": groupIds,
		@"structureId": structureId,
		@"name": name,
		@"description": description,
		@"andOperator": andOperator
	};

	NSDictionary *_command = @{@"/journalstructure/search-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)copyStructure:(NSNumber *)groupId oldStructureId:(NSString *)oldStructureId newStructureId:(NSString *)newStructureId autoStructureId:(BOOL)autoStructureId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"oldStructureId": oldStructureId,
		@"newStructureId": newStructureId,
		@"autoStructureId": autoStructureId
	};

	NSDictionary *_command = @{@"/journalstructure/copy-structure": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateStructure:(NSNumber *)groupId structureId:(NSString *)structureId parentStructureId:(NSString *)parentStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"structureId": structureId,
		@"parentStructureId": parentStructureId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsd": xsd,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalstructure/update-structure": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addStructure:(NSNumber *)groupId structureId:(NSString *)structureId autoStructureId:(BOOL)autoStructureId parentStructureId:(NSString *)parentStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"structureId": structureId,
		@"autoStructureId": autoStructureId,
		@"parentStructureId": parentStructureId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsd": xsd,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalstructure/add-structure": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteStructure:(NSNumber *)groupId structureId:(NSString *)structureId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"structureId": structureId
	};

	NSDictionary *_command = @{@"/journalstructure/delete-structure": _params};

	[session invoke:_command];
}

- (NSDictionary *)getStructure:(NSNumber *)groupId structureId:(NSString *)structureId includeGlobalStructures:(BOOL)includeGlobalStructures {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"structureId": structureId,
		@"includeGlobalStructures": includeGlobalStructures
	};

	NSDictionary *_command = @{@"/journalstructure/get-structure": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)search:(NSNumber *)companyId groupIds:(NSArray *)groupIds structureId:(NSString *)structureId name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupIds": groupIds,
		@"structureId": structureId,
		@"name": name,
		@"description": description,
		@"andOperator": andOperator,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalstructure/search": _params};

	return (NSArray *)[session invoke:_command];
}

@end