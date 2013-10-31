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
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface SCFrameworkVersionService_v62 : BaseService

- (NSDictionary *)getFrameworkVersion:(long)frameworkVersionId;
- (NSDictionary *)addFrameworkVersion:(NSString *)name url:(NSString *)url active:(BOOL)active priority:(int)priority serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateFrameworkVersion:(long)frameworkVersionId name:(NSString *)name url:(NSString *)url active:(BOOL)active priority:(int)priority;
- (NSArray *)getFrameworkVersions:(long)groupId active:(BOOL)active start:(int)start end:(int)end;
- (void)deleteFrameworkVersion:(long)frameworkVersionId;

@end