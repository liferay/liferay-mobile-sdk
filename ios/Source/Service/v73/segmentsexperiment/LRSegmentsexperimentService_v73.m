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

#import "LRSegmentsexperimentService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRSegmentsexperimentService_v73

- (NSDictionary *)addSegmentsExperimentWithSegmentsExperienceId:(long long)segmentsExperienceId classNameId:(long long)classNameId classPK:(long long)classPK name:(NSString *)name description:(NSString *)description goal:(NSString *)goal goalTarget:(NSString *)goalTarget serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperienceId": @(segmentsExperienceId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"goal": [self checkNull: goal],
		@"goalTarget": [self checkNull: goalTarget],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/add-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSegmentsExperimentWithSegmentsExperimentId:(long long)segmentsExperimentId name:(NSString *)name description:(NSString *)description goal:(NSString *)goal goalTarget:(NSString *)goalTarget error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentId": @(segmentsExperimentId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"goal": [self checkNull: goal],
		@"goalTarget": [self checkNull: goalTarget]
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/update-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getSegmentsExperimentWithSegmentsExperimentId:(long long)segmentsExperimentId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentId": @(segmentsExperimentId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/get-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getSegmentsExperimentWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentKey": [self checkNull: segmentsExperimentKey]
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/get-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)runSegmentsExperimentWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey confidenceLevel:(double)confidenceLevel segmentsExperienceKeySplitMap:(NSDictionary *)segmentsExperienceKeySplitMap error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentKey": [self checkNull: segmentsExperimentKey],
		@"confidenceLevel": @(confidenceLevel),
		@"segmentsExperienceKeySplitMap": [self checkNull: segmentsExperienceKeySplitMap]
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/run-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)runSegmentsExperimentWithSegmentsExperimentId:(long long)segmentsExperimentId confidenceLevel:(double)confidenceLevel segmentsExperienceIdSplitMap:(NSDictionary *)segmentsExperienceIdSplitMap error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentId": @(segmentsExperimentId),
		@"confidenceLevel": @(confidenceLevel),
		@"segmentsExperienceIdSplitMap": [self checkNull: segmentsExperienceIdSplitMap]
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/run-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchSegmentsExperimentWithSegmentsExperienceId:(long long)segmentsExperienceId classNameId:(long long)classNameId classPK:(long long)classPK statuses:(NSArray *)statuses error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperienceId": @(segmentsExperienceId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"statuses": [self checkNull: statuses]
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/fetch-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchSegmentsExperimentWithGroupId:(long long)groupId segmentsExperimentKey:(NSString *)segmentsExperimentKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"segmentsExperimentKey": [self checkNull: segmentsExperimentKey]
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/fetch-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteSegmentsExperimentWithSegmentsExperimentId:(long long)segmentsExperimentId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentId": @(segmentsExperimentId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/delete-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteSegmentsExperimentWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentKey": [self checkNull: segmentsExperimentKey]
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/delete-segments-experiment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsExperienceSegmentsExperimentsWithSegmentsExperienceIds:(NSArray *)segmentsExperienceIds classNameId:(long long)classNameId classPK:(long long)classPK statuses:(NSArray *)statuses start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperienceIds": [self checkNull: segmentsExperienceIds],
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"statuses": [self checkNull: statuses],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/get-segments-experience-segments-experiments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSegmentsExperimentStatusWithSegmentsExperimentId:(long long)segmentsExperimentId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentId": @(segmentsExperimentId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/update-segments-experiment-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSegmentsExperimentStatusWithSegmentsExperimentId:(long long)segmentsExperimentId winnerSegmentsExperienceId:(long long)winnerSegmentsExperienceId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentId": @(segmentsExperimentId),
		@"winnerSegmentsExperienceId": @(winnerSegmentsExperienceId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/update-segments-experiment-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSegmentsExperimentStatusWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentKey": [self checkNull: segmentsExperimentKey],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/update-segments-experiment-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSegmentsExperimentStatusWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey winnerSegmentsExperienceKey:(NSString *)winnerSegmentsExperienceKey status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentKey": [self checkNull: segmentsExperimentKey],
		@"winnerSegmentsExperienceKey": [self checkNull: winnerSegmentsExperienceKey],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/update-segments-experiment-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsExperimentsWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/get-segments-experiments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getSegmentsExperimentsWithSegmentsExperienceId:(long long)segmentsExperienceId classNameId:(long long)classNameId classPK:(long long)classPK statuses:(NSArray *)statuses orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperienceId": @(segmentsExperienceId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"statuses": [self checkNull: statuses],
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.segments.model.SegmentsExperiment>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/segments.segmentsexperiment/get-segments-experiments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end