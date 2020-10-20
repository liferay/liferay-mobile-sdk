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

#import "LRCommercepricingclasscpdefinitionrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercepricingclasscpdefinitionrelService_v73

- (NSArray *)searchByCommercePricingClassIdWithCommercePricingClassId:(long long)commercePricingClassId name:(NSString *)name languageId:(NSString *)languageId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId),
		@"name": [self checkNull: name],
		@"languageId": [self checkNull: languageId],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/search-by-commerce-pricing-class-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommercePricingClassCpDefinitionRelWithCommercePricingClassId:(long long)commercePricingClassId cpDefinitionId:(long long)cpDefinitionId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId),
		@"cpDefinitionId": @(cpDefinitionId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/add-commerce-pricing-class-cp-definition-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommercePricingClassCpDefinitionRelWithCommercePricingClassId:(long long)commercePricingClassId cpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId),
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/fetch-commerce-pricing-class-cp-definition-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteCommercePricingClassCpDefinitionRelWithCommercePricingClassCPDefinitionRelId:(long long)commercePricingClassCPDefinitionRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassCPDefinitionRelId": @(commercePricingClassCPDefinitionRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/delete-commerce-pricing-class-cp-definition-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteCommercePricingClassCpDefinitionRelWithCommercePricingClassCPDefinitionRel:(LRJSONObjectWrapper *)commercePricingClassCPDefinitionRel error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"commercePricingClassCPDefinitionRel" className:@"com.liferay.commerce.pricing.model.CommercePricingClassCPDefinitionRel" wrapper:commercePricingClassCPDefinitionRel];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/delete-commerce-pricing-class-cp-definition-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionIdsWithCommercePricingClassId:(long long)commercePricingClassId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/get-cp-definition-ids": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePricingClassCpDefinitionRelsWithCommercePricingClassId:(long long)commercePricingClassId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.pricing.model.CommercePricingClassCPDefinitionRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePricingClassCpDefinitionRelsCountWithCommercePricingClassId:(long long)commercePricingClassId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePricingClassCpDefinitionRelsCountWithCommercePricingClassId:(long long)commercePricingClassId name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId),
		@"name": [self checkNull: name],
		@"languageId": [self checkNull: languageId]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePricingClassCpDefinitionRelByClassIdWithCommercePricingClassId:(long long)commercePricingClassId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassId": @(commercePricingClassId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rel-by-class-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommercePricingClassCpDefinitionRelWithCommercePricingClassCPDefinitionRelId:(long long)commercePricingClassCPDefinitionRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePricingClassCPDefinitionRelId": @(commercePricingClassCPDefinitionRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end