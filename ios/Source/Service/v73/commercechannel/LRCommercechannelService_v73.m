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

#import "LRCommercechannelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercechannelService_v73

- (NSDictionary *)getCommerceChannelWithCommerceChannelId:(long long)commerceChannelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/get-commerce-channel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceChannelWithSiteGroupId:(long long)siteGroupId name:(NSString *)name type:(NSString *)type typeSettingsUnicodeProperties:(NSDictionary *)typeSettingsUnicodeProperties commerceCurrencyCode:(NSString *)commerceCurrencyCode externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"siteGroupId": @(siteGroupId),
		@"name": [self checkNull: name],
		@"type": [self checkNull: type],
		@"typeSettingsUnicodeProperties": [self checkNull: typeSettingsUnicodeProperties],
		@"commerceCurrencyCode": [self checkNull: commerceCurrencyCode],
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercechannel/add-commerce-channel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteCommerceChannelWithCommerceChannelId:(long long)commerceChannelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/delete-commerce-channel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceChannelWithCommerceChannelId:(long long)commerceChannelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/fetch-commerce-channel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceChannelByOrderGroupIdWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/get-commerce-channel-by-order-group-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceChannelsWithStart:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/get-commerce-channels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceChannelsWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/get-commerce-channels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchCommerceChannelsWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.commercechannel/search-commerce-channels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchCommerceChannelsWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/search-commerce-channels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCommerceChannelsCountWithCompanyId:(long long)companyId keywords:(NSString *)keywords error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords]
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/search-commerce-channels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceChannelWithCommerceChannelId:(long long)commerceChannelId siteGroupId:(long long)siteGroupId name:(NSString *)name type:(NSString *)type typeSettingsUnicodeProperties:(NSDictionary *)typeSettingsUnicodeProperties commerceCurrencyCode:(NSString *)commerceCurrencyCode priceDisplayType:(NSString *)priceDisplayType discountsTargetNetPrice:(BOOL)discountsTargetNetPrice error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId),
		@"siteGroupId": @(siteGroupId),
		@"name": [self checkNull: name],
		@"type": [self checkNull: type],
		@"typeSettingsUnicodeProperties": [self checkNull: typeSettingsUnicodeProperties],
		@"commerceCurrencyCode": [self checkNull: commerceCurrencyCode],
		@"priceDisplayType": [self checkNull: priceDisplayType],
		@"discountsTargetNetPrice": @(discountsTargetNetPrice)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/update-commerce-channel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceChannelWithCommerceChannelId:(long long)commerceChannelId siteGroupId:(long long)siteGroupId name:(NSString *)name type:(NSString *)type typeSettingsUnicodeProperties:(NSDictionary *)typeSettingsUnicodeProperties commerceCurrencyCode:(NSString *)commerceCurrencyCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId),
		@"siteGroupId": @(siteGroupId),
		@"name": [self checkNull: name],
		@"type": [self checkNull: type],
		@"typeSettingsUnicodeProperties": [self checkNull: typeSettingsUnicodeProperties],
		@"commerceCurrencyCode": [self checkNull: commerceCurrencyCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/update-commerce-channel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceChannelExternalReferenceCodeWithCommerceChannelId:(long long)commerceChannelId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.commercechannel/update-commerce-channel-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end