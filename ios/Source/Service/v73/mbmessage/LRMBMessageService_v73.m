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

#import "LRMBMessageService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRMBMessageService_v73

- (NSNumber *)getCategoryMessagesCountWithGroupId:(long long)groupId categoryId:(long long)categoryId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/get-category-messages-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getThreadMessagesWithGroupId:(long long)groupId categoryId:(long long)categoryId threadId:(long long)threadId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"threadId": @(threadId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/get-thread-messages": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addDiscussionMessageWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK threadId:(long long)threadId parentMessageId:(long long)parentMessageId subject:(NSString *)subject body:(NSString *)body serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"threadId": @(threadId),
		@"parentMessageId": @(parentMessageId),
		@"subject": [self checkNull: subject],
		@"body": [self checkNull: body],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/mb.mbmessage/add-discussion-message": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addMessageWithGroupId:(long long)groupId categoryId:(long long)categoryId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"subject": [self checkNull: subject],
		@"body": [self checkNull: body],
		@"format": [self checkNull: format],
		@"inputStreamOVPs": [self checkNull: inputStreamOVPs],
		@"anonymous": @(anonymous),
		@"priority": @(priority),
		@"allowPingbacks": @(allowPingbacks),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/mb.mbmessage/add-message": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addMessageWithParentMessageId:(long long)parentMessageId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format inputStreamOVPs:(NSArray *)inputStreamOVPs anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"parentMessageId": @(parentMessageId),
		@"subject": [self checkNull: subject],
		@"body": [self checkNull: body],
		@"format": [self checkNull: format],
		@"inputStreamOVPs": [self checkNull: inputStreamOVPs],
		@"anonymous": @(anonymous),
		@"priority": @(priority),
		@"allowPingbacks": @(allowPingbacks),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/mb.mbmessage/add-message": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addMessageWithCategoryId:(long long)categoryId subject:(NSString *)subject body:(NSString *)body serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"categoryId": @(categoryId),
		@"subject": [self checkNull: subject],
		@"body": [self checkNull: body],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/mb.mbmessage/add-message": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addMessageWithGroupId:(long long)groupId categoryId:(long long)categoryId subject:(NSString *)subject body:(NSString *)body format:(NSString *)format fileName:(NSString *)fileName file:(LRUploadData *)file anonymous:(BOOL)anonymous priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"subject": [self checkNull: subject],
		@"body": [self checkNull: body],
		@"format": [self checkNull: format],
		@"fileName": [self checkNull: fileName],
		@"file": [self checkNull: file],
		@"anonymous": @(anonymous),
		@"priority": @(priority),
		@"allowPingbacks": @(allowPingbacks),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/mb.mbmessage/add-message": _params};

	return (NSDictionary *)[self.session upload:_command error:error];
}

- (void)addMessageAttachmentWithMessageId:(long long)messageId fileName:(NSString *)fileName file:(LRUploadData *)file mimeType:(NSString *)mimeType error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId),
		@"fileName": [self checkNull: fileName],
		@"file": [self checkNull: file],
		@"mimeType": [self checkNull: mimeType]
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/add-message-attachment": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteDiscussionMessageWithMessageId:(long long)messageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/delete-discussion-message": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteMessageWithMessageId:(long long)messageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/delete-message": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteMessageAttachmentWithMessageId:(long long)messageId fileName:(NSString *)fileName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId),
		@"fileName": [self checkNull: fileName]
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/delete-message-attachment": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteMessageAttachmentsWithMessageId:(long long)messageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/delete-message-attachments": _params};

	[self.session invoke:_command error:error];
}

- (void)emptyMessageAttachmentsWithMessageId:(long long)messageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/empty-message-attachments": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchMbMessageByUrlSubjectWithGroupId:(long long)groupId urlSubject:(NSString *)urlSubject error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"urlSubject": [self checkNull: urlSubject]
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/fetch-mb-message-by-url-subject": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getCategoryMessagesWithGroupId:(long long)groupId categoryId:(long long)categoryId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/get-category-messages": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getGroupMessagesCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/get-group-messages-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getMessageDisplayWithMessageId:(long long)messageId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/get-message-display": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSNumber *)getThreadMessagesCountWithGroupId:(long long)groupId categoryId:(long long)categoryId threadId:(long long)threadId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"threadId": @(threadId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/get-thread-messages-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)moveMessageAttachmentToTrashWithMessageId:(long long)messageId fileName:(NSString *)fileName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId),
		@"fileName": [self checkNull: fileName]
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/move-message-attachment-to-trash": _params};

	[self.session invoke:_command error:error];
}

- (void)restoreMessageAttachmentFromTrashWithMessageId:(long long)messageId fileName:(NSString *)fileName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId),
		@"fileName": [self checkNull: fileName]
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/restore-message-attachment-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (void)subscribeMessageWithMessageId:(long long)messageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/subscribe-message": _params};

	[self.session invoke:_command error:error];
}

