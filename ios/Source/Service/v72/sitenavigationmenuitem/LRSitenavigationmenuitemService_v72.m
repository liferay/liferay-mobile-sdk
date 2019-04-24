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

#import "LRSitenavigationmenuitemService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRSitenavigationmenuitemService_v72

- (NSArray *)getSiteNavigationMenuItemsWithSiteNavigationMenuId:(long long)siteNavigationMenuId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteNavigationMenuId": @(siteNavigationMenuId)
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenuitem/get-site-navigation-menu-items": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteSiteNavigationMenuItemWithSiteNavigationMenuItemId:(long long)siteNavigationMenuItemId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteNavigationMenuItemId": @(siteNavigationMenuItemId)
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenuitem/delete-site-navigation-menu-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteSiteNavigationMenuItemsWithSiteNavigationMenuId:(long long)siteNavigationMenuId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteNavigationMenuId": @(siteNavigationMenuId)
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenuitem/delete-site-navigation-menu-items": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addSiteNavigationMenuItemWithGroupId:(long long)groupId siteNavigationMenuId:(long long)siteNavigationMenuId parentSiteNavigationMenuItemId:(long long)parentSiteNavigationMenuItemId type:(NSString *)type typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"siteNavigationMenuId": @(siteNavigationMenuId),
		@"parentSiteNavigationMenuItemId": @(parentSiteNavigationMenuItemId),
		@"type": [self checkNull: type],
		@"typeSettings": [self checkNull: typeSettings],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenuitem/add-site-navigation-menu-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSiteNavigationMenuItemWithSiteNavigationMenuId:(long long)siteNavigationMenuId parentSiteNavigationMenuItemId:(long long)parentSiteNavigationMenuItemId order:(int)order error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteNavigationMenuId": @(siteNavigationMenuId),
		@"parentSiteNavigationMenuItemId": @(parentSiteNavigationMenuItemId),
		@"order": @(order)
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenuitem/update-site-navigation-menu-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSiteNavigationMenuItemWithSiteNavigationMenuId:(long long)siteNavigationMenuId typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteNavigationMenuId": @(siteNavigationMenuId),
		@"typeSettings": [self checkNull: typeSettings],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenuitem/update-site-navigation-menu-item": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end