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

#import "LRCommercechannelrelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCommercechannelrelService_v73

- (void)deleteCommerceChannelRelsWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/delete-commerce-channel-rels": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addCommerceChannelRelWithClassName:(NSString *)className classPK:(long long)classPK commerceChannelId:(long long)commerceChannelId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"commerceChannelId": @(commerceChannelId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/add-commerce-channel-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceChannelRelsCountWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/get-commerce-channel-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceChannelRelsCountWithCommerceChannelId:(long long)commerceChannelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/get-commerce-channel-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceChannelRelsCountWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/get-commerce-channel-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCommerceChannelRelsCountWithClassName:(NSString *)className classPK:(long long)classPK classPKField:(NSString *)classPKField name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"classPKField": [self checkNull: classPKField],
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/get-commerce-channel-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCommerceChannelRelWithClassName:(NSString *)className classPK:(long long)classPK commerceChannelId:(long long)commerceChannelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"commerceChannelId": @(commerceChannelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/fetch-commerce-channel-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceChannelRelsWithClassName:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CommerceChannelRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/get-commerce-channel-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceChannelRelsWithClassName:(NSString *)className classPK:(long long)classPK classPKField:(NSString *)classPKField name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"classPKField": [self checkNull: classPKField],
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/get-commerce-channel-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceChannelRelsWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/get-commerce-channel-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCommerceChannelRelsWithCommerceChannelId:(long long)commerceChannelId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelId": @(commerceChannelId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CommerceChannelRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/get-commerce-channel-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteCommerceChannelRelWithCommerceChannelRelId:(long long)commerceChannelRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelRelId": @(commerceChannelRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/delete-commerce-channel-rel": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getCommerceChannelRelWithCommerceChannelRelId:(long long)commerceChannelRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"commerceChannelRelId": @(commerceChannelRelId)
	}];

	NSDictionary *_command = @{@"/commerce.commercechannelrel/get-commerce-channel-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end