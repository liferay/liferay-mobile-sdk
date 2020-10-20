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

#import "LRCommercediscountrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercediscountrelService_v73

- (NSArray *)getClassPKsWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"className": [self checkNull: className]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-class-p-ks": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceDiscountRelWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className classPK:(long long)classPK serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/add-commerce-discount-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceDiscountRelWithCommerceDiscountRelId:(long long)commerceDiscountRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountRelId": @(commerceDiscountRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/delete-commerce-discount-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceDiscountRelWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/fetch-commerce-discount-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceDiscountRelsWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"className": [self checkNull: className],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.discount.model.CommerceDiscountRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-commerce-discount-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceDiscountRelsWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"className": [self checkNull: className]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-commerce-discount-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCategoriesByCommerceDiscountIdWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-categories-by-commerce-discount-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCategoriesByCommerceDiscountIdCountWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-categories-by-commerce-discount-id-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceDiscountRelsCountWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"className": [self checkNull: className]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-commerce-discount-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePricingClassesByCommerceDiscountIdWithCommerceDiscountId:(long long)commerceDiscountId title:(NSString *)title start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"title": [self checkNull: title],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-commerce-pricing-classes-by-commerce-discount-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePricingClassesByCommerceDiscountIdCountWithCommerceDiscountId:(long long)commerceDiscountId title:(NSString *)title error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"title": [self checkNull: title]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-commerce-pricing-classes-by-commerce-discount-id-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionsByCommerceDiscountIdWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name languageId:(NSString *)languageId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name],
		@"languageId": [self checkNull: languageId],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-cp-definitions-by-commerce-discount-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionsByCommerceDiscountIdCountWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name],
		@"languageId": [self checkNull: languageId]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-cp-definitions-by-commerce-discount-id-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceDiscountRelWithCommerceDiscountRelId:(long long)commerceDiscountRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountRelId": @(commerceDiscountRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrel/get-commerce-discount-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end