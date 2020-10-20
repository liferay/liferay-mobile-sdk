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

#import "LRKbtemplateService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRKbtemplateService_v73

- (NSDictionary *)addKbTemplateWithPortletId:(NSString *)portletId title:(NSString *)title content:(NSString *)content serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"portletId": [self checkNull: portletId],
		@"title": [self checkNull: title],
		@"content": [self checkNull: content],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbtemplate/add-kb-template": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateKbTemplateWithKbTemplateId:(long long)kbTemplateId title:(NSString *)title content:(NSString *)content serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbTemplateId": @(kbTemplateId),
		@"title": [self checkNull: title],
		@"content": [self checkNull: content],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbtemplate/update-kb-template": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupKbTemplatesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBTemplate>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbtemplate/get-group-kb-templates": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupKbTemplatesCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/kb.kbtemplate/get-group-kb-templates-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteKbTemplateWithKbTemplateId:(long long)kbTemplateId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbTemplateId": @(kbTemplateId)
	}];

	NSDictionary *_command = @{@"/kb.kbtemplate/delete-kb-template": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteKbTemplatesWithGroupId:(long long)groupId kbTemplateIds:(NSArray *)kbTemplateIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"kbTemplateIds": [self checkNull: kbTemplateIds]
	}];

	NSDictionary *_command = @{@"/kb.kbtemplate/delete-kb-templates": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getKbTemplateSearchDisplayWithGroupId:(long long)groupId title:(NSString *)title content:(NSString *)content startDate:(long long)startDate endDate:(long long)endDate andOperator:(BOOL)andOperator curStartValues:(NSArray *)curStartValues cur:(int)cur delta:(int)delta orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"title": [self checkNull: title],
		@"content": [self checkNull: content],
		@"startDate": @(startDate),
		@"endDate": @(endDate),
		@"andOperator": @(andOperator),
		@"curStartValues": [self checkNull: curStartValues],
		@"cur": @(cur),
		@"delta": @(delta),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBTemplate>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/kb.kbtemplate/get-kb-template-search-display": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getKbTemplateWithKbTemplateId:(long long)kbTemplateId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbTemplateId": @(kbTemplateId)
	}];

	NSDictionary *_command = @{@"/kb.kbtemplate/get-kb-template": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end