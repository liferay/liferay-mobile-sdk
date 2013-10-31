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

#import "MBMessageService_v62.h"

/**
 * author Bruno Farache
 */
@implementation MBMessageService_v62

- (void)unsubscribeMessage:(NSNumber *)messageId {
	NSDictionary *_params = @{
		@"messageId": messageId
	};

	NSDictionary *_command = @{@"/mbmessage/unsubscribe-message": _params};

	[session invoke:_command];
}

- (NSDictionary *)addDiscussionMessage:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(NSNumber *)permissionClassPK permissionOwnerId:(NSNumber *)permissionOwnerId threadId:(NSNumber *)threadId parentMessageId:(NSNumber *)parentMessageId subject:(NSString *)subject body:(NSString *)body serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"className": className,
		@"classPK": classPK,
		@"permissionClassName": permissionClassName,
		@"permissionClassPK": permissionClassPK,
		@"permissionOwnerId": permissionOwnerId,
		@"threadId": threadId,
		@"parentMessageId": parentMessageId,
		@"subject": subject,
		@"body": body,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mbmessage/add-discussion-message": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getCategoryMessages:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/mbmessage/get-category-messages": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSString *)getCompanyMessagesRss:(NSNumber *)companyId status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"status": status,
		@"max": max,
		@"type": type,
		@"version": version,
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/mbmessage/get-company-messages-rss": _params};

	return (NSString *)[session invoke:_command];
}

- (NSNumber *)getCategoryMessagesCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId,
		@"status": status
	};

	NSDictionary *_command = @{@"/mbmessage/get-category-messages-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSNumber *)getGroupMessagesCount:(NSNumber *)groupId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"status": status
	};

	NSDictionary *_command = @{@"/mbmessage/get-group-messages-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)addMessage:(NSNumber *)parentMessageId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(NSNumber *)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"parentMessageId": parentMessageId,
		@"subject": subject,
		@"body": body,
		@"format": format,
		@"inputStreamOVPs": inputStreamOVPs,
		@"anonymous": anonymous,
		@"priority": priority,
		@"allowPingbacks": allowPingbacks,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mbmessage/add-message": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getMessageDisplay:(NSNumber *)messageId status:(NSNumber *)status threadView:(NSString *)threadView includePrevAndNext:(BOOL)includePrevAndNext {
	NSDictionary *_params = @{
		@"messageId": messageId,
		@"status": status,
		@"threadView": threadView,
		@"includePrevAndNext": includePrevAndNext
	};

	NSDictionary *_command = @{@"/mbmessage/get-message-display": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateDiscussionMessage:(NSString *)className classPK:(NSNumber *)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(NSNumber *)permissionClassPK permissionOwnerId:(NSNumber *)permissionOwnerId messageId:(NSNumber *)messageId subject:(NSString *)subject body:(NSString *)body serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": classPK,
		@"permissionClassName": permissionClassName,
		@"permissionClassPK": permissionClassPK,
		@"permissionOwnerId": permissionOwnerId,
		@"messageId": messageId,
		@"subject": subject,
		@"body": body,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mbmessage/update-discussion-message": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteMessageAttachments:(NSNumber *)messageId {
	NSDictionary *_params = @{
		@"messageId": messageId
	};

	NSDictionary *_command = @{@"/mbmessage/delete-message-attachments": _params};

	[session invoke:_command];
}

- (void)deleteDiscussionMessage:(NSNumber *)groupId className:(NSString *)className classPK:(NSNumber *)classPK permissionClassName:(NSString *)permissionClassName permissionClassPK:(NSNumber *)permissionClassPK permissionOwnerId:(NSNumber *)permissionOwnerId messageId:(NSNumber *)messageId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"className": className,
		@"classPK": classPK,
		@"permissionClassName": permissionClassName,
		@"permissionClassPK": permissionClassPK,
		@"permissionOwnerId": permissionOwnerId,
		@"messageId": messageId
	};

	NSDictionary *_command = @{@"/mbmessage/delete-discussion-message": _params};

	[session invoke:_command];
}

- (NSString *)getThreadMessagesRss:(NSNumber *)threadId status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
	NSDictionary *_params = @{
		@"threadId": threadId,
		@"status": status,
		@"max": max,
		@"type": type,
		@"version": version,
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/mbmessage/get-thread-messages-rss": _params};

	return (NSString *)[session invoke:_command];
}

- (NSDictionary *)updateMessage:(NSNumber *)messageId subject:(NSString *)subject body:(NSString *)body inputStreamOVPs:(NSArray *)inputStreamOVPs existingFiles:(NSArray *)existingFiles priority:(NSNumber *)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"messageId": messageId,
		@"subject": subject,
		@"body": body,
		@"inputStreamOVPs": inputStreamOVPs,
		@"existingFiles": existingFiles,
		@"priority": priority,
		@"allowPingbacks": allowPingbacks,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mbmessage/update-message": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getThreadAnswersCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId threadId:(NSNumber *)threadId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId,
		@"threadId": threadId
	};

	NSDictionary *_command = @{@"/mbmessage/get-thread-answers-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)deleteMessage:(NSNumber *)messageId {
	NSDictionary *_params = @{
		@"messageId": messageId
	};

	NSDictionary *_command = @{@"/mbmessage/delete-message": _params};

	[session invoke:_command];
}

- (NSString *)getCategoryMessagesRss:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId,
		@"status": status,
		@"max": max,
		@"type": type,
		@"version": version,
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/mbmessage/get-category-messages-rss": _params};

	return (NSString *)[session invoke:_command];
}

- (NSDictionary *)getMessage:(NSNumber *)messageId {
	NSDictionary *_params = @{
		@"messageId": messageId
	};

	NSDictionary *_command = @{@"/mbmessage/get-message": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getThreadMessagesCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId threadId:(NSNumber *)threadId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId,
		@"threadId": threadId,
		@"status": status
	};

	NSDictionary *_command = @{@"/mbmessage/get-thread-messages-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)restoreMessageAttachmentFromTrash:(NSNumber *)messageId fileName:(NSString *)fileName {
	NSDictionary *_params = @{
		@"messageId": messageId,
		@"fileName": fileName
	};

	NSDictionary *_command = @{@"/mbmessage/restore-message-attachment-from-trash": _params};

	[session invoke:_command];
}

- (void)updateAnswer:(NSNumber *)messageId answer:(BOOL)answer cascade:(BOOL)cascade {
	NSDictionary *_params = @{
		@"messageId": messageId,
		@"answer": answer,
		@"cascade": cascade
	};

	NSDictionary *_command = @{@"/mbmessage/update-answer": _params};

	[session invoke:_command];
}

- (NSArray *)getThreadMessages:(NSNumber *)groupId categoryId:(NSNumber *)categoryId threadId:(NSNumber *)threadId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"categoryId": categoryId,
		@"threadId": threadId,
		@"status": status,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/mbmessage/get-thread-messages": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)subscribeMessage:(NSNumber *)messageId {
	NSDictionary *_params = @{
		@"messageId": messageId
	};

	NSDictionary *_command = @{@"/mbmessage/subscribe-message": _params};

	[session invoke:_command];
}

- (NSString *)getGroupMessagesRss:(NSNumber *)groupId status:(NSNumber *)status max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(NSDictionary *)themeDisplay {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"status": status,
		@"max": max,
		@"type": type,
		@"version": version,
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"themeDisplay": themeDisplay
	};

	NSDictionary *_command = @{@"/mbmessage/get-group-messages-rss": _params};

	return (NSString *)[session invoke:_command];
}

@end