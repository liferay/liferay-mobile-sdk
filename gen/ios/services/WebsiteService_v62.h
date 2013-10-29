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

/**
 * author: Bruno Farache
 */
@interface WebsiteService_v62 : NSObject

- (NSArray *)getWebsites:(NSString *)className classPK:(NSNumber *)classPK;
- (NSDictionary *)updateWebsite:(NSNumber *)websiteId url:(NSString *)url typeId:(NSNumber *)typeId primary:(BOOL)primary;
- (void)deleteWebsite:(NSNumber *)websiteId;
- (NSDictionary *)addWebsite:(NSString *)className classPK:(NSNumber *)classPK url:(NSString *)url typeId:(NSNumber *)typeId primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getWebsite:(NSNumber *)websiteId;

@end