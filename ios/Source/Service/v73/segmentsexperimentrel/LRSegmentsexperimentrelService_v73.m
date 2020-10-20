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

#import "LRSegmentsexperimentrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRSegmentsexperimentrelService_v73

- (NSArray *)getSegmentsExperimentRelsWithSegmentsExperimentId:(long long)segmentsExperimentId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentId": @(segmentsExperimentId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperimentrel/get-segments-experiment-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addSegmentsExperimentRelWithSegmentsExperimentId:(long long)segmentsExperimentId segmentsExperienceId:(long long)segmentsExperienceId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentId": @(segmentsExperimentId),
		@"segmentsExperienceId": @(segmentsExperienceId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/segments.segmentsexperimentrel/add-segments-experiment-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSegmentsExperimentRelWithSegmentsExperimentRelId:(long long)segmentsExperimentRelId split:(double)split error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentRelId": @(segmentsExperimentRelId),
		@"split": @(split)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperimentrel/update-segments-experiment-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSegmentsExperimentRelWithSegmentsExperimentRelId:(long long)segmentsExperimentRelId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentRelId": @(segmentsExperimentRelId),
		@"name": [self checkNull: name],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/segments.segmentsexperimentrel/update-segments-experiment-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteSegmentsExperimentRelWithSegmentsExperimentRelId:(long long)segmentsExperimentRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentRelId": @(segmentsExperimentRelId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperimentrel/delete-segments-experiment-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getSegmentsExperimentRelWithSegmentsExperimentId:(long long)segmentsExperimentId segmentsExperienceId:(long long)segmentsExperienceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"segmentsExperimentId": @(segmentsExperimentId),
		@"segmentsExperienceId": @(segmentsExperienceId)
	}];

	NSDictionary *_command = @{@"/segments.segmentsexperimentrel/get-segments-experiment-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end