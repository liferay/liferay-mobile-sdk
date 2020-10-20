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

#import "LRCommercesubscriptionentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercesubscriptionentryService_v73

- (NSDictionary *)updateSubscriptionStatusWithCommerceSubscriptionEntryId:(long long)commerceSubscriptionEntryId subscriptionStatus:(int)subscriptionStatus error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceSubscriptionEntryId": @(commerceSubscriptionEntryId),
		@"subscriptionStatus": @(subscriptionStatus)
	}];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/update-subscription-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceSubscriptionEntryWithCommerceSubscriptionEntryId:(long long)commerceSubscriptionEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceSubscriptionEntryId": @(commerceSubscriptionEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/delete-commerce-subscription-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceSubscriptionEntryWithCommerceSubscriptionEntryId:(long long)commerceSubscriptionEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceSubscriptionEntryId": @(commerceSubscriptionEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/fetch-commerce-subscription-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceSubscriptionEntriesWithCompanyId:(long long)companyId groupId:(long long)groupId userId:(long long)userId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceSubscriptionEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/get-commerce-subscription-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceSubscriptionEntriesWithCompanyId:(long long)companyId userId:(long long)userId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceSubscriptionEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/get-commerce-subscription-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceSubscriptionEntriesCountWithCompanyId:(long long)companyId groupId:(long long)groupId userId:(long long)userId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"userId": @(userId)
	}];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/get-commerce-subscription-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceSubscriptionEntriesCountWithCompanyId:(long long)companyId userId:(long long)userId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"userId": @(userId)
	}];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/get-commerce-subscription-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommerceSubscriptionEntriesWithCompanyId:(long long)companyId groupIds:(NSArray *)groupIds maxSubscriptionCycles:(long long)maxSubscriptionCycles subscriptionStatus:(int)subscriptionStatus keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupIds": [self checkNull: groupIds],
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
		@"subscriptionStatus": @(subscriptionStatus),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/search-commerce-subscription-entries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommerceSubscriptionEntriesWithCompanyId:(long long)companyId maxSubscriptionCycles:(long long)maxSubscriptionCycles subscriptionStatus:(int)subscriptionStatus keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
		@"subscriptionStatus": @(subscriptionStatus),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/search-commerce-subscription-entries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceSubscriptionEntryWithCommerceSubscriptionEntryId:(long long)commerceSubscriptionEntryId subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles subscriptionStatus:(int)subscriptionStatus nextIterationDateMonth:(int)nextIterationDateMonth nextIterationDateDay:(int)nextIterationDateDay nextIterationDateYear:(int)nextIterationDateYear nextIterationDateHour:(int)nextIterationDateHour nextIterationDateMinute:(int)nextIterationDateMinute deliverySubscriptionLength:(int)deliverySubscriptionLength deliverySubscriptionType:(NSString *)deliverySubscriptionType deliverySubscriptionTypeSettingsUnicodeProperties:(NSDictionary *)deliverySubscriptionTypeSettingsUnicodeProperties deliveryMaxSubscriptionCycles:(long long)deliveryMaxSubscriptionCycles deliverySubscriptionStatus:(int)deliverySubscriptionStatus deliveryNextIterationDateMonth:(int)deliveryNextIterationDateMonth deliveryNextIterationDateDay:(int)deliveryNextIterationDateDay deliveryNextIterationDateYear:(int)deliveryNextIterationDateYear deliveryNextIterationDateHour:(int)deliveryNextIterationDateHour deliveryNextIterationDateMinute:(int)deliveryNextIterationDateMinute error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceSubscriptionEntryId": @(commerceSubscriptionEntryId),
		@"subscriptionLength": @(subscriptionLength),
		@"subscriptionType": [self checkNull: subscriptionType],
		@"subscriptionTypeSettingsUnicodeProperties": [self checkNull: subscriptionTypeSettingsUnicodeProperties],
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
		@"subscriptionStatus": @(subscriptionStatus),
		@"nextIterationDateMonth": @(nextIterationDateMonth),
		@"nextIterationDateDay": @(nextIterationDateDay),
		@"nextIterationDateYear": @(nextIterationDateYear),
		@"nextIterationDateHour": @(nextIterationDateHour),
		@"nextIterationDateMinute": @(nextIterationDateMinute),
		@"deliverySubscriptionLength": @(deliverySubscriptionLength),
		@"deliverySubscriptionType": [self checkNull: deliverySubscriptionType],
		@"deliverySubscriptionTypeSettingsUnicodeProperties": [self checkNull: deliverySubscriptionTypeSettingsUnicodeProperties],
		@"deliveryMaxSubscriptionCycles": @(deliveryMaxSubscriptionCycles),
		@"deliverySubscriptionStatus": @(deliverySubscriptionStatus),
		@"deliveryNextIterationDateMonth": @(deliveryNextIterationDateMonth),
		@"deliveryNextIterationDateDay": @(deliveryNextIterationDateDay),
		@"deliveryNextIterationDateYear": @(deliveryNextIterationDateYear),
		@"deliveryNextIterationDateHour": @(deliveryNextIterationDateHour),
		@"deliveryNextIterationDateMinute": @(deliveryNextIterationDateMinute)
	}];

	NSDictionary *_command = @{@"/commerce.commercesubscriptionentry/update-commerce-subscription-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end