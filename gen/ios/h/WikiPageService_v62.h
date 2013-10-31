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
@interface WikiPageService_v62 : BaseService

- (NSDictionary *)updatePage:(long)nodeId title:(NSString *)title version:(double)version content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit format:(NSString *)format parentTitle:(NSString *)parentTitle redirectTitle:(NSString *)redirectTitle serviceContext:(NSDictionary *)serviceContext;
- (void)deleteTrashPageAttachments:(long)nodeId title:(NSString *)title;
- (NSDictionary *)revertPage:(long)nodeId title:(NSString *)title version:(double)version serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getPages:(long)groupId nodeId:(long)nodeId head:(BOOL)head status:(int)status start:(int)start end:(int)end obc:(NSDictionary *)obc;
- (NSArray *)getRecentChanges:(long)groupId nodeId:(long)nodeId start:(int)start end:(int)end;
- (void)changeParent:(long)nodeId title:(NSString *)title newParentTitle:(NSString *)newParentTitle serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getDraftPage:(long)nodeId title:(NSString *)title;
- (NSString *)getNodePagesRss:(long)nodeId max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL attachmentURLPrefix:(NSString *)attachmentURLPrefix;
- (void)addPageAttachments:(long)nodeId title:(NSString *)title inputStreamOVPs:(NSArray *)inputStreamOVPs;
- (void)subscribePage:(long)nodeId title:(NSString *)title;
- (void)discardDraft:(long)nodeId title:(NSString *)title version:(double)version;
- (void)addPageAttachment:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName file:(NSDictionary *)file mimeType:(NSString *)mimeType;
- (NSDictionary *)addPage:(long)nodeId title:(NSString *)title content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit format:(NSString *)format parentTitle:(NSString *)parentTitle redirectTitle:(NSString *)redirectTitle serviceContext:(NSDictionary *)serviceContext;
- (void)deletePageAttachments:(long)nodeId title:(NSString *)title;
- (NSString *)getPagesRss:(long)companyId nodeId:(long)nodeId title:(NSString *)title max:(int)max type:(NSString *)type version:(double)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL attachmentURLPrefix:(NSString *)attachmentURLPrefix locale:(NSString *)locale;
- (NSArray *)getOrphans:(long)groupId nodeId:(long)nodeId;
- (NSArray *)getTempPageAttachmentNames:(long)nodeId tempFolderName:(NSString *)tempFolderName;
- (void)restorePageAttachmentFromTrash:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName;
- (void)unsubscribePage:(long)nodeId title:(NSString *)title;
- (NSArray *)getNodePages:(long)nodeId max:(int)max;
- (NSDictionary *)movePageToTrash:(long)nodeId title:(NSString *)title version:(double)version;
- (NSDictionary *)movePageAttachmentToTrash:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName;
- (void)deleteTempPageAttachment:(long)nodeId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName;
- (NSDictionary *)getPage:(long)nodeId title:(NSString *)title version:(double)version;
- (void)copyPageAttachments:(long)templateNodeId templateTitle:(NSString *)templateTitle nodeId:(long)nodeId title:(NSString *)title;
- (NSArray *)getChildren:(long)groupId nodeId:(long)nodeId head:(BOOL)head parentTitle:(NSString *)parentTitle;
- (int)getRecentChangesCount:(long)groupId nodeId:(long)nodeId;
- (int)getPagesCount:(long)groupId userId:(long)userId nodeId:(long)nodeId status:(int)status;
- (void)restorePageFromTrash:(long)resourcePrimKey;
- (void)deletePageAttachment:(long)nodeId title:(NSString *)title fileName:(NSString *)fileName;
- (void)movePage:(long)nodeId title:(NSString *)title newTitle:(NSString *)newTitle serviceContext:(NSDictionary *)serviceContext;
- (void)deletePage:(long)nodeId title:(NSString *)title version:(double)version;

@end