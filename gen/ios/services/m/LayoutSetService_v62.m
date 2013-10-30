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
}

- (NSDictionary *)updateLookAndFeel:(NSNumber *)groupId privateLayout:(BOOL)privateLayout themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css wapTheme:(BOOL)wapTheme {
}

- (void)updateLogo:(NSNumber *)groupId privateLayout:(BOOL)privateLayout logo:(BOOL)logo file:(NSDictionary *)file {
}

- (void)updateLayoutSetPrototypeLinkEnabled:(NSNumber *)groupId privateLayout:(BOOL)privateLayout layoutSetPrototypeLinkEnabled:(BOOL)layoutSetPrototypeLinkEnabled layoutSetPrototypeUuid:(NSString *)layoutSetPrototypeUuid {
}

- (NSDictionary *)updateVirtualHost:(NSNumber *)groupId privateLayout:(BOOL)privateLayout virtualHost:(NSString *)virtualHost {
}

@end