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

#import "LRCpspecificationoptionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpspecificationoptionService_v73

- (NSDictionary *)fetchCpSpecificationOptionWithCompanyId:(long long)companyId key:(NSString *)key error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"key": [self checkNull: key]
	}];

	NSDictionary *_command = @{@"/commerce.cpspecificationoption/fetch-cp-specification-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpSpecificationOptionWithCpSpecificationOptionId:(long long)cpSpecificationOptionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpSpecificationOptionId": @(cpSpecificationOptionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpspecificationoption/get-cp-specification-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpSpecificationOptionWithCpOptionCategoryId:(long long)cpOptionCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap facetable:(BOOL)facetable key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionCategoryId": @(cpOptionCategoryId),
		@"titleMap": [self checkNull: titleMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"facetable": @(facetable),
		@"key": [self checkNull: key],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpspecificationoption/add-cp-specification-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpSpecificationOptionWithCpSpecificationOptionId:(long long)cpSpecificationOptionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpSpecificationOptionId": @(cpSpecificationOptionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpspecificationoption/delete-cp-specification-option": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpSpecificationOptionsWithCompanyId:(long long)companyId facetable:(BOOL)facetable keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"facetable": @(facetable),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpspecificationoption/search-cp-specification-options": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpSpecificationOptionWithCpSpecificationOptionId:(long long)cpSpecificationOptionId cpOptionCategoryId:(long long)cpOptionCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap facetable:(BOOL)facetable key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpSpecificationOptionId": @(cpSpecificationOptionId),
		@"cpOptionCategoryId": @(cpOptionCategoryId),
		@"titleMap": [self checkNull: titleMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"facetable": @(facetable),
		@"key": [self checkNull: key],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpspecificationoption/update-cp-specification-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end