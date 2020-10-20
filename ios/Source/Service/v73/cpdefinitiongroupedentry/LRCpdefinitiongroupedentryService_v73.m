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

#import "LRCpdefinitiongroupedentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdefinitiongroupedentryService_v73

- (void)addCpDefinitionGroupedEntriesWithCpDefinitionId:(long long)cpDefinitionId entryCPDefinitionIds:(NSArray *)entryCPDefinitionIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"entryCPDefinitionIds": [self checkNull: entryCPDefinitionIds],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitiongroupedentry/add-cp-definition-grouped-entries": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionGroupedEntriesWithCpDefinitionId:(long long)cpDefinitionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.type.grouped.model.CPDefinitionGroupedEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpdefinitiongroupedentry/get-cp-definition-grouped-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionGroupedEntriesCountWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitiongroupedentry/get-cp-definition-grouped-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionGroupedEntryWithCpDefinitionGroupedEntryId:(long long)cpDefinitionGroupedEntryId priority:(double)priority quantity:(int)quantity error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionGroupedEntryId": @(cpDefinitionGroupedEntryId),
		@"priority": @(priority),
		@"quantity": @(quantity)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitiongroupedentry/update-cp-definition-grouped-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteCpDefinitionGroupedEntryWithCpDefinitionGroupedEntryId:(long long)cpDefinitionGroupedEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionGroupedEntryId": @(cpDefinitionGroupedEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitiongroupedentry/delete-cp-definition-grouped-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpDefinitionGroupedEntryWithCpDefinitionGroupedEntryId:(long long)cpDefinitionGroupedEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionGroupedEntryId": @(cpDefinitionGroupedEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitiongroupedentry/get-cp-definition-grouped-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end