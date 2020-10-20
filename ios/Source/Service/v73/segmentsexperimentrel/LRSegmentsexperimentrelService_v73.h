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
@interface LRSegmentsexperimentrelService_v73 : LRBaseService

- (NSArray *)getSegmentsExperimentRelsWithSegmentsExperimentId:(long long)segmentsExperimentId error:(NSError **)error;
- (NSDictionary *)addSegmentsExperimentRelWithSegmentsExperimentId:(long long)segmentsExperimentId segmentsExperienceId:(long long)segmentsExperienceId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateSegmentsExperimentRelWithSegmentsExperimentRelId:(long long)segmentsExperimentRelId split:(double)split error:(NSError **)error;
- (NSDictionary *)updateSegmentsExperimentRelWithSegmentsExperimentRelId:(long long)segmentsExperimentRelId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteSegmentsExperimentRelWithSegmentsExperimentRelId:(long long)segmentsExperimentRelId error:(NSError **)error;
- (NSDictionary *)getSegmentsExperimentRelWithSegmentsExperimentId:(long long)segmentsExperimentId segmentsExperienceId:(long long)segmentsExperienceId error:(NSError **)error;

@end