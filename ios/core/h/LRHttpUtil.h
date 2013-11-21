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

#import <Foundation/Foundation.h>
#import "LRBatchSession.h"

/**
 * author Bruno Farache
 */

#define HEAD @"HEAD"
#define POST @"POST"

#define UNKNOWN -1
#define V_6_2 6200

#define ERROR_DOMAIN @"com.liferay.mobile.sync.ErrorDomain"
#define SERVER_EXCEPTION 1
#define STATUS_OK 200
#define STATUS_UNAUTHORIZED 401

@interface LRHttpUtil : NSObject

typedef void (^LRHandler)(NSURLResponse *r, NSData *d, NSError *e);

+ (int)getPortalVersion:(LRSession *)session error:(NSError **)error;
+ (int)getPortalVersionWithURL:(NSString *)URL error:(NSError **)error;

+ (NSArray *)post:(LRSession *)session command:(NSDictionary *)command
	error:(NSError **)error;

+ (NSArray *)post:(LRSession *)session commands:(NSArray *)commands
	error:(NSError **)error;

@end