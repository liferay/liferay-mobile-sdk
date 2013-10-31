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
	NSDictionary *_params = @{
		@"couponId": couponId,
		@"name": name,
		@"description": description,
		@"startDateMonth": startDateMonth,
		@"startDateDay": startDateDay,
		@"startDateYear": startDateYear,
		@"startDateHour": startDateHour,
		@"startDateMinute": startDateMinute,
		@"endDateMonth": endDateMonth,
		@"endDateDay": endDateDay,
		@"endDateYear": endDateYear,
		@"endDateHour": endDateHour,
		@"endDateMinute": endDateMinute,
		@"neverExpire": neverExpire,
		@"active": active,
		@"limitCategories": limitCategories,
		@"limitSkus": limitSkus,
		@"minOrder": minOrder,
		@"discount": discount,
		@"discountType": discountType,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingcoupon/update-coupon": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addCoupon:(NSString *)code autoCode:(BOOL)autoCode name:(NSString *)name description:(NSString *)description startDateMonth:(NSNumber *)startDateMonth startDateDay:(NSNumber *)startDateDay startDateYear:(NSNumber *)startDateYear startDateHour:(NSNumber *)startDateHour startDateMinute:(NSNumber *)startDateMinute endDateMonth:(NSNumber *)endDateMonth endDateDay:(NSNumber *)endDateDay endDateYear:(NSNumber *)endDateYear endDateHour:(NSNumber *)endDateHour endDateMinute:(NSNumber *)endDateMinute neverExpire:(BOOL)neverExpire active:(BOOL)active limitCategories:(NSString *)limitCategories limitSkus:(NSString *)limitSkus minOrder:(NSNumber *)minOrder discount:(NSNumber *)discount discountType:(NSString *)discountType serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"code": code,
		@"autoCode": autoCode,
		@"name": name,
		@"description": description,
		@"startDateMonth": startDateMonth,
		@"startDateDay": startDateDay,
		@"startDateYear": startDateYear,
		@"startDateHour": startDateHour,
		@"startDateMinute": startDateMinute,
		@"endDateMonth": endDateMonth,
		@"endDateDay": endDateDay,
		@"endDateYear": endDateYear,
		@"endDateHour": endDateHour,
		@"endDateMinute": endDateMinute,
		@"neverExpire": neverExpire,
		@"active": active,
		@"limitCategories": limitCategories,
		@"limitSkus": limitSkus,
		@"minOrder": minOrder,
		@"discount": discount,
		@"discountType": discountType,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingcoupon/add-coupon": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)search:(NSNumber *)groupId companyId:(NSNumber *)companyId code:(NSString *)code active:(BOOL)active discountType:(NSString *)discountType andOperator:(BOOL)andOperator start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"companyId": companyId,
		@"code": code,
		@"active": active,
		@"discountType": discountType,
		@"andOperator": andOperator,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/shoppingcoupon/search": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)deleteCoupon:(NSNumber *)groupId couponId:(NSNumber *)couponId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"couponId": couponId
	};

	NSDictionary *_command = @{@"/shoppingcoupon/delete-coupon": _params};

	[session invoke:_command];
}

- (NSDictionary *)getCoupon:(NSNumber *)groupId couponId:(NSNumber *)couponId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"couponId": couponId
	};

	NSDictionary *_command = @{@"/shoppingcoupon/get-coupon": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end