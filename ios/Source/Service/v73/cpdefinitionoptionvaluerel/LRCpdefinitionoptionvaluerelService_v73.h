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
@interface LRCpdefinitionoptionvaluerelService_v73 : LRBaseService

- (NSArray *)getCpDefinitionOptionValueRelsWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCpDefinitionOptionValueRelsWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCpDefinitionOptionValueRelsWithGroupId:(long long)groupId key:(NSString *)key start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)fetchCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId error:(NSError **)error;
- (NSDictionary *)fetchCpDefinitionOptionValueRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId key:(NSString *)key error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key cpInstanceId:(long long)cpInstanceId quantity:(int)quantity price:(NSDictionary *)price serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key cpInstanceId:(long long)cpInstanceId quantity:(int)quantity preselected:(BOOL)preselected price:(NSDictionary *)price serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCpDefinitionOptionValueRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId error:(NSError **)error;
- (NSNumber *)getCpDefinitionOptionValueRelsCountWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId error:(NSError **)error;
- (NSDictionary *)resetCpInstanceCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId error:(NSError **)error;
- (NSDictionary *)searchCpDefinitionOptionValueRelsWithCompanyId:(long long)companyId groupId:(long long)groupId cpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionOptionValueRelPreselectedWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId preselected:(BOOL)preselected error:(NSError **)error;
- (NSDictionary *)getCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId error:(NSError **)error;

@end