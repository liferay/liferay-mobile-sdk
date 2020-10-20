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
@interface LRCommercebomdefinitionService_v73 : LRBaseService

- (NSArray *)getCommerceBomDefinitionsWithCommerceBOMFolderId:(long long)commerceBOMFolderId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommerceBomDefinitionsCountWithCommerceBOMFolderId:(long long)commerceBOMFolderId error:(NSError **)error;
- (void)deleteCommerceBomDefinitionWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateCommerceBomDefinitionWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId cpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)addCommerceBomDefinitionWithUserId:(long long)userId commerceBOMFolderId:(long long)commerceBOMFolderId cpAttachmentFileEntryId:(long long)cpAttachmentFileEntryId name:(NSString *)name friendlyUrl:(NSString *)friendlyUrl error:(NSError **)error;
- (NSDictionary *)getCommerceBomDefinitionWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId error:(NSError **)error;

@end