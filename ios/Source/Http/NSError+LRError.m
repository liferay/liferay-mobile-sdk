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

#import "NSError+LRError.h"

NSString *const LR_ERROR_DOMAIN = @"com.liferay.mobile";

/**
 * @author Bruno Farache
 */
@implementation NSError (LRError)

+ (NSError *)errorWithCode:(NSInteger)code description:(NSString *)description {
	return [self errorWithCode:code description:description userInfo:nil];
}

+ (NSError *)errorWithCode:(NSInteger)code description:(NSString *)description
		userInfo:(NSDictionary *)userInfo {

	NSMutableDictionary *values = [[NSMutableDictionary alloc]
		initWithDictionary:userInfo];

	[values setObject:description forKey:NSLocalizedDescriptionKey];

	return [self errorWithDomain:LR_ERROR_DOMAIN code:code userInfo:values];
}

@end