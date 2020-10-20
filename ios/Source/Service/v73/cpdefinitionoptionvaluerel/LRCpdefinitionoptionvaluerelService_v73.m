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

#import "LRCpdefinitionoptionvaluerelService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRCpdefinitionoptionvaluerelService_v73

- (NSArray *)getCpDefinitionOptionValueRelsWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinitionOptionValueRel>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionOptionValueRelsWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCpDefinitionOptionValueRelsWithGroupId:(long long)groupId key:(NSString *)key start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"key": [self checkNull: key],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionValueRelId": @(cpDefinitionOptionValueRelId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/fetch-cp-definition-option-value-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchCpDefinitionOptionValueRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId key:(NSString *)key error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId),
		@"key": [self checkNull: key]
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/fetch-cp-definition-option-value-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key cpInstanceId:(long long)cpInstanceId quantity:(int)quantity price:(NSDictionary *)price serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionValueRelId": @(cpDefinitionOptionValueRelId),
		@"nameMap": [self checkNull: nameMap],
		@"priority": @(priority),
		@"key": [self checkNull: key],
		@"cpInstanceId": @(cpInstanceId),
		@"quantity": @(quantity),
		@"price": [self checkNull: price],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key cpInstanceId:(long long)cpInstanceId quantity:(int)quantity preselected:(BOOL)preselected price:(NSDictionary *)price serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionValueRelId": @(cpDefinitionOptionValueRelId),
		@"nameMap": [self checkNull: nameMap],
		@"priority": @(priority),
		@"key": [self checkNull: key],
		@"cpInstanceId": @(cpInstanceId),
		@"quantity": @(quantity),
		@"preselected": @(preselected),
		@"price": [self checkNull: price],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionValueRelId": @(cpDefinitionOptionValueRelId),
		@"nameMap": [self checkNull: nameMap],
		@"priority": @(priority),
		@"key": [self checkNull: key],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addCpDefinitionOptionValueRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId nameMap:(NSDictionary *)nameMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId),
		@"nameMap": [self checkNull: nameMap],
		@"priority": @(priority),
		@"key": [self checkNull: key],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/add-cp-definition-option-value-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionValueRelId": @(cpDefinitionOptionValueRelId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/delete-cp-definition-option-value-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCpDefinitionOptionValueRelsCountWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)resetCpInstanceCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionValueRelId": @(cpDefinitionOptionValueRelId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/reset-cp-instance-cp-definition-option-value-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)searchCpDefinitionOptionValueRelsWithCompanyId:(long long)companyId groupId:(long long)groupId cpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"cpDefinitionOptionRelId": @(cpDefinitionOptionRelId),
		@"keywords": [self checkNull: keywords],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"sort" className:@"com.liferay.portal.kernel.search.Sort" wrapper:sort];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/search-cp-definition-option-value-rels": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCpDefinitionOptionValueRelPreselectedWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId preselected:(BOOL)preselected error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionValueRelId": @(cpDefinitionOptionValueRelId),
		@"preselected": @(preselected)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel-preselected": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCpDefinitionOptionValueRelWithCpDefinitionOptionValueRelId:(long long)cpDefinitionOptionValueRelId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"cpDefinitionOptionValueRelId": @(cpDefinitionOptionValueRelId)
	}];

	NSDictionary *_command = @{@"/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rel": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end