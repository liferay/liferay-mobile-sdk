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
@interface LRPasswordPolicyService_v71 : LRBaseService

- (NSArray *)searchWithCompanyId:(long long)companyId name:(NSString *)name start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSDictionary *)fetchPasswordPolicyWithPasswordPolicyId:(long long)passwordPolicyId error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long long)companyId name:(NSString *)name error:(NSError **)error;
- (void)deletePasswordPolicyWithPasswordPolicyId:(long long)passwordPolicyId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addPasswordPolicyWithName:(NSString *)name description:(NSString *)description changeable:(BOOL)changeable changeRequired:(BOOL)changeRequired minAge:(long long)minAge checkSyntax:(BOOL)checkSyntax allowDictionaryWords:(BOOL)allowDictionaryWords minAlphanumeric:(int)minAlphanumeric minLength:(int)minLength minLowerCase:(int)minLowerCase minNumbers:(int)minNumbers minSymbols:(int)minSymbols minUpperCase:(int)minUpperCase regex:(NSString *)regex history:(BOOL)history historyCount:(int)historyCount expireable:(BOOL)expireable maxAge:(long long)maxAge warningTime:(long long)warningTime graceLimit:(int)graceLimit lockout:(BOOL)lockout maxFailure:(int)maxFailure lockoutDuration:(long long)lockoutDuration resetFailureCount:(long long)resetFailureCount resetTicketMaxAge:(long long)resetTicketMaxAge serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updatePasswordPolicyWithPasswordPolicyId:(long long)passwordPolicyId name:(NSString *)name description:(NSString *)description changeable:(BOOL)changeable changeRequired:(BOOL)changeRequired minAge:(long long)minAge checkSyntax:(BOOL)checkSyntax allowDictionaryWords:(BOOL)allowDictionaryWords minAlphanumeric:(int)minAlphanumeric minLength:(int)minLength minLowerCase:(int)minLowerCase minNumbers:(int)minNumbers minSymbols:(int)minSymbols minUpperCase:(int)minUpperCase regex:(NSString *)regex history:(BOOL)history historyCount:(int)historyCount expireable:(BOOL)expireable maxAge:(long long)maxAge warningTime:(long long)warningTime graceLimit:(int)graceLimit lockout:(BOOL)lockout maxFailure:(int)maxFailure lockoutDuration:(long long)lockoutDuration resetFailureCount:(long long)resetFailureCount resetTicketMaxAge:(long long)resetTicketMaxAge serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end