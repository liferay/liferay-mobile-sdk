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

#import "LRLayoutpagetemplatestructureService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRLayoutpagetemplatestructureService_v73

- (NSDictionary *)updateLayoutPageTemplateStructureWithGroupId:(long long)groupId classNameId:(long long)classNameId classPK:(long long)classPK segmentsExperienceId:(long long)segmentsExperienceId data:(NSString *)data error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"segmentsExperienceId": @(segmentsExperienceId),
		@"data": [self checkNull: data]
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatestructure/update-layout-page-template-structure": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateLayoutPageTemplateStructureDataWithGroupId:(long long)groupId plid:(long long)plid segmentsExperienceId:(long long)segmentsExperienceId data:(NSString *)data error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"plid": @(plid),
		@"segmentsExperienceId": @(segmentsExperienceId),
		@"data": [self checkNull: data]
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatestructure/update-layout-page-template-structure-data": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end