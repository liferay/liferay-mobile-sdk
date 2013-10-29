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

/**
 * author: Bruno Farache
 */
@interface MBMessageService_v62 : NSObject

- (void)unsubscribeMessage:(NSNumber *)messageId;
- (NSDictionary *)addDiscussionMessage:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(NSNumber *)permissionClassPK permissionOwnerId:(NSNumber *)permissionOwnerId threadId:(NSNumber *)threadId parentMessageId:(NSNumber *)parentMessageId subject:(NSString *)subject body:(NSString *)body serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getCategoryMessages:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (NSString *)getCompanyMessagesRss:(NSNumber *)companyId status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSNumber *)getCategoryMessagesCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status;
- (NSNumber *)getGroupMessagesCount:(NSNumber *)groupId status:(NSNumber *)status;
- (NSDictionary *)addMessage:(NSNumber *)parentMessageId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(NSNumber *)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getMessageDisplay:(NSNumber *)messageId status:(NSNumber *)status threadView:(NSString *)threadView includePrevAndNext:(BOOL)includePrevAndNext;
- (NSDictionary *)updateDiscussionMessage:(NSString *)className classPK:(NSNumber *)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(NSNumber *)permissionClassPK permissionOwnerId:(NSNumber *)permissionOwnerId messageId:(NSNumber *)messageId subject:(NSString *)subject body:(NSString *)body serviceContext:(NSDictionary *)serviceContext;
- (void)deleteMessageAttachments:(NSNumber *)messageId;
- (void)deleteDiscussionMessage:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(NSNumber *)permissionClassPK permissionOwnerId:(NSNumber *)permissionOwnerId messageId:(NSNumber *)messageId;
- (NSString *)getThreadMessagesRss:(NSNumber *)threadId status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSDictionary *)updateMessage:(NSNumber *)messageId subject:(NSString *)subject body:(NSString *)body inputStreamOVPs:(NSArray *)inputStreamOVPs existingFiles:(NSArray *)existingFiles priority:(NSNumber *)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext;
- (NSNumber *)getThreadAnswersCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId threadId:(NSNumber *)threadId;
- (void)deleteMessage:(NSNumber *)messageId;
- (NSString *)getCategoryMessagesRss:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSDictionary *)getMessage:(NSNumber *)messageId;
- (NSNumber *)getThreadMessagesCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId threadId:(NSNumber *)threadId status:(NSNumber *)status;
- (void)restoreMessageAttachmentFromTrash:(NSNumber *)messageId fileName:(NSString *)fileName;
- (void)updateAnswer:(NSNumber *)messageId answer:(BOOL)answer cascade:(BOOL)cascade;
- (NSArray *)getThreadMessages:(NSNumber *)groupId categoryId:(NSNumber *)categoryId threadId:(NSNumber *)threadId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (void)subscribeMessage:(NSNumber *)messageId;
- (NSString *)getGroupMessagesRss:(NSNumber *)groupId status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;

@end