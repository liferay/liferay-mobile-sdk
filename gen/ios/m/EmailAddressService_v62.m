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

#import "EmailAddressService_v62.h"

/**
 * author Bruno Farache
 */
@implementation EmailAddressService_v62

- (NSDictionary *)updateEmailAddress:(NSNumber *)emailAddressId address:(NSString *)address typeId:(NSNumber *)typeId primary:(BOOL)primary {
	NSDictionary *_params = @{
		@"emailAddressId": emailAddressId,
		@"address": address,
		@"typeId": typeId,
		@"primary": primary
	};

	NSDictionary *_command = @{@"/emailaddress/update-email-address": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getEmailAddresses:(NSString *)className classPK:(NSNumber *)classPK {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": classPK
	};

	NSDictionary *_command = @{@"/emailaddress/get-email-addresses": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)getEmailAddress:(NSNumber *)emailAddressId {
	NSDictionary *_params = @{
		@"emailAddressId": emailAddressId
	};

	NSDictionary *_command = @{@"/emailaddress/get-email-address": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addEmailAddress:(NSString *)className classPK:(NSNumber *)classPK address:(NSString *)address typeId:(NSNumber *)typeId primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": classPK,
		@"address": address,
		@"typeId": typeId,
		@"primary": primary,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/emailaddress/add-email-address": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteEmailAddress:(NSNumber *)emailAddressId {
	NSDictionary *_params = @{
		@"emailAddressId": emailAddressId
	};

	NSDictionary *_command = @{@"/emailaddress/delete-email-address": _params};

	[session invoke:_command];
}

@end