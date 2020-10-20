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

#import "LRLayoutpagetemplateentryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRLayoutpagetemplateentryService_v73

- (NSDictionary *)updateStatusWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/update-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name type:(int)type status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/add-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name type:(int)type masterLayoutPlid:(long long)masterLayoutPlid status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"masterLayoutPlid": @(masterLayoutPlid),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/add-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name status:(int)status classNameId:(long long)classNameId classTypeId:(long long)classTypeId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"name": [self checkNull: name],
		@"status": @(status),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/add-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name masterLayoutPlid:(long long)masterLayoutPlid status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"name": [self checkNull: name],
		@"masterLayoutPlid": @(masterLayoutPlid),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/add-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"name": [self checkNull: name],
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/add-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/update-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId defaultTemplate:(BOOL)defaultTemplate error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
		@"defaultTemplate": @(defaultTemplate)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/update-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId fragmentEntryIds:(NSArray *)fragmentEntryIds editableValues:(NSString *)editableValues serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
		@"fragmentEntryIds": [self checkNull: fragmentEntryIds],
		@"editableValues": [self checkNull: editableValues],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/update-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId previewFileEntryId:(long long)previewFileEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
		@"previewFileEntryId": @(previewFileEntryId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/update-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId name:(NSString *)name fragmentEntryIds:(NSArray *)fragmentEntryIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
		@"name": [self checkNull: name],
		@"fragmentEntryIds": [self checkNull: fragmentEntryIds],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/update-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)copyLayoutPageTemplateEntryWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId layoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/copy-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/delete-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchDefaultLayoutPageTemplateEntryWithGroupId:(long long)groupId type:(int)type status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"type": @(type),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/fetch-default-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchDefaultLayoutPageTemplateEntryWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/fetch-default-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchLayoutPageTemplateEntryWithLayoutPageTemplateEntryId:(long long)layoutPageTemplateEntryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryId": @(layoutPageTemplateEntryId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/fetch-layout-page-template-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"name": [self checkNull: name],
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"type": @(type),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId name:(NSString *)name type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId name:(NSString *)name type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"type": @(type),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"type": @(type),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId type:(int)type defaultTemplate:(BOOL)defaultTemplate error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"type": @(type),
		@"defaultTemplate": @(defaultTemplate)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"type": @(type),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"type": @(type),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchLayoutPageTemplateEntryByUuidAndGroupIdWithUuid:(NSString *)uuid groupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"uuid": [self checkNull: uuid],
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/fetch-layout-page-template-entry-by-uuid-and-group-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"name": [self checkNull: name],
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name type:(int)type status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId name:(NSString *)name type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId name:(NSString *)name type:(int)type status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"type": @(type),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId type:(int)type status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"type": @(type),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"type": @(type),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountWithGroupId:(long long)groupId classNameId:(long long)classNameId classTypeId:(long long)classTypeId name:(NSString *)name type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"classNameId": @(classNameId),
		@"classTypeId": @(classTypeId),
		@"name": [self checkNull: name],
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteLayoutPageTemplateEntriesWithLayoutPageTemplateEntryIds:(NSArray *)layoutPageTemplateEntryIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateEntryIds": [self checkNull: layoutPageTemplateEntryIds]
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/delete-layout-page-template-entries": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateEntriesByTypeWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId type:(int)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"type": @(type),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-by-type": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateEntriesCountByTypeWithGroupId:(long long)groupId layoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId type:(int)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"type": @(type)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplateentry/get-layout-page-template-entries-count-by-type": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

@end