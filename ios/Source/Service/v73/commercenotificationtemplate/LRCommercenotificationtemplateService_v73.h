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
@interface LRCommercenotificationtemplateService_v73 : LRBaseService

- (NSDictionary *)getCommerceNotificationTemplateWithCommerceNotificationTemplateId:(long long)commerceNotificationTemplateId error:(NSError **)error;
- (NSDictionary *)addCommerceNotificationTemplateWithName:(NSString *)name description:(NSString *)description from:(NSString *)from fromNameMap:(NSDictionary *)fromNameMap to:(NSString *)to cc:(NSString *)cc bcc:(NSString *)bcc type:(NSString *)type enabled:(BOOL)enabled subjectMap:(NSDictionary *)subjectMap bodyMap:(NSDictionary *)bodyMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceNotificationTemplateWithUserId:(long long)userId groupId:(long long)groupId name:(NSString *)name description:(NSString *)description from:(NSString *)from fromNameMap:(NSDictionary *)fromNameMap to:(NSString *)to cc:(NSString *)cc bcc:(NSString *)bcc type:(NSString *)type enabled:(BOOL)enabled subjectMap:(NSDictionary *)subjectMap bodyMap:(NSDictionary *)bodyMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceNotificationTemplateWithCommerceNotificationTemplateId:(long long)commerceNotificationTemplateId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCommerceNotificationTemplatesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceNotificationTemplatesWithGroupId:(long long)groupId enabled:(BOOL)enabled start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceNotificationTemplatesCountWithGroupId:(long long)groupId enabled:(BOOL)enabled error:(NSError **)error;
- (NSNumber *)getCommerceNotificationTemplatesCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSDictionary *)updateCommerceNotificationTemplateWithCommerceNotificationTemplateId:(long long)commerceNotificationTemplateId name:(NSString *)name description:(NSString *)description from:(NSString *)from fromNameMap:(NSDictionary *)fromNameMap to:(NSString *)to cc:(NSString *)cc bcc:(NSString *)bcc type:(NSString *)type enabled:(BOOL)enabled subjectMap:(NSDictionary *)subjectMap bodyMap:(NSDictionary *)bodyMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end