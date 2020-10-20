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

#import "LRCpdefinitionspecificationoptionvalueService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdefinitionspecificationoptionvalueService_v73

- (NSDictionary *)addCpDefinitionSpecificationOptionValueWithCpDefinitionId:(long long)cpDefinitionId cpSpecificationOptionId:(long long)cpSpecificationOptionId cpOptionCategoryId:(long long)cpOptionCategoryId valueMap:(NSDictionary *)valueMap priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"cpSpecificationOptionId": @(cpSpecificationOptionId),
		@"cpOptionCategoryId": @(cpOptionCategoryId),
		@"valueMap": [self checkNull: valueMap],
		@"priority": @(priority),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionspecificationoptionvalue/add-cp-definition-specification-option-value": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpDefinitionSpecificationOptionValueWithCpDefinitionSpecificationOptionValueId:(long long)cpDefinitionSpecificationOptionValueId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionSpecificationOptionValueId": @(cpDefinitionSpecificationOptionValueId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionspecificationoptionvalue/delete-cp-definition-specification-option-value": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionSpecificationOptionValueWithCpDefinitionSpecificationOptionValueId:(long long)cpDefinitionSpecificationOptionValueId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionSpecificationOptionValueId": @(cpDefinitionSpecificationOptionValueId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionspecificationoptionvalue/fetch-cp-definition-specification-option-value": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionSpecificationOptionValuesWithCpDefinitionId:(long long)cpDefinitionId cpOptionCategoryId:(long long)cpOptionCategoryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"cpOptionCategoryId": @(cpOptionCategoryId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-values": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionSpecificationOptionValuesWithCpDefinitionId:(long long)cpDefinitionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinitionSpecificationOptionValue>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-values": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionSpecificationOptionValuesCountWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-values-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionSpecificationOptionValueWithCpDefinitionSpecificationOptionValueId:(long long)cpDefinitionSpecificationOptionValueId cpOptionCategoryId:(long long)cpOptionCategoryId valueMap:(NSDictionary *)valueMap priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionSpecificationOptionValueId": @(cpDefinitionSpecificationOptionValueId),
		@"cpOptionCategoryId": @(cpOptionCategoryId),
		@"valueMap": [self checkNull: valueMap],
		@"priority": @(priority),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionspecificationoptionvalue/update-cp-definition-specification-option-value": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpDefinitionSpecificationOptionValueWithCpDefinitionSpecificationOptionValueId:(long long)cpDefinitionSpecificationOptionValueId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionSpecificationOptionValueId": @(cpDefinitionSpecificationOptionValueId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-value": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end