- (void)unsubscribeMessageWithMessageId:(long long)messageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/unsubscribe-message": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateDiscussionMessageWithClassName:(NSString *)className classPK:(long long)classPK messageId:(long long)messageId subject:(NSString *)subject body:(NSString *)body serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"messageId": @(messageId),
		@"subject": [self checkNull: subject],
		@"body": [self checkNull: body],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/mb.mbmessage/update-discussion-message": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateMessageWithMessageId:(long long)messageId subject:(NSString *)subject body:(NSString *)body inputStreamOVPs:(NSArray *)inputStreamOVPs priority:(double)priority allowPingbacks:(BOOL)allowPingbacks serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId),
		@"subject": [self checkNull: subject],
		@"body": [self checkNull: body],
		@"inputStreamOVPs": [self checkNull: inputStreamOVPs],
		@"priority": @(priority),
		@"allowPingbacks": @(allowPingbacks),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/mb.mbmessage/update-message": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteTempAttachmentWithGroupId:(long long)groupId categoryId:(long long)categoryId folderName:(NSString *)folderName fileName:(NSString *)fileName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"folderName": [self checkNull: folderName],
		@"fileName": [self checkNull: fileName]
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/delete-temp-attachment": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getTempAttachmentNamesWithGroupId:(long long)groupId folderName:(NSString *)folderName error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"folderName": [self checkNull: folderName]
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/get-temp-attachment-names": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)updateAnswerWithMessageId:(long long)messageId answer:(BOOL)answer cascade:(BOOL)cascade error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId),
		@"answer": @(answer),
		@"cascade": @(cascade)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/update-answer": _params};

	[self.session invoke:_command error:error];
}

- (NSString *)getCategoryMessagesRssWithGroupId:(long long)groupId categoryId:(long long)categoryId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"status": @(status),
		@"max": @(max),
		@"type": [self checkNull: type],
		@"version": @(version),
		@"displayStyle": [self checkNull: displayStyle],
		@"feedURL": [self checkNull: feedURL],
		@"entryURL": [self checkNull: entryURL],
	}];

	[self mangleWrapperWithParams:_params name:@"themeDisplay" className:@"com.liferay.portal.kernel.theme.ThemeDisplay" wrapper:themeDisplay];

	NSDictionary *_command = @{@"/mb.mbmessage/get-category-messages-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSString *)getCompanyMessagesRssWithCompanyId:(long long)companyId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"status": @(status),
		@"max": @(max),
		@"type": [self checkNull: type],
		@"version": @(version),
		@"displayStyle": [self checkNull: displayStyle],
		@"feedURL": [self checkNull: feedURL],
		@"entryURL": [self checkNull: entryURL],
	}];

	[self mangleWrapperWithParams:_params name:@"themeDisplay" className:@"com.liferay.portal.kernel.theme.ThemeDisplay" wrapper:themeDisplay];

	NSDictionary *_command = @{@"/mb.mbmessage/get-company-messages-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSString *)getGroupMessagesRssWithGroupId:(long long)groupId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status),
		@"max": @(max),
		@"type": [self checkNull: type],
		@"version": @(version),
		@"displayStyle": [self checkNull: displayStyle],
		@"feedURL": [self checkNull: feedURL],
		@"entryURL": [self checkNull: entryURL],
	}];

	[self mangleWrapperWithParams:_params name:@"themeDisplay" className:@"com.liferay.portal.kernel.theme.ThemeDisplay" wrapper:themeDisplay];

	NSDictionary *_command = @{@"/mb.mbmessage/get-group-messages-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSString *)getGroupMessagesRssWithGroupId:(long long)groupId userId:(long long)userId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"status": @(status),
		@"max": @(max),
		@"type": [self checkNull: type],
		@"version": @(version),
		@"displayStyle": [self checkNull: displayStyle],
		@"feedURL": [self checkNull: feedURL],
		@"entryURL": [self checkNull: entryURL],
	}];

	[self mangleWrapperWithParams:_params name:@"themeDisplay" className:@"com.liferay.portal.kernel.theme.ThemeDisplay" wrapper:themeDisplay];

	NSDictionary *_command = @{@"/mb.mbmessage/get-group-messages-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSNumber *)getThreadAnswersCountWithGroupId:(long long)groupId categoryId:(long long)categoryId threadId:(long long)threadId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"categoryId": @(categoryId),
		@"threadId": @(threadId)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/get-thread-answers-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSString *)getThreadMessagesRssWithThreadId:(long long)threadId status:(int)status max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL themeDisplay:(LRJSONObjectWrapper *)themeDisplay error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"threadId": @(threadId),
		@"status": @(status),
		@"max": @(max),
		@"type": [self checkNull: type],
		@"version": @(version),
		@"displayStyle": [self checkNull: displayStyle],
		@"feedURL": [self checkNull: feedURL],
		@"entryURL": [self checkNull: entryURL],
	}];

	[self mangleWrapperWithParams:_params name:@"themeDisplay" className:@"com.liferay.portal.kernel.theme.ThemeDisplay" wrapper:themeDisplay];

	NSDictionary *_command = @{@"/mb.mbmessage/get-thread-messages-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getMessageWithMessageId:(long long)messageId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"messageId": @(messageId)
	}];

	NSDictionary *_command = @{@"/mb.mbmessage/get-message": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end