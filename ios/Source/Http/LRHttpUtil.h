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

extern NSString *const LR_ERROR_DOMAIN;
extern NSString *const LR_GET;
extern NSString *const LR_HEAD;
extern NSString *const LR_IF_MODIFIED_SINCE;
extern NSString *const LR_LAST_MODIFIED;
extern NSString *const LR_POST;
extern const int LR_STATUS_OK;
extern const int LR_STATUS_UNAUTHORIZED;

/**
 * @author Bruno Farache
 */
@interface LRHttpUtil : NSObject

typedef void (^LRHandler)(NSURLResponse *r, NSData *d, NSError *e);

+ (NSURL *)getURL:(LRSession *)session path:(NSString *)path;

+ (id)handleServerException:(id)data response:(NSHTTPURLResponse *)response
	error:(NSError **)error;

+ (NSArray *)post:(LRSession *)session command:(NSDictionary *)command
	error:(NSError **)error;

+ (NSArray *)post:(LRSession *)session commands:(NSArray *)commands
	error:(NSError **)error;

@end