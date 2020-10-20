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

#import "LRCommercetaxfixedrateService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercetaxfixedrateService_v73

- (NSDictionary *)addCommerceTaxFixedRateWithCommerceTaxMethodId:(long long)commerceTaxMethodId cpTaxCategoryId:(long long)cpTaxCategoryId rate:(double)rate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxMethodId": @(commerceTaxMethodId),
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"rate": @(rate),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrate/add-commerce-tax-fixed-rate": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceTaxFixedRateWithUserId:(long long)userId groupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId cpTaxCategoryId:(long long)cpTaxCategoryId rate:(double)rate error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"commerceTaxMethodId": @(commerceTaxMethodId),
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"rate": @(rate)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrate/add-commerce-tax-fixed-rate": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceTaxFixedRatesWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceTaxMethodId": @(commerceTaxMethodId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.tax.engine.fixed.model.CommerceTaxFixedRate>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrate/get-commerce-tax-fixed-rates": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceTaxFixedRateWithCommerceTaxFixedRateId:(long long)commerceTaxFixedRateId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxFixedRateId": @(commerceTaxFixedRateId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrate/fetch-commerce-tax-fixed-rate": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceTaxFixedRateWithCpTaxCategoryId:(long long)cpTaxCategoryId commerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"commerceTaxMethodId": @(commerceTaxMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrate/fetch-commerce-tax-fixed-rate": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceTaxFixedRatesCountWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceTaxMethodId": @(commerceTaxMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrate/get-commerce-tax-fixed-rates-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceTaxFixedRateWithCommerceTaxFixedRateId:(long long)commerceTaxFixedRateId rate:(double)rate error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxFixedRateId": @(commerceTaxFixedRateId),
		@"rate": @(rate)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrate/update-commerce-tax-fixed-rate": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceTaxFixedRateWithCommerceTaxFixedRateId:(long long)commerceTaxFixedRateId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxFixedRateId": @(commerceTaxFixedRateId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrate/delete-commerce-tax-fixed-rate": _params};

	[self.session invoke:_command error:error];
}

@end