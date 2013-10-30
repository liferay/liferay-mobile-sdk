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

#import "AddressService_v62.h"

/**
 * author Bruno Farache
 */
@implementation AddressService_v62

- (void)deleteAddress:(NSNumber *)addressId {
}

- (NSDictionary *)getAddress:(NSNumber *)addressId {
}

- (NSDictionary *)updateAddress:(NSNumber *)addressId street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip regionId:(NSNumber *)regionId countryId:(NSNumber *)countryId typeId:(NSNumber *)typeId mailing:(BOOL)mailing primary:(BOOL)primary {
}

- (NSArray *)getAddresses:(NSString *)className classPK:(NSNumber *)classPK {
}

- (NSDictionary *)addAddress:(NSString *)className classPK:(NSNumber *)classPK street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip regionId:(NSNumber *)regionId countryId:(NSNumber *)countryId typeId:(NSNumber *)typeId mailing:(BOOL)mailing primary:(BOOL)primary serviceContext:(NSDictionary *)serviceContext {
}

@end