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

#import "StagingService_v62.h"

/**
 * author Bruno Farache
 */
@implementation StagingService_v62

- (NSDictionary *)validateStagingRequest:(NSNumber *)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap {
}

- (NSNumber *)createStagingRequest:(NSNumber *)groupId checksum:(NSString *)checksum {
}

- (void)cleanUpStagingRequest:(NSNumber *)stagingRequestId {
}

- (void)updateStagingRequest:(NSNumber *)stagingRequestId fileName:(NSString *)fileName bytes:(NSArray *)bytes {
}

- (void)publishStagingRequest:(NSNumber *)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap {
}

@end