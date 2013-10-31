/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import "TrashEntryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation TrashEntryService_v62

- (NSDictionary *)restoreEntry:(NSNumber *)entryId overrideClassPK:(NSNumber *)overrideClassPK name:(NSString *)name {
	NSDictionary *_params = @{
		@"entryId": entryId,
		@"overrideClassPK": overrideClassPK,
		@"name": name
	};

	NSDictionary *_command = @{@"/trashentry/restore-entry": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteEntry:(NSString *)className classPK:(NSNumber *)classPK {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": classPK
	};

	NSDictionary *_command = @{@"/trashentry/delete-entry": _params};

	[session invoke:_command];
}

- (void)moveEntry:(NSString *)className classPK:(NSNumber *)classPK destinationContainerModelId:(NSNumber *)destinationContainerModelId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": classPK,
		@"destinationContainerModelId": destinationContainerModelId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/trashentry/move-entry": _params};

	[session invoke:_command];
}

- (void)deleteEntries:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/trashentry/delete-entries": _params};

	[session invoke:_command];
}

- (NSDictionary *)getEntries:(NSNumber *)groupId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"start": start,
		@"end": end,
		@"obc": obc
	};

	NSDictionary *_command = @{@"/trashentry/get-entries": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end