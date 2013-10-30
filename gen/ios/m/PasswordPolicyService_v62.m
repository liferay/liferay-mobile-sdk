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

#import "PasswordPolicyService_v62.h"

/**
 * author Bruno Farache
 */
@implementation PasswordPolicyService_v62

- (NSDictionary *)updatePasswordPolicy:(NSNumber *)passwordPolicyId name:(NSString *)name description:(NSString *)description changeable:(BOOL)changeable changeRequired:(BOOL)changeRequired minAge:(NSNumber *)minAge checkSyntax:(BOOL)checkSyntax allowDictionaryWords:(BOOL)allowDictionaryWords minAlphanumeric:(NSNumber *)minAlphanumeric minLength:(NSNumber *)minLength minLowerCase:(NSNumber *)minLowerCase minNumbers:(NSNumber *)minNumbers minSymbols:(NSNumber *)minSymbols minUpperCase:(NSNumber *)minUpperCase regex:(NSString *)regex history:(BOOL)history historyCount:(NSNumber *)historyCount expireable:(BOOL)expireable maxAge:(NSNumber *)maxAge warningTime:(NSNumber *)warningTime graceLimit:(NSNumber *)graceLimit lockout:(BOOL)lockout maxFailure:(NSNumber *)maxFailure lockoutDuration:(NSNumber *)lockoutDuration resetFailureCount:(NSNumber *)resetFailureCount resetTicketMaxAge:(NSNumber *)resetTicketMaxAge serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)addPasswordPolicy:(NSString *)name description:(NSString *)description changeable:(BOOL)changeable changeRequired:(BOOL)changeRequired minAge:(NSNumber *)minAge checkSyntax:(BOOL)checkSyntax allowDictionaryWords:(BOOL)allowDictionaryWords minAlphanumeric:(NSNumber *)minAlphanumeric minLength:(NSNumber *)minLength minLowerCase:(NSNumber *)minLowerCase minNumbers:(NSNumber *)minNumbers minSymbols:(NSNumber *)minSymbols minUpperCase:(NSNumber *)minUpperCase regex:(NSString *)regex history:(BOOL)history historyCount:(NSNumber *)historyCount expireable:(BOOL)expireable maxAge:(NSNumber *)maxAge warningTime:(NSNumber *)warningTime graceLimit:(NSNumber *)graceLimit lockout:(BOOL)lockout maxFailure:(NSNumber *)maxFailure lockoutDuration:(NSNumber *)lockoutDuration resetFailureCount:(NSNumber *)resetFailureCount resetTicketMaxAge:(NSNumber *)resetTicketMaxAge serviceContext:(NSDictionary *)serviceContext {
}

- (void)deletePasswordPolicy:(NSNumber *)passwordPolicyId {
}

@end