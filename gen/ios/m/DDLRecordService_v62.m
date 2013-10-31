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

#import "DDLRecordService_v62.h"

/**
 * author Bruno Farache
 */
@implementation DDLRecordService_v62

- (NSDictionary *)addRecord:(NSNumber *)groupId recordSetId:(NSNumber *)recordSetId displayIndex:(NSNumber *)displayIndex fieldsMap:(NSDictionary *)fieldsMap serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"recordSetId": recordSetId,
		@"displayIndex": displayIndex,
		@"fieldsMap": fieldsMap,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecord/add-record": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getRecord:(NSNumber *)recordId {
	NSDictionary *_params = @{
		@"recordId": recordId
	};

	NSDictionary *_command = @{@"/ddlrecord/get-record": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateRecord:(NSNumber *)recordId majorVersion:(BOOL)majorVersion displayIndex:(NSNumber *)displayIndex fields:(NSDictionary *)fields mergeFields:(BOOL)mergeFields serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"recordId": recordId,
		@"majorVersion": majorVersion,
		@"displayIndex": displayIndex,
		@"fields": fields,
		@"mergeFields": mergeFields,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecord/update-record": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)deleteRecordLocale:(NSNumber *)recordId locale:(NSString *)locale serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"recordId": recordId,
		@"locale": locale,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/ddlrecord/delete-record-locale": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end