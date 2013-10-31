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

#import "SCLicenseService_v62.h"

/**
 * author Bruno Farache
 */
@implementation SCLicenseService_v62

- (void)deleteLicense:(NSNumber *)licenseId {
	NSDictionary *_params = @{
		@"licenseId": licenseId
	};

	NSDictionary *_command = @{@"/sclicense/delete-license": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateLicense:(NSNumber *)licenseId name:(NSString *)name url:(NSString *)url openSource:(BOOL)openSource active:(BOOL)active recommended:(BOOL)recommended {
	NSDictionary *_params = @{
		@"licenseId": licenseId,
		@"name": name,
		@"url": url,
		@"openSource": openSource,
		@"active": active,
		@"recommended": recommended
	};

	NSDictionary *_command = @{@"/sclicense/update-license": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getLicense:(NSNumber *)licenseId {
	NSDictionary *_params = @{
		@"licenseId": licenseId
	};

	NSDictionary *_command = @{@"/sclicense/get-license": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addLicense:(NSString *)name url:(NSString *)url openSource:(BOOL)openSource active:(BOOL)active recommended:(BOOL)recommended {
	NSDictionary *_params = @{
		@"name": name,
		@"url": url,
		@"openSource": openSource,
		@"active": active,
		@"recommended": recommended
	};

	NSDictionary *_command = @{@"/sclicense/add-license": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end