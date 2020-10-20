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

#import "LRCommercepaymentmethodgrouprelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercepaymentmethodgrouprelService_v73

- (NSDictionary *)setActiveWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePaymentMethodGroupRelId": @(commercePaymentMethodGroupRelId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/set-active": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAddressRestrictionWithClassPK:(long long)classPK commerceCountryId:(long long)commerceCountryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"classPK": @(classPK),
		@"commerceCountryId": @(commerceCountryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/add-commerce-address-restriction": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAddressRestrictionWithUserId:(long long)userId groupId:(long long)groupId classPK:(long long)classPK commerceCountryId:(long long)commerceCountryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"classPK": @(classPK),
		@"commerceCountryId": @(commerceCountryId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/add-commerce-address-restriction": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAddressRestrictionsWithClassPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"classPK": @(classPK),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceAddressRestriction>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-address-restrictions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAddressRestrictionsCountWithClassPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-address-restrictions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAddressRestrictionWithCommerceAddressRestrictionId:(long long)commerceAddressRestrictionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAddressRestrictionId": @(commerceAddressRestrictionId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/delete-commerce-address-restriction": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteCommerceAddressRestrictionsWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePaymentMethodGroupRelId": @(commercePaymentMethodGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/delete-commerce-address-restrictions": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommercePaymentMethodGroupRelWithUserId:(long long)userId groupId:(long long)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap imageFile:(LRUploadData *)imageFile engineKey:(NSString *)engineKey priority:(double)priority active:(BOOL)active error:(NSError **)error {
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

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/add-commerce-payment-method-group-rel": _params};

	return (NSDictionary *)[self.session upload:_command error:error];
}

- (void)deleteCommercePaymentMethodGroupRelWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePaymentMethodGroupRelId": @(commercePaymentMethodGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/delete-commerce-payment-method-group-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommercePaymentMethodGroupRelWithGroupId:(long long)groupId engineKey:(NSString *)engineKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"engineKey": [self checkNull: engineKey]
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/fetch-commerce-payment-method-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommercePaymentMethodGroupRelWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePaymentMethodGroupRelId": @(commercePaymentMethodGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommercePaymentMethodGroupRelWithGroupId:(long long)groupId engineKey:(NSString *)engineKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"engineKey": [self checkNull: engineKey]
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"active": @(active),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId commerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceCountryId": @(commerceCountryId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId active:(BOOL)active start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"active": @(active),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePaymentMethodGroupRelsCountWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommercePaymentMethodGroupRelsCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommercePaymentMethodGroupRelWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap imageFile:(LRUploadData *)imageFile priority:(double)priority active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commercePaymentMethodGroupRelId": @(commercePaymentMethodGroupRelId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"imageFile": [self checkNull: imageFile],
		@"priority": @(priority),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercepaymentmethodgrouprel/update-commerce-payment-method-group-rel": _params};

	return (NSDictionary *)[self.session upload:_command error:error];
}

@end