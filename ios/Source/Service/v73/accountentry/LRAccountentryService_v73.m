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

#import "LRAccountentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRAccountentryService_v73

- (NSDictionary *)addAccountEntryWithUserId:(long long)userId parentAccountEntryId:(long long)parentAccountEntryId name:(NSString *)name description:(NSString *)description domains:(NSArray *)domains logoBytes:(NSData *)logoBytes taxIdNumber:(NSString *)taxIdNumber type:(NSString *)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"parentAccountEntryId": @(parentAccountEntryId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"domains": [self checkNull: domains],
		@"logoBytes": [self toString:logoBytes],
		@"taxIdNumber": [self checkNull: taxIdNumber],
		@"type": [self checkNull: type],
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/account.accountentry/add-account-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addAccountEntryWithUserId:(long long)userId parentAccountEntryId:(long long)parentAccountEntryId name:(NSString *)name description:(NSString *)description domains:(NSArray *)domains logoBytes:(NSData *)logoBytes status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"parentAccountEntryId": @(parentAccountEntryId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"domains": [self checkNull: domains],
		@"logoBytes": [self toString:logoBytes],
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/account.accountentry/add-account-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addAccountEntryWithUserId:(long long)userId parentAccountEntryId:(long long)parentAccountEntryId name:(NSString *)name description:(NSString *)description domains:(NSArray *)domains logoBytes:(NSData *)logoBytes status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"parentAccountEntryId": @(parentAccountEntryId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"domains": [self checkNull: domains],
		@"logoBytes": [self toString:logoBytes],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/account.accountentry/add-account-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getAccountEntriesWithCompanyId:(long long)companyId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.account.model.AccountEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/account.accountentry/get-account-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchWithKeywords:(NSString *)keywords params:(NSDictionary *)params cur:(int)cur delta:(int)delta orderByField:(NSString *)orderByField reverse:(BOOL)reverse error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"keywords": [self checkNull: keywords],
		@"params": [self checkNull: params],
		@"cur": @(cur),
		@"delta": @(delta),
		@"orderByField": [self checkNull: orderByField],
		@"reverse": @(reverse)
	}];

	NSDictionary *_command = @{@"/account.accountentry/search": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end