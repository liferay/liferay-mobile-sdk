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
@interface CountryService_v62 : NSObject

- (NSDictionary *)getCountryByName:(NSString *)name;
- (NSDictionary *)getCountryByA2:(NSString *)a2;
- (NSDictionary *)getCountryByA3:(NSString *)a3;
- (NSDictionary *)fetchCountry:(NSNumber *)countryId;
- (NSDictionary *)getCountry:(NSNumber *)countryId;
- (NSDictionary *)fetchCountryByA3:(NSString *)a3;
- (NSDictionary *)fetchCountryByA2:(NSString *)a2;
- (NSArray *)getCountries:(BOOL)active;
- (NSDictionary *)addCountry:(NSString *)name a2:(NSString *)a2 a3:(NSString *)a3 number:(NSString *)number idd:(NSString *)idd active:(BOOL)active;

@end