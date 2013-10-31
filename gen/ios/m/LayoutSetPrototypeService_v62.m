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

#import "LayoutSetPrototypeService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LayoutSetPrototypeService_v62

- (NSDictionary *)updateLayoutSetPrototype:(long)layoutSetPrototypeId nameMap:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"layoutSetPrototypeId": @(layoutSetPrototypeId),
		@"nameMap": nameMap,
		@"description": description,
		@"active": @(active),
		@"layoutsUpdateable": @(layoutsUpdateable),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layoutsetprototype/update-layout-set-prototype": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteLayoutSetPrototype:(long)layoutSetPrototypeId {
	NSDictionary *_params = @{
		@"layoutSetPrototypeId": @(layoutSetPrototypeId)
	};

	NSDictionary *_command = @{@"/layoutsetprototype/delete-layout-set-prototype": _params};

	[self.session invoke:_command];
}

- (NSArray *)search:(long)companyId active:(NSDictionary *)active obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"active": active,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/layoutsetprototype/search": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)addLayoutSetPrototype:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"nameMap": nameMap,
		@"description": description,
		@"active": @(active),
		@"layoutsUpdateable": @(layoutsUpdateable),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/layoutsetprototype/add-layout-set-prototype": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getLayoutSetPrototype:(long)layoutSetPrototypeId {
	NSDictionary *_params = @{
		@"layoutSetPrototypeId": @(layoutSetPrototypeId)
	};

	NSDictionary *_command = @{@"/layoutsetprototype/get-layout-set-prototype": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end