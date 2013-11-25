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

#import "LRDDLRecordService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRDDLRecordService_v62

- (NSDictionary *)addRecordWithGroupId:(long long)groupId recordSetId:(long long)recordSetId displayIndex:(int)displayIndex fields:(NSDictionary *)fields serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"recordSetId": @(recordSetId),
		@"displayIndex": @(displayIndex),
		@"fields": fields,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecord/add-record": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addRecordWithGroupId:(long long)groupId recordSetId:(long long)recordSetId displayIndex:(int)displayIndex fieldsMap:(NSDictionary *)fieldsMap serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"recordSetId": @(recordSetId),
		@"displayIndex": @(displayIndex),
		@"fieldsMap": fieldsMap,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecord/add-record": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteRecordLocaleWithRecordId:(long long)recordId locale:(NSString *)locale serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"recordId": @(recordId),
		@"locale": locale,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecord/delete-record-locale": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getRecordWithRecordId:(long long)recordId error:(NSError **)error {
	NSDictionary *_params = @{
		@"recordId": @(recordId)
	};

	NSDictionary *_command = @{@"/ddlrecord/get-record": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateRecordWithRecordId:(long long)recordId displayIndex:(int)displayIndex fieldsMap:(NSDictionary *)fieldsMap mergeFields:(BOOL)mergeFields serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"recordId": @(recordId),
		@"displayIndex": @(displayIndex),
		@"fieldsMap": fieldsMap,
		@"mergeFields": @(mergeFields),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecord/update-record": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateRecordWithRecordId:(long long)recordId majorVersion:(BOOL)majorVersion displayIndex:(int)displayIndex fields:(NSDictionary *)fields mergeFields:(BOOL)mergeFields serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"recordId": @(recordId),
		@"majorVersion": @(majorVersion),
		@"displayIndex": @(displayIndex),
		@"fields": fields,
		@"mergeFields": @(mergeFields),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecord/update-record": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end