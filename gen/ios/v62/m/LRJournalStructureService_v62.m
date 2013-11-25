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

#import "LRJournalStructureService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRJournalStructureService_v62

- (NSDictionary *)addStructureWithGroupId:(long long)groupId structureId:(NSString *)structureId autoStructureId:(BOOL)autoStructureId parentStructureId:(NSString *)parentStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"structureId": structureId,
		@"autoStructureId": @(autoStructureId),
		@"parentStructureId": parentStructureId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsd": xsd,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalstructure/add-structure": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)copyStructureWithGroupId:(long long)groupId oldStructureId:(NSString *)oldStructureId newStructureId:(NSString *)newStructureId autoStructureId:(BOOL)autoStructureId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"oldStructureId": oldStructureId,
		@"newStructureId": newStructureId,
		@"autoStructureId": @(autoStructureId)
	};

	NSDictionary *_command = @{@"/journalstructure/copy-structure": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteStructureWithGroupId:(long long)groupId structureId:(NSString *)structureId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"structureId": structureId
	};

	NSDictionary *_command = @{@"/journalstructure/delete-structure": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getStructureWithGroupId:(long long)groupId structureId:(NSString *)structureId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"structureId": structureId
	};

	NSDictionary *_command = @{@"/journalstructure/get-structure": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getStructureWithGroupId:(long long)groupId structureId:(NSString *)structureId includeGlobalStructures:(BOOL)includeGlobalStructures error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"structureId": structureId,
		@"includeGlobalStructures": @(includeGlobalStructures)
	};

	NSDictionary *_command = @{@"/journalstructure/get-structure": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getStructuresWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/journalstructure/get-structures": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getStructuresWithGroupIds:(NSArray *)groupIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/journalstructure/get-structures": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupIds": groupIds,
		@"keywords": keywords,
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalstructure/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds structureId:(NSString *)structureId name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupIds": groupIds,
		@"structureId": structureId,
		@"name": name,
		@"description": description,
		@"andOperator": @(andOperator),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/journalstructure/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCountWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupIds": groupIds,
		@"keywords": keywords
	};

	NSDictionary *_command = @{@"/journalstructure/search-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCountWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds structureId:(NSString *)structureId name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupIds": groupIds,
		@"structureId": structureId,
		@"name": name,
		@"description": description,
		@"andOperator": @(andOperator)
	};

	NSDictionary *_command = @{@"/journalstructure/search-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateStructureWithGroupId:(long long)groupId structureId:(NSString *)structureId parentStructureId:(NSString *)parentStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"structureId": structureId,
		@"parentStructureId": parentStructureId,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"xsd": xsd,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/journalstructure/update-structure": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end