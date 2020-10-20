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

#import "LRCpdisplaylayoutService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdisplaylayoutService_v73

- (NSDictionary *)addCpDisplayLayoutWithUserId:(long long)userId groupId:(long long)groupId clazz:(NSString *)clazz classPK:(long long)classPK layoutUuid:(NSString *)layoutUuid error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"clazz": [self checkNull: clazz],
		@"classPK": @(classPK),
		@"layoutUuid": [self checkNull: layoutUuid]
	}];

	NSDictionary *_command = @{@"/commerce.cpdisplaylayout/add-cp-display-layout": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpDisplayLayoutWithClazz:(NSString *)clazz classPK:(long long)classPK layoutUuid:(NSString *)layoutUuid serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"clazz": [self checkNull: clazz],
		@"classPK": @(classPK),
		@"layoutUuid": [self checkNull: layoutUuid],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdisplaylayout/add-cp-display-layout": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpDisplayLayoutWithClazz:(NSString *)clazz classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"clazz": [self checkNull: clazz],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.cpdisplaylayout/delete-cp-display-layout": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCpDisplayLayoutWithCpDisplayLayoutId:(long long)cpDisplayLayoutId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDisplayLayoutId": @(cpDisplayLayoutId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdisplaylayout/delete-cp-display-layout": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDisplayLayoutWithCpDisplayLayoutId:(long long)cpDisplayLayoutId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDisplayLayoutId": @(cpDisplayLayoutId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdisplaylayout/fetch-cp-display-layout": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDisplayLayoutWithCpDisplayLayoutId:(long long)cpDisplayLayoutId layoutUuid:(NSString *)layoutUuid error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDisplayLayoutId": @(cpDisplayLayoutId),
		@"layoutUuid": [self checkNull: layoutUuid]
	}];

	NSDictionary *_command = @{@"/commerce.cpdisplaylayout/update-cp-display-layout": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpDisplayLayoutWithCompanyId:(long long)companyId groupId:(long long)groupId className:(NSString *)className keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpdisplaylayout/search-cp-display-layout": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end