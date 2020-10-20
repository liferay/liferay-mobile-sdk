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

#import "LRCommerceaccountService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceaccountService_v73

- (NSDictionary *)setActiveWithCommerceAccountId:(long long)commerceAccountId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/set-active": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceAccountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/get-commerce-account": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addBusinessCommerceAccountWithName:(NSString *)name parentCommerceAccountId:(long long)parentCommerceAccountId email:(NSString *)email taxId:(NSString *)taxId active:(BOOL)active externalReferenceCode:(NSString *)externalReferenceCode userIds:(NSArray *)userIds emailAddresses:(NSArray *)emailAddresses serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"parentCommerceAccountId": @(parentCommerceAccountId),
		@"email": [self checkNull: email],
		@"taxId": [self checkNull: taxId],
		@"active": @(active),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"userIds": [self checkNull: userIds],
		@"emailAddresses": [self checkNull: emailAddresses],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccount/add-business-commerce-account": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAccountWithName:(NSString *)name parentCommerceAccountId:(long long)parentCommerceAccountId email:(NSString *)email taxId:(NSString *)taxId type:(int)type active:(BOOL)active externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"parentCommerceAccountId": @(parentCommerceAccountId),
		@"email": [self checkNull: email],
		@"taxId": [self checkNull: taxId],
		@"type": @(type),
		@"active": @(active),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccount/add-commerce-account": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAccountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/delete-commerce-account": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceAccountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/fetch-commerce-account": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getPersonalCommerceAccountWithUserId:(long long)userId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/get-personal-commerce-account": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserCommerceAccountsWithUserId:(long long)userId parentCommerceAccountId:(long long)parentCommerceAccountId commerceSiteType:(int)commerceSiteType keywords:(NSString *)keywords start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"parentCommerceAccountId": @(parentCommerceAccountId),
		@"commerceSiteType": @(commerceSiteType),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/get-user-commerce-accounts": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserCommerceAccountsWithUserId:(long long)userId parentCommerceAccountId:(long long)parentCommerceAccountId commerceSiteType:(int)commerceSiteType keywords:(NSString *)keywords active:(BOOL)active start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"parentCommerceAccountId": @(parentCommerceAccountId),
		@"commerceSiteType": @(commerceSiteType),
		@"keywords": [self checkNull: keywords],
		@"active": @(active),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/get-user-commerce-accounts": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getUserCommerceAccountsCountWithUserId:(long long)userId parentCommerceAccountId:(long long)parentCommerceAccountId commerceSiteType:(int)commerceSiteType keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"parentCommerceAccountId": @(parentCommerceAccountId),
		@"commerceSiteType": @(commerceSiteType),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/get-user-commerce-accounts-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getUserCommerceAccountsCountWithUserId:(long long)userId parentCommerceAccountId:(long long)parentCommerceAccountId commerceSiteType:(int)commerceSiteType keywords:(NSString *)keywords active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"parentCommerceAccountId": @(parentCommerceAccountId),
		@"commerceSiteType": @(commerceSiteType),
		@"keywords": [self checkNull: keywords],
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/get-user-commerce-accounts-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceAccountWithCommerceAccountId:(long long)commerceAccountId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes email:(NSString *)email taxId:(NSString *)taxId active:(BOOL)active defaultBillingAddressId:(long long)defaultBillingAddressId defaultShippingAddressId:(long long)defaultShippingAddressId externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"name": [self checkNull: name],
		@"logo": @(logo),
		@"logoBytes": [self toString:logoBytes],
		@"email": [self checkNull: email],
		@"taxId": [self checkNull: taxId],
		@"active": @(active),
		@"defaultBillingAddressId": @(defaultBillingAddressId),
		@"defaultShippingAddressId": @(defaultShippingAddressId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccount/update-commerce-account": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceAccountWithCommerceAccountId:(long long)commerceAccountId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes email:(NSString *)email taxId:(NSString *)taxId active:(BOOL)active defaultBillingAddressId:(long long)defaultBillingAddressId defaultShippingAddressId:(long long)defaultShippingAddressId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"name": [self checkNull: name],
		@"logo": @(logo),
		@"logoBytes": [self toString:logoBytes],
		@"email": [self checkNull: email],
		@"taxId": [self checkNull: taxId],
		@"active": @(active),
		@"defaultBillingAddressId": @(defaultBillingAddressId),
		@"defaultShippingAddressId": @(defaultShippingAddressId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccount/update-commerce-account": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceAccountWithCommerceAccountId:(long long)commerceAccountId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes email:(NSString *)email taxId:(NSString *)taxId active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"name": [self checkNull: name],
		@"logo": @(logo),
		@"logoBytes": [self toString:logoBytes],
		@"email": [self checkNull: email],
		@"taxId": [self checkNull: taxId],
		@"active": @(active),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccount/update-commerce-account": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateDefaultBillingAddressWithCommerceAccountId:(long long)commerceAccountId commerceAddressId:(long long)commerceAddressId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"commerceAddressId": @(commerceAddressId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/update-default-billing-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateDefaultShippingAddressWithCommerceAccountId:(long long)commerceAccountId commerceAddressId:(long long)commerceAddressId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountId": @(commerceAccountId),
		@"commerceAddressId": @(commerceAddressId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccount/update-default-shipping-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCommerceAccountWithName:(NSString *)name parentCommerceAccountId:(long long)parentCommerceAccountId logo:(BOOL)logo logoBytes:(NSData *)logoBytes email:(NSString *)email taxId:(NSString *)taxId type:(int)type active:(BOOL)active externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"parentCommerceAccountId": @(parentCommerceAccountId),
		@"logo": @(logo),
		@"logoBytes": [self toString:logoBytes],
		@"email": [self checkNull: email],
		@"taxId": [self checkNull: taxId],
		@"type": @(type),
		@"active": @(active),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccount/upsert-commerce-account": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end