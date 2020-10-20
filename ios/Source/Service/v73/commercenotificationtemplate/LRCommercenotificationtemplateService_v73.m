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

#import "LRCommercenotificationtemplateService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercenotificationtemplateService_v73

- (NSDictionary *)getCommerceNotificationTemplateWithCommerceNotificationTemplateId:(long long)commerceNotificationTemplateId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceNotificationTemplateId": @(commerceNotificationTemplateId)
	}];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplate/get-commerce-notification-template": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceNotificationTemplateWithName:(NSString *)name description:(NSString *)description from:(NSString *)from fromNameMap:(NSDictionary *)fromNameMap to:(NSString *)to cc:(NSString *)cc bcc:(NSString *)bcc type:(NSString *)type enabled:(BOOL)enabled subjectMap:(NSDictionary *)subjectMap bodyMap:(NSDictionary *)bodyMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"from": [self checkNull: from],
		@"fromNameMap": [self checkNull: fromNameMap],
		@"to": [self checkNull: to],
		@"cc": [self checkNull: cc],
		@"bcc": [self checkNull: bcc],
		@"type": [self checkNull: type],
		@"enabled": @(enabled),
		@"subjectMap": [self checkNull: subjectMap],
		@"bodyMap": [self checkNull: bodyMap],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplate/add-commerce-notification-template": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceNotificationTemplateWithUserId:(long long)userId groupId:(long long)groupId name:(NSString *)name description:(NSString *)description from:(NSString *)from fromNameMap:(NSDictionary *)fromNameMap to:(NSString *)to cc:(NSString *)cc bcc:(NSString *)bcc type:(NSString *)type enabled:(BOOL)enabled subjectMap:(NSDictionary *)subjectMap bodyMap:(NSDictionary *)bodyMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"from": [self checkNull: from],
		@"fromNameMap": [self checkNull: fromNameMap],
		@"to": [self checkNull: to],
		@"cc": [self checkNull: cc],
		@"bcc": [self checkNull: bcc],
		@"type": [self checkNull: type],
		@"enabled": @(enabled),
		@"subjectMap": [self checkNull: subjectMap],
		@"bodyMap": [self checkNull: bodyMap],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplate/add-commerce-notification-template": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceNotificationTemplateWithCommerceNotificationTemplateId:(long long)commerceNotificationTemplateId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceNotificationTemplateId": @(commerceNotificationTemplateId)
	}];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplate/delete-commerce-notification-template": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceNotificationTemplatesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.notification.model.CommerceNotificationTemplate>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplate/get-commerce-notification-templates": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceNotificationTemplatesWithGroupId:(long long)groupId enabled:(BOOL)enabled start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"enabled": @(enabled),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.notification.model.CommerceNotificationTemplate>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplate/get-commerce-notification-templates": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceNotificationTemplatesCountWithGroupId:(long long)groupId enabled:(BOOL)enabled error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"enabled": @(enabled)
	}];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplate/get-commerce-notification-templates-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceNotificationTemplatesCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplate/get-commerce-notification-templates-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceNotificationTemplateWithCommerceNotificationTemplateId:(long long)commerceNotificationTemplateId name:(NSString *)name description:(NSString *)description from:(NSString *)from fromNameMap:(NSDictionary *)fromNameMap to:(NSString *)to cc:(NSString *)cc bcc:(NSString *)bcc type:(NSString *)type enabled:(BOOL)enabled subjectMap:(NSDictionary *)subjectMap bodyMap:(NSDictionary *)bodyMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceNotificationTemplateId": @(commerceNotificationTemplateId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"from": [self checkNull: from],
		@"fromNameMap": [self checkNull: fromNameMap],
		@"to": [self checkNull: to],
		@"cc": [self checkNull: cc],
		@"bcc": [self checkNull: bcc],
		@"type": [self checkNull: type],
		@"enabled": @(enabled),
		@"subjectMap": [self checkNull: subjectMap],
		@"bodyMap": [self checkNull: bodyMap],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercenotificationtemplate/update-commerce-notification-template": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end