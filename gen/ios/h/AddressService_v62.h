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
@interface AddressService_v62 : BaseService

- (void)deleteAddress:(long)addressId;
- (NSDictionary *)getAddress:(long)addressId;
- (NSDictionary *)updateAddress:(long)addressId street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip regionId:(long)regionId countryId:(long)countryId typeId:(int)typeId mailing:(BOOL)mailing primary:(BOOL)primary;
- (NSArray *)getAddresses:(NSString *)className classPK:(long)classPK;
- (NSDictionary *)addAddress:(NSString *)className classPK:(long)classPK street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip regionId:(long)regionId countryId:(long)countryId typeId:(int)typeId mailing:(BOOL)mailing primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext;

@end