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

#import "PortletPreferencesService_v62.h"

/**
 * author Bruno Farache
 */
@implementation PortletPreferencesService_v62

- (void)updateArchivePreferences:(long)userId groupId:(long)groupId name:(NSString *)name portletId:(NSString *)portletId preferences:(NSDictionary *)preferences {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"name": name,
		@"portletId": portletId,
		@"preferences": preferences
	};

	NSDictionary *_command = @{@"/portletpreferences/update-archive-preferences": _params};

	[self.session invoke:_command];
}

- (void)restoreArchivedPreferences:(long)groupId name:(NSString *)name layout:(NSDictionary *)layout portletId:(NSString *)portletId preferences:(NSDictionary *)preferences {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"layout": layout,
		@"portletId": portletId,
		@"preferences": preferences
	};

	NSDictionary *_command = @{@"/portletpreferences/restore-archived-preferences": _params};

	[self.session invoke:_command];
}

- (void)deleteArchivedPreferences:(long)portletItemId {
	NSDictionary *_params = @{
		@"portletItemId": @(portletItemId)
	};

	NSDictionary *_command = @{@"/portletpreferences/delete-archived-preferences": _params};

	[self.session invoke:_command];
}

@end