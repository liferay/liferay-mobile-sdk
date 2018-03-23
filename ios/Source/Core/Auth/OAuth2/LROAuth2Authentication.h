/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
#import "LRAuthentication.h"

/**
 * @author Victor Galán
 */
NS_ASSUME_NONNULL_BEGIN
@interface LROAuth2Authentication : NSObject<LRAuthentication>

@property (nonatomic, copy) NSString *accessToken;
@property (nonatomic, copy) NSString *refreshToken;
@property (nonatomic, copy) NSString *scope;
@property (nonatomic) NSDate *accessTokenExpirationDate;
@property (nonatomic, copy) NSString *clientId;
@property (nonatomic, copy, nullable) NSString *clientSecret;

- (instancetype)initWithAccessToken:(NSString *)accessToken
	refreshToken:(NSString *)refreshToken scope:(NSString *)scope
	accessTokenExpirationDate:(NSDate *)accessTokenExpirationDate
	clientId:(NSString *)clientId clientSecret:(NSString *_Nullable)clientSecret;

@end
NS_ASSUME_NONNULL_END
