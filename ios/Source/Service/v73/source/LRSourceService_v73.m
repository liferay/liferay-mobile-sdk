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

#import "LRSourceService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRSourceService_v73

- (NSArray *)getSourcesWithGroupId:(long long)groupId name:(NSString *)name driverUrl:(NSString *)driverUrl andSearch:(BOOL)andSearch start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"driverUrl": [self checkNull: driverUrl],
		@"andSearch": @(andSearch),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.reports.engine.console.model.Source>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/reports.source/get-sources": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSourceWithSourceId:(long long)sourceId nameMap:(NSDictionary *)nameMap driverClassName:(NSString *)driverClassName driverUrl:(NSString *)driverUrl driverUserName:(NSString *)driverUserName driverPassword:(NSString *)driverPassword serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"sourceId": @(sourceId),
		@"nameMap": [self checkNull: nameMap],
		@"driverClassName": [self checkNull: driverClassName],
		@"driverUrl": [self checkNull: driverUrl],
		@"driverUserName": [self checkNull: driverUserName],
		@"driverPassword": [self checkNull: driverPassword],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/reports.source/update-source": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addSourceWithGroupId:(long long)groupId nameMap:(NSDictionary *)nameMap driverClassName:(NSString *)driverClassName driverUrl:(NSString *)driverUrl driverUserName:(NSString *)driverUserName driverPassword:(NSString *)driverPassword serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"nameMap": [self checkNull: nameMap],
		@"driverClassName": [self checkNull: driverClassName],
		@"driverUrl": [self checkNull: driverUrl],
		@"driverUserName": [self checkNull: driverUserName],
		@"driverPassword": [self checkNull: driverPassword],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/reports.source/add-source": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSourcesCountWithGroupId:(long long)groupId name:(NSString *)name driverUrl:(NSString *)driverUrl andSearch:(BOOL)andSearch error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"driverUrl": [self checkNull: driverUrl],
		@"andSearch": @(andSearch)
	}];

	NSDictionary *_command = @{@"/reports.source/get-sources-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getSourceWithSourceId:(long long)sourceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"sourceId": @(sourceId)
	}];

	NSDictionary *_command = @{@"/reports.source/get-source": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteSourceWithSourceId:(long long)sourceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"sourceId": @(sourceId)
	}];

	NSDictionary *_command = @{@"/reports.source/delete-source": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end