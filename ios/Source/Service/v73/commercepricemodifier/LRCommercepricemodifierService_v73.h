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
@interface LRCommercepricemodifierService_v73 : LRBaseService

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommercePriceModifierWithUserId:(long long)userId groupId:(long long)groupId title:(NSString *)title target:(NSString *)target commercePriceListId:(long long)commercePriceListId modifierType:(NSString *)modifierType modifierAmount:(NSDictionary *)modifierAmount priority:(double)priority active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCommercePriceModifierWithCommercePriceModifierId:(long long)commercePriceModifierId error:(NSError **)error;
- (NSDictionary *)deleteCommercePriceModifierWithCommercePriceModifierId:(long long)commercePriceModifierId error:(NSError **)error;
- (NSDictionary *)fetchCommercePriceModifierWithCommercePriceModifierId:(long long)commercePriceModifierId error:(NSError **)error;
- (NSArray *)getCommercePriceModifiersWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommercePriceModifiersWithCompanyId:(long long)companyId target:(NSString *)target error:(NSError **)error;
- (NSNumber *)getCommercePriceModifiersCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error;
- (NSNumber *)getCommercePriceModifiersCount:(NSError **)error;
- (NSDictionary *)updateCommercePriceModifierWithCommercePriceModifierId:(long long)commercePriceModifierId groupId:(long long)groupId title:(NSString *)title target:(NSString *)target commercePriceListId:(long long)commercePriceListId modifierType:(NSString *)modifierType modifierAmount:(NSDictionary *)modifierAmount priority:(double)priority active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCommercePriceModifierWithUserId:(long long)userId commercePriceModifierId:(long long)commercePriceModifierId groupId:(long long)groupId title:(NSString *)title target:(NSString *)target commercePriceListId:(long long)commercePriceListId modifierType:(NSString *)modifierType modifierAmount:(NSDictionary *)modifierAmount priority:(double)priority active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute externalReferenceCode:(NSString *)externalReferenceCode neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)searchCommercePriceModifiersWithCompanyId:(long long)companyId keywords:(NSString *)keywords status:(int)status start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;

@end