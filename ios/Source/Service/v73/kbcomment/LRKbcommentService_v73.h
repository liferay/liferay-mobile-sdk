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
@interface LRKbcommentService_v73 : LRBaseService

- (NSDictionary *)updateStatusWithKbCommentId:(long long)kbCommentId status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateKbCommentWithKbCommentId:(long long)kbCommentId classNameId:(long long)classNameId classPK:(long long)classPK content:(NSString *)content serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateKbCommentWithKbCommentId:(long long)kbCommentId classNameId:(long long)classNameId classPK:(long long)classPK content:(NSString *)content status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteKbCommentWithKbComment:(LRJSONObjectWrapper *)kbComment error:(NSError **)error;
- (NSDictionary *)deleteKbCommentWithKbCommentId:(long long)kbCommentId error:(NSError **)error;
- (NSDictionary *)getKbCommentWithKbCommentId:(long long)kbCommentId error:(NSError **)error;
- (NSArray *)getKbCommentsWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getKbCommentsWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getKbCommentsWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getKbCommentsWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getKbCommentsWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getKbCommentsWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getKbCommentsCountWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK status:(int)status error:(NSError **)error;
- (NSNumber *)getKbCommentsCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSNumber *)getKbCommentsCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error;
- (NSNumber *)getKbCommentsCountWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;

@end