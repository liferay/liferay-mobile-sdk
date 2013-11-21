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
@interface LRMBMessageService_v62 : BaseService

- (NSDictionary *)addDiscussionMessageWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(long)permissionClassPK permissionOwnerId:(long)permissionOwnerId threadId:(long)threadId parentMessageId:(long)parentMessageId subject:(NSString *)subject body:(NSString *)body serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addMessageWithGroupId:(long)groupId categoryId:(long)categoryId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addMessageWithGroupId:(long)groupId categoryId:(long)categoryId threadId:(long)threadId parentMessageId:(long)parentMessageId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addMessageWithCategoryId:(long)categoryId subject:(NSString *)subject body:(NSString *)body serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addMessageWithParentMessageId:(long)parentMessageId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteDiscussionMessageWithGroupId:(long)groupId className:(NSString *)className classPK:(long)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(long)permissionClassPK permissionOwnerId:(long)permissionOwnerId messageId:(long)messageId error:(NSError **)error;
- (void)deleteMessageWithMessageId:(long)messageId error:(NSError **)error;
- (void)deleteMessageAttachmentsWithMessageId:(long)messageId error:(NSError **)error;
- (NSArray *)getCategoryMessagesWithGroupId:(long)groupId categoryId:(long)categoryId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (int)getCategoryMessagesCountWithGroupId:(long)groupId categoryId:(long)categoryId status:(int)status error:(NSError **)error;
- (NSString *)getCategoryMessagesRssWithGroupId:(long)groupId categoryId:(long)categoryId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (NSString *)getCompanyMessagesRssWithCompanyId:(long)companyId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (int)getGroupMessagesCountWithGroupId:(long)groupId status:(int)status error:(NSError **)error;
- (NSString *)getGroupMessagesRssWithGroupId:(long)groupId userId:(long)userId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (NSString *)getGroupMessagesRssWithGroupId:(long)groupId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (NSDictionary *)getMessageWithMessageId:(long)messageId error:(NSError **)error;
- (NSDictionary *)getMessageDisplayWithMessageId:(long)messageId status:(int)status threadView:(NSString *)threadView includePrevAndNext:(BOOL)includePrevAndNext error:(NSError **)error;
- (int)getThreadAnswersCountWithGroupId:(long)groupId categoryId:(long)categoryId threadId:(long)threadId error:(NSError **)error;
- (NSArray *)getThreadMessagesWithGroupId:(long)groupId categoryId:(long)categoryId threadId:(long)threadId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (int)getThreadMessagesCountWithGroupId:(long)groupId categoryId:(long)categoryId threadId:(long)threadId status:(int)status error:(NSError **)error;
- (NSString *)getThreadMessagesRssWithThreadId:(long)threadId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay error:(NSError **)error;
- (void)restoreMessageAttachmentFromTrashWithMessageId:(long)messageId fileName:(NSString *)fileName error:(NSError **)error;
- (void)subscribeMessageWithMessageId:(long)messageId error:(NSError **)error;
- (void)unsubscribeMessageWithMessageId:(long)messageId error:(NSError **)error;
- (void)updateAnswerWithMessageId:(long)messageId answer:(BOOL)answer cascade:(BOOL)cascade error:(NSError **)error;
- (NSDictionary *)updateDiscussionMessageWithClassName:(NSString *)className classPK:(long)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(long)permissionClassPK permissionOwnerId:(long)permissionOwnerId messageId:(long)messageId subject:(NSString *)subject body:(NSString *)body serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateMessageWithMessageId:(long)messageId subject:(NSString *)subject body:(NSString *)body inputStreamOVPs:(NSArray *)inputStreamOVPs existingFiles:(NSArray *)existingFiles priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end