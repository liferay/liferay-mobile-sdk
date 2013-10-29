/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

/**
 * author: Bruno Farache
 */
@interface CompanyService_v62 : NSObject

- (void)updateDisplay:(NSNumber *)companyId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId;
- (NSDictionary *)getCompanyByWebId:(NSString *)webId;
- (NSDictionary *)getCompanyByLogoId:(NSNumber *)logoId;
- (NSDictionary *)getCompanyByVirtualHost:(NSString *)virtualHost;
- (NSDictionary *)updateLogo:(NSNumber *)companyId bytes:(NSArray *)bytes;
- (NSDictionary *)getCompanyById:(NSNumber *)companyId;
- (NSDictionary *)getCompanyByMx:(NSString *)mx;
- (void)deleteLogo:(NSNumber *)companyId;
- (NSDictionary *)updateCompany:(NSNumber *)companyId virtualHost:(NSString *)virtualHost mx:(NSString *)mx maxUsers:(NSNumber *)maxUsers active:(BOOL)active;

@end