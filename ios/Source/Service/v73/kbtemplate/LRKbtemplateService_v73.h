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
@interface LRKbtemplateService_v73 : LRBaseService

- (NSDictionary *)addKbTemplateWithPortletId:(NSString *)portletId title:(NSString *)title content:(NSString *)content serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateKbTemplateWithKbTemplateId:(long long)kbTemplateId title:(NSString *)title content:(NSString *)content serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getGroupKbTemplatesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getGroupKbTemplatesCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSDictionary *)deleteKbTemplateWithKbTemplateId:(long long)kbTemplateId error:(NSError **)error;
- (void)deleteKbTemplatesWithGroupId:(long long)groupId kbTemplateIds:(NSArray *)kbTemplateIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)getKbTemplateSearchDisplayWithGroupId:(long long)groupId title:(NSString *)title content:(NSString *)content startDate:(long long)startDate endDate:(long long)endDate andOperator:(BOOL)andOperator curStartValues:(NSArray *)curStartValues cur:(int)cur delta:(int)delta orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)getKbTemplateWithKbTemplateId:(long long)kbTemplateId error:(NSError **)error;

@end