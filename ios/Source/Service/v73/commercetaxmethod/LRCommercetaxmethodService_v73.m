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

#import "LRCommercetaxmethodService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercetaxmethodService_v73

- (NSDictionary *)setActiveWithCommerceTaxMethodId:(long long)commerceTaxMethodId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxMethodId": @(commerceTaxMethodId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/set-active": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceTaxMethodWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap engineKey:(NSString *)engineKey percentage:(BOOL)percentage active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"engineKey": [self checkNull: engineKey],
		@"percentage": @(percentage),
		@"active": @(active),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/add-commerce-tax-method": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceTaxMethodWithUserId:(long long)userId groupId:(long long)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap engineKey:(NSString *)engineKey percentage:(BOOL)percentage active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"groupId": @(groupId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"engineKey": [self checkNull: engineKey],
		@"percentage": @(percentage),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/add-commerce-tax-method": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)createCommerceTaxMethodWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"commerceTaxMethodId": @(commerceTaxMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/create-commerce-tax-method": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceTaxMethodWithCommerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxMethodId": @(commerceTaxMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/get-commerce-tax-method": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceTaxMethodWithGroupId:(long long)groupId engineKey:(NSString *)engineKey error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"engineKey": [self checkNull: engineKey]
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/fetch-commerce-tax-method": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceTaxMethodsWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/get-commerce-tax-methods": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceTaxMethodsWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/get-commerce-tax-methods": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCommerceTaxMethodWithCommerceTaxMethodId:(long long)commerceTaxMethodId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap percentage:(BOOL)percentage active:(BOOL)active error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxMethodId": @(commerceTaxMethodId),
		@"nameMap": [self checkNull: nameMap],
		@"descriptionMap": [self checkNull: descriptionMap],
		@"percentage": @(percentage),
		@"active": @(active)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/update-commerce-tax-method": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceTaxMethodWithCommerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceTaxMethodId": @(commerceTaxMethodId)
	}];

	NSDictionary *_command = @{@"/commerce.commercetaxmethod/delete-commerce-tax-method": _params};

	[self.session invoke:_command error:error];
}

@end