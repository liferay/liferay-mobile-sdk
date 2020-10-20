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
@interface LRCommercepriceentryService_v73 : LRBaseService

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommercePriceEntryWithCProductId:(long long)cProductId cpInstanceUuid:(NSString *)cpInstanceUuid commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommercePriceEntryWithCpInstanceId:(long long)cpInstanceId commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommercePriceEntryWithCpInstanceId:(long long)cpInstanceId commercePriceListId:(long long)commercePriceListId price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId error:(NSError **)error;
- (NSArray *)getCommercePriceEntriesWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommercePriceEntriesWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommercePriceEntriesByCompanyIdWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommercePriceEntriesCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error;
- (NSNumber *)getCommercePriceEntriesCountByCompanyIdWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSDictionary *)getInstanceBaseCommercePriceEntryWithCpInstanceUuid:(NSString *)cpInstanceUuid priceListType:(NSString *)priceListType error:(NSError **)error;
- (NSArray *)getInstanceCommercePriceEntriesWithCpInstanceId:(long long)cpInstanceId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getInstanceCommercePriceEntriesWithCpInstanceId:(long long)cpInstanceId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getInstanceCommercePriceEntriesCountWithCpInstanceId:(long long)cpInstanceId error:(NSError **)error;
- (NSDictionary *)searchCommercePriceEntriesWithCompanyId:(long long)companyId commercePriceListId:(long long)commercePriceListId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSNumber *)searchCommercePriceEntriesCountWithCompanyId:(long long)companyId commercePriceListId:(long long)commercePriceListId keywords:(NSString *)keywords error:(NSError **)error;
- (NSDictionary *)updateCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId price:(NSDictionary *)price discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 bulkPricing:(BOOL)bulkPricing displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId price:(NSDictionary *)price discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateExternalReferenceCodeWithCommercePriceEntry:(LRJSONObjectWrapper *)commercePriceEntry externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)upsertCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId cpInstanceId:(long long)cpInstanceId commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice skuExternalReferenceCode:(NSString *)skuExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId cProductId:(long long)cProductId cpInstanceUuid:(NSString *)cpInstanceUuid commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire skuExternalReferenceCode:(NSString *)skuExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId cProductId:(long long)cProductId cpInstanceUuid:(NSString *)cpInstanceUuid commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice skuExternalReferenceCode:(NSString *)skuExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId error:(NSError **)error;

@end