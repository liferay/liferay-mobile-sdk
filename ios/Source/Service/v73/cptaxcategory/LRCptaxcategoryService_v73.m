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

#import "LRCptaxcategoryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCptaxcategoryService_v73

- (NSDictionary *)addCpTaxCategoryWithExternalReferenceCode:(NSString *)externalReferenceCode nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/add-cp-tax-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpTaxCategoryWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/add-cp-tax-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)countCpTaxCategoriesByCompanyIdWithCompanyId:(long long)companyId keyword:(NSString *)keyword error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keyword": [self checkNull: keyword]
	}];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/count-cp-tax-categories-by-company-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCpTaxCategoryWithCpTaxCategoryId:(long long)cpTaxCategoryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpTaxCategoryId": @(cpTaxCategoryId)
	}];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/delete-cp-tax-category": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)findCpTaxCategoriesByCompanyIdWithCompanyId:(long long)companyId keyword:(NSString *)keyword start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keyword": [self checkNull: keyword],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/find-cp-tax-categories-by-company-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpTaxCategoriesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPTaxCategory>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/get-cp-tax-categories": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpTaxCategoriesWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/get-cp-tax-categories": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpTaxCategoriesCountWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/get-cp-tax-categories-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpTaxCategoryWithCpTaxCategoryId:(long long)cpTaxCategoryId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap]
	}];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/update-cp-tax-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpTaxCategoryWithExternalReferenceCode:(NSString *)externalReferenceCode cpTaxCategoryId:(long long)cpTaxCategoryId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap]
	}];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/update-cp-tax-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpTaxCategoryWithCpTaxCategoryId:(long long)cpTaxCategoryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpTaxCategoryId": @(cpTaxCategoryId)
	}];

	NSDictionary *_command = @{@"/commerce.cptaxcategory/get-cp-tax-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end