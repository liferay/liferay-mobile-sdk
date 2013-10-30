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

/**
 * author Bruno Farache
 */
@interface SCFrameworkVersionService_v62 : NSObject

- (NSDictionary *)getFrameworkVersion:(NSNumber *)frameworkVersionId;
- (NSDictionary *)addFrameworkVersion:(NSString *)name url:(NSString *)url active:(BOOL)active priority:(NSNumber *)priority serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateFrameworkVersion:(NSNumber *)frameworkVersionId name:(NSString *)name url:(NSString *)url active:(BOOL)active priority:(NSNumber *)priority;
- (NSArray *)getFrameworkVersions:(NSNumber *)groupId active:(BOOL)active start:(NSNumber *)start end:(NSNumber *)end;
- (void)deleteFrameworkVersion:(NSNumber *)frameworkVersionId;

@end