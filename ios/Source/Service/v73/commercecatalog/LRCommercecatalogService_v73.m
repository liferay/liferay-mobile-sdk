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

#import "LRCommercecatalogService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercecatalogService_v73

- (NSDictionary *)getCommerceCatalogWithCommerceCatalogId:(long long)commerceCatalogId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCatalogId": @(commerceCatalogId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecatalog/get-commerce-catalog": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercecatalog/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceCatalogWithName:(NSString *)name commerceCurrencyCode:(NSString *)commerceCurrencyCode catalogDefaultLanguageId:(NSString *)catalogDefaultLanguageId externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"commerceCurrencyCode": [self checkNull: commerceCurrencyCode],
		@"catalogDefaultLanguageId": [self checkNull: catalogDefaultLanguageId],
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercecatalog/add-commerce-catalog": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteCommerceCatalogWithCommerceCatalogId:(long long)commerceCatalogId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCatalogId": @(commerceCatalogId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecatalog/delete-commerce-catalog": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceCatalogWithCommerceCatalogId:(long long)commerceCatalogId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCatalogId": @(commerceCatalogId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecatalog/fetch-commerce-catalog": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceCatalogByGroupIdWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercecatalog/fetch-commerce-catalog-by-group-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceCatalogsWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercecatalog/get-commerce-catalogs": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchCommerceCatalogsWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commercecatalog/search-commerce-catalogs": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCommerceCatalogsCountWithCompanyId:(long long)companyId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commercecatalog/search-commerce-catalogs-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceCatalogWithCommerceCatalogId:(long long)commerceCatalogId name:(NSString *)name commerceCurrencyCode:(NSString *)commerceCurrencyCode catalogDefaultLanguageId:(NSString *)catalogDefaultLanguageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCatalogId": @(commerceCatalogId),
		@"name": [self checkNull: name],
		@"commerceCurrencyCode": [self checkNull: commerceCurrencyCode],
		@"catalogDefaultLanguageId": [self checkNull: catalogDefaultLanguageId]
	}];

	NSDictionary *_command = @{@"/commerce.commercecatalog/update-commerce-catalog": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceCatalogExternalReferenceCodeWithCommerceCatalogId:(long long)commerceCatalogId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceCatalogId": @(commerceCatalogId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercecatalog/update-commerce-catalog-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end