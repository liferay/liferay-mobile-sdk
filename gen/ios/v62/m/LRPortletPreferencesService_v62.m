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

#import "LRPortletPreferencesService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRPortletPreferencesService_v62

- (void)deleteArchivedPreferencesWithPortletItemId:(long long)portletItemId error:(NSError **)error {
	NSDictionary *_params = @{
		@"portletItemId": @(portletItemId)
	};

	NSDictionary *_command = @{@"/portletpreferences/delete-archived-preferences": _params};

	[self.session invoke:_command error:error];
}

- (void)restoreArchivedPreferencesWithGroupId:(long long)groupId layout:(NSDictionary *)layout portletId:(NSString *)portletId portletItem:(NSDictionary *)portletItem preferences:(NSDictionary *)preferences error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"layout": layout,
		@"portletId": portletId,
		@"portletItem": portletItem,
		@"preferences": preferences
	};

	NSDictionary *_command = @{@"/portletpreferences/restore-archived-preferences": _params};

	[self.session invoke:_command error:error];
}

- (void)restoreArchivedPreferencesWithGroupId:(long long)groupId layout:(NSDictionary *)layout portletId:(NSString *)portletId portletItemId:(long long)portletItemId preferences:(NSDictionary *)preferences error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"layout": layout,
		@"portletId": portletId,
		@"portletItemId": @(portletItemId),
		@"preferences": preferences
	};

	NSDictionary *_command = @{@"/portletpreferences/restore-archived-preferences": _params};

	[self.session invoke:_command error:error];
}

- (void)restoreArchivedPreferencesWithGroupId:(long long)groupId name:(NSString *)name layout:(NSDictionary *)layout portletId:(NSString *)portletId preferences:(NSDictionary *)preferences error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"layout": layout,
		@"portletId": portletId,
		@"preferences": preferences
	};

	NSDictionary *_command = @{@"/portletpreferences/restore-archived-preferences": _params};

	[self.session invoke:_command error:error];
}

- (void)updateArchivePreferencesWithUserId:(long long)userId groupId:(long long)groupId name:(NSString *)name portletId:(NSString *)portletId preferences:(NSDictionary *)preferences error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"name": name,
		@"portletId": portletId,
		@"preferences": preferences
	};

	NSDictionary *_command = @{@"/portletpreferences/update-archive-preferences": _params};

	[self.session invoke:_command error:error];
}

@end