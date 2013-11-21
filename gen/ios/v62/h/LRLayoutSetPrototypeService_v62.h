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
@interface LRLayoutSetPrototypeService_v62 : BaseService

- (NSDictionary *)addLayoutSetPrototypeWithNameMap:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteLayoutSetPrototypeWithLayoutSetPrototypeId:(long)layoutSetPrototypeId error:(NSError **)error;
- (NSDictionary *)getLayoutSetPrototypeWithLayoutSetPrototypeId:(long)layoutSetPrototypeId error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId active:(NSDictionary *)active obc:(NSDictionary *)obc error:(NSError **)error;
- (NSDictionary *)updateLayoutSetPrototypeWithLayoutSetPrototypeId:(long)layoutSetPrototypeId settings:(NSString *)settings error:(NSError **)error;
- (NSDictionary *)updateLayoutSetPrototypeWithLayoutSetPrototypeId:(long)layoutSetPrototypeId nameMap:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end