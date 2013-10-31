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

#import "RegionService_v62.h"

/**
 * author Bruno Farache
 */
@implementation RegionService_v62

- (NSDictionary *)fetchRegion:(NSNumber *)countryId regionCode:(NSString *)regionCode {
	NSDictionary *_params = @{
		@"countryId": countryId,
		@"regionCode": regionCode
	};

	NSDictionary *_command = @{@"/region/fetch-region": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getRegions:(NSNumber *)countryId active:(BOOL)active {
	NSDictionary *_params = @{
		@"countryId": countryId,
		@"active": active
	};

	NSDictionary *_command = @{@"/region/get-regions": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)getRegion:(NSNumber *)countryId regionCode:(NSString *)regionCode {
	NSDictionary *_params = @{
		@"countryId": countryId,
		@"regionCode": regionCode
	};

	NSDictionary *_command = @{@"/region/get-region": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addRegion:(NSNumber *)countryId regionCode:(NSString *)regionCode name:(NSString *)name active:(BOOL)active {
	NSDictionary *_params = @{
		@"countryId": countryId,
		@"regionCode": regionCode,
		@"name": name,
		@"active": active
	};

	NSDictionary *_command = @{@"/region/add-region": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end