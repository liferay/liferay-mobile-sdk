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
@interface LRCommercebomentryService_v73 : LRBaseService

- (NSDictionary *)addCommerceBomEntryWithUserId:(long long)userId number:(int)number cpInstanceUuid:(NSString *)cpInstanceUuid cProductId:(long long)cProductId commerceBOMDefinitionId:(long long)commerceBOMDefinitionId positionX:(double)positionX positionY:(double)positionY radius:(double)radius error:(NSError **)error;
- (void)deleteCommerceBomEntryWithCommerceBOMEntryId:(long long)commerceBOMEntryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCommerceBomEntriesWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommerceBomEntriesCountWithCommerceBOMDefinitionId:(long long)commerceBOMDefinitionId error:(NSError **)error;
- (NSDictionary *)updateCommerceBomEntryWithCommerceBOMEntryId:(long long)commerceBOMEntryId number:(int)number cpInstanceUuid:(NSString *)cpInstanceUuid cProductId:(long long)cProductId positionX:(double)positionX positionY:(double)positionY radius:(double)radius error:(NSError **)error;
- (NSDictionary *)getCommerceBomEntryWithCommerceBOMEntryId:(long long)commerceBOMEntryId error:(NSError **)error;

@end