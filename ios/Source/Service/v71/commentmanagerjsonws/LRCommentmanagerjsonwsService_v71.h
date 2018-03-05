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
@interface LRCommentmanagerjsonwsService_v71 : LRBaseService

- (void)deleteCommentWithCommentId:(long long)commentId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSNumber *)updateCommentWithClassName:(NSString *)className classPK:(long long)classPK commentId:(long long)commentId subject:(NSString *)subject body:(NSString *)body error:(NSError **)error;
- (void)subscribeDiscussionWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsubscribeDiscussionWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSNumber *)getCommentsCountWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (BOOL)hasDiscussionWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSNumber *)addCommentWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK body:(NSString *)body error:(NSError **)error;
- (NSArray *)getCommentsWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommentsWithCommentId:(long long)commentId start:(int)start end:(int)end error:(NSError **)error;

@end