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

#import "LRCommerceshippingfixedoptionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceshippingfixedoptionService_v73

- (NSDictionary *)addCommerceShippingFixedOptionWithCommerceShippingMethodId:(long long)commerceShippingMethodId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap amount:(NSDictionary *)amount priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"amount": [self checkNull: amount],
		@"priority": @(priority),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoption/add-commerce-shipping-fixed-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceShippingFixedOptionWithUserId:(long long)userId groupId:(long long)groupId commerceShippingMethodId:(long long)commerceShippingMethodId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap amount:(NSDictionary *)amount priority:(double)priority error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"amount": [self checkNull: amount],
		@"priority": @(priority)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoption/add-commerce-shipping-fixed-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceShippingFixedOptionWithCommerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingFixedOptionId": @(commerceShippingFixedOptionId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoption/delete-commerce-shipping-fixed-option": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShippingFixedOptionsWithCommerceShippingMethodId:(long long)commerceShippingMethodId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShippingFixedOptionsWithCompanyId:(long long)companyId groupId:(long long)groupId commerceShippingMethodId:(long long)commerceShippingMethodId keywords:(NSString *)keywords start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShippingFixedOptionsWithCommerceShippingMethodId:(long long)commerceShippingMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.shipping.engine.fixed.model.CommerceShippingFixedOption>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShippingFixedOptionsCountWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceShippingFixedOptionWithCommerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap amount:(NSDictionary *)amount priority:(double)priority error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingFixedOptionId": @(commerceShippingFixedOptionId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"amount": [self checkNull: amount],
		@"priority": @(priority)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoption/update-commerce-shipping-fixed-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceShippingFixedOptionWithCommerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingFixedOptionId": @(commerceShippingFixedOptionId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingfixedoption/fetch-commerce-shipping-fixed-option": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end