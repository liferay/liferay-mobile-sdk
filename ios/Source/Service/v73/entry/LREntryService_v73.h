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
@interface LREntryService_v73 : LRBaseService

- (NSNumber *)getEntriesCountWithGroupId:(long long)groupId definitionName:(NSString *)definitionName userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT andSearch:(BOOL)andSearch error:(NSError **)error;
- (void)deleteAttachmentWithCompanyId:(long long)companyId entryId:(long long)entryId fileName:(NSString *)fileName error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)sendEmailsWithEntryId:(long long)entryId fileName:(NSString *)fileName emailAddresses:(NSArray *)emailAddresses notification:(BOOL)notification error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unscheduleEntryWithEntryId:(long long)entryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addEntryWithGroupId:(long long)groupId definitionId:(long long)definitionId format:(NSString *)format schedulerRequest:(BOOL)schedulerRequest startDate:(long long)startDate endDate:(long long)endDate repeating:(BOOL)repeating recurrence:(NSString *)recurrence emailNotifications:(NSString *)emailNotifications emailDelivery:(NSString *)emailDelivery portletId:(NSString *)portletId pageURL:(NSString *)pageURL reportName:(NSString *)reportName reportParameters:(NSString *)reportParameters serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getEntriesWithGroupId:(long long)groupId definitionName:(NSString *)definitionName userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT andSearch:(BOOL)andSearch start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)deleteEntryWithEntryId:(long long)entryId error:(NSError **)error;

@end