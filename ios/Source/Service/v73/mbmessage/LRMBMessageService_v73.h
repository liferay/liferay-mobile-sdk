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
@interface LRMBMessageService_v73 : LRBaseService

- (NSNumber *)getCategoryMessagesCountWithGroupId:(long long)groupId categoryId:(long long)categoryId status:(int)status error:(NSError **)error;
- (NSArray *)getThreadMessagesWithGroupId:(long long)groupId categoryId:(long long)categoryId threadId:(long long)threadId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)addDiscussionMessageWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK threadId:(long long)threadId parentMessageId:(long long)parentMessageId subject:(NSString *)subject body:(NSString *)body serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addMessageWithGroupId:(long long)groupId categoryId:(long long)categoryId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addMessageWithParentMessageId:(long long)parentMessageId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addMessageWithCategoryId:(long long)categoryId subject:(NSString *)subject body:(NSString *)body serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addMessageWithGroupId:(long long)groupId categoryId:(long long)categoryId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format fileName:(NSString *)fileName file:(LRUploadData *)file anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)addMessageAttachmentWithMessageId:(long long)messageId fileName:(NSString *)fileName file:(LRUploadData *)file mimeType:(NSString *)mimeType error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteDiscussionMessageWithMessageId:(long long)messageId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteMessageWithMessageId:(long long)messageId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteMessageAttachmentWithMessageId:(long long)messageId fileName:(NSString *)fileName error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteMessageAttachmentsWithMessageId:(long long)messageId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)emptyMessageAttachmentsWithMessageId:(long long)messageId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchMbMessageByUrlSubjectWithGroupId:(long long)groupId urlSubject:(NSString *)urlSubject error:(NSError **)error;
- (NSArray *)getCategoryMessagesWithGroupId:(long long)groupId categoryId:(long long)categoryId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getGroupMessagesCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error;
- (NSDictionary *)getMessageDisplayWithMessageId:(long long)messageId status:(int)status error:(NSError **)error;
- (NSNumber *)getThreadMessagesCountWithGroupId:(long long)groupId categoryId:(long long)categoryId threadId:(long long)threadId status:(int)status error:(NSError **)error;
- (void)moveMessageAttachmentToTrashWithMessageId:(long long)messageId fileName:(NSString *)fileName error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)restoreMessageAttachmentFromTrashWithMessageId:(long long)messageId fileName:(NSString *)fileName error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)subscribeMessageWithMessageId:(long long)messageId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsubscribeMessageWithMessageId:(long long)messageId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateDiscussionMessageWithClassName:(NSString *)className classPK:(long long)classPK messageId:(long long)messageId subject:(NSString *)subject body:(NSString *)body serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateMessageWithMessageId:(long long)messageId subject:(NSString *)subject body:(NSString *)body inputStreamOVPs:(NSArray *)inputStreamOVPs priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteTempAttachmentWithGroupId:(long long)groupId categoryId:(long long)categoryId folderName:(NSString *)folderName fileName:(NSString *)fileName error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getTempAttachmentNamesWithGroupId:(long long)groupId folderName:(NSString *)folderName error:(NSError **)error;
- (void)updateAnswerWithMessageId:(long long)messageId answer:(BOOL)answer cascade:(BOOL)cascade error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSString *)getCategoryMessagesRssWithGroupId:(long long)groupId categoryId:(long long)categoryId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error;
- (NSString *)getCompanyMessagesRssWithCompanyId:(long long)companyId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error;
- (NSString *)getGroupMessagesRssWithGroupId:(long long)groupId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error;
- (NSString *)getGroupMessagesRssWithGroupId:(long long)groupId userId:(long long)userId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error;
- (NSNumber *)getThreadAnswersCountWithGroupId:(long long)groupId categoryId:(long long)categoryId threadId:(long long)threadId error:(NSError **)error;
- (NSString *)getThreadMessagesRssWithThreadId:(long long)threadId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error;
- (NSDictionary *)getMessageWithMessageId:(long long)messageId error:(NSError **)error;

@end