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

#import "LRCommercecurrencyService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercecurrencyService_v73

- (NSDictionary *)setActiveWithCommerceCurrencyId:(long long)commerceCurrencyId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCurrencyId": @(commerceCurrencyId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/set-active": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceCurrencyWithCompanyId:(long long)companyId code:(NSString *)code error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"code": [self checkNull: code]
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/get-commerce-currency": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceCurrencyWithCommerceCurrencyId:(long long)commerceCurrencyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCurrencyId": @(commerceCurrencyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/get-commerce-currency": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceCurrencyWithUserId:(long long)userId code:(NSString *)code nameMap:(NSDictionary *)nameMap symbol:(NSString *)symbol rate:(NSDictionary *)rate formatPatternMap:(NSDictionary *)formatPatternMap maxFractionDigits:(int)maxFractionDigits minFractionDigits:(int)minFractionDigits roundingMode:(NSString *)roundingMode primary:(BOOL)primary priority:(double)priority active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"code": [self checkNull: code],
		@"nameMap": [self checkNull: nameMap],
		@"symbol": [self checkNull: symbol],
		@"rate": [self checkNull: rate],
		@"formatPatternMap": [self checkNull: formatPatternMap],
		@"maxFractionDigits": @(maxFractionDigits),
		@"minFractionDigits": @(minFractionDigits),
		@"roundingMode": [self checkNull: roundingMode],
		@"primary": @(primary),
		@"priority": @(priority),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/add-commerce-currency": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceCurrencyWithCommerceCurrencyId:(long long)commerceCurrencyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCurrencyId": @(commerceCurrencyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/delete-commerce-currency": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchPrimaryCommerceCurrencyWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/fetch-primary-commerce-currency": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceCurrenciesWithCompanyId:(long long)companyId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.currency.model.CommerceCurrency>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercecurrency/get-commerce-currencies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceCurrenciesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.currency.model.CommerceCurrency>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercecurrency/get-commerce-currencies": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceCurrenciesCountWithCompanyId:(long long)companyId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/get-commerce-currencies-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceCurrenciesCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/get-commerce-currencies-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceCurrencyWithCommerceCurrencyId:(long long)commerceCurrencyId code:(NSString *)code nameMap:(NSDictionary *)nameMap symbol:(NSString *)symbol rate:(NSDictionary *)rate formatPatternMap:(NSDictionary *)formatPatternMap maxFractionDigits:(int)maxFractionDigits minFractionDigits:(int)minFractionDigits roundingMode:(NSString *)roundingMode primary:(BOOL)primary priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCurrencyId": @(commerceCurrencyId),
		@"code": [self checkNull: code],
		@"nameMap": [self checkNull: nameMap],
		@"symbol": [self checkNull: symbol],
		@"rate": [self checkNull: rate],
		@"formatPatternMap": [self checkNull: formatPatternMap],
		@"maxFractionDigits": @(maxFractionDigits),
		@"minFractionDigits": @(minFractionDigits),
		@"roundingMode": [self checkNull: roundingMode],
		@"primary": @(primary),
		@"priority": @(priority),
		@"active": @(active),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercecurrency/update-commerce-currency": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)updateExchangeRateWithCommerceCurrencyId:(long long)commerceCurrencyId exchangeRateProviderKey:(NSString *)exchangeRateProviderKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCurrencyId": @(commerceCurrencyId),
		@"exchangeRateProviderKey": [self checkNull: exchangeRateProviderKey]
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/update-exchange-rate": _params};

	[self.session invoke:_command error:error];
}

- (void)updateExchangeRates:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/update-exchange-rates": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)setPrimaryWithCommerceCurrencyId:(long long)commerceCurrencyId primary:(BOOL)primary error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCurrencyId": @(commerceCurrencyId),
		@"primary": @(primary)
	}];

	NSDictionary *_command = @{@"/commerce.commercecurrency/set-primary": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end