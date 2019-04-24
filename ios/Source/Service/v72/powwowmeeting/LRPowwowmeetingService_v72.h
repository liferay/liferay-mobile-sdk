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
@interface LRPowwowmeetingService_v72 : LRBaseService

- (NSDictionary *)deletePowwowMeetingWithPowwowMeetingId:(long long)powwowMeetingId error:(NSError **)error;
- (NSDictionary *)updatePowwowMeetingWithPowwowMeetingId:(long long)powwowMeetingId powwowServerId:(long long)powwowServerId name:(NSString *)name description:(NSString *)description providerType:(NSString *)providerType providerTypeMetadataMap:(NSDictionary *)providerTypeMetadataMap languageId:(NSString *)languageId calendarBookingId:(long long)calendarBookingId status:(int)status powwowParticipants:(NSArray *)powwowParticipants serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getPowwowMeetingWithPowwowMeetingId:(long long)powwowMeetingId error:(NSError **)error;
- (NSDictionary *)addPowwowMeetingWithGroupId:(long long)groupId portletId:(NSString *)portletId powwowServerId:(long long)powwowServerId name:(NSString *)name description:(NSString *)description providerType:(NSString *)providerType providerTypeMetadataMap:(NSDictionary *)providerTypeMetadataMap languageId:(NSString *)languageId calendarBookingId:(long long)calendarBookingId status:(int)status powwowParticipants:(NSArray *)powwowParticipants serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSNumber *)getPowwowMeetingsCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSArray *)getPowwowMeetingsWithGroupId:(long long)groupId start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;

@end