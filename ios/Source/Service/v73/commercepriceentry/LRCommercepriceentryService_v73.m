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

#import "LRCommercepriceentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercepriceentryService_v73

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommercePriceEntryWithCProductId:(long long)cProductId cpInstanceUuid:(NSString *)cpInstanceUuid commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cProductId": @(cProductId),
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid],
		@"commercePriceListId": @(commercePriceListId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"price": [self checkNull: price],
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

	NSDictionary *_command = @{@"/commerce.commercepriceentry/add-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommercePriceEntryWithCpInstanceId:(long long)cpInstanceId commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"commercePriceListId": @(commercePriceListId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/add-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommercePriceEntryWithCpInstanceId:(long long)cpInstanceId commercePriceListId:(long long)commercePriceListId price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"commercePriceListId": @(commercePriceListId),
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/add-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/delete-commerce-price-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/fetch-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceEntriesWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-commerce-price-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceEntriesWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-commerce-price-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceEntriesByCompanyIdWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-commerce-price-entries-by-company-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceEntriesCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceListId": @(commercePriceListId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-commerce-price-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceEntriesCountByCompanyIdWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-commerce-price-entries-count-by-company-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getInstanceBaseCommercePriceEntryWithCpInstanceUuid:(NSString *)cpInstanceUuid priceListType:(NSString *)priceListType error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid],
		@"priceListType": [self checkNull: priceListType]
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-instance-base-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getInstanceCommercePriceEntriesWithCpInstanceId:(long long)cpInstanceId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-instance-commerce-price-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getInstanceCommercePriceEntriesWithCpInstanceId:(long long)cpInstanceId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-instance-commerce-price-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getInstanceCommercePriceEntriesCountWithCpInstanceId:(long long)cpInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-instance-commerce-price-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommercePriceEntriesWithCompanyId:(long long)companyId commercePriceListId:(long long)commercePriceListId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"commercePriceListId": @(commercePriceListId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/search-commerce-price-entries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCommercePriceEntriesCountWithCompanyId:(long long)companyId commercePriceListId:(long long)commercePriceListId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"commercePriceListId": @(commercePriceListId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/search-commerce-price-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/update-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId price:(NSDictionary *)price discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 bulkPricing:(BOOL)bulkPricing displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"price": [self checkNull: price],
		@"discountDiscovery": @(discountDiscovery),
		@"discountLevel1": [self checkNull: discountLevel1],
		@"discountLevel2": [self checkNull: discountLevel2],
		@"discountLevel3": [self checkNull: discountLevel3],
		@"discountLevel4": [self checkNull: discountLevel4],
		@"bulkPricing": @(bulkPricing),
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

	NSDictionary *_command = @{@"/commerce.commercepriceentry/update-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId price:(NSDictionary *)price discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"price": [self checkNull: price],
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

	NSDictionary *_command = @{@"/commerce.commercepriceentry/update-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateExternalReferenceCodeWithCommercePriceEntry:(LRJSONObjectWrapper *)commercePriceEntry externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	[self mangleWrapperWithParams:_params name:@"commercePriceEntry" className:@"com.liferay.commerce.price.list.model.CommercePriceEntry" wrapper:commercePriceEntry];
	NSDictionary *_command = @{@"/commerce.commercepriceentry/update-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId cpInstanceId:(long long)cpInstanceId commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice skuExternalReferenceCode:(NSString *)skuExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"cpInstanceId": @(cpInstanceId),
		@"commercePriceListId": @(commercePriceListId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
		@"skuExternalReferenceCode": [self checkNull: skuExternalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/upsert-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId cProductId:(long long)cProductId cpInstanceUuid:(NSString *)cpInstanceUuid commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price discountDiscovery:(BOOL)discountDiscovery discountLevel1:(NSDictionary *)discountLevel1 discountLevel2:(NSDictionary *)discountLevel2 discountLevel3:(NSDictionary *)discountLevel3 discountLevel4:(NSDictionary *)discountLevel4 displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire skuExternalReferenceCode:(NSString *)skuExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"cProductId": @(cProductId),
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid],
		@"commercePriceListId": @(commercePriceListId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"price": [self checkNull: price],
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
		@"skuExternalReferenceCode": [self checkNull: skuExternalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/upsert-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId cProductId:(long long)cProductId cpInstanceUuid:(NSString *)cpInstanceUuid commercePriceListId:(long long)commercePriceListId externalReferenceCode:(NSString *)externalReferenceCode price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice skuExternalReferenceCode:(NSString *)skuExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId),
		@"cProductId": @(cProductId),
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid],
		@"commercePriceListId": @(commercePriceListId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
		@"skuExternalReferenceCode": [self checkNull: skuExternalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/upsert-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommercePriceEntryWithCommercePriceEntryId:(long long)commercePriceEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceEntryId": @(commercePriceEntryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepriceentry/get-commerce-price-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end