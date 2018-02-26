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
#import "LRCookieCallback.h"

NS_ASSUME_NONNULL_BEGIN
typedef void (^LRCookieFailureBlock)(NSError *);
typedef void (^LRCookieSuccessBlock)(LRSession *);

/**
 * @author Víctor Galán
 */
@interface LRBlockCookieCallback : NSObject <LRCookieCallback>

@property (nonatomic, copy) LRCookieFailureBlock failure;
@property (nonatomic, copy) LRCookieSuccessBlock success;

- (id)initWithSuccess:(LRCookieSuccessBlock)success failure:(LRCookieFailureBlock)failure;

@end
NS_ASSUME_NONNULL_END

