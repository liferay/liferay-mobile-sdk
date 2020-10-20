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

#import "LRCommerceshippingmethodService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceshippingmethodService_v73

- (NSDictionary *)fetchCommerceShippingMethodWithGroupId:(long long)groupId engineKey:(NSString *)engineKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"engineKey": [self checkNull: engineKey]
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/fetch-commerce-shipping-method": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShippingMethodsWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/get-commerce-shipping-methods": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShippingMethodsWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/get-commerce-shipping-methods": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceShippingMethodsWithGroupId:(long long)groupId commerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceCountryId": @(commerceCountryId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/get-commerce-shipping-methods": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceShippingMethodWithCommerceShippingMethodId:(long long)commerceShippingMethodId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap imageFile:(LRUploadData *)imageFile priority:(double)priority active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"imageFile": [self checkNull: imageFile],
		@"priority": @(priority),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/update-commerce-shipping-method": _params};

	return (NSDictionary *)[self.session upload:_command error:error];
}

- (NSDictionary *)setActiveWithCommerceShippingMethodId:(long long)commerceShippingMethodId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/set-active": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)createCommerceShippingMethodWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/create-commerce-shipping-method": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAddressRestrictionWithCommerceShippingMethodId:(long long)commerceShippingMethodId commerceCountryId:(long long)commerceCountryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"commerceCountryId": @(commerceCountryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/add-commerce-address-restriction": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAddressRestrictionWithUserId:(long long)userId groupId:(long long)groupId commerceShippingMethodId:(long long)commerceShippingMethodId commerceCountryId:(long long)commerceCountryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"commerceCountryId": @(commerceCountryId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/add-commerce-address-restriction": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceShippingMethodWithUserId:(long long)userId groupId:(long long)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap imageFile:(LRUploadData *)imageFile engineKey:(NSString *)engineKey priority:(double)priority active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"imageFile": [self checkNull: imageFile],
		@"engineKey": [self checkNull: engineKey],
		@"priority": @(priority),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/add-commerce-shipping-method": _params};

	return (NSDictionary *)[self.session upload:_command error:error];
}

- (NSDictionary *)getCommerceShippingMethodWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/get-commerce-shipping-method": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAddressRestrictionsWithCommerceShippingMethodId:(long long)commerceShippingMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceAddressRestriction>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/get-commerce-address-restrictions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAddressRestrictionsCountWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/get-commerce-address-restrictions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAddressRestrictionWithCommerceAddressRestrictionId:(long long)commerceAddressRestrictionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAddressRestrictionId": @(commerceAddressRestrictionId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/delete-commerce-address-restriction": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceAddressRestrictionsWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/delete-commerce-address-restrictions": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceShippingMethodWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceShippingMethodId": @(commerceShippingMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/delete-commerce-shipping-method": _params};

	[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceShippingMethodsCountWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceshippingmethod/get-commerce-shipping-methods-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end