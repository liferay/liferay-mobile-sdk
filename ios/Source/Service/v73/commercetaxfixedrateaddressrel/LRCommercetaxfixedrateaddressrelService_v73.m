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

#import "LRCommercetaxfixedrateaddressrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercetaxfixedrateaddressrelService_v73

- (NSDictionary *)addCommerceTaxFixedRateAddressRelWithCommerceTaxMethodId:(long long)commerceTaxMethodId cpTaxCategoryId:(long long)cpTaxCategoryId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip rate:(double)rate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxMethodId": @(commerceTaxMethodId),
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"commerceCountryId": @(commerceCountryId),
		@"commerceRegionId": @(commerceRegionId),
		@"zip": [self checkNull: zip],
		@"rate": @(rate),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrateaddressrel/add-commerce-tax-fixed-rate-address-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceTaxFixedRateAddressRelWithUserId:(long long)userId groupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId cpTaxCategoryId:(long long)cpTaxCategoryId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip rate:(double)rate error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"commerceTaxMethodId": @(commerceTaxMethodId),
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"commerceCountryId": @(commerceCountryId),
		@"commerceRegionId": @(commerceRegionId),
		@"zip": [self checkNull: zip],
		@"rate": @(rate)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrateaddressrel/add-commerce-tax-fixed-rate-address-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceTaxFixedRateAddressRelWithCommerceTaxFixedRateAddressRelId:(long long)commerceTaxFixedRateAddressRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxFixedRateAddressRelId": @(commerceTaxFixedRateAddressRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrateaddressrel/delete-commerce-tax-fixed-rate-address-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceTaxFixedRateAddressRelWithCommerceTaxFixedRateAddressRelId:(long long)commerceTaxFixedRateAddressRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxFixedRateAddressRelId": @(commerceTaxFixedRateAddressRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrateaddressrel/fetch-commerce-tax-fixed-rate-address-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceTaxMethodFixedRateAddressRelsWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceTaxMethodId": @(commerceTaxMethodId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.tax.engine.fixed.model.CommerceTaxFixedRateAddressRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrateaddressrel/get-commerce-tax-method-fixed-rate-address-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceTaxMethodFixedRateAddressRelsCountWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceTaxMethodId": @(commerceTaxMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrateaddressrel/get-commerce-tax-method-fixed-rate-address-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceTaxFixedRateAddressRelWithCommerceTaxFixedRateAddressRelId:(long long)commerceTaxFixedRateAddressRelId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip rate:(double)rate error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxFixedRateAddressRelId": @(commerceTaxFixedRateAddressRelId),
		@"commerceCountryId": @(commerceCountryId),
		@"commerceRegionId": @(commerceRegionId),
		@"zip": [self checkNull: zip],
		@"rate": @(rate)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxfixedrateaddressrel/update-commerce-tax-fixed-rate-address-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end