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
@interface LRCommercecatalogService_v73 : LRBaseService

- (NSDictionary *)getCommerceCatalogWithCommerceCatalogId:(long long)commerceCatalogId error:(NSError **)error;
- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommerceCatalogWithName:(NSString *)name commerceCurrencyCode:(NSString *)commerceCurrencyCode catalogDefaultLanguageId:(NSString *)catalogDefaultLanguageId externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteCommerceCatalogWithCommerceCatalogId:(long long)commerceCatalogId error:(NSError **)error;
- (NSDictionary *)fetchCommerceCatalogWithCommerceCatalogId:(long long)commerceCatalogId error:(NSError **)error;
- (NSDictionary *)fetchCommerceCatalogByGroupIdWithGroupId:(long long)groupId error:(NSError **)error;
- (NSArray *)getCommerceCatalogsWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)searchCommerceCatalogsWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSNumber *)searchCommerceCatalogsCountWithCompanyId:(long long)companyId keywords:(NSString *)keywords error:(NSError **)error;
- (NSDictionary *)updateCommerceCatalogWithCommerceCatalogId:(long long)commerceCatalogId name:(NSString *)name commerceCurrencyCode:(NSString *)commerceCurrencyCode catalogDefaultLanguageId:(NSString *)catalogDefaultLanguageId error:(NSError **)error;
- (NSDictionary *)updateCommerceCatalogExternalReferenceCodeWithCommerceCatalogId:(long long)commerceCatalogId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;

@end