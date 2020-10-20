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

#import "LRCpoptioncategoryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpoptioncategoryService_v73

- (NSDictionary *)getCpOptionCategoryWithCpOptionCategoryId:(long long)cpOptionCategoryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionCategoryId": @(cpOptionCategoryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoptioncategory/get-cp-option-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpOptionCategoryWithTitleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"titleMap": [self checkNull: titleMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"priority": @(priority),
		@"key": [self checkNull: key],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpoptioncategory/add-cp-option-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpOptionCategoryWithCpOptionCategoryId:(long long)cpOptionCategoryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionCategoryId": @(cpOptionCategoryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoptioncategory/delete-cp-option-category": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpOptionCategoryWithCpOptionCategoryId:(long long)cpOptionCategoryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionCategoryId": @(cpOptionCategoryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoptioncategory/fetch-cp-option-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpOptionCategoriesWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpoptioncategory/search-cp-option-categories": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpOptionCategoryWithCpOptionCategoryId:(long long)cpOptionCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap priority:(double)priority key:(NSString *)key error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionCategoryId": @(cpOptionCategoryId),
		@"titleMap": [self checkNull: titleMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"priority": @(priority),
		@"key": [self checkNull: key]
	}];

	NSDictionary *_command = @{@"/commerce.cpoptioncategory/update-cp-option-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end