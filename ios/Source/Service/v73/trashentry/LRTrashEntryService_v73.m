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

#import "LRTrashEntryService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRTrashEntryService_v73

- (void)moveEntryWithClassName:(NSString *)className classPK:(long long)classPK destinationContainerModelId:(long long)destinationContainerModelId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"destinationContainerModelId": @(destinationContainerModelId),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/trash.trashentry/move-entry": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)restoreEntryWithClassName:(NSString *)className classPK:(long long)classPK overrideClassPK:(long long)overrideClassPK name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"overrideClassPK": @(overrideClassPK),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/trash.trashentry/restore-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)restoreEntryWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/trash.trashentry/restore-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)restoreEntryWithEntryId:(long long)entryId overrideClassPK:(long long)overrideClassPK name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"entryId": @(entryId),
		@"overrideClassPK": @(overrideClassPK),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/trash.trashentry/restore-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)restoreEntryWithEntryId:(long long)entryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"entryId": @(entryId)
	}];

	NSDictionary *_command = @{@"/trash.trashentry/restore-entry": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteEntriesWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/trash.trashentry/delete-entries": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteEntriesWithEntryIds:(NSArray *)entryIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"entryIds": [self checkNull: entryIds]
	}];

	NSDictionary *_command = @{@"/trash.trashentry/delete-entries": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getEntriesWithGroupId:(long long)groupId className:(NSString *)className start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.trash.model.TrashEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/trash.trashentry/get-entries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getEntriesWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/trash.trashentry/get-entries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getEntriesWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.trash.model.TrashEntry>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/trash.trashentry/get-entries": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getEntriesWithGroupId:(long long)groupId className:(NSString *)className error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className]
	}];

	NSDictionary *_command = @{@"/trash.trashentry/get-entries": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteEntryWithEntryId:(long long)entryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"entryId": @(entryId)
	}];

	NSDictionary *_command = @{@"/trash.trashentry/delete-entry": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteEntryWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/trash.trashentry/delete-entry": _params};

	[self.session invoke:_command error:error];
}

@end