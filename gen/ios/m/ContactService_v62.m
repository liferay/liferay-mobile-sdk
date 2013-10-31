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

#import "ContactService_v62.h"

/**
 * author Bruno Farache
 */
@implementation ContactService_v62

- (NSDictionary *)getContact:(NSNumber *)contactId {
	NSDictionary *_params = @{
		@"contactId": contactId
	};

	NSDictionary *_command = @{@"/contact/get-contact": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getContactsCount:(NSNumber *)classNameId classPK:(NSNumber *)classPK {
	NSDictionary *_params = @{
		@"classNameId": classNameId,
		@"classPK": classPK
	};

	NSDictionary *_command = @{@"/contact/get-contacts-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getContacts:(NSNumber *)classNameId classPK:(NSNumber *)classPK start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator {
	NSDictionary *_params = @{
		@"classNameId": classNameId,
		@"classPK": classPK,
		@"start": start,
		@"end": end,
		@"orderByComparator": orderByComparator
	};

	NSDictionary *_command = @{@"/contact/get-contacts": _params};

	return (NSArray *)[session invoke:_command];
}

@end