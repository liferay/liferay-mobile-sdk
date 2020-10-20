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

#import "LRAuditeventService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRAuditeventService_v73

- (NSNumber *)getAuditEventsCountWithCompanyId:(long long)companyId userId:(long long)userId userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT eventType:(NSString *)eventType className:(NSString *)className classPK:(NSString *)classPK clientHost:(NSString *)clientHost clientIP:(NSString *)clientIP serverName:(NSString *)serverName serverPort:(int)serverPort sessionID:(NSString *)sessionID andSearch:(BOOL)andSearch error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"userName": [self checkNull: userName],
		@"createDateGT": @(createDateGT),
		@"createDateLT": @(createDateLT),
		@"eventType": [self checkNull: eventType],
		@"className": [self checkNull: className],
		@"classPK": [self checkNull: classPK],
		@"clientHost": [self checkNull: clientHost],
		@"clientIP": [self checkNull: clientIP],
		@"serverName": [self checkNull: serverName],
		@"serverPort": @(serverPort),
		@"sessionID": [self checkNull: sessionID],
		@"andSearch": @(andSearch)
	}];

	NSDictionary *_command = @{@"/audit.auditevent/get-audit-events-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getAuditEventsCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/audit.auditevent/get-audit-events-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getAuditEventsWithCompanyId:(long long)companyId userId:(long long)userId userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT eventType:(NSString *)eventType className:(NSString *)className classPK:(NSString *)classPK clientHost:(NSString *)clientHost clientIP:(NSString *)clientIP serverName:(NSString *)serverName serverPort:(int)serverPort sessionID:(NSString *)sessionID andSearch:(BOOL)andSearch start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"userName": [self checkNull: userName],
		@"createDateGT": @(createDateGT),
		@"createDateLT": @(createDateLT),
		@"eventType": [self checkNull: eventType],
		@"className": [self checkNull: className],
		@"classPK": [self checkNull: classPK],
		@"clientHost": [self checkNull: clientHost],
		@"clientIP": [self checkNull: clientIP],
		@"serverName": [self checkNull: serverName],
		@"serverPort": @(serverPort),
		@"sessionID": [self checkNull: sessionID],
		@"andSearch": @(andSearch),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/audit.auditevent/get-audit-events": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getAuditEventsWithCompanyId:(long long)companyId userId:(long long)userId userName:(NSString *)userName createDateGT:(long long)createDateGT createDateLT:(long long)createDateLT eventType:(NSString *)eventType className:(NSString *)className classPK:(NSString *)classPK clientHost:(NSString *)clientHost clientIP:(NSString *)clientIP serverName:(NSString *)serverName serverPort:(int)serverPort sessionID:(NSString *)sessionID andSearch:(BOOL)andSearch start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"userName": [self checkNull: userName],
		@"createDateGT": @(createDateGT),
		@"createDateLT": @(createDateLT),
		@"eventType": [self checkNull: eventType],
		@"className": [self checkNull: className],
		@"classPK": [self checkNull: classPK],
		@"clientHost": [self checkNull: clientHost],
		@"clientIP": [self checkNull: clientIP],
		@"serverName": [self checkNull: serverName],
		@"serverPort": @(serverPort),
		@"sessionID": [self checkNull: sessionID],
		@"andSearch": @(andSearch),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.security.audit.storage.model.AuditEvent>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/audit.auditevent/get-audit-events": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getAuditEventsWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.security.audit.storage.model.AuditEvent>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/audit.auditevent/get-audit-events": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getAuditEventsWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/audit.auditevent/get-audit-events": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end