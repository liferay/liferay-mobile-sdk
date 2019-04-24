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
@interface LRPowwowparticipantService_v72 : LRBaseService

- (NSNumber *)getPowwowParticipantsCountWithPowwowMeetingId:(long long)powwowMeetingId error:(NSError **)error;
- (NSDictionary *)deletePowwowParticipantWithPowwowParticipant:(LRJSONObjectWrapper *)powwowParticipant error:(NSError **)error;
- (NSDictionary *)updatePowwowParticipantWithPowwowParticipantId:(long long)powwowParticipantId powwowMeetingId:(long long)powwowMeetingId name:(NSString *)name participantUserId:(long long)participantUserId emailAddress:(NSString *)emailAddress type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getPowwowParticipantsWithPowwowMeetingId:(long long)powwowMeetingId error:(NSError **)error;

@end