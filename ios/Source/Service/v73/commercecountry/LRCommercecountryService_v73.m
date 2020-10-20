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

#import "LRCommercecountryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercecountryService_v73

- (NSDictionary *)setActiveWithCommerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/set-active": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceCountryWithCompanyId:(long long)companyId twoLettersISOCode:(NSString *)twoLettersISOCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"twoLettersISOCode": [self checkNull: twoLettersISOCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-commerce-country": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceCountryWithCommerceCountryId:(long long)commerceCountryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-commerce-country": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceCountryWithCompanyId:(long long)companyId twoLettersISOCode:(NSString *)twoLettersISOCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"twoLettersISOCode": [self checkNull: twoLettersISOCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/fetch-commerce-country": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceCountryWithNameMap:(NSDictionary *)nameMap billingAllowed:(BOOL)billingAllowed shippingAllowed:(BOOL)shippingAllowed twoLettersISOCode:(NSString *)twoLettersISOCode threeLettersISOCode:(NSString *)threeLettersISOCode numericISOCode:(int)numericISOCode subjectToVAT:(BOOL)subjectToVAT priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"nameMap": [self checkNull: nameMap],
		@"billingAllowed": @(billingAllowed),
		@"shippingAllowed": @(shippingAllowed),
		@"twoLettersISOCode": [self checkNull: twoLettersISOCode],
		@"threeLettersISOCode": [self checkNull: threeLettersISOCode],
		@"numericISOCode": @(numericISOCode),
		@"subjectToVAT": @(subjectToVAT),
		@"priority": @(priority),
		@"active": @(active),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercecountry/add-commerce-country": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceCountryWithCommerceCountryId:(long long)commerceCountryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/delete-commerce-country": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getBillingCommerceCountriesWithCompanyId:(long long)companyId billingAllowed:(BOOL)billingAllowed active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"billingAllowed": @(billingAllowed),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-billing-commerce-countries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getBillingCommerceCountriesByChannelIdWithCommerceChannelId:(long long)commerceChannelId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-billing-commerce-countries-by-channel-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceCountriesWithCompanyId:(long long)companyId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-commerce-countries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceCountriesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceCountry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-commerce-countries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceCountriesWithCompanyId:(long long)companyId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceCountry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-commerce-countries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceCountriesCountWithCompanyId:(long long)companyId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-commerce-countries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceCountriesCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-commerce-countries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getShippingCommerceCountriesWithCompanyId:(long long)companyId shippingAllowed:(BOOL)shippingAllowed active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"shippingAllowed": @(shippingAllowed),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-shipping-commerce-countries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getShippingCommerceCountriesByChannelIdWithCommerceChannelId:(long long)commerceChannelId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-shipping-commerce-countries-by-channel-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getWarehouseCommerceCountriesWithCompanyId:(long long)companyId all:(BOOL)all error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"all": @(all)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/get-warehouse-commerce-countries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommerceCountriesWithCompanyId:(long long)companyId active:(BOOL)active keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commercecountry/search-commerce-countries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommerceCountriesWithSearchContext:(LRJSONObjectWrapper *)searchContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"searchContext" className:@"com.liferay.portal.kernel.search.SearchContext" wrapper:searchContext];

	NSDictionary *_command = @{@"/commerce.commercecountry/search-commerce-countries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceCountryWithCommerceCountryId:(long long)commerceCountryId nameMap:(NSDictionary *)nameMap billingAllowed:(BOOL)billingAllowed shippingAllowed:(BOOL)shippingAllowed twoLettersISOCode:(NSString *)twoLettersISOCode threeLettersISOCode:(NSString *)threeLettersISOCode numericISOCode:(int)numericISOCode subjectToVAT:(BOOL)subjectToVAT priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId),
		@"nameMap": [self checkNull: nameMap],
		@"billingAllowed": @(billingAllowed),
		@"shippingAllowed": @(shippingAllowed),
		@"twoLettersISOCode": [self checkNull: twoLettersISOCode],
		@"threeLettersISOCode": [self checkNull: threeLettersISOCode],
		@"numericISOCode": @(numericISOCode),
		@"subjectToVAT": @(subjectToVAT),
		@"priority": @(priority),
		@"active": @(active),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercecountry/update-commerce-country": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceCountryChannelFilterWithCommerceCountryId:(long long)commerceCountryId enable:(BOOL)enable error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCountryId": @(commerceCountryId),
		@"enable": @(enable)
	}];

	NSDictionary *_command = @{@"/commerce.commercecountry/update-commerce-country-channel-filter": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end