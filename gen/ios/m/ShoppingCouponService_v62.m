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

#import "ShoppingCouponService_v62.h"

/**
 * author Bruno Farache
 */
@implementation ShoppingCouponService_v62

- (NSDictionary *)updateCoupon:(NSNumber *)couponId name:(NSString *)name description:(NSString *)description startDateMonth:(NSNumber *)startDateMonth startDateDay:(NSNumber *)startDateDay startDateYear:(NSNumber *)startDateYear startDateHour:(NSNumber *)startDateHour startDateMinute:(NSNumber *)startDateMinute endDateMonth:(NSNumber *)endDateMonth endDateDay:(NSNumber *)endDateDay endDateYear:(NSNumber *)endDateYear endDateHour:(NSNumber *)endDateHour endDateMinute:(NSNumber *)endDateMinute neverExpire:(BOOL)neverExpire active:(BOOL)active limitCategories:(NSString *)limitCategories limitSkus:(NSString *)limitSkus minOrder:(NSNumber *)minOrder discount:(NSNumber *)discount discountType:(NSString *)discountType serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)addCoupon:(NSString *)code autoCode:(BOOL)autoCode name:(NSString *)name description:(NSString *)description startDateMonth:(NSNumber *)startDateMonth startDateDay:(NSNumber *)startDateDay startDateYear:(NSNumber *)startDateYear startDateHour:(NSNumber *)startDateHour startDateMinute:(NSNumber *)startDateMinute endDateMonth:(NSNumber *)endDateMonth endDateDay:(NSNumber *)endDateDay endDateYear:(NSNumber *)endDateYear endDateHour:(NSNumber *)endDateHour endDateMinute:(NSNumber *)endDateMinute neverExpire:(BOOL)neverExpire active:(BOOL)active limitCategories:(NSString *)limitCategories limitSkus:(NSString *)limitSkus minOrder:(NSNumber *)minOrder discount:(NSNumber *)discount discountType:(NSString *)discountType serviceContext:(NSDictionary *)serviceContext {
}

- (NSArray *)search:(NSNumber *)groupId companyId:(NSNumber *)companyId code:(NSString *)code active:(BOOL)active discountType:(NSString *)discountType andOperator:(BOOL)andOperator start:(NSNumber *)start end:(NSNumber *)end {
}

- (void)deleteCoupon:(NSNumber *)groupId couponId:(NSNumber *)couponId {
}

- (NSDictionary *)getCoupon:(NSNumber *)groupId couponId:(NSNumber *)couponId {
}

@end