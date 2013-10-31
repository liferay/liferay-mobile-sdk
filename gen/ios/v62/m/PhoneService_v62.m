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

#import "PhoneService_v62.h"

/**
 * author Bruno Farache
 */
@implementation PhoneService_v62

- (NSArray *)getPhones:(NSString *)className classPK:(long)classPK {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/phone/get-phones": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)getPhone:(long)phoneId {
	NSDictionary *_params = @{
		@"phoneId": @(phoneId)
	};

	NSDictionary *_command = @{@"/phone/get-phone": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addPhone:(NSString *)className classPK:(long)classPK number:(NSString *)number extension:(NSString *)extension typeId:(int)typeId primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK),
		@"number": number,
		@"extension": extension,
		@"typeId": @(typeId),
		@"primary": @(primary),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/phone/add-phone": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updatePhone:(long)phoneId number:(NSString *)number extension:(NSString *)extension typeId:(int)typeId primary:(BOOL)primary {
	NSDictionary *_params = @{
		@"phoneId": @(phoneId),
		@"number": number,
		@"extension": extension,
		@"typeId": @(typeId),
		@"primary": @(primary)
	};

	NSDictionary *_command = @{@"/phone/update-phone": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deletePhone:(long)phoneId {
	NSDictionary *_params = @{
		@"phoneId": @(phoneId)
	};

	NSDictionary *_command = @{@"/phone/delete-phone": _params};

	[self.session invoke:_command];
}

@end