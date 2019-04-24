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

#import "LRSegmentsexperienceService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRSegmentsexperienceService_v72

- (NSDictionary *)deleteSegmentsExperienceWithSegmentsExperienceId:(long long)segmentsExperienceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperienceId": @(segmentsExperienceId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperience/delete-segments-experience": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getSegmentsExperienceWithSegmentsExperienceId:(long long)segmentsExperienceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperienceId": @(segmentsExperienceId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperience/get-segments-experience": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsExperiencesWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"active": @(active),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.segments.model.SegmentsExperience>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/segments.segmentsexperience/get-segments-experiences": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsExperiencesWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperience/get-segments-experiences": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSegmentsExperiencesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperience/get-segments-experiences-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)updateSegmentsExperiencePriorityWithSegmentsExperienceId:(long long)segmentsExperienceId newPriority:(int)newPriority error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperienceId": @(segmentsExperienceId),
		@"newPriority": @(newPriority)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperience/update-segments-experience-priority": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addSegmentsExperienceWithSegmentsEntryId:(long long)segmentsEntryId classNameId:(long long)classNameId classPK:(long long)classPK nameMap:(NSDictionary *)nameMap active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"nameMap": [self checkNull: nameMap],
		@"active": @(active),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/segments.segmentsexperience/add-segments-experience": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSegmentsExperienceWithSegmentsExperienceId:(long long)segmentsExperienceId segmentsEntryId:(long long)segmentsEntryId nameMap:(NSDictionary *)nameMap active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperienceId": @(segmentsExperienceId),
		@"segmentsEntryId": @(segmentsEntryId),
		@"nameMap": [self checkNull: nameMap],
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperience/update-segments-experience": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end