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
@interface ShoppingOrderService_v62 : BaseService

- (NSDictionary *)updateOrder:(long)groupId orderId:(long)orderId ppTxnId:(NSString *)ppTxnId ppPaymentStatus:(NSString *)ppPaymentStatus ppPaymentGross:(double)ppPaymentGross ppReceiverEmail:(NSString *)ppReceiverEmail ppPayerEmail:(NSString *)ppPayerEmail;
- (void)deleteOrder:(long)groupId orderId:(long)orderId;
- (NSDictionary *)getOrder:(long)groupId orderId:(long)orderId;
- (void)completeOrder:(long)groupId number:(NSString *)number ppTxnId:(NSString *)ppTxnId ppPaymentStatus:(NSString *)ppPaymentStatus ppPaymentGross:(double)ppPaymentGross ppReceiverEmail:(NSString *)ppReceiverEmail ppPayerEmail:(NSString *)ppPayerEmail serviceContext:(NSDictionary *)serviceContext;
- (void)sendEmail:(long)groupId orderId:(long)orderId emailType:(NSString *)emailType serviceContext:(NSDictionary *)serviceContext;

@end