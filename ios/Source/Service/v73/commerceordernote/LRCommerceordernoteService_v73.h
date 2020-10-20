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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRCommerceordernoteService_v73 : LRBaseService

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommerceOrderNoteWithCommerceOrderId:(long long)commerceOrderId content:(NSString *)content restricted:(BOOL)restricted serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getCommerceOrderNotesWithCommerceOrderId:(long long)commerceOrderId restricted:(BOOL)restricted error:(NSError **)error;
- (NSArray *)getCommerceOrderNotesWithCommerceOrderId:(long long)commerceOrderId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommerceOrderNotesCountWithCommerceOrderId:(long long)commerceOrderId error:(NSError **)error;
- (NSNumber *)getCommerceOrderNotesCountWithCommerceOrderId:(long long)commerceOrderId restricted:(BOOL)restricted error:(NSError **)error;
- (NSDictionary *)updateCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId content:(NSString *)content restricted:(BOOL)restricted error:(NSError **)error;
- (NSDictionary *)upsertCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId commerceOrderId:(long long)commerceOrderId content:(NSString *)content restricted:(BOOL)restricted externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId error:(NSError **)error;
- (void)deleteCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceOrderNoteWithCommerceOrderNoteId:(long long)commerceOrderNoteId error:(NSError **)error;

@end