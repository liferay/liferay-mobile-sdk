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
@interface LRCompanyService_v72 : LRBaseService

- (NSDictionary *)getCompanyByIdWithCompanyId:(long long)companyId error:(NSError **)error;
- (void)updatePreferencesWithCompanyId:(long long)companyId properties:(NSDictionary *)properties error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateCompanyWithCompanyId:(long long)companyId virtualHost:(NSString *)virtualHost mx:(NSString *)mx homeURL:(NSString *)homeURL logo:(BOOL)logo logoBytes:(NSData *)logoBytes name:(NSString *)name legalName:(NSString *)legalName legalId:(NSString *)legalId legalType:(NSString *)legalType sicCode:(NSString *)sicCode tickerSymbol:(NSString *)tickerSymbol industry:(NSString *)industry type:(NSString *)type size:(NSString *)size error:(NSError **)error;
- (NSDictionary *)updateCompanyWithCompanyId:(long long)companyId virtualHost:(NSString *)virtualHost mx:(NSString *)mx maxUsers:(int)maxUsers active:(BOOL)active error:(NSError **)error;
- (void)deleteLogoWithCompanyId:(long long)companyId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCompanies:(NSError **)error;
- (NSDictionary *)getCompanyByLogoIdWithLogoId:(long long)logoId error:(NSError **)error;
- (NSDictionary *)getCompanyByMxWithMx:(NSString *)mx error:(NSError **)error;
- (NSDictionary *)getCompanyByVirtualHostWithVirtualHost:(NSString *)virtualHost error:(NSError **)error;
- (NSDictionary *)getCompanyByWebIdWithWebId:(NSString *)webId error:(NSError **)error;
- (void)removePreferencesWithCompanyId:(long long)companyId keys:(NSArray *)keys error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)updateDisplayWithCompanyId:(long long)companyId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateLogoWithCompanyId:(long long)companyId bytes:(NSData *)bytes error:(NSError **)error;

@end