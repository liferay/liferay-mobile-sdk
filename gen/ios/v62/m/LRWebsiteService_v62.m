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

#import "LRWebsiteService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRWebsiteService_v62

- (NSDictionary *)addWebsiteWithClassName:(NSString *)className classPK:(long long)classPK url:(NSString *)url typeId:(int)typeId primary:(BOOL)primary error:(NSError **)error {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK),
		@"url": url,
		@"typeId": @(typeId),
		@"primary": @(primary)
	};

	NSDictionary *_command = @{@"/website/add-website": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addWebsiteWithClassName:(NSString *)className classPK:(long long)classPK url:(NSString *)url typeId:(int)typeId primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK),
		@"url": url,
		@"typeId": @(typeId),
		@"primary": @(primary),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/website/add-website": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteWebsiteWithWebsiteId:(long long)websiteId error:(NSError **)error {
	NSDictionary *_params = @{
		@"websiteId": @(websiteId)
	};

	NSDictionary *_command = @{@"/website/delete-website": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getWebsiteWithWebsiteId:(long long)websiteId error:(NSError **)error {
	NSDictionary *_params = @{
		@"websiteId": @(websiteId)
	};

	NSDictionary *_command = @{@"/website/get-website": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getWebsitesWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/website/get-websites": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateWebsiteWithWebsiteId:(long long)websiteId url:(NSString *)url typeId:(int)typeId primary:(BOOL)primary error:(NSError **)error {
	NSDictionary *_params = @{
		@"websiteId": @(websiteId),
		@"url": url,
		@"typeId": @(typeId),
		@"primary": @(primary)
	};

	NSDictionary *_command = @{@"/website/update-website": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end