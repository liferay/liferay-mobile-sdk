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

#import <Foundation/Foundation.h>
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface CompanyService_v62 : BaseService

- (void)updateDisplay:(long)companyId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId;
- (NSDictionary *)getCompanyByWebId:(NSString *)webId;
- (NSDictionary *)getCompanyByLogoId:(long)logoId;
- (NSDictionary *)getCompanyByVirtualHost:(NSString *)virtualHost;
- (NSDictionary *)updateLogo:(long)companyId bytes:(NSArray *)bytes;
- (NSDictionary *)getCompanyById:(long)companyId;
- (NSDictionary *)getCompanyByMx:(NSString *)mx;
- (void)deleteLogo:(long)companyId;
- (NSDictionary *)updateCompany:(long)companyId virtualHost:(NSString *)virtualHost mx:(NSString *)mx maxUsers:(int)maxUsers active:(BOOL)active;

@end