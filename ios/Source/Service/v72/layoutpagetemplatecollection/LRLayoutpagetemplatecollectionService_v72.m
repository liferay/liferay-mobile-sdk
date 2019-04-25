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

#import "LRLayoutpagetemplatecollectionService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRLayoutpagetemplatecollectionService_v72

- (void)deleteLayoutPageTemplateCollectionsWithLayoutPageTemplateCollectionIds:(NSArray *)layoutPageTemplateCollectionIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateCollectionIds": [self checkNull: layoutPageTemplateCollectionIds]
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/delete-layout-page-template-collections": _params};

	[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateCollectionsCountWithGroupId:(long long)groupId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/get-layout-page-template-collections-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getLayoutPageTemplateCollectionsCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/get-layout-page-template-collections-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteLayoutPageTemplateCollectionWithLayoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/delete-layout-page-template-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchLayoutPageTemplateCollectionWithLayoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/fetch-layout-page-template-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateCollectionsWithGroupId:(long long)groupId name:(NSString *)name start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/get-layout-page-template-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateCollectionsWithGroupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/get-layout-page-template-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateCollectionsWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/get-layout-page-template-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getLayoutPageTemplateCollectionsWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateCollection>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/get-layout-page-template-collections": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateLayoutPageTemplateCollectionWithLayoutPageTemplateCollectionId:(long long)layoutPageTemplateCollectionId name:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"layoutPageTemplateCollectionId": @(layoutPageTemplateCollectionId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description]
	}];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/update-layout-page-template-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addLayoutPageTemplateCollectionWithGroupId:(long long)groupId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/layout.layoutpagetemplatecollection/add-layout-page-template-collection": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end