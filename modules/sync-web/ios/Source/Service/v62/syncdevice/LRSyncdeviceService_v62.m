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

#import "LRSyncdeviceService_v62.h"

/**
 * @author Bruno Farache
 */
@implementation LRSyncdeviceService_v62

- (NSDictionary *)registerSyncDeviceWithType:(NSString *)type buildNumber:(int)buildNumber featureSet:(int)featureSet uuid:(NSString *)uuid error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"type": [self checkNull: type],
		@"buildNumber": @(buildNumber),
		@"featureSet": @(featureSet),
		@"uuid": [self checkNull: uuid]
	}];

	NSDictionary *_command = @{@"/sync-web.syncdevice/register-sync-device": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)unregisterSyncDeviceWithUuid:(NSString *)uuid error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"uuid": [self checkNull: uuid]
	}];

	NSDictionary *_command = @{@"/sync-web.syncdevice/unregister-sync-device": _params};

	[self.session invoke:_command error:error];
}

@end