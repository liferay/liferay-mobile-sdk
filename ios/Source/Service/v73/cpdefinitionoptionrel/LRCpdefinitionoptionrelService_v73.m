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

#import "LRCpdefinitionoptionrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdefinitionoptionrelService_v73

- (NSDictionary *)addCpDefinitionOptionRelWithCpDefinitionId:(long long)cpDefinitionId cpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName priority:(double)priority facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor importOptionValue:(BOOL)importOptionValue priceType:(NSString *)priceType serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"cpOptionId": @(cpOptionId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"ddmFormFieldTypeName": [self checkNull: ddmFormFieldTypeName],
		@"priority": @(priority),
		@"facetable": @(facetable),
		@"required": @(required),
		@"skuContributor": @(skuContributor),
		@"importOptionValue": @(importOptionValue),
		@"priceType": [self checkNull: priceType],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/add-cp-definition-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpDefinitionOptionRelWithCpDefinitionId:(long long)cpDefinitionId cpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName priority:(double)priority facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor importOptionValue:(BOOL)importOptionValue serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"cpOptionId": @(cpOptionId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"ddmFormFieldTypeName": [self checkNull: ddmFormFieldTypeName],
		@"priority": @(priority),
		@"facetable": @(facetable),
		@"required": @(required),
		@"skuContributor": @(skuContributor),
		@"importOptionValue": @(importOptionValue),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/add-cp-definition-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpDefinitionOptionRelWithCpDefinitionId:(long long)cpDefinitionId cpOptionId:(long long)cpOptionId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"cpOptionId": @(cpOptionId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/add-cp-definition-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/delete-cp-definition-option-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionOptionRelWithCpDefinitionId:(long long)cpDefinitionId cpOptionId:(long long)cpOptionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"cpOptionId": @(cpOptionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/fetch-cp-definition-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/fetch-cp-definition-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/get-cp-definition-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpDefinitionOptionRelCpDefinitionOptionValueRelIdsWithCpDefinitionId:(long long)cpDefinitionId json:(NSString *)json error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"json": [self checkNull: json]
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/get-cp-definition-option-rel-cp-definition-option-value-rel-ids": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpDefinitionOptionRelKeysCpDefinitionOptionValueRelKeysWithCpInstanceId:(long long)cpInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/get-cp-definition-option-rel-keys-cp-definition-option-value-rel-keys": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionOptionRelsWithCpDefinitionId:(long long)cpDefinitionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinitionOptionRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionOptionRelsWithCpDefinitionId:(long long)cpDefinitionId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionOptionRelsWithCpDefinitionId:(long long)cpDefinitionId skuContributor:(BOOL)skuContributor error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"skuContributor": @(skuContributor)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionOptionRelsCountWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionOptionRelsCountWithCpDefinitionId:(long long)cpDefinitionId skuContributor:(BOOL)skuContributor error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"skuContributor": @(skuContributor)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpDefinitionOptionRelsWithCompanyId:(long long)companyId groupId:(long long)groupId cpDefinitionId:(long long)cpDefinitionId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"cpDefinitionId": @(cpDefinitionId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/search-cp-definition-option-rels": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId cpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName priority:(double)priority facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId),
		@"cpOptionId": @(cpOptionId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"ddmFormFieldTypeName": [self checkNull: ddmFormFieldTypeName],
		@"priority": @(priority),
		@"facetable": @(facetable),
		@"required": @(required),
		@"skuContributor": @(skuContributor),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/update-cp-definition-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId cpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName priority:(double)priority facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor priceType:(NSString *)priceType serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId),
		@"cpOptionId": @(cpOptionId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"ddmFormFieldTypeName": [self checkNull: ddmFormFieldTypeName],
		@"priority": @(priority),
		@"facetable": @(facetable),
		@"required": @(required),
		@"skuContributor": @(skuContributor),
		@"priceType": [self checkNull: priceType],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionrel/update-cp-definition-option-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end