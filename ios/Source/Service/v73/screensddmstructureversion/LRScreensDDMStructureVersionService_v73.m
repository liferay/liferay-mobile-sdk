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

#import "LRScreensDDMStructureVersionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRScreensDDMStructureVersionService_v73

- (NSDictionary *)getDdmStructureVersionWithStructureId:(long long)structureId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"structureId": @(structureId)
	}];

	NSDictionary *_command = @{@"/screens.screensddmstructureversion/get-ddm-structure-version": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end