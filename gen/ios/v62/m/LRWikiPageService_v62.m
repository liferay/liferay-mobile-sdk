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

#import "LRWikiPageService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRWikiPageService_v62

- (NSDictionary *)addPageWithNodeId:(long)nodeId title:(NSString *)title content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"content": content,
		@"summary": summary,
		@"minorEdit": @(minorEdit),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikipage/add-page": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addPageWithNodeId:(long)nodeId title:(NSString *)title content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit format:(NSString *)format parentTitle:(NSString *)parentTitle redirectTitle:(NSString *)redirectTitle serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"content": content,
		@"summary": summary,
		@"minorEdit": @(minorEdit),
		@"format": format,
		@"parentTitle": parentTitle,
		@"redirectTitle": redirectTitle,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikipage/add-page": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)addPageAttachmentWithNodeId:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName file:(NSDictionary *)file mimeType:(NSString *)mimeType error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"fileName": fileName,
		@"file": file,
		@"mimeType": mimeType
	};

	NSDictionary *_command = @{@"/wikipage/add-page-attachment": _params};

	[self.session invoke:_command error:error];
}

- (void)addPageAttachmentsWithNodeId:(long)nodeId title:(NSString *)title inputStreamOVPs:(NSArray *)inputStreamOVPs error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"inputStreamOVPs": inputStreamOVPs
	};

	NSDictionary *_command = @{@"/wikipage/add-page-attachments": _params};

	[self.session invoke:_command error:error];
}

- (void)changeParentWithNodeId:(long)nodeId title:(NSString *)title newParentTitle:(NSString *)newParentTitle serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"newParentTitle": newParentTitle,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikipage/change-parent": _params};

	[self.session invoke:_command error:error];
}

- (void)copyPageAttachmentsWithTemplateNodeId:(long)templateNodeId templateTitle:(NSString *)templateTitle nodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"templateNodeId": @(templateNodeId),
		@"templateTitle": templateTitle,
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/copy-page-attachments": _params};

	[self.session invoke:_command error:error];
}

- (void)deletePageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/delete-page": _params};

	[self.session invoke:_command error:error];
}

- (void)deletePageWithNodeId:(long)nodeId title:(NSString *)title version:(double)version error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"version": @(version)
	};

	NSDictionary *_command = @{@"/wikipage/delete-page": _params};

	[self.session invoke:_command error:error];
}

- (void)deletePageAttachmentWithNodeId:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"fileName": fileName
	};

	NSDictionary *_command = @{@"/wikipage/delete-page-attachment": _params};

	[self.session invoke:_command error:error];
}

- (void)deletePageAttachmentsWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/delete-page-attachments": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteTempPageAttachmentWithNodeId:(long)nodeId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"fileName": fileName,
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/wikipage/delete-temp-page-attachment": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteTrashPageAttachmentsWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/delete-trash-page-attachments": _params};

	[self.session invoke:_command error:error];
}

