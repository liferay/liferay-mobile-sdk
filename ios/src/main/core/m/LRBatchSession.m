/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

#import "LRHttpUtil.h"
#import "LRBatchSession.h"

/**
 * @author Bruno Farache
 */
@implementation LRBatchSession

- (NSArray *)invoke:(NSError **)error {
	NSArray *results = [LRHttpUtil post:self commands:self.commands
		error:error];

	self.commands = [[NSMutableArray alloc] init];

	return results;
}

- (NSArray *)invoke:(NSDictionary *)command error:(NSError **)error {
	if (!self.commands) {
		self.commands = [[NSMutableArray alloc] init];
	}

	[self.commands addObject:command];

	return nil;
}

@end