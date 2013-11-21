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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRWikiPageService_v62 : BaseService

- (NSDictionary *)addPageWithNodeId:(long)nodeId title:(NSString *)title content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addPageWithNodeId:(long)nodeId title:(NSString *)title content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit format:(NSString *)format parentTitle:(NSString *)parentTitle redirectTitle:(NSString *)redirectTitle serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)addPageAttachmentWithNodeId:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName file:(NSDictionary *)file mimeType:(NSString *)mimeType error:(NSError **)error;
- (void)addPageAttachmentsWithNodeId:(long)nodeId title:(NSString *)title inputStreamOVPs:(NSArray *)inputStreamOVPs error:(NSError **)error;
- (void)changeParentWithNodeId:(long)nodeId title:(NSString *)title newParentTitle:(NSString *)newParentTitle serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)copyPageAttachmentsWithTemplateNodeId:(long)templateNodeId templateTitle:(NSString *)templateTitle nodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (void)deletePageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (void)deletePageWithNodeId:(long)nodeId title:(NSString *)title version:(double)version error:(NSError **)error;
- (void)deletePageAttachmentWithNodeId:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName error:(NSError **)error;
- (void)deletePageAttachmentsWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (void)deleteTempPageAttachmentWithNodeId:(long)nodeId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName error:(NSError **)error;
- (void)deleteTrashPageAttachmentsWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (void)discardDraftWithNodeId:(long)nodeId title:(NSString *)title version:(double)version error:(NSError **)error;
- (NSArray *)getChildrenWithGroupId:(long)groupId nodeId:(long)nodeId head:(BOOL)head parentTitle:(NSString *)parentTitle error:(NSError **)error;
- (NSDictionary *)getDraftPageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (NSArray *)getNodePagesWithNodeId:(long)nodeId max:(int)max error:(NSError **)error;
- (NSString *)getNodePagesRssWithNodeId:(long)nodeId max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL error:(NSError **)error;
- (NSString *)getNodePagesRssWithNodeId:(long)nodeId max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL attachmentURLPrefix:(NSString *)attachmentURLPrefix error:(NSError **)error;
- (NSArray *)getOrphansWithGroupId:(long)groupId nodeId:(long)nodeId error:(NSError **)error;
- (NSDictionary *)getPageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (NSDictionary *)getPageWithGroupId:(long)groupId nodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (NSDictionary *)getPageWithNodeId:(long)nodeId title:(NSString *)title head:(NSDictionary *)head error:(NSError **)error;
- (NSDictionary *)getPageWithNodeId:(long)nodeId title:(NSString *)title version:(double)version error:(NSError **)error;
- (NSArray *)getPagesWithGroupId:(long)groupId userId:(long)userId nodeId:(long)nodeId status:(int)status start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getPagesWithGroupId:(long)groupId nodeId:(long)nodeId head:(BOOL)head status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc error:(NSError **)error;
- (int)getPagesCountWithGroupId:(long)groupId nodeId:(long)nodeId head:(BOOL)head error:(NSError **)error;
- (int)getPagesCountWithGroupId:(long)groupId userId:(long)userId nodeId:(long)nodeId status:(int)status error:(NSError **)error;
- (NSString *)getPagesRssWithCompanyId:(long)companyId nodeId:(long)nodeId title:(NSString *)title max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL locale:(NSString *)locale error:(NSError **)error;
- (NSString *)getPagesRssWithCompanyId:(long)companyId nodeId:(long)nodeId title:(NSString *)title max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL attachmentURLPrefix:(NSString *)attachmentURLPrefix locale:(NSString *)locale error:(NSError **)error;
- (NSArray *)getRecentChangesWithGroupId:(long)groupId nodeId:(long)nodeId start:(int)start end:(int)end error:(NSError **)error;
- (int)getRecentChangesCountWithGroupId:(long)groupId nodeId:(long)nodeId error:(NSError **)error;
- (NSArray *)getTempPageAttachmentNamesWithNodeId:(long)nodeId tempFolderName:(NSString *)tempFolderName error:(NSError **)error;
- (void)movePageWithNodeId:(long)nodeId title:(NSString *)title newTitle:(NSString *)newTitle serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)movePageAttachmentToTrashWithNodeId:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName error:(NSError **)error;
- (NSDictionary *)movePageToTrashWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (NSDictionary *)movePageToTrashWithNodeId:(long)nodeId title:(NSString *)title version:(double)version error:(NSError **)error;
- (void)restorePageAttachmentFromTrashWithNodeId:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName error:(NSError **)error;
- (void)restorePageFromTrashWithResourcePrimKey:(long)resourcePrimKey error:(NSError **)error;
- (NSDictionary *)revertPageWithNodeId:(long)nodeId title:(NSString *)title version:(double)version serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)subscribePageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (void)unsubscribePageWithNodeId:(long)nodeId title:(NSString *)title error:(NSError **)error;
- (NSDictionary *)updatePageWithNodeId:(long)nodeId title:(NSString *)title version:(double)version content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit format:(NSString *)format parentTitle:(NSString *)parentTitle redirectTitle:(NSString *)redirectTitle serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end