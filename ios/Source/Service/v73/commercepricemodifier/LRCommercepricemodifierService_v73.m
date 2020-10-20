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

#import "LRCommercepricemodifierService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercepricemodifierService_v73

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommercePriceModifierWithUserId:(long long)userId groupId:(long long)groupId title:(NSString *)title target:(NSString *)target commercePriceListId:(long long)commercePriceListId modifierType:(NSString *)modifierType modifierAmount:(NSDictionary *)modifierAmount priority:(double)priority active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"commercePriceListId": @(commercePriceListId),
		@"modifierType": [self checkNull: modifierType],
		@"modifierAmount": [self checkNull: modifierAmount],
		@"priority": @(priority),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/add-commerce-price-modifier": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommercePriceModifierWithCommercePriceModifierId:(long long)commercePriceModifierId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/get-commerce-price-modifier": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteCommercePriceModifierWithCommercePriceModifierId:(long long)commercePriceModifierId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/delete-commerce-price-modifier": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommercePriceModifierWithCommercePriceModifierId:(long long)commercePriceModifierId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/fetch-commerce-price-modifier": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceModifiersWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.pricing.model.CommercePriceModifier>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/get-commerce-price-modifiers": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceModifiersWithCompanyId:(long long)companyId target:(NSString *)target error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"target": [self checkNull: target]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/get-commerce-price-modifiers": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceModifiersCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/get-commerce-price-modifiers-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceModifiersCount:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/get-commerce-price-modifiers-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommercePriceModifierWithCommercePriceModifierId:(long long)commercePriceModifierId groupId:(long long)groupId title:(NSString *)title target:(NSString *)target commercePriceListId:(long long)commercePriceListId modifierType:(NSString *)modifierType modifierAmount:(NSDictionary *)modifierAmount priority:(double)priority active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"groupId": @(groupId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"commercePriceListId": @(commercePriceListId),
		@"modifierType": [self checkNull: modifierType],
		@"modifierAmount": [self checkNull: modifierAmount],
		@"priority": @(priority),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/update-commerce-price-modifier": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommercePriceModifierWithUserId:(long long)userId commercePriceModifierId:(long long)commercePriceModifierId groupId:(long long)groupId title:(NSString *)title target:(NSString *)target commercePriceListId:(long long)commercePriceListId modifierType:(NSString *)modifierType modifierAmount:(NSDictionary *)modifierAmount priority:(double)priority active:(BOOL)active displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute externalReferenceCode:(NSString *)externalReferenceCode neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"groupId": @(groupId),
		@"title": [self checkNull: title],
		@"target": [self checkNull: target],
		@"commercePriceListId": @(commercePriceListId),
		@"modifierType": [self checkNull: modifierType],
		@"modifierAmount": [self checkNull: modifierAmount],
		@"priority": @(priority),
		@"active": @(active),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/upsert-commerce-price-modifier": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommercePriceModifiersWithCompanyId:(long long)companyId keywords:(NSString *)keywords status:(int)status start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commercepricemodifier/search-commerce-price-modifiers": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end