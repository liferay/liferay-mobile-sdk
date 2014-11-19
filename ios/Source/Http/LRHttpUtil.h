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

#import "LRSession.h"

extern NSString *const LR_GET;
extern NSString *const LR_HEAD;
extern NSString *const LR_POST;

/**
 * @author Bruno Farache
 */
@interface LRHttpUtil : NSObject

+ (NSString *)encodeURL:(NSString *)URL;
+ (NSURL *)getURL:(LRSession *)session path:(NSString *)path;

+ (NSArray *)post:(LRSession *)session command:(NSDictionary *)command
	error:(NSError **)error;

+ (NSArray *)post:(LRSession *)session commands:(NSArray *)commands
	error:(NSError **)error;

+ (void)setAuthHeader:(LRSession *)session
	request:(NSMutableURLRequest *)request;

@end