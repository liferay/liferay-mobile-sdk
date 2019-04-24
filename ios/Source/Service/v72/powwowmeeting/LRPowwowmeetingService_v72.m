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

#import "LRPowwowmeetingService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRPowwowmeetingService_v72

- (NSDictionary *)deletePowwowMeetingWithPowwowMeetingId:(long long)powwowMeetingId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"powwowMeetingId": @(powwowMeetingId)
	}];

	NSDictionary *_command = @{@"/powwow-portlet.powwowmeeting/delete-powwow-meeting": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePowwowMeetingWithPowwowMeetingId:(long long)powwowMeetingId powwowServerId:(long long)powwowServerId name:(NSString *)name description:(NSString *)description providerType:(NSString *)providerType providerTypeMetadataMap:(NSDictionary *)providerTypeMetadataMap languageId:(NSString *)languageId calendarBookingId:(long long)calendarBookingId status:(int)status powwowParticipants:(NSArray *)powwowParticipants serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"powwowMeetingId": @(powwowMeetingId),
		@"powwowServerId": @(powwowServerId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"providerType": [self checkNull: providerType],
		@"providerTypeMetadataMap": [self checkNull: providerTypeMetadataMap],
		@"languageId": [self checkNull: languageId],
		@"calendarBookingId": @(calendarBookingId),
		@"status": @(status),
		@"powwowParticipants": [self checkNull: powwowParticipants],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/powwow-portlet.powwowmeeting/update-powwow-meeting": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getPowwowMeetingWithPowwowMeetingId:(long long)powwowMeetingId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"powwowMeetingId": @(powwowMeetingId)
	}];

	NSDictionary *_command = @{@"/powwow-portlet.powwowmeeting/get-powwow-meeting": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addPowwowMeetingWithGroupId:(long long)groupId portletId:(NSString *)portletId powwowServerId:(long long)powwowServerId name:(NSString *)name description:(NSString *)description providerType:(NSString *)providerType providerTypeMetadataMap:(NSDictionary *)providerTypeMetadataMap languageId:(NSString *)languageId calendarBookingId:(long long)calendarBookingId status:(int)status powwowParticipants:(NSArray *)powwowParticipants serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"portletId": [self checkNull: portletId],
		@"powwowServerId": @(powwowServerId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"providerType": [self checkNull: providerType],
		@"providerTypeMetadataMap": [self checkNull: providerTypeMetadataMap],
		@"languageId": [self checkNull: languageId],
		@"calendarBookingId": @(calendarBookingId),
		@"status": @(status),
		@"powwowParticipants": [self checkNull: powwowParticipants],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/powwow-portlet.powwowmeeting/add-powwow-meeting": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getPowwowMeetingsCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/powwow-portlet.powwowmeeting/get-powwow-meetings-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getPowwowMeetingsWithGroupId:(long long)groupId start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"obc" className:@"com.liferay.portal.kernel.util.OrderByComparator" wrapper:obc];

	NSDictionary *_command = @{@"/powwow-portlet.powwowmeeting/get-powwow-meetings": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end