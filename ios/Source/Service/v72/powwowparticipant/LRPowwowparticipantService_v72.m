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

#import "LRPowwowparticipantService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRPowwowparticipantService_v72

- (NSNumber *)getPowwowParticipantsCountWithPowwowMeetingId:(long long)powwowMeetingId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"powwowMeetingId": @(powwowMeetingId)
	}];

	NSDictionary *_command = @{@"/powwow-portlet.powwowparticipant/get-powwow-participants-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deletePowwowParticipantWithPowwowParticipant:(LRJSONObjectWrapper *)powwowParticipant error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"powwowParticipant" className:@"com.liferay.powwow.model.PowwowParticipant" wrapper:powwowParticipant];

	NSDictionary *_command = @{@"/powwow-portlet.powwowparticipant/delete-powwow-participant": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePowwowParticipantWithPowwowParticipantId:(long long)powwowParticipantId powwowMeetingId:(long long)powwowMeetingId name:(NSString *)name participantUserId:(long long)participantUserId emailAddress:(NSString *)emailAddress type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"powwowParticipantId": @(powwowParticipantId),
		@"powwowMeetingId": @(powwowMeetingId),
		@"name": [self checkNull: name],
		@"participantUserId": @(participantUserId),
		@"emailAddress": [self checkNull: emailAddress],
		@"type": @(type),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/powwow-portlet.powwowparticipant/update-powwow-participant": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getPowwowParticipantsWithPowwowMeetingId:(long long)powwowMeetingId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"powwowMeetingId": @(powwowMeetingId)
	}];

	NSDictionary *_command = @{@"/powwow-portlet.powwowparticipant/get-powwow-participants": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end