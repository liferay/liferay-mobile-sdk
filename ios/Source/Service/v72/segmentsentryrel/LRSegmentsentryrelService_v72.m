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

#import "LRSegmentsentryrelService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRSegmentsentryrelService_v72

- (void)deleteSegmentsEntryRelWithSegmentsEntryRelId:(long long)segmentsEntryRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryRelId": @(segmentsEntryRelId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentryrel/delete-segments-entry-rel": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteSegmentsEntryRelWithSegmentsEntryId:(long long)segmentsEntryId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentryrel/delete-segments-entry-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addSegmentsEntryRelWithSegmentsEntryId:(long long)segmentsEntryId classNameId:(long long)classNameId classPK:(long long)classPK serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/segments.segmentsentryrel/add-segments-entry-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsEntryRelsWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentryrel/get-segments-entry-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsEntryRelsWithSegmentsEntryId:(long long)segmentsEntryId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.segments.model.SegmentsEntryRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/segments.segmentsentryrel/get-segments-entry-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsEntryRelsWithSegmentsEntryId:(long long)segmentsEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentryrel/get-segments-entry-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSegmentsEntryRelsCountWithSegmentsEntryId:(long long)segmentsEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentryrel/get-segments-entry-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getSegmentsEntryRelsCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentryrel/get-segments-entry-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (BOOL)hasSegmentsEntryRelWithSegmentsEntryId:(long long)segmentsEntryId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsEntryId": @(segmentsEntryId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/segments.segmentsentryrel/has-segments-entry-rel": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

@end