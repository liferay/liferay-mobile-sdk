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
@interface LRCommercecurrencyService_v73 : LRBaseService

- (NSDictionary *)setActiveWithCommerceCurrencyId:(long long)commerceCurrencyId active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)getCommerceCurrencyWithCompanyId:(long long)companyId code:(NSString *)code error:(NSError **)error;
- (NSDictionary *)getCommerceCurrencyWithCommerceCurrencyId:(long long)commerceCurrencyId error:(NSError **)error;
- (NSDictionary *)addCommerceCurrencyWithUserId:(long long)userId code:(NSString *)code nameMap:(NSDictionary *)nameMap symbol:(NSString *)symbol rate:(NSDictionary *)rate formatPatternMap:(NSDictionary *)formatPatternMap maxFractionDigits:(int)maxFractionDigits minFractionDigits:(int)minFractionDigits roundingMode:(NSString *)roundingMode primary:(BOOL)primary priority:(double)priority active:(BOOL)active error:(NSError **)error;
- (void)deleteCommerceCurrencyWithCommerceCurrencyId:(long long)commerceCurrencyId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchPrimaryCommerceCurrencyWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSArray *)getCommerceCurrenciesWithCompanyId:(long long)companyId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceCurrenciesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceCurrenciesCountWithCompanyId:(long long)companyId active:(BOOL)active error:(NSError **)error;
- (NSNumber *)getCommerceCurrenciesCountWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSDictionary *)updateCommerceCurrencyWithCommerceCurrencyId:(long long)commerceCurrencyId code:(NSString *)code nameMap:(NSDictionary *)nameMap symbol:(NSString *)symbol rate:(NSDictionary *)rate formatPatternMap:(NSDictionary *)formatPatternMap maxFractionDigits:(int)maxFractionDigits minFractionDigits:(int)minFractionDigits roundingMode:(NSString *)roundingMode primary:(BOOL)primary priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)updateExchangeRateWithCommerceCurrencyId:(long long)commerceCurrencyId exchangeRateProviderKey:(NSString *)exchangeRateProviderKey error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)updateExchangeRates:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)setPrimaryWithCommerceCurrencyId:(long long)commerceCurrencyId primary:(BOOL)primary error:(NSError **)error;

@end