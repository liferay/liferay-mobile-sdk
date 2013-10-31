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

#import "LayoutSetService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LayoutSetService_v62

- (NSDictionary *)updateSettings:(NSNumber *)groupId privateLayout:(BOOL)privateLayout settings:(NSString *)settings {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"settings": settings
	};

	NSDictionary *_command = @{@"/layoutset/update-settings": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateLookAndFeel:(NSNumber *)groupId privateLayout:(BOOL)privateLayout themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css wapTheme:(BOOL)wapTheme {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"themeId": themeId,
		@"colorSchemeId": colorSchemeId,
		@"css": css,
		@"wapTheme": wapTheme
	};

	NSDictionary *_command = @{@"/layoutset/update-look-and-feel": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)updateLogo:(NSNumber *)groupId privateLayout:(BOOL)privateLayout logo:(BOOL)logo file:(NSDictionary *)file {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"logo": logo,
		@"file": file
	};

	NSDictionary *_command = @{@"/layoutset/update-logo": _params};

	[session invoke:_command];
}

- (void)updateLayoutSetPrototypeLinkEnabled:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutSetPrototypeLinkEnabled:(BOOL)layoutSetPrototypeLinkEnabled layoutSetPrototypeUuid:(NSString *)layoutSetPrototypeUuid {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"layoutSetPrototypeLinkEnabled": layoutSetPrototypeLinkEnabled,
		@"layoutSetPrototypeUuid": layoutSetPrototypeUuid
	};

	NSDictionary *_command = @{@"/layoutset/update-layout-set-prototype-link-enabled": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateVirtualHost:(NSNumber *)groupId privateLayout:(BOOL)privateLayout virtualHost:(NSString *)virtualHost {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"privateLayout": privateLayout,
		@"virtualHost": virtualHost
	};

	NSDictionary *_command = @{@"/layoutset/update-virtual-host": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end