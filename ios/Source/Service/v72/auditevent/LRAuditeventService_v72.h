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
@interface LRAuditeventService_v72 : LRBaseService

- (NSArray *)getAuditEventsWithCompanyId:(long long)companyId userId:(long long)userId userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT eventType:(NSString *)eventType className:(NSString *)className classPK:(NSString *)classPK clientHost:(NSString *)clientHost clientIP:(NSString *)clientIP serverName:(NSString *)serverName serverPort:(int)serverPort sessionID:(NSString *)sessionID andSearch:(BOOL)andSearch start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getAuditEventsWithCompanyId:(long long)companyId userId:(long long)userId userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT eventType:(NSString *)eventType className:(NSString *)className classPK:(NSString *)classPK clientHost:(NSString *)clientHost clientIP:(NSString *)clientIP serverName:(NSString *)serverName serverPort:(int)serverPort sessionID:(NSString *)sessionID andSearch:(BOOL)andSearch start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getAuditEventsWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getAuditEventsWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getAuditEventsCountWithCompanyId:(long long)companyId userId:(long long)userId userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT eventType:(NSString *)eventType className:(NSString *)className classPK:(NSString *)classPK clientHost:(NSString *)clientHost clientIP:(NSString *)clientIP serverName:(NSString *)serverName serverPort:(int)serverPort sessionID:(NSString *)sessionID andSearch:(BOOL)andSearch error:(NSError **)error;
- (NSNumber *)getAuditEventsCountWithCompanyId:(long long)companyId error:(NSError **)error;

@end