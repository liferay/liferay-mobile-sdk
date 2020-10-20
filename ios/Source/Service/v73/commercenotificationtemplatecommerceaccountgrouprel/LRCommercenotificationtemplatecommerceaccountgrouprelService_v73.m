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

#import "LRCommercenotificationtemplatecommerceaccountgrouprelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercenotificationtemplatecommerceaccountgrouprelService_v73

- (NSDictionary *)addCommerceNotificationTemplateCommerceAccountGroupRelWithCommerceNotificationTemplateId:(long long)commerceNotificationTemplateId commerceAccountGroupId:(long long)commerceAccountGroupId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceNotificationTemplateId": @(commerceNotificationTemplateId),
		@"commerceAccountGroupId": @(commerceAccountGroupId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplatecommerceaccountgrouprel/add-commerce-notification-template-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceNotificationTemplateCommerceAccountGroupRelWithCommerceNotificationTemplateId:(long long)commerceNotificationTemplateId commerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceNotificationTemplateId": @(commerceNotificationTemplateId),
		@"commerceAccountGroupId": @(commerceAccountGroupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplatecommerceaccountgrouprel/fetch-commerce-notification-template-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceNotificationTemplateCommerceAccountGroupRelsWithCommerceNotificationTemplateId:(long long)commerceNotificationTemplateId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceNotificationTemplateId": @(commerceNotificationTemplateId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.notification.model.CommerceNotificationTemplateCommerceAccountGroupRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplatecommerceaccountgrouprel/get-commerce-notification-template-commerce-account-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceNotificationTemplateCommerceAccountGroupRelWithCommerceNotificationTemplateCommerceAccountGroupRelId:(long long)commerceNotificationTemplateCommerceAccountGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceNotificationTemplateCommerceAccountGroupRelId": @(commerceNotificationTemplateCommerceAccountGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplatecommerceaccountgrouprel/delete-commerce-notification-template-commerce-account-group-rel": _params};

	[self.session invoke:_command error:error];
}

@end