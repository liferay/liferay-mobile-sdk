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

#import "LRCpinstanceService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpinstanceService_v73

- (NSDictionary *)fetchCpInstanceWithCpInstanceId:(long long)cpInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId)
	}];

	NSDictionary *_command = @{@"/commerce.cpinstance/fetch-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpInstanceWithCpInstanceId:(long long)cpInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId)
	}];

	NSDictionary *_command = @{@"/commerce.cpinstance/get-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.cpinstance/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)buildCpInstancesWithCpDefinitionId:(long long)cpDefinitionId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/build-cp-instances": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateShippingInfoWithCpInstanceId:(long long)cpInstanceId width:(double)width height:(double)height depth:(double)depth weight:(double)weight serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"width": @(width),
		@"height": @(height),
		@"depth": @(depth),
		@"weight": @(weight),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/update-shipping-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSubscriptionInfoWithCpInstanceId:(long long)cpInstanceId overrideSubscriptionInfo:(BOOL)overrideSubscriptionInfo subscriptionEnabled:(BOOL)subscriptionEnabled subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles deliverySubscriptionEnabled:(BOOL)deliverySubscriptionEnabled deliverySubscriptionLength:(int)deliverySubscriptionLength deliverySubscriptionType:(NSString *)deliverySubscriptionType deliverySubscriptionTypeSettingsUnicodeProperties:(NSDictionary *)deliverySubscriptionTypeSettingsUnicodeProperties deliveryMaxSubscriptionCycles:(long long)deliveryMaxSubscriptionCycles error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"overrideSubscriptionInfo": @(overrideSubscriptionInfo),
		@"subscriptionEnabled": @(subscriptionEnabled),
		@"subscriptionLength": @(subscriptionLength),
		@"subscriptionType": [self checkNull: subscriptionType],
		@"subscriptionTypeSettingsUnicodeProperties": [self checkNull: subscriptionTypeSettingsUnicodeProperties],
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
		@"deliverySubscriptionEnabled": @(deliverySubscriptionEnabled),
		@"deliverySubscriptionLength": @(deliverySubscriptionLength),
		@"deliverySubscriptionType": [self checkNull: deliverySubscriptionType],
		@"deliverySubscriptionTypeSettingsUnicodeProperties": [self checkNull: deliverySubscriptionTypeSettingsUnicodeProperties],
		@"deliveryMaxSubscriptionCycles": @(deliveryMaxSubscriptionCycles)
	}];

	NSDictionary *_command = @{@"/commerce.cpinstance/update-subscription-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSubscriptionInfoWithCpInstanceId:(long long)cpInstanceId overrideSubscriptionInfo:(BOOL)overrideSubscriptionInfo subscriptionEnabled:(BOOL)subscriptionEnabled subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"overrideSubscriptionInfo": @(overrideSubscriptionInfo),
		@"subscriptionEnabled": @(subscriptionEnabled),
		@"subscriptionLength": @(subscriptionLength),
		@"subscriptionType": [self checkNull: subscriptionType],
		@"subscriptionTypeSettingsUnicodeProperties": [self checkNull: subscriptionTypeSettingsUnicodeProperties],
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/update-subscription-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpInstanceWithCpDefinitionId:(long long)cpDefinitionId groupId:(long long)groupId sku:(NSString *)sku gtin:(NSString *)gtin manufacturerPartNumber:(NSString *)manufacturerPartNumber purchasable:(BOOL)purchasable cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds:(NSDictionary *)cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"groupId": @(groupId),
		@"sku": [self checkNull: sku],
		@"gtin": [self checkNull: gtin],
		@"manufacturerPartNumber": [self checkNull: manufacturerPartNumber],
		@"purchasable": @(purchasable),
		@"cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds": [self checkNull: cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds],
		@"published": @(published),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/add-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpInstanceWithCpDefinitionId:(long long)cpDefinitionId groupId:(long long)groupId sku:(NSString *)sku gtin:(NSString *)gtin manufacturerPartNumber:(NSString *)manufacturerPartNumber purchasable:(BOOL)purchasable json:(NSString *)json published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire unspsc:(NSString *)unspsc serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"groupId": @(groupId),
		@"sku": [self checkNull: sku],
		@"gtin": [self checkNull: gtin],
		@"manufacturerPartNumber": [self checkNull: manufacturerPartNumber],
		@"purchasable": @(purchasable),
		@"json": [self checkNull: json],
		@"published": @(published),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
		@"unspsc": [self checkNull: unspsc],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/add-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpInstanceWithCpDefinitionId:(long long)cpDefinitionId groupId:(long long)groupId sku:(NSString *)sku gtin:(NSString *)gtin manufacturerPartNumber:(NSString *)manufacturerPartNumber purchasable:(BOOL)purchasable json:(NSString *)json published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"groupId": @(groupId),
		@"sku": [self checkNull: sku],
		@"gtin": [self checkNull: gtin],
		@"manufacturerPartNumber": [self checkNull: manufacturerPartNumber],
		@"purchasable": @(purchasable),
		@"json": [self checkNull: json],
		@"published": @(published),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/add-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpInstanceWithCpDefinitionId:(long long)cpDefinitionId groupId:(long long)groupId sku:(NSString *)sku gtin:(NSString *)gtin manufacturerPartNumber:(NSString *)manufacturerPartNumber purchasable:(BOOL)purchasable cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds:(NSDictionary *)cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire unspsc:(NSString *)unspsc serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"groupId": @(groupId),
		@"sku": [self checkNull: sku],
		@"gtin": [self checkNull: gtin],
		@"manufacturerPartNumber": [self checkNull: manufacturerPartNumber],
		@"purchasable": @(purchasable),
		@"cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds": [self checkNull: cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds],
		@"published": @(published),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
		@"unspsc": [self checkNull: unspsc],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/add-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpInstanceWithCpInstanceId:(long long)cpInstanceId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId)
	}];

	NSDictionary *_command = @{@"/commerce.cpinstance/delete-cp-instance": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCProductInstanceWithCProductId:(long long)cProductId cpInstanceUuid:(NSString *)cpInstanceUuid error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cProductId": @(cProductId),
		@"cpInstanceUuid": [self checkNull: cpInstanceUuid]
	}];

	NSDictionary *_command = @{@"/commerce.cpinstance/fetch-c-product-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionInstancesWithCpDefinitionId:(long long)cpDefinitionId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPInstance>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpinstance/get-cp-definition-instances": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionInstancesCountWithCpDefinitionId:(long long)cpDefinitionId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/commerce.cpinstance/get-cp-definition-instances-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpInstancesWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPInstance>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpinstance/get-cp-instances": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpInstancesCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/commerce.cpinstance/get-cp-instances-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpDefinitionInstancesWithCompanyId:(long long)companyId cpDefinitionId:(long long)cpDefinitionId keywords:(NSString *)keywords status:(int)status sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"cpDefinitionId": @(cpDefinitionId),
		@"keywords": [self checkNull: keywords],
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpinstance/search-cp-definition-instances": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpDefinitionInstancesWithCompanyId:(long long)companyId cpDefinitionId:(long long)cpDefinitionId keywords:(NSString *)keywords status:(int)status start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"cpDefinitionId": @(cpDefinitionId),
		@"keywords": [self checkNull: keywords],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpinstance/search-cp-definition-instances": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpInstancesWithCompanyId:(long long)companyId groupId:(long long)groupId keywords:(NSString *)keywords status:(int)status start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"keywords": [self checkNull: keywords],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpinstance/search-cp-instances": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpInstancesWithCompanyId:(long long)companyId keywords:(NSString *)keywords status:(int)status start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpinstance/search-cp-instances": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpInstanceWithCpInstanceId:(long long)cpInstanceId sku:(NSString *)sku gtin:(NSString *)gtin manufacturerPartNumber:(NSString *)manufacturerPartNumber purchasable:(BOOL)purchasable published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire unspsc:(NSString *)unspsc serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"sku": [self checkNull: sku],
		@"gtin": [self checkNull: gtin],
		@"manufacturerPartNumber": [self checkNull: manufacturerPartNumber],
		@"purchasable": @(purchasable),
		@"published": @(published),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
		@"unspsc": [self checkNull: unspsc],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/update-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpInstanceWithCpInstanceId:(long long)cpInstanceId sku:(NSString *)sku gtin:(NSString *)gtin manufacturerPartNumber:(NSString *)manufacturerPartNumber purchasable:(BOOL)purchasable published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"sku": [self checkNull: sku],
		@"gtin": [self checkNull: gtin],
		@"manufacturerPartNumber": [self checkNull: manufacturerPartNumber],
		@"purchasable": @(purchasable),
		@"published": @(published),
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/update-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePricingInfoWithCpInstanceId:(long long)cpInstanceId price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice cost:(NSDictionary *)cost serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpInstanceId": @(cpInstanceId),
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
		@"cost": [self checkNull: cost],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/update-pricing-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCpInstanceWithCpDefinitionId:(long long)cpDefinitionId groupId:(long long)groupId sku:(NSString *)sku gtin:(NSString *)gtin manufacturerPartNumber:(NSString *)manufacturerPartNumber purchasable:(BOOL)purchasable json:(NSString *)json width:(double)width height:(double)height depth:(double)depth weight:(double)weight price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice cost:(NSDictionary *)cost published:(BOOL)published externalReferenceCode:(NSString *)externalReferenceCode displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"groupId": @(groupId),
		@"sku": [self checkNull: sku],
		@"gtin": [self checkNull: gtin],
		@"manufacturerPartNumber": [self checkNull: manufacturerPartNumber],
		@"purchasable": @(purchasable),
		@"json": [self checkNull: json],
		@"width": @(width),
		@"height": @(height),
		@"depth": @(depth),
		@"weight": @(weight),
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
		@"cost": [self checkNull: cost],
		@"published": @(published),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/upsert-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCpInstanceWithCpDefinitionId:(long long)cpDefinitionId groupId:(long long)groupId sku:(NSString *)sku gtin:(NSString *)gtin manufacturerPartNumber:(NSString *)manufacturerPartNumber purchasable:(BOOL)purchasable json:(NSString *)json width:(double)width height:(double)height depth:(double)depth weight:(double)weight price:(NSDictionary *)price promoPrice:(NSDictionary *)promoPrice cost:(NSDictionary *)cost published:(BOOL)published externalReferenceCode:(NSString *)externalReferenceCode displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire unspsc:(NSString *)unspsc serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"groupId": @(groupId),
		@"sku": [self checkNull: sku],
		@"gtin": [self checkNull: gtin],
		@"manufacturerPartNumber": [self checkNull: manufacturerPartNumber],
		@"purchasable": @(purchasable),
		@"json": [self checkNull: json],
		@"width": @(width),
		@"height": @(height),
		@"depth": @(depth),
		@"weight": @(weight),
		@"price": [self checkNull: price],
		@"promoPrice": [self checkNull: promoPrice],
		@"cost": [self checkNull: cost],
		@"published": @(published),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
		@"displayDateMonth": @(displayDateMonth),
		@"displayDateDay": @(displayDateDay),
		@"displayDateYear": @(displayDateYear),
		@"displayDateHour": @(displayDateHour),
		@"displayDateMinute": @(displayDateMinute),
		@"expirationDateMonth": @(expirationDateMonth),
		@"expirationDateDay": @(expirationDateDay),
		@"expirationDateYear": @(expirationDateYear),
		@"expirationDateHour": @(expirationDateHour),
		@"expirationDateMinute": @(expirationDateMinute),
		@"neverExpire": @(neverExpire),
		@"unspsc": [self checkNull: unspsc],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpinstance/upsert-cp-instance": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end