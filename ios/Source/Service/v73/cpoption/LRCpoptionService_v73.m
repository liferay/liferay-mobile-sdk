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

#import "LRCpoptionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpoptionService_v73

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.cpoption/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpOptionWithCpOptionId:(long long)cpOptionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionId": @(cpOptionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoption/get-cp-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpOptionsWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpoption/search-cp-options": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpOptionWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"ddmFormFieldTypeName": [self checkNull: ddmFormFieldTypeName],
		@"facetable": @(facetable),
		@"required": @(required),
		@"skuContributor": @(skuContributor),
		@"key": [self checkNull: key],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpoption/add-cp-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpOptionWithCompanyId:(long long)companyId key:(NSString *)key error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"key": [self checkNull: key]
	}];

	NSDictionary *_command = @{@"/commerce.cpoption/fetch-cp-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpOptionWithCpOptionId:(long long)cpOptionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionId": @(cpOptionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoption/fetch-cp-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpOptionWithCpOptionId:(long long)cpOptionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionId": @(cpOptionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoption/delete-cp-option": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)findCpOptionByCompanyIdWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPOption>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpoption/find-cp-option-by-company-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpOptionWithCpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionId": @(cpOptionId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"ddmFormFieldTypeName": [self checkNull: ddmFormFieldTypeName],
		@"facetable": @(facetable),
		@"required": @(required),
		@"skuContributor": @(skuContributor),
		@"key": [self checkNull: key],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpoption/update-cp-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCpOptionWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor key:(NSString *)key externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"ddmFormFieldTypeName": [self checkNull: ddmFormFieldTypeName],
		@"facetable": @(facetable),
		@"required": @(required),
		@"skuContributor": @(skuContributor),
		@"key": [self checkNull: key],
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpoption/upsert-cp-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end