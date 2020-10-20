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

#import "LRCommercepricemodifierrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercepricemodifierrelService_v73

- (NSArray *)getClassPKsWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId className:(NSString *)className error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierRelId": @(commercePriceModifierRelId),
		@"className": [self checkNull: className]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-class-p-ks": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommercePriceModifierRelWithCommercePriceModifierId:(long long)commercePriceModifierId className:(NSString *)className classPK:(long long)classPK serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/add-commerce-price-modifier-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommercePriceModifierRelWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierRelId": @(commercePriceModifierRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/delete-commerce-price-modifier-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommercePriceModifierRelWithCommercePriceModifierId:(long long)commercePriceModifierId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/fetch-commerce-price-modifier-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCategoriesCommercePriceModifierRelsWithCommercePriceModifierId:(long long)commercePriceModifierId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-categories-commerce-price-modifier-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCategoriesCommercePriceModifierRelsCountWithCommercePriceModifierId:(long long)commercePriceModifierId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-categories-commerce-price-modifier-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceModifierRelsWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId className:(NSString *)className start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierRelId": @(commercePriceModifierRelId),
		@"className": [self checkNull: className],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.pricing.model.CommercePriceModifierRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-commerce-price-modifier-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceModifierRelsWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId className:(NSString *)className error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierRelId": @(commercePriceModifierRelId),
		@"className": [self checkNull: className]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-commerce-price-modifier-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePriceModifierRelsCountWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId className:(NSString *)className error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierRelId": @(commercePriceModifierRelId),
		@"className": [self checkNull: className]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-commerce-price-modifier-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePriceModifiersRelsWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-commerce-price-modifiers-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePricingClassesCommercePriceModifierRelsWithCommercePriceModifierId:(long long)commercePriceModifierId title:(NSString *)title start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"title": [self checkNull: title],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-commerce-pricing-classes-commerce-price-modifier-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePricingClassesCommercePriceModifierRelsCountWithCommercePriceModifierId:(long long)commercePriceModifierId title:(NSString *)title error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"title": [self checkNull: title]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-commerce-pricing-classes-commerce-price-modifier-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionsCommercePriceModifierRelsWithCommercePriceModifierId:(long long)commercePriceModifierId name:(NSString *)name languageId:(NSString *)languageId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"name": [self checkNull: name],
		@"languageId": [self checkNull: languageId],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-cp-definitions-commerce-price-modifier-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionsCommercePriceModifierRelsCountWithCommercePriceModifierId:(long long)commercePriceModifierId name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierId": @(commercePriceModifierId),
		@"name": [self checkNull: name],
		@"languageId": [self checkNull: languageId]
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-cp-definitions-commerce-price-modifier-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommercePriceModifierRelWithCommercePriceModifierRelId:(long long)commercePriceModifierRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePriceModifierRelId": @(commercePriceModifierRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepricemodifierrel/get-commerce-price-modifier-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end