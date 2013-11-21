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

#import "HttpUtil.h"
#import "BatchSession.h"

/**
 * author Bruno Farache
 */
@implementation BatchSession

- (id)init {
	self = [super init];

	if (self) {
		self.commands = [[NSMutableArray alloc] init];
	}

	return self;
}

- (NSArray *)invoke:(NSError **)error {
	NSArray *results = [HttpUtil post:self commands:self.commands error:error];

	self.commands = [[NSMutableArray alloc] init];

	return results;
}

- (NSArray *)invoke:(NSDictionary *)command error:(NSError **)error {
	[self.commands addObject:command];

	return nil;
}

@end