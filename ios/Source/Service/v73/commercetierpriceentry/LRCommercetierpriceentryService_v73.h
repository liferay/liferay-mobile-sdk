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
@interface LRCommercetierpriceentryService_v73 : LRBaseService

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)getCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId error:(NSError **)error;
- (NSDictionary *)updateExternalReferenceCodeWithCommerceTierPriceEntry:(LRJSONObjectWrapper *)commerceTierPriceEntry externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommerceTierPriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice minQuantity:(int)minQuantity serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceTierPriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice minQuantity:(int)minQuantity serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceTierPriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price minQuantity:(int)minQuantity bulkPricing:(BOOL)bulkPricing discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)fetchCommerceTierPriceEntriesWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceTierPriceEntriesWithCommercePriceEntryId:(long long)commercePriceEntryId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceTierPriceEntriesWithCommercePriceEntryId:(long long)commercePriceEntryId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceTierPriceEntriesCountWithCommercePriceEntryId:(long long)commercePriceEntryId error:(NSError **)error;
- (NSNumber *)getCommerceTierPriceEntriesCountByCompanyIdWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSDictionary *)searchCommerceTierPriceEntriesWithCompanyId:(long long)companyId commercePriceEntryId:(long long)commercePriceEntryId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSNumber *)searchCommerceTierPriceEntriesCountWithCompanyId:(long long)companyId commercePriceEntryId:(long long)commercePriceEntryId keywords:(NSString *)keywords error:(NSError **)error;
- (NSDictionary *)updateCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice minQuantity:(int)minQuantity serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId price:(NSDictionary *)price minQuantity:(int)minQuantity bulkPricing:(BOOL)bulkPricing discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId commercePriceEntryId:(long long)commercePriceEntryId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice minQuantity:(int)minQuantity priceEntryExternalReferenceCode:(NSString *)priceEntryExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId commercePriceEntryId:(long long)commercePriceEntryId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price minQuantity:(int)minQuantity bulkPricing:(BOOL)bulkPricing discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire priceEntryExternalReferenceCode:(NSString *)priceEntryExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId error:(NSError **)error;

@end