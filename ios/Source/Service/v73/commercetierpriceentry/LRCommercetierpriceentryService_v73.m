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

#import "LRCommercetierpriceentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercetierpriceentryService_v73

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTierPriceEntryId": @(commerceTierPriceEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/get-commerce-tier-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateExternalReferenceCodeWithCommerceTierPriceEntry:(LRJSONObjectWrapper *)commerceTierPriceEntry externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	[self mangleWrapperWithParams:_params name:@"commerceTierPriceEntry" className:@"com.liferay.commerce.price.list.model.CommerceTierPriceEntry" wrapper:commerceTierPriceEntry];
	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/update-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceTierPriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice minQuantity:(int)minQuantity serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
		@"minQuantity": @(minQuantity),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/add-commerce-tier-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceTierPriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice minQuantity:(int)minQuantity serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
		@"minQuantity": @(minQuantity),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/add-commerce-tier-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceTierPriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price minQuantity:(int)minQuantity bulkPricing:(BOOL)bulkPricing discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"price": [self checkNull: price],
		@"minQuantity": @(minQuantity),
		@"bulkPricing": @(bulkPricing),
		@"discountDiscovery": @(discountDiscovery),
		@"discountLevel1": [self checkNull: discountLevel1],
		@"discountLevel2": [self checkNull: discountLevel2],
		@"discountLevel3": [self checkNull: discountLevel3],
		@"discountLevel4": [self checkNull: discountLevel4],
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

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/add-commerce-tier-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTierPriceEntryId": @(commerceTierPriceEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/delete-commerce-tier-price-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)fetchCommerceTierPriceEntriesWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/fetch-commerce-tier-price-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceTierPriceEntriesWithCommercePriceEntryId:(long long)commercePriceEntryId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/get-commerce-tier-price-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceTierPriceEntriesWithCommercePriceEntryId:(long long)commercePriceEntryId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommerceTierPriceEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/get-commerce-tier-price-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceTierPriceEntriesCountWithCommercePriceEntryId:(long long)commercePriceEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/get-commerce-tier-price-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceTierPriceEntriesCountByCompanyIdWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/get-commerce-tier-price-entries-count-by-company-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommerceTierPriceEntriesWithCompanyId:(long long)companyId commercePriceEntryId:(long long)commercePriceEntryId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/search-commerce-tier-price-entries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCommerceTierPriceEntriesCountWithCompanyId:(long long)companyId commercePriceEntryId:(long long)commercePriceEntryId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/search-commerce-tier-price-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice minQuantity:(int)minQuantity serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTierPriceEntryId": @(commerceTierPriceEntryId),
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
		@"minQuantity": @(minQuantity),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/update-commerce-tier-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId price:(NSDictionary *)price minQuantity:(int)minQuantity bulkPricing:(BOOL)bulkPricing discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTierPriceEntryId": @(commerceTierPriceEntryId),
		@"price": [self checkNull: price],
		@"minQuantity": @(minQuantity),
		@"bulkPricing": @(bulkPricing),
		@"discountDiscovery": @(discountDiscovery),
		@"discountLevel1": [self checkNull: discountLevel1],
		@"discountLevel2": [self checkNull: discountLevel2],
		@"discountLevel3": [self checkNull: discountLevel3],
		@"discountLevel4": [self checkNull: discountLevel4],
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

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/update-commerce-tier-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId commercePriceEntryId:(long long)commercePriceEntryId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice minQuantity:(int)minQuantity priceEntryExternalReferenceCode:(NSString *)priceEntryExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTierPriceEntryId": @(commerceTierPriceEntryId),
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
		@"minQuantity": @(minQuantity),
		@"priceEntryExternalReferenceCode": [self checkNull: priceEntryExternalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/upsert-commerce-tier-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId commercePriceEntryId:(long long)commercePriceEntryId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price minQuantity:(int)minQuantity bulkPricing:(BOOL)bulkPricing discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire priceEntryExternalReferenceCode:(NSString *)priceEntryExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTierPriceEntryId": @(commerceTierPriceEntryId),
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"price": [self checkNull: price],
		@"minQuantity": @(minQuantity),
		@"bulkPricing": @(bulkPricing),
		@"discountDiscovery": @(discountDiscovery),
		@"discountLevel1": [self checkNull: discountLevel1],
		@"discountLevel2": [self checkNull: discountLevel2],
		@"discountLevel3": [self checkNull: discountLevel3],
		@"discountLevel4": [self checkNull: discountLevel4],
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
		@"priceEntryExternalReferenceCode": [self checkNull: priceEntryExternalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/upsert-commerce-tier-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceTierPriceEntryWithCommerceTierPriceEntryId:(long long)commerceTierPriceEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTierPriceEntryId": @(commerceTierPriceEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetierpriceentry/fetch-commerce-tier-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end