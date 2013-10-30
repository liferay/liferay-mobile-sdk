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
@interface ShoppingOrderService_v62 : NSObject

- (NSDictionary *)updateOrder:(NSNumber *)groupId orderId:(NSNumber *)orderId ppTxnId:(NSString *)ppTxnId ppPaymentStatus:(NSString *)ppPaymentStatus ppPaymentGross:(NSNumber *)ppPaymentGross ppReceiverEmail:(NSString *)ppReceiverEmail ppPayerEmail:(NSString *)ppPayerEmail;
- (void)deleteOrder:(NSNumber *)groupId orderId:(NSNumber *)orderId;
- (NSDictionary *)getOrder:(NSNumber *)groupId orderId:(NSNumber *)orderId;
- (void)completeOrder:(NSNumber *)groupId number:(NSString *)number ppTxnId:(NSString *)ppTxnId ppPaymentStatus:(NSString *)ppPaymentStatus ppPaymentGross:(NSNumber *)ppPaymentGross ppReceiverEmail:(NSString *)ppReceiverEmail ppPayerEmail:(NSString *)ppPayerEmail serviceContext:(NSDictionary *)serviceContext;
- (void)sendEmail:(NSNumber *)groupId orderId:(NSNumber *)orderId emailType:(NSString *)emailType serviceContext:(NSDictionary *)serviceContext;

@end