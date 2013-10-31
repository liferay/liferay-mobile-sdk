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

- (void)deleteRecordSet:(long)recordSetId {
	NSDictionary *_params = @{
		@"recordSetId": @(recordSetId)
	};

	NSDictionary *_command = @{@"/ddlrecordset/delete-record-set": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getRecordSet:(long)recordSetId {
	NSDictionary *_params = @{
		@"recordSetId": @(recordSetId)
	};

	NSDictionary *_command = @{@"/ddlrecordset/get-record-set": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)searchCount:(long)companyId groupId:(long)groupId name:(NSString *)name description:(NSString *)description scope:(int)scope andOperator:(BOOL)andOperator {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"name": name,
		@"description": description,
		@"scope": @(scope),
		@"andOperator": @(andOperator)
	};

	NSDictionary *_command = @{@"/ddlrecordset/search-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)search:(long)companyId groupId:(long)groupId name:(NSString *)name description:(NSString *)description scope:(int)scope andOperator:(BOOL)andOperator start:(int)start end:(int)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"name": name,
		@"description": description,
		@"scope": @(scope),
		@"andOperator": @(andOperator),
		@"start": @(start),
		@"end": @(end),
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/ddlrecordset/search": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)updateMinDisplayRows:(long)recordSetId minDisplayRows:(int)minDisplayRows serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"recordSetId": @(recordSetId),
		@"minDisplayRows": @(minDisplayRows),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecordset/update-min-display-rows": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updateRecordSet:(long)groupId ddmStructureId:(long)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(int)minDisplayRows serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"ddmStructureId": @(ddmStructureId),
		@"recordSetKey": recordSetKey,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"minDisplayRows": @(minDisplayRows),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecordset/update-record-set": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addRecordSet:(long)groupId ddmStructureId:(long)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(int)minDisplayRows scope:(int)scope serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"ddmStructureId": @(ddmStructureId),
		@"recordSetKey": recordSetKey,
		@"nameMap": nameMap,
		@"descriptionMap": descriptionMap,
		@"minDisplayRows": @(minDisplayRows),
		@"scope": @(scope),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecordset/add-record-set": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end