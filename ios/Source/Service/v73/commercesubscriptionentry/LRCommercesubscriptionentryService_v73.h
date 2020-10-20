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
@interface LRCommercesubscriptionentryService_v73 : LRBaseService

- (NSDictionary *)updateSubscriptionStatusWithCommerceSubscriptionEntryId:(long long)commerceSubscriptionEntryId subscriptionStatus:(int)subscriptionStatus error:(NSError **)error;
- (void)deleteCommerceSubscriptionEntryWithCommerceSubscriptionEntryId:(long long)commerceSubscriptionEntryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceSubscriptionEntryWithCommerceSubscriptionEntryId:(long long)commerceSubscriptionEntryId error:(NSError **)error;
- (NSArray *)getCommerceSubscriptionEntriesWithCompanyId:(long long)companyId groupId:(long long)groupId userId:(long long)userId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceSubscriptionEntriesWithCompanyId:(long long)companyId userId:(long long)userId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceSubscriptionEntriesCountWithCompanyId:(long long)companyId groupId:(long long)groupId userId:(long long)userId error:(NSError **)error;
- (NSNumber *)getCommerceSubscriptionEntriesCountWithCompanyId:(long long)companyId userId:(long long)userId error:(NSError **)error;
- (NSDictionary *)searchCommerceSubscriptionEntriesWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds maxSubscriptionCycles:(long long)maxSubscriptionCycles subscriptionStatus:(int)subscriptionStatus keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)searchCommerceSubscriptionEntriesWithCompanyId:(long long)companyId maxSubscriptionCycles:(long long)maxSubscriptionCycles subscriptionStatus:(int)subscriptionStatus keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)updateCommerceSubscriptionEntryWithCommerceSubscriptionEntryId:(long long)commerceSubscriptionEntryId subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles subscriptionStatus:(int)subscriptionStatus nextIterationDateMonth:(int)nextIterationDateMonth nextIterationDateDay:(int)nextIterationDateDay nextIterationDateYear:(int)nextIterationDateYear nextIterationDateHour:(int)nextIterationDateHour nextIterationDateMinute:(int)nextIterationDateMinute deliverySubscriptionLength:(int)deliverySubscriptionLength deliverySubscriptionType:(NSString *)deliverySubscriptionType deliverySubscriptionTypeSettingsUnicodeProperties:(NSDictionary *)deliverySubscriptionTypeSettingsUnicodeProperties deliveryMaxSubscriptionCycles:(long long)deliveryMaxSubscriptionCycles deliverySubscriptionStatus:(int)deliverySubscriptionStatus deliveryNextIterationDateMonth:(int)deliveryNextIterationDateMonth deliveryNextIterationDateDay:(int)deliveryNextIterationDateDay deliveryNextIterationDateYear:(int)deliveryNextIterationDateYear deliveryNextIterationDateHour:(int)deliveryNextIterationDateHour deliveryNextIterationDateMinute:(int)deliveryNextIterationDateMinute error:(NSError **)error;

@end