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

#import "DDLRecordSetService_v62.h"

/**
 * author Bruno Farache
 */
@implementation DDLRecordSetService_v62

- (void)deleteRecordSet:(NSNumber *)recordSetId {
	NSDictionary *_params = @{
		@"recordSetId": recordSetId
	};

	NSDictionary *_command = @{@"/ddlrecordset/delete-record-set": _params};

	[session invoke:_command];
}

- (NSDictionary *)getRecordSet:(NSNumber *)recordSetId {
	NSDictionary *_params = @{
		@"recordSetId": recordSetId
	};

	NSDictionary *_command = @{@"/ddlrecordset/get-record-set": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)searchCount:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name description:(NSString *)description scope:(NSNumber *)scope andOperator:(BOOL)andOperator {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupId": groupId,
		@"name": name,
		@"description": description,
		@"scope": scope,
		@"andOperator": andOperator
	};

	NSDictionary *_command = @{@"/ddlrecordset/search-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)search:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name description:(NSString *)description scope:(NSNumber *)scope andOperator:(BOOL)andOperator start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupId": groupId,
		@"name": name,
		@"description": description,
		@"scope": scope,
		@"andOperator": andOperator,
		@"start": start,
		@"end": end,
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/ddlrecordset/search": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateMinDisplayRows:(NSNumber *)recordSetId minDisplayRows:(NSNumber *)minDisplayRows serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"recordSetId": recordSetId,
		@"minDisplayRows": minDisplayRows,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecordset/update-min-display-rows": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateRecordSet:(NSNumber *)groupId ddmStructureId:(NSNumber *)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(NSNumber *)minDisplayRows serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"ddmStructureId": ddmStructureId,
		@"recordSetKey": recordSetKey,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"minDisplayRows": minDisplayRows,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecordset/update-record-set": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addRecordSet:(NSNumber *)groupId ddmStructureId:(NSNumber *)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(NSNumber *)minDisplayRows scope:(NSNumber *)scope serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"ddmStructureId": ddmStructureId,
		@"recordSetKey": recordSetKey,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"minDisplayRows": minDisplayRows,
		@"scope": scope,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecordset/add-record-set": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end