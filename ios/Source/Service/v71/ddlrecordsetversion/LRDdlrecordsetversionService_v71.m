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

#import "LRDdlrecordsetversionService_v71.h"

/**
 * @author Bruno Farache
 */
@implementation LRDdlrecordsetversionService_v71

- (NSDictionary *)getRecordSetVersionWithRecordSetVersionId:(long long)recordSetVersionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"recordSetVersionId": @(recordSetVersionId)
	}];

	NSDictionary *_command = @{@"/ddl.ddlrecordsetversion/get-record-set-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getLatestRecordSetVersionWithRecordSetId:(long long)recordSetId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"recordSetId": @(recordSetId)
	}];

	NSDictionary *_command = @{@"/ddl.ddlrecordsetversion/get-latest-record-set-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getRecordSetVersionsCountWithRecordSetId:(long long)recordSetId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"recordSetId": @(recordSetId)
	}];

	NSDictionary *_command = @{@"/ddl.ddlrecordsetversion/get-record-set-versions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getRecordSetVersionsWithRecordSetId:(long long)recordSetId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"recordSetId": @(recordSetId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.lists.model.DDLRecordSetVersion>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/ddl.ddlrecordsetversion/get-record-set-versions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end