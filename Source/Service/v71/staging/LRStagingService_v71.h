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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRStagingService_v71 : LRBaseService

- (NSNumber *)createStagingRequestWithGroupId:(long long)groupId checksum:(NSString *)checksum error:(NSError **)error;
- (NSDictionary *)publishStagingRequestWithStagingRequestId:(long long)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap error:(NSError **)error;
- (NSDictionary *)publishStagingRequestWithStagingRequestId:(long long)stagingRequestId exportImportConfiguration:(LRJSONObjectWrapper *)exportImportConfiguration error:(NSError **)error;
- (void)cleanUpStagingRequestWithStagingRequestId:(long long)stagingRequestId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (BOOL)hasRemoteLayoutWithUuid:(NSString *)uuid groupId:(long long)groupId privateLayout:(BOOL)privateLayout error:(NSError **)error;
- (void)updateStagingRequestWithStagingRequestId:(long long)stagingRequestId fileName:(NSString *)fileName bytes:(NSData *)bytes error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)validateStagingRequestWithStagingRequestId:(long long)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap error:(NSError **)error;
- (void)propagateExportImportLifecycleEventWithCode:(int)code processFlag:(int)processFlag processId:(NSString *)processId arguments:(NSArray *)arguments error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end