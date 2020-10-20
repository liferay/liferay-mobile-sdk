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

#import "LRCpdefinitionService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdefinitionService_v73

- (NSString *)getLayoutUuidWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/get-layout-uuid": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateStatusWithUserId:(long long)userId cpDefinitionId:(long long)cpDefinitionId status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext workflowContext:(NSDictionary *)workflowContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"cpDefinitionId": @(cpDefinitionId),
		@"status": @(status),
		@"workflowContext": [self checkNull: workflowContext]
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];
	NSDictionary *_command = @{@"/commerce.cpdefinition/update-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSString *)getUrlTitleMapAsXmlWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/get-url-title-map-as-xml": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpDefinitionWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/get-cp-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpDefinitionWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/delete-cp-definition": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)copyCpDefinitionWithCpDefinitionId:(long long)cpDefinitionId groupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/copy-cp-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpDefinitionWithGroupId:(long long)groupId userId:(long long)userId nameMap:(NSDictionary *)nameMap shortDescriptionMap:(NSDictionary *)shortDescriptionMap descriptionMap:(NSDictionary *)descriptionMap urlTitleMap:(NSDictionary *)urlTitleMap metaTitleMap:(NSDictionary *)metaTitleMap metaDescriptionMap:(NSDictionary *)metaDescriptionMap metaKeywordsMap:(NSDictionary *)metaKeywordsMap productTypeName:(NSString *)productTypeName ignoreSKUCombinations:(BOOL)ignoreSKUCombinations shippable:(BOOL)shippable freeShipping:(BOOL)freeShipping shipSeparately:(BOOL)shipSeparately shippingExtraPrice:(double)shippingExtraPrice width:(double)width height:(double)height depth:(double)depth weight:(double)weight cpTaxCategoryId:(long long)cpTaxCategoryId taxExempt:(BOOL)taxExempt telcoOrElectronics:(BOOL)telcoOrElectronics ddmStructureKey:(NSString *)ddmStructureKey published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire defaultSku:(NSString *)defaultSku subscriptionEnabled:(BOOL)subscriptionEnabled subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"nameMap": [self checkNull: nameMap],
		@"shortDescriptionMap": [self checkNull: shortDescriptionMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"urlTitleMap": [self checkNull: urlTitleMap],
		@"metaTitleMap": [self checkNull: metaTitleMap],
		@"metaDescriptionMap": [self checkNull: metaDescriptionMap],
		@"metaKeywordsMap": [self checkNull: metaKeywordsMap],
		@"productTypeName": [self checkNull: productTypeName],
		@"ignoreSKUCombinations": @(ignoreSKUCombinations),
		@"shippable": @(shippable),
		@"freeShipping": @(freeShipping),
		@"shipSeparately": @(shipSeparately),
		@"shippingExtraPrice": @(shippingExtraPrice),
		@"width": @(width),
		@"height": @(height),
		@"depth": @(depth),
		@"weight": @(weight),
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"taxExempt": @(taxExempt),
		@"telcoOrElectronics": @(telcoOrElectronics),
		@"ddmStructureKey": [self checkNull: ddmStructureKey],
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
		@"defaultSku": [self checkNull: defaultSku],
		@"subscriptionEnabled": @(subscriptionEnabled),
		@"subscriptionLength": @(subscriptionLength),
		@"subscriptionType": [self checkNull: subscriptionType],
		@"subscriptionTypeSettingsUnicodeProperties": [self checkNull: subscriptionTypeSettingsUnicodeProperties],
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinition/add-cp-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpDefinitionWithGroupId:(long long)groupId userId:(long long)userId nameMap:(NSDictionary *)nameMap shortDescriptionMap:(NSDictionary *)shortDescriptionMap descriptionMap:(NSDictionary *)descriptionMap urlTitleMap:(NSDictionary *)urlTitleMap metaTitleMap:(NSDictionary *)metaTitleMap metaDescriptionMap:(NSDictionary *)metaDescriptionMap metaKeywordsMap:(NSDictionary *)metaKeywordsMap productTypeName:(NSString *)productTypeName ignoreSKUCombinations:(BOOL)ignoreSKUCombinations shippable:(BOOL)shippable freeShipping:(BOOL)freeShipping shipSeparately:(BOOL)shipSeparately shippingExtraPrice:(double)shippingExtraPrice width:(double)width height:(double)height depth:(double)depth weight:(double)weight cpTaxCategoryId:(long long)cpTaxCategoryId taxExempt:(BOOL)taxExempt telcoOrElectronics:(BOOL)telcoOrElectronics ddmStructureKey:(NSString *)ddmStructureKey published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire defaultSku:(NSString *)defaultSku subscriptionEnabled:(BOOL)subscriptionEnabled subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles deliverySubscriptionEnabled:(BOOL)deliverySubscriptionEnabled deliverySubscriptionLength:(int)deliverySubscriptionLength deliverySubscriptionType:(NSString *)deliverySubscriptionType deliverySubscriptionTypeSettingsUnicodeProperties:(NSDictionary *)deliverySubscriptionTypeSettingsUnicodeProperties deliveryMaxSubscriptionCycles:(long long)deliveryMaxSubscriptionCycles externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"nameMap": [self checkNull: nameMap],
		@"shortDescriptionMap": [self checkNull: shortDescriptionMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"urlTitleMap": [self checkNull: urlTitleMap],
		@"metaTitleMap": [self checkNull: metaTitleMap],
		@"metaDescriptionMap": [self checkNull: metaDescriptionMap],
		@"metaKeywordsMap": [self checkNull: metaKeywordsMap],
		@"productTypeName": [self checkNull: productTypeName],
		@"ignoreSKUCombinations": @(ignoreSKUCombinations),
		@"shippable": @(shippable),
		@"freeShipping": @(freeShipping),
		@"shipSeparately": @(shipSeparately),
		@"shippingExtraPrice": @(shippingExtraPrice),
		@"width": @(width),
		@"height": @(height),
		@"depth": @(depth),
		@"weight": @(weight),
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"taxExempt": @(taxExempt),
		@"telcoOrElectronics": @(telcoOrElectronics),
		@"ddmStructureKey": [self checkNull: ddmStructureKey],
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
		@"defaultSku": [self checkNull: defaultSku],
		@"subscriptionEnabled": @(subscriptionEnabled),
		@"subscriptionLength": @(subscriptionLength),
		@"subscriptionType": [self checkNull: subscriptionType],
		@"subscriptionTypeSettingsUnicodeProperties": [self checkNull: subscriptionTypeSettingsUnicodeProperties],
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
		@"deliverySubscriptionEnabled": @(deliverySubscriptionEnabled),
		@"deliverySubscriptionLength": @(deliverySubscriptionLength),
		@"deliverySubscriptionType": [self checkNull: deliverySubscriptionType],
		@"deliverySubscriptionTypeSettingsUnicodeProperties": [self checkNull: deliverySubscriptionTypeSettingsUnicodeProperties],
		@"deliveryMaxSubscriptionCycles": @(deliveryMaxSubscriptionCycles),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinition/add-cp-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteAssetCategoryCpDefinitionWithCpDefinitionId:(long long)cpDefinitionId categoryId:(long long)categoryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"categoryId": @(categoryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinition/delete-asset-category-cp-definition": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/fetch-cp-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionByCProductExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/fetch-cp-definition-by-c-product-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionByCProductIdWithCProductId:(long long)cProductId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cProductId": @(cProductId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/fetch-cp-definition-by-c-product-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionsWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinition>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpdefinition/get-cp-definitions": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionsCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/get-cp-definitions-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpDefinitionsWithCompanyId:(long long)companyId keywords:(NSString *)keywords status:(int)status start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpdefinition/search-cp-definitions": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpDefinitionsWithCompanyId:(long long)companyId keywords:(NSString *)keywords filterFields:(NSString *)filterFields filterValues:(NSString *)filterValues start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"filterFields": [self checkNull: filterFields],
		@"filterValues": [self checkNull: filterValues],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpdefinition/search-cp-definitions": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionWithCpDefinitionId:(long long)cpDefinitionId nameMap:(NSDictionary *)nameMap shortDescriptionMap:(NSDictionary *)shortDescriptionMap descriptionMap:(NSDictionary *)descriptionMap urlTitleMap:(NSDictionary *)urlTitleMap metaTitleMap:(NSDictionary *)metaTitleMap metaDescriptionMap:(NSDictionary *)metaDescriptionMap metaKeywordsMap:(NSDictionary *)metaKeywordsMap ignoreSKUCombinations:(BOOL)ignoreSKUCombinations ddmStructureKey:(NSString *)ddmStructureKey published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"nameMap": [self checkNull: nameMap],
		@"shortDescriptionMap": [self checkNull: shortDescriptionMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"urlTitleMap": [self checkNull: urlTitleMap],
		@"metaTitleMap": [self checkNull: metaTitleMap],
		@"metaDescriptionMap": [self checkNull: metaDescriptionMap],
		@"metaKeywordsMap": [self checkNull: metaKeywordsMap],
		@"ignoreSKUCombinations": @(ignoreSKUCombinations),
		@"ddmStructureKey": [self checkNull: ddmStructureKey],
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

	NSDictionary *_command = @{@"/commerce.cpdefinition/update-cp-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionAccountGroupFilterWithCpDefinitionId:(long long)cpDefinitionId enable:(BOOL)enable error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"enable": @(enable)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/update-cp-definition-account-group-filter": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionCategorizationWithCpDefinitionId:(long long)cpDefinitionId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinition/update-cp-definition-categorization": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionChannelFilterWithCpDefinitionId:(long long)cpDefinitionId enable:(BOOL)enable error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"enable": @(enable)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/update-cp-definition-channel-filter": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateShippingInfoWithCpDefinitionId:(long long)cpDefinitionId shippable:(BOOL)shippable freeShipping:(BOOL)freeShipping shipSeparately:(BOOL)shipSeparately shippingExtraPrice:(double)shippingExtraPrice width:(double)width height:(double)height depth:(double)depth weight:(double)weight serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"shippable": @(shippable),
		@"freeShipping": @(freeShipping),
		@"shipSeparately": @(shipSeparately),
		@"shippingExtraPrice": @(shippingExtraPrice),
		@"width": @(width),
		@"height": @(height),
		@"depth": @(depth),
		@"weight": @(weight),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinition/update-shipping-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSubscriptionInfoWithCpDefinitionId:(long long)cpDefinitionId subscriptionEnabled:(BOOL)subscriptionEnabled subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"subscriptionEnabled": @(subscriptionEnabled),
		@"subscriptionLength": @(subscriptionLength),
		@"subscriptionType": [self checkNull: subscriptionType],
		@"subscriptionTypeSettingsUnicodeProperties": [self checkNull: subscriptionTypeSettingsUnicodeProperties],
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinition/update-subscription-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateSubscriptionInfoWithCpDefinitionId:(long long)cpDefinitionId subscriptionEnabled:(BOOL)subscriptionEnabled subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles deliverySubscriptionEnabled:(BOOL)deliverySubscriptionEnabled deliverySubscriptionLength:(int)deliverySubscriptionLength deliverySubscriptionType:(NSString *)deliverySubscriptionType deliverySubscriptionTypeSettingsUnicodeProperties:(NSDictionary *)deliverySubscriptionTypeSettingsUnicodeProperties deliveryMaxSubscriptionCycles:(long long)deliveryMaxSubscriptionCycles error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
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

	NSDictionary *_command = @{@"/commerce.cpdefinition/update-subscription-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateTaxCategoryInfoWithCpDefinitionId:(long long)cpDefinitionId cpTaxCategoryId:(long long)cpTaxCategoryId taxExempt:(BOOL)taxExempt telcoOrElectronics:(BOOL)telcoOrElectronics error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"taxExempt": @(taxExempt),
		@"telcoOrElectronics": @(telcoOrElectronics)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinition/update-tax-category-info": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCpDefinitionWithGroupId:(long long)groupId userId:(long long)userId nameMap:(NSDictionary *)nameMap shortDescriptionMap:(NSDictionary *)shortDescriptionMap descriptionMap:(NSDictionary *)descriptionMap urlTitleMap:(NSDictionary *)urlTitleMap metaTitleMap:(NSDictionary *)metaTitleMap metaDescriptionMap:(NSDictionary *)metaDescriptionMap metaKeywordsMap:(NSDictionary *)metaKeywordsMap productTypeName:(NSString *)productTypeName ignoreSKUCombinations:(BOOL)ignoreSKUCombinations shippable:(BOOL)shippable freeShipping:(BOOL)freeShipping shipSeparately:(BOOL)shipSeparately shippingExtraPrice:(double)shippingExtraPrice width:(double)width height:(double)height depth:(double)depth weight:(double)weight cpTaxCategoryId:(long long)cpTaxCategoryId taxExempt:(BOOL)taxExempt telcoOrElectronics:(BOOL)telcoOrElectronics ddmStructureKey:(NSString *)ddmStructureKey published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire defaultSku:(NSString *)defaultSku subscriptionEnabled:(BOOL)subscriptionEnabled subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles deliverySubscriptionEnabled:(BOOL)deliverySubscriptionEnabled deliverySubscriptionLength:(int)deliverySubscriptionLength deliverySubscriptionType:(NSString *)deliverySubscriptionType deliverySubscriptionTypeSettingsUnicodeProperties:(NSDictionary *)deliverySubscriptionTypeSettingsUnicodeProperties deliveryMaxSubscriptionCycles:(long long)deliveryMaxSubscriptionCycles externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"nameMap": [self checkNull: nameMap],
		@"shortDescriptionMap": [self checkNull: shortDescriptionMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"urlTitleMap": [self checkNull: urlTitleMap],
		@"metaTitleMap": [self checkNull: metaTitleMap],
		@"metaDescriptionMap": [self checkNull: metaDescriptionMap],
		@"metaKeywordsMap": [self checkNull: metaKeywordsMap],
		@"productTypeName": [self checkNull: productTypeName],
		@"ignoreSKUCombinations": @(ignoreSKUCombinations),
		@"shippable": @(shippable),
		@"freeShipping": @(freeShipping),
		@"shipSeparately": @(shipSeparately),
		@"shippingExtraPrice": @(shippingExtraPrice),
		@"width": @(width),
		@"height": @(height),
		@"depth": @(depth),
		@"weight": @(weight),
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"taxExempt": @(taxExempt),
		@"telcoOrElectronics": @(telcoOrElectronics),
		@"ddmStructureKey": [self checkNull: ddmStructureKey],
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
		@"defaultSku": [self checkNull: defaultSku],
		@"subscriptionEnabled": @(subscriptionEnabled),
		@"subscriptionLength": @(subscriptionLength),
		@"subscriptionType": [self checkNull: subscriptionType],
		@"subscriptionTypeSettingsUnicodeProperties": [self checkNull: subscriptionTypeSettingsUnicodeProperties],
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
		@"deliverySubscriptionEnabled": @(deliverySubscriptionEnabled),
		@"deliverySubscriptionLength": @(deliverySubscriptionLength),
		@"deliverySubscriptionType": [self checkNull: deliverySubscriptionType],
		@"deliverySubscriptionTypeSettingsUnicodeProperties": [self checkNull: deliverySubscriptionTypeSettingsUnicodeProperties],
		@"deliveryMaxSubscriptionCycles": @(deliveryMaxSubscriptionCycles),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinition/upsert-cp-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCpDefinitionWithGroupId:(long long)groupId userId:(long long)userId nameMap:(NSDictionary *)nameMap shortDescriptionMap:(NSDictionary *)shortDescriptionMap descriptionMap:(NSDictionary *)descriptionMap urlTitleMap:(NSDictionary *)urlTitleMap metaTitleMap:(NSDictionary *)metaTitleMap metaDescriptionMap:(NSDictionary *)metaDescriptionMap metaKeywordsMap:(NSDictionary *)metaKeywordsMap productTypeName:(NSString *)productTypeName ignoreSKUCombinations:(BOOL)ignoreSKUCombinations shippable:(BOOL)shippable freeShipping:(BOOL)freeShipping shipSeparately:(BOOL)shipSeparately shippingExtraPrice:(double)shippingExtraPrice width:(double)width height:(double)height depth:(double)depth weight:(double)weight cpTaxCategoryId:(long long)cpTaxCategoryId taxExempt:(BOOL)taxExempt telcoOrElectronics:(BOOL)telcoOrElectronics ddmStructureKey:(NSString *)ddmStructureKey published:(BOOL)published displayDateMonth:(int)displayDateMonth displayDateDay:(int)displayDateDay displayDateYear:(int)displayDateYear displayDateHour:(int)displayDateHour displayDateMinute:(int)displayDateMinute expirationDateMonth:(int)expirationDateMonth expirationDateDay:(int)expirationDateDay expirationDateYear:(int)expirationDateYear expirationDateHour:(int)expirationDateHour expirationDateMinute:(int)expirationDateMinute neverExpire:(BOOL)neverExpire defaultSku:(NSString *)defaultSku subscriptionEnabled:(BOOL)subscriptionEnabled subscriptionLength:(int)subscriptionLength subscriptionType:(NSString *)subscriptionType subscriptionTypeSettingsUnicodeProperties:(NSDictionary *)subscriptionTypeSettingsUnicodeProperties maxSubscriptionCycles:(long long)maxSubscriptionCycles externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"nameMap": [self checkNull: nameMap],
		@"shortDescriptionMap": [self checkNull: shortDescriptionMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"urlTitleMap": [self checkNull: urlTitleMap],
		@"metaTitleMap": [self checkNull: metaTitleMap],
		@"metaDescriptionMap": [self checkNull: metaDescriptionMap],
		@"metaKeywordsMap": [self checkNull: metaKeywordsMap],
		@"productTypeName": [self checkNull: productTypeName],
		@"ignoreSKUCombinations": @(ignoreSKUCombinations),
		@"shippable": @(shippable),
		@"freeShipping": @(freeShipping),
		@"shipSeparately": @(shipSeparately),
		@"shippingExtraPrice": @(shippingExtraPrice),
		@"width": @(width),
		@"height": @(height),
		@"depth": @(depth),
		@"weight": @(weight),
		@"cpTaxCategoryId": @(cpTaxCategoryId),
		@"taxExempt": @(taxExempt),
		@"telcoOrElectronics": @(telcoOrElectronics),
		@"ddmStructureKey": [self checkNull: ddmStructureKey],
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
		@"defaultSku": [self checkNull: defaultSku],
		@"subscriptionEnabled": @(subscriptionEnabled),
		@"subscriptionLength": @(subscriptionLength),
		@"subscriptionType": [self checkNull: subscriptionType],
		@"subscriptionTypeSettingsUnicodeProperties": [self checkNull: subscriptionTypeSettingsUnicodeProperties],
		@"maxSubscriptionCycles": @(maxSubscriptionCycles),
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinition/upsert-cp-definition": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)updateCpDisplayLayoutWithCpDefinitionId:(long long)cpDefinitionId layoutUuid:(NSString *)layoutUuid serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"layoutUuid": [self checkNull: layoutUuid],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinition/update-cp-display-layout": _params};

	[self.session invoke:_command error:error];
}

@end