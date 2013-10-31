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
@interface MBMessageService_v62 : BaseService

- (void)unsubscribeMessage:(long)messageId;
- (NSDictionary *)addDiscussionMessage:(long)groupId className:(NSString *)className classPK:(long)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(long)permissionClassPK permissionOwnerId:(long)permissionOwnerId threadId:(long)threadId parentMessageId:(long)parentMessageId subject:(NSString *)subject body:(NSString *)body serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getCategoryMessages:(long)groupId categoryId:(long)categoryId status:(int)status start:(int)start end:(int)end;
- (NSString *)getCompanyMessagesRss:(long)companyId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (int)getCategoryMessagesCount:(long)groupId categoryId:(long)categoryId status:(int)status;
- (int)getGroupMessagesCount:(long)groupId status:(int)status;
- (NSDictionary *)addMessage:(long)parentMessageId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getMessageDisplay:(long)messageId status:(int)status threadView:(NSString *)threadView includePrevAndNext:(BOOL)includePrevAndNext;
- (NSDictionary *)updateDiscussionMessage:(NSString *)className classPK:(long)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(long)permissionClassPK permissionOwnerId:(long)permissionOwnerId messageId:(long)messageId subject:(NSString *)subject body:(NSString *)body serviceContext:(NSDictionary *)serviceContext;
- (void)deleteMessageAttachments:(long)messageId;
- (void)deleteDiscussionMessage:(long)groupId className:(NSString *)className classPK:(long)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(long)permissionClassPK permissionOwnerId:(long)permissionOwnerId messageId:(long)messageId;
- (NSString *)getThreadMessagesRss:(long)threadId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSDictionary *)updateMessage:(long)messageId subject:(NSString *)subject body:(NSString *)body inputStreamOVPs:(NSArray *)inputStreamOVPs existingFiles:(NSArray *)existingFiles priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext;
- (int)getThreadAnswersCount:(long)groupId categoryId:(long)categoryId threadId:(long)threadId;
- (void)deleteMessage:(long)messageId;
- (NSString *)getCategoryMessagesRss:(long)groupId categoryId:(long)categoryId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;
- (NSDictionary *)getMessage:(long)messageId;
- (int)getThreadMessagesCount:(long)groupId categoryId:(long)categoryId threadId:(long)threadId status:(int)status;
- (void)restoreMessageAttachmentFromTrash:(long)messageId fileName:(NSString *)fileName;
- (void)updateAnswer:(long)messageId answer:(BOOL)answer cascade:(BOOL)cascade;
- (NSArray *)getThreadMessages:(long)groupId categoryId:(long)categoryId threadId:(long)threadId status:(int)status start:(int)start end:(int)end;
- (void)subscribeMessage:(long)messageId;
- (NSString *)getGroupMessagesRss:(long)groupId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay;

@end