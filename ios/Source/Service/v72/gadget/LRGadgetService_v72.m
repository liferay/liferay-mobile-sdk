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

#import "LRGadgetService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRGadgetService_v72

- (void)deleteGadgetWithGadgetId:(long long)gadgetId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"gadgetId": @(gadgetId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/opensocial-portlet.gadget/delete-gadget": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addGadgetWithCompanyId:(long long)companyId url:(NSString *)url portletCategoryNames:(NSString *)portletCategoryNames serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"url": [self checkNull: url],
		@"portletCategoryNames": [self checkNull: portletCategoryNames],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/opensocial-portlet.gadget/add-gadget": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)updateGadgetWithGadgetId:(long long)gadgetId portletCategoryNames:(NSString *)portletCategoryNames serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"gadgetId": @(gadgetId),
		@"portletCategoryNames": [self checkNull: portletCategoryNames],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/opensocial-portlet.gadget/update-gadget": _params};

	[self.session invoke:_command error:error];
}

@end