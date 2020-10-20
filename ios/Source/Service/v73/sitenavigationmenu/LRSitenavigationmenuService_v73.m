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

#import "LRSitenavigationmenuService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRSitenavigationmenuService_v73

- (NSDictionary *)addSiteNavigationMenuWithGroupId:(long long)groupId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/add-site-navigation-menu": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addSiteNavigationMenuWithGroupId:(long long)groupId name:(NSString *)name type:(int)type automatic:(BOOL)automatic serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"auto": @(automatic),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/add-site-navigation-menu": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addSiteNavigationMenuWithGroupId:(long long)groupId name:(NSString *)name type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"type": @(type),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/add-site-navigation-menu": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSiteNavigationMenuWithSiteNavigationMenuId:(long long)siteNavigationMenuId type:(int)type automatic:(BOOL)automatic serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteNavigationMenuId": @(siteNavigationMenuId),
		@"type": @(type),
		@"auto": @(automatic),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/update-site-navigation-menu": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSiteNavigationMenuWithSiteNavigationMenuId:(long long)siteNavigationMenuId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteNavigationMenuId": @(siteNavigationMenuId),
		@"name": [self checkNull: name],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/update-site-navigation-menu": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getSiteNavigationMenusWithGroupId:(long long)groupId keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.site.navigation.model.SiteNavigationMenu>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/get-site-navigation-menus": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSiteNavigationMenusWithGroupIds:(NSArray *)groupIds start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupIds": [self checkNull: groupIds],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.site.navigation.model.SiteNavigationMenu>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/get-site-navigation-menus": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSiteNavigationMenusWithGroupIds:(NSArray *)groupIds keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupIds": [self checkNull: groupIds],
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.site.navigation.model.SiteNavigationMenu>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/get-site-navigation-menus": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSiteNavigationMenusWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.site.navigation.model.SiteNavigationMenu>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/get-site-navigation-menus": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSiteNavigationMenusWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/get-site-navigation-menus": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteSiteNavigationMenuWithSiteNavigationMenuId:(long long)siteNavigationMenuId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteNavigationMenuId": @(siteNavigationMenuId)
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/delete-site-navigation-menu": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchSiteNavigationMenuWithSiteNavigationMenuId:(long long)siteNavigationMenuId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteNavigationMenuId": @(siteNavigationMenuId)
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/fetch-site-navigation-menu": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSiteNavigationMenusCountWithGroupIds:(NSArray *)groupIds keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupIds": [self checkNull: groupIds],
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/get-site-navigation-menus-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSiteNavigationMenusCountWithGroupIds:(NSArray *)groupIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupIds": [self checkNull: groupIds]
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/get-site-navigation-menus-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSiteNavigationMenusCountWithGroupId:(long long)groupId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/get-site-navigation-menus-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSiteNavigationMenusCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/sitenavigation.sitenavigationmenu/get-site-navigation-menus-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end
