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

@interface LRBatchSession ()

@property (atomic, strong) NSMutableArray *commands;

@end

@implementation LRBatchSession

- (id)initWithServer:(NSString *)server username:(NSString *)username
		password:(NSString *)password connectionTimeout:(int)connectionTimeout
		callback:(id<LRCallback>)callback queue:(NSOperationQueue *)queue {

	self = [super initWithServer:server username:username password:password
		connectionTimeout:connectionTimeout callback:callback queue:queue];

	if (self) {
		self.commands = [[NSMutableArray alloc] init];
	}

	return self;
}

- (NSArray *)invoke:(NSError **)error {
	if ([self.commands count] == 0) {
		return nil;
	}

	NSArray *results = [LRHttpUtil post:self
		commands:[NSArray arrayWithArray:self.commands] error:error];

	self.commands = [[NSMutableArray alloc] init];

	return results;
}

- (NSArray *)invoke:(NSDictionary *)command error:(NSError **)error {
	[self.commands addObject:command];

	return nil;
}

- (NSOperation *)upload:(NSDictionary *)command error:(NSError **)error {
	[NSException raise:@"" format:@"Can't batch upload requests"];

	return nil;
}

@end