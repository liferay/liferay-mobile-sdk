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

#import "LRCommercediscountruleService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercediscountruleService_v73

- (NSDictionary *)addCommerceDiscountRuleWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name type:(NSString *)type typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name],
		@"type": [self checkNull: type],
		@"typeSettings": [self checkNull: typeSettings],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/add-commerce-discount-rule": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceDiscountRuleWithCommerceDiscountId:(long long)commerceDiscountId type:(NSString *)type typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"type": [self checkNull: type],
		@"typeSettings": [self checkNull: typeSettings],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/add-commerce-discount-rule": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountRuleId": @(commerceDiscountRuleId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/delete-commerce-discount-rule": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceDiscountRulesWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/get-commerce-discount-rules": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceDiscountRulesWithCommerceDiscountId:(long long)commerceDiscountId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.discount.model.CommerceDiscountRule>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/get-commerce-discount-rules": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceDiscountRulesCountWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/get-commerce-discount-rules-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceDiscountRulesCountWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountId": @(commerceDiscountId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/get-commerce-discount-rules-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId name:(NSString *)name type:(NSString *)type typeSettings:(NSString *)typeSettings error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountRuleId": @(commerceDiscountRuleId),
		@"name": [self checkNull: name],
		@"type": [self checkNull: type],
		@"typeSettings": [self checkNull: typeSettings]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/update-commerce-discount-rule": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId type:(NSString *)type typeSettings:(NSString *)typeSettings error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountRuleId": @(commerceDiscountRuleId),
		@"type": [self checkNull: type],
		@"typeSettings": [self checkNull: typeSettings]
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/update-commerce-discount-rule": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountRuleId": @(commerceDiscountRuleId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/fetch-commerce-discount-rule": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceDiscountRuleId": @(commerceDiscountRuleId)
	}];

	NSDictionary *_command = @{@"/commerce.commercediscountrule/get-commerce-discount-rule": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end