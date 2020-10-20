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

#import "LRCommerceaccountgrouprelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommerceaccountgrouprelService_v73

- (void)deleteCommerceAccountGroupRelsWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgrouprel/delete-commerce-account-group-rels": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceAccountGroupRelWithClassName:(NSString *)className classPK:(long long)classPK commerceAccountGroupId:(long long)commerceAccountGroupId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"commerceAccountGroupId": @(commerceAccountGroupId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commerceaccountgrouprel/add-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAccountGroupRelsWithClassName:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.account.model.CommerceAccountGroupRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceaccountgrouprel/get-commerce-account-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceAccountGroupRelsWithCommerceAccountGroupId:(long long)commerceAccountGroupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupId": @(commerceAccountGroupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.account.model.CommerceAccountGroupRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commerceaccountgrouprel/get-commerce-account-group-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAccountGroupRelsCountWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgrouprel/get-commerce-account-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceAccountGroupRelsCountWithCommerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupId": @(commerceAccountGroupId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgrouprel/get-commerce-account-group-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceAccountGroupRelWithCommerceAccountGroupRelId:(long long)commerceAccountGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupRelId": @(commerceAccountGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgrouprel/delete-commerce-account-group-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceAccountGroupRelWithCommerceAccountGroupRelId:(long long)commerceAccountGroupRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceAccountGroupRelId": @(commerceAccountGroupRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commerceaccountgrouprel/get-commerce-account-group-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end