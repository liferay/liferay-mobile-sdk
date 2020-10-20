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

#import "LRCpoptionvalueService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpoptionvalueService_v73

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"externalReferenceCode": [self checkNull: externalReferenceCode]
	}];

	NSDictionary *_command = @{@"/commerce.cpoptionvalue/fetch-by-external-reference-code": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpOptionValuesWithCpOptionId:(long long)cpOptionId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionId": @(cpOptionId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.cpoptionvalue/get-cp-option-values": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpOptionValueWithCpOptionId:(long long)cpOptionId titleMap:(NSDictionary *)titleMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionId": @(cpOptionId),
		@"titleMap": [self checkNull: titleMap],
		@"priority": @(priority),
		@"key": [self checkNull: key],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpoptionvalue/add-cp-option-value": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCpOptionValueWithCpOptionValueId:(long long)cpOptionValueId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionValueId": @(cpOptionValueId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoptionvalue/delete-cp-option-value": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpOptionValueWithCpOptionValueId:(long long)cpOptionValueId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionValueId": @(cpOptionValueId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoptionvalue/get-cp-option-value": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpOptionValuesCountWithCpOptionId:(long long)cpOptionId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionId": @(cpOptionId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoptionvalue/get-cp-option-values-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpOptionValueWithCpOptionValueId:(long long)cpOptionValueId titleMap:(NSDictionary *)titleMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionValueId": @(cpOptionValueId),
		@"titleMap": [self checkNull: titleMap],
		@"priority": @(priority),
		@"key": [self checkNull: key],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpoptionvalue/update-cp-option-value": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)upsertCpOptionValueWithCpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionId": @(cpOptionId),
		@"nameMap": [self checkNull: nameMap],
		@"priority": @(priority),
		@"key": [self checkNull: key],
		@"externalReferenceCode": [self checkNull: externalReferenceCode],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpoptionvalue/upsert-cp-option-value": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpOptionValueWithCpOptionValueId:(long long)cpOptionValueId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpOptionValueId": @(cpOptionValueId)
	}];

	NSDictionary *_command = @{@"/commerce.cpoptionvalue/fetch-cp-option-value": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end