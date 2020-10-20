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

#import "LRCommerceaddressService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceaddressService_v73

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAddressWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber type:(int)type externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionId": @(commerceRegionId),
		@"commerceCountryId": @(commerceCountryId),
		@"phoneNumber": [self checkNull: phoneNumber],
		@"type": @(type),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaddress/add-commerce-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAddressWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionId": @(commerceRegionId),
		@"commerceCountryId": @(commerceCountryId),
		@"phoneNumber": [self checkNull: phoneNumber],
		@"type": @(type),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaddress/add-commerce-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAddressWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber defaultBilling:(BOOL)defaultBilling defaultShipping:(BOOL)defaultShipping serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionId": @(commerceRegionId),
		@"commerceCountryId": @(commerceCountryId),
		@"phoneNumber": [self checkNull: phoneNumber],
		@"defaultBilling": @(defaultBilling),
		@"defaultShipping": @(defaultShipping),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaddress/add-commerce-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAddressWithCommerceAddressId:(long long)commerceAddressId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAddressId": @(commerceAddressId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/delete-commerce-address": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getBillingCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-billing-commerce-addresses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getBillingCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-billing-commerce-addresses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getBillingCommerceAddressesCountWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-billing-commerce-addresses-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAddressesWithClassName:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceAddress>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-commerce-addresses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAddressesWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-commerce-addresses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAddressesWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceAddress>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-commerce-addresses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAddressesByCompanyIdWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-commerce-addresses-by-company-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAddressesByCompanyIdWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceAddress>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-commerce-addresses-by-company-id": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAddressesCountWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-commerce-addresses-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAddressesCountWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-commerce-addresses-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAddressesCountByCompanyIdWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-commerce-addresses-count-by-company-id": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getShippingCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-shipping-commerce-addresses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getShippingCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-shipping-commerce-addresses": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getShippingCommerceAddressesCountWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-shipping-commerce-addresses-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommerceAddressesWithCompanyId:(long long)companyId groupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commerceaddress/search-commerce-addresses": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commerceaddress/search-commerce-addresses": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceAddressWithCommerceAddressId:(long long)commerceAddressId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAddressId": @(commerceAddressId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionId": @(commerceRegionId),
		@"commerceCountryId": @(commerceCountryId),
		@"phoneNumber": [self checkNull: phoneNumber],
		@"type": @(type),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaddress/update-commerce-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceAddressWithCommerceAddressId:(long long)commerceAddressId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber defaultBilling:(BOOL)defaultBilling defaultShipping:(BOOL)defaultShipping serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAddressId": @(commerceAddressId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"street1": [self checkNull: street1],
		@"street2": [self checkNull: street2],
		@"street3": [self checkNull: street3],
		@"city": [self checkNull: city],
		@"zip": [self checkNull: zip],
		@"commerceRegionId": @(commerceRegionId),
		@"commerceCountryId": @(commerceCountryId),
		@"phoneNumber": [self checkNull: phoneNumber],
		@"defaultBilling": @(defaultBilling),
		@"defaultShipping": @(defaultShipping),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaddress/update-commerce-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceAddressWithCommerceAddressId:(long long)commerceAddressId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAddressId": @(commerceAddressId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/fetch-commerce-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceAddressWithCommerceAddressId:(long long)commerceAddressId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAddressId": @(commerceAddressId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaddress/get-commerce-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end