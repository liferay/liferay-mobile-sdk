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

#import "LRDefinitionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRDefinitionService_v73

- (NSDictionary *)deleteDefinitionWithDefinitionId:(long long)definitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"definitionId": @(definitionId)
	}];

	NSDictionary *_command = @{@"/reports.definition/delete-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getDefinitionsCountWithGroupId:(long long)groupId definitionName:(NSString *)definitionName description:(NSString *)description sourceId:(NSString *)sourceId reportName:(NSString *)reportName andSearch:(BOOL)andSearch error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"definitionName": [self checkNull: definitionName],
		@"description": [self checkNull: description],
		@"sourceId": [self checkNull: sourceId],
		@"reportName": [self checkNull: reportName],
		@"andSearch": @(andSearch)
	}];

	NSDictionary *_command = @{@"/reports.definition/get-definitions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getDefinitionWithDefinitionId:(long long)definitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"definitionId": @(definitionId)
	}];

	NSDictionary *_command = @{@"/reports.definition/get-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getDefinitionsWithGroupId:(long long)groupId definitionName:(NSString *)definitionName description:(NSString *)description sourceId:(NSString *)sourceId reportName:(NSString *)reportName andSearch:(BOOL)andSearch start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"definitionName": [self checkNull: definitionName],
		@"description": [self checkNull: description],
		@"sourceId": [self checkNull: sourceId],
		@"reportName": [self checkNull: reportName],
		@"andSearch": @(andSearch),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.reports.engine.console.model.Definition>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/reports.definition/get-definitions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end