- (void)discardDraftWithNodeId:(long)nodeId title:(NSString *)title version:(double)version error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"version": @(version)
	};

	NSDictionary *_command = @{@"/wikipage/discard-draft": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getChildrenWithGroupId:(long)groupId nodeId:(long)nodeId head:(BOOL)head parentTitle:(NSString *)parentTitle error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"nodeId": @(nodeId),
		@"head": @(head),
		@"parentTitle": parentTitle
	};

	NSDictionary *_command = @{@"/wikipage/get-children": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getDraftPageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/get-draft-page": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getNodePagesWithNodeId:(long)nodeId max:(int)max error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/wikipage/get-node-pages": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSString *)getNodePagesRssWithNodeId:(long)nodeId max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"max": @(max),
		@"type": type,
		@"version": @(version),
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL
	};

	NSDictionary *_command = @{@"/wikipage/get-node-pages-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSString *)getNodePagesRssWithNodeId:(long)nodeId max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL attachmentURLPrefix:(NSString *)attachmentURLPrefix error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"max": @(max),
		@"type": type,
		@"version": @(version),
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"attachmentURLPrefix": attachmentURLPrefix
	};

	NSDictionary *_command = @{@"/wikipage/get-node-pages-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSArray *)getOrphansWithGroupId:(long)groupId nodeId:(long)nodeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikipage/get-orphans": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getPageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/get-page": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getPageWithGroupId:(long)groupId nodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/get-page": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getPageWithNodeId:(long)nodeId title:(NSString *)title head:(NSDictionary *)head error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"head": head
	};

	NSDictionary *_command = @{@"/wikipage/get-page": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getPageWithNodeId:(long)nodeId title:(NSString *)title version:(double)version error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"version": @(version)
	};

	NSDictionary *_command = @{@"/wikipage/get-page": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getPagesWithGroupId:(long)groupId userId:(long)userId nodeId:(long)nodeId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"nodeId": @(nodeId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/wikipage/get-pages": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getPagesWithGroupId:(long)groupId nodeId:(long)nodeId head:(BOOL)head status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"nodeId": @(nodeId),
		@"head": @(head),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
		@"obc": obc
	};

	NSDictionary *_command = @{@"/wikipage/get-pages": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (int)getPagesCountWithGroupId:(long)groupId nodeId:(long)nodeId head:(BOOL)head error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"nodeId": @(nodeId),
		@"head": @(head)
	};

	NSDictionary *_command = @{@"/wikipage/get-pages-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (int)getPagesCountWithGroupId:(long)groupId userId:(long)userId nodeId:(long)nodeId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId),
		@"nodeId": @(nodeId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/wikipage/get-pages-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (NSString *)getPagesRssWithCompanyId:(long)companyId nodeId:(long)nodeId title:(NSString *)title max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL locale:(NSString *)locale error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"nodeId": @(nodeId),
		@"title": title,
		@"max": @(max),
		@"type": type,
		@"version": @(version),
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"locale": locale
	};

	NSDictionary *_command = @{@"/wikipage/get-pages-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSString *)getPagesRssWithCompanyId:(long)companyId nodeId:(long)nodeId title:(NSString *)title max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL attachmentURLPrefix:(NSString *)attachmentURLPrefix locale:(NSString *)locale error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"nodeId": @(nodeId),
		@"title": title,
		@"max": @(max),
		@"type": type,
		@"version": @(version),
		@"displayStyle": displayStyle,
		@"feedURL": feedURL,
		@"entryURL": entryURL,
		@"attachmentURLPrefix": attachmentURLPrefix,
		@"locale": locale
	};

	NSDictionary *_command = @{@"/wikipage/get-pages-rss": _params};

	return (NSString *)[self.session invoke:_command error:error];
}

- (NSArray *)getRecentChangesWithGroupId:(long)groupId nodeId:(long)nodeId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"nodeId": @(nodeId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/wikipage/get-recent-changes": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (int)getRecentChangesCountWithGroupId:(long)groupId nodeId:(long)nodeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikipage/get-recent-changes-count": _params};

	return (int)[self.session invoke:_command error:error];
}

- (NSArray *)getTempPageAttachmentNamesWithNodeId:(long)nodeId tempFolderName:(NSString *)tempFolderName error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"tempFolderName": tempFolderName
	};

	NSDictionary *_command = @{@"/wikipage/get-temp-page-attachment-names": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)movePageWithNodeId:(long)nodeId title:(NSString *)title newTitle:(NSString *)newTitle serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"newTitle": newTitle,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikipage/move-page": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)movePageAttachmentToTrashWithNodeId:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"fileName": fileName
	};

	NSDictionary *_command = @{@"/wikipage/move-page-attachment-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)movePageToTrashWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/move-page-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)movePageToTrashWithNodeId:(long)nodeId title:(NSString *)title version:(double)version error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"version": @(version)
	};

	NSDictionary *_command = @{@"/wikipage/move-page-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)restorePageAttachmentFromTrashWithNodeId:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"fileName": fileName
	};

	NSDictionary *_command = @{@"/wikipage/restore-page-attachment-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (void)restorePageFromTrashWithResourcePrimKey:(long)resourcePrimKey error:(NSError **)error {
	NSDictionary *_params = @{
		@"resourcePrimKey": @(resourcePrimKey)
	};

	NSDictionary *_command = @{@"/wikipage/restore-page-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)revertPageWithNodeId:(long)nodeId title:(NSString *)title version:(double)version serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"version": @(version),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikipage/revert-page": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)subscribePageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/subscribe-page": _params};

	[self.session invoke:_command error:error];
}

- (void)unsubscribePageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title
	};

	NSDictionary *_command = @{@"/wikipage/unsubscribe-page": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePageWithNodeId:(long)nodeId title:(NSString *)title version:(double)version content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit format:(NSString *)format parentTitle:(NSString *)parentTitle redirectTitle:(NSString *)redirectTitle serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"title": title,
		@"version": @(version),
		@"content": content,
		@"summary": summary,
		@"minorEdit": @(minorEdit),
		@"format": format,
		@"parentTitle": parentTitle,
		@"redirectTitle": redirectTitle,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikipage/update-page": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end