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

#import "LRCpdefinitionlinkService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdefinitionlinkService_v73

- (NSDictionary *)addCpDefinitionLinkWithCpDefinitionId:(long long)cpDefinitionId cProductId:(long long)cProductId priority:(double)priority type:(NSString *)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"cProductId": @(cProductId),
		@"priority": @(priority),
		@"type": [self checkNull: type],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/add-cp-definition-link": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpDefinitionLinkWithCpDefinitionLinkId:(long long)cpDefinitionLinkId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionLinkId": @(cpDefinitionLinkId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/delete-cp-definition-link": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/get-cp-definition-links": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/get-cp-definition-links": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId type:(NSString *)type start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"type": [self checkNull: type],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinitionLink>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/get-cp-definition-links": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId type:(NSString *)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"type": [self checkNull: type]
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/get-cp-definition-links": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionLinksCountWithCpDefinitionId:(long long)cpDefinitionId type:(NSString *)type error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"type": [self checkNull: type]
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/get-cp-definition-links-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionLinksCountWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/get-cp-definition-links-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionLinkWithCpDefinitionLinkId:(long long)cpDefinitionLinkId priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionLinkId": @(cpDefinitionLinkId),
		@"priority": @(priority),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/update-cp-definition-link": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)updateCpDefinitionLinksWithCpDefinitionId:(long long)cpDefinitionId cpDefinitionIds2:(NSArray *)cpDefinitionIds2 type:(NSString *)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionId": @(cpDefinitionId),
		@"cpDefinitionIds2": [self checkNull: cpDefinitionIds2],
		@"type": [self checkNull: type],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/update-cp-definition-links": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionLinkWithCpDefinitionLinkId:(long long)cpDefinitionLinkId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionLinkId": @(cpDefinitionLinkId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/fetch-cp-definition-link": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpDefinitionLinkWithCpDefinitionLinkId:(long long)cpDefinitionLinkId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionLinkId": @(cpDefinitionLinkId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionlink/get-cp-definition-link": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end