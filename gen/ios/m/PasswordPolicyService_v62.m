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
	NSDictionary *_params = @{
		@"passwordPolicyId": passwordPolicyId,
		@"name": name,
		@"description": description,
		@"changeable": changeable,
		@"changeRequired": changeRequired,
		@"minAge": minAge,
		@"checkSyntax": checkSyntax,
		@"allowDictionaryWords": allowDictionaryWords,
		@"minAlphanumeric": minAlphanumeric,
		@"minLength": minLength,
		@"minLowerCase": minLowerCase,
		@"minNumbers": minNumbers,
		@"minSymbols": minSymbols,
		@"minUpperCase": minUpperCase,
		@"regex": regex,
		@"history": history,
		@"historyCount": historyCount,
		@"expireable": expireable,
		@"maxAge": maxAge,
		@"warningTime": warningTime,
		@"graceLimit": graceLimit,
		@"lockout": lockout,
		@"maxFailure": maxFailure,
		@"lockoutDuration": lockoutDuration,
		@"resetFailureCount": resetFailureCount,
		@"resetTicketMaxAge": resetTicketMaxAge,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/passwordpolicy/update-password-policy": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addPasswordPolicy:(NSString *)name description:(NSString *)description changeable:(BOOL)changeable changeRequired:(BOOL)changeRequired minAge:(NSNumber *)minAge checkSyntax:(BOOL)checkSyntax allowDictionaryWords:(BOOL)allowDictionaryWords minAlphanumeric:(NSNumber *)minAlphanumeric minLength:(NSNumber *)minLength minLowerCase:(NSNumber *)minLowerCase minNumbers:(NSNumber *)minNumbers minSymbols:(NSNumber *)minSymbols minUpperCase:(NSNumber *)minUpperCase regex:(NSString *)regex history:(BOOL)history historyCount:(NSNumber *)historyCount expireable:(BOOL)expireable maxAge:(NSNumber *)maxAge warningTime:(NSNumber *)warningTime graceLimit:(NSNumber *)graceLimit lockout:(BOOL)lockout maxFailure:(NSNumber *)maxFailure lockoutDuration:(NSNumber *)lockoutDuration resetFailureCount:(NSNumber *)resetFailureCount resetTicketMaxAge:(NSNumber *)resetTicketMaxAge serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"name": name,
		@"description": description,
		@"changeable": changeable,
		@"changeRequired": changeRequired,
		@"minAge": minAge,
		@"checkSyntax": checkSyntax,
		@"allowDictionaryWords": allowDictionaryWords,
		@"minAlphanumeric": minAlphanumeric,
		@"minLength": minLength,
		@"minLowerCase": minLowerCase,
		@"minNumbers": minNumbers,
		@"minSymbols": minSymbols,
		@"minUpperCase": minUpperCase,
		@"regex": regex,
		@"history": history,
		@"historyCount": historyCount,
		@"expireable": expireable,
		@"maxAge": maxAge,
		@"warningTime": warningTime,
		@"graceLimit": graceLimit,
		@"lockout": lockout,
		@"maxFailure": maxFailure,
		@"lockoutDuration": lockoutDuration,
		@"resetFailureCount": resetFailureCount,
		@"resetTicketMaxAge": resetTicketMaxAge,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/passwordpolicy/add-password-policy": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deletePasswordPolicy:(NSNumber *)passwordPolicyId {
	NSDictionary *_params = @{
		@"passwordPolicyId": passwordPolicyId
	};

	NSDictionary *_command = @{@"/passwordpolicy/delete-password-policy": _params};

	[session invoke:_command];
}

@end