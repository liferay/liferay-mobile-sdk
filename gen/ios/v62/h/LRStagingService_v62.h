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

#import <Foundation/Foundation.h>
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRStagingService_v62 : BaseService

- (void)cleanUpStagingRequestWithStagingRequestId:(long)stagingRequestId error:(NSError **)error;
- (long)createStagingRequestWithGroupId:(long)groupId checksum:(NSString *)checksum error:(NSError **)error;
- (void)publishStagingRequestWithStagingRequestId:(long)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap error:(NSError **)error;
- (void)updateStagingRequestWithStagingRequestId:(long)stagingRequestId fileName:(NSString *)fileName bytes:(NSArray *)bytes error:(NSError **)error;
- (NSDictionary *)validateStagingRequestWithStagingRequestId:(long)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap error:(NSError **)error;

@end