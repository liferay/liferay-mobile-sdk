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

#import "LRSharingentryService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRSharingentryService_v72

- (NSDictionary *)addSharingEntryWithToUserId:(long long)toUserId classNameId:(long long)classNameId classPK:(long long)classPK groupId:(long long)groupId shareable:(BOOL)shareable sharingEntryActions:(NSArray *)sharingEntryActions expirationDate:(long long)expirationDate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"toUserId": @(toUserId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"groupId": @(groupId),
		@"shareable": @(shareable),
		@"sharingEntryActions": [self checkNull: sharingEntryActions],
		@"expirationDate": @(expirationDate),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sharing.sharingentry/add-sharing-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addOrUpdateSharingEntryWithToUserId:(long long)toUserId classNameId:(long long)classNameId classPK:(long long)classPK groupId:(long long)groupId shareable:(BOOL)shareable sharingEntryActions:(NSArray *)sharingEntryActions expirationDate:(long long)expirationDate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"toUserId": @(toUserId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"groupId": @(groupId),
		@"shareable": @(shareable),
		@"sharingEntryActions": [self checkNull: sharingEntryActions],
		@"expirationDate": @(expirationDate),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sharing.sharingentry/add-or-update-sharing-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteSharingEntryWithSharingEntryId:(long long)sharingEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"sharingEntryId": @(sharingEntryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sharing.sharingentry/delete-sharing-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSharingEntryWithSharingEntryId:(long long)sharingEntryId sharingEntryActions:(NSArray *)sharingEntryActions shareable:(BOOL)shareable expirationDate:(long long)expirationDate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"sharingEntryId": @(sharingEntryId),
		@"sharingEntryActions": [self checkNull: sharingEntryActions],
		@"shareable": @(shareable),
		@"expirationDate": @(expirationDate),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sharing.sharingentry/update-sharing-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end