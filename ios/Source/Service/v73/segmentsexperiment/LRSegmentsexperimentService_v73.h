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
@interface LRSegmentsexperimentService_v73 : LRBaseService

- (NSDictionary *)addSegmentsExperimentWithSegmentsExperienceId:(long long)segmentsExperienceId classNameId:(long long)classNameId classPK:(long long)classPK name:(NSString *)name description:(NSString *)description goal:(NSString *)goal goalTarget:(NSString *)goalTarget serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateSegmentsExperimentWithSegmentsExperimentId:(long long)segmentsExperimentId name:(NSString *)name description:(NSString *)description goal:(NSString *)goal goalTarget:(NSString *)goalTarget error:(NSError **)error;
- (NSDictionary *)getSegmentsExperimentWithSegmentsExperimentId:(long long)segmentsExperimentId error:(NSError **)error;
- (NSDictionary *)getSegmentsExperimentWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey error:(NSError **)error;
- (NSDictionary *)runSegmentsExperimentWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey confidenceLevel:(double)confidenceLevel segmentsExperienceKeySplitMap:(NSDictionary *)segmentsExperienceKeySplitMap error:(NSError **)error;
- (NSDictionary *)runSegmentsExperimentWithSegmentsExperimentId:(long long)segmentsExperimentId confidenceLevel:(double)confidenceLevel segmentsExperienceIdSplitMap:(NSDictionary *)segmentsExperienceIdSplitMap error:(NSError **)error;
- (NSDictionary *)fetchSegmentsExperimentWithSegmentsExperienceId:(long long)segmentsExperienceId classNameId:(long long)classNameId classPK:(long long)classPK statuses:(NSArray *)statuses error:(NSError **)error;
- (NSDictionary *)fetchSegmentsExperimentWithGroupId:(long long)groupId segmentsExperimentKey:(NSString *)segmentsExperimentKey error:(NSError **)error;
- (NSDictionary *)deleteSegmentsExperimentWithSegmentsExperimentId:(long long)segmentsExperimentId error:(NSError **)error;
- (NSDictionary *)deleteSegmentsExperimentWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey error:(NSError **)error;
- (NSArray *)getSegmentsExperienceSegmentsExperimentsWithSegmentsExperienceIds:(NSArray *)segmentsExperienceIds classNameId:(long long)classNameId classPK:(long long)classPK statuses:(NSArray *)statuses start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)updateSegmentsExperimentStatusWithSegmentsExperimentId:(long long)segmentsExperimentId status:(int)status error:(NSError **)error;
- (NSDictionary *)updateSegmentsExperimentStatusWithSegmentsExperimentId:(long long)segmentsExperimentId winnerSegmentsExperienceId:(long long)winnerSegmentsExperienceId status:(int)status error:(NSError **)error;
- (NSDictionary *)updateSegmentsExperimentStatusWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey status:(int)status error:(NSError **)error;
- (NSDictionary *)updateSegmentsExperimentStatusWithSegmentsExperimentKey:(NSString *)segmentsExperimentKey winnerSegmentsExperienceKey:(NSString *)winnerSegmentsExperienceKey status:(int)status error:(NSError **)error;
- (NSArray *)getSegmentsExperimentsWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getSegmentsExperimentsWithSegmentsExperienceId:(long long)segmentsExperienceId classNameId:(long long)classNameId classPK:(long long)classPK statuses:(NSArray *)statuses orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;

@end