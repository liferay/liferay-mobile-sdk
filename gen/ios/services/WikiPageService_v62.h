@interface WikiPageService_v62 : NSObject

- (NSDictionary *)updatePage:(NSNumber *)nodeId title:(NSString *)title version:(NSNumber *)version content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit format:(NSString *)format parentTitle:(NSString *)parentTitle redirectTitle:(NSString *)redirectTitle serviceContext:(NSDictionary *)serviceContext;
- (void)deleteTrashPageAttachments:(NSNumber *)nodeId title:(NSString *)title;
- (NSDictionary *)revertPage:(NSNumber *)nodeId title:(NSString *)title version:(NSNumber *)version serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getPages:(NSNumber *)groupId nodeId:(NSNumber *)nodeId head:(BOOL)head status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSArray *)getRecentChanges:(NSNumber *)groupId nodeId:(NSNumber *)nodeId start:(NSNumber *)start end:(NSNumber *)end;
- (void)changeParent:(NSNumber *)nodeId title:(NSString *)title newParentTitle:(NSString *)newParentTitle serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getDraftPage:(NSNumber *)nodeId title:(NSString *)title;
- (NSString *)getNodePagesRss:(NSNumber *)nodeId max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL attachmentURLPrefix:(NSString *)attachmentURLPrefix;
- (void)addPageAttachments:(NSNumber *)nodeId title:(NSString *)title inputStreamOVPs:(NSArray *)inputStreamOVPs;
- (void)subscribePage:(NSNumber *)nodeId title:(NSString *)title;
- (void)discardDraft:(NSNumber *)nodeId title:(NSString *)title version:(NSNumber *)version;
- (void)addPageAttachment:(NSNumber *)nodeId title:(NSString *)title fileName:(NSString *)fileName file:(NSDictionary *)file mimeType:(NSString *)mimeType;
- (NSDictionary *)addPage:(NSNumber *)nodeId title:(NSString *)title content:(NSString *)content summary:(NSString *)summary minorEdit:(BOOL)minorEdit format:(NSString *)format parentTitle:(NSString *)parentTitle redirectTitle:(NSString *)redirectTitle serviceContext:(NSDictionary *)serviceContext;
- (void)deletePageAttachments:(NSNumber *)nodeId title:(NSString *)title;
- (NSString *)getPagesRss:(NSNumber *)companyId nodeId:(NSNumber *)nodeId title:(NSString *)title max:(NSNumber *)max type:(NSString *)type version:(NSNumber *)version displayStyle:(NSString *)displayStyle feedURL:(NSString *)feedURL entryURL:(NSString *)entryURL attachmentURLPrefix:(NSString *)attachmentURLPrefix locale:(NSString *)locale;
- (NSArray *)getOrphans:(NSNumber *)groupId nodeId:(NSNumber *)nodeId;
- (NSArray *)getTempPageAttachmentNames:(NSNumber *)nodeId tempFolderName:(NSString *)tempFolderName;
- (void)restorePageAttachmentFromTrash:(NSNumber *)nodeId title:(NSString *)title fileName:(NSString *)fileName;
- (void)unsubscribePage:(NSNumber *)nodeId title:(NSString *)title;
- (NSArray *)getNodePages:(NSNumber *)nodeId max:(NSNumber *)max;
- (NSDictionary *)movePageToTrash:(NSNumber *)nodeId title:(NSString *)title version:(NSNumber *)version;
- (NSDictionary *)movePageAttachmentToTrash:(NSNumber *)nodeId title:(NSString *)title fileName:(NSString *)fileName;
- (void)deleteTempPageAttachment:(NSNumber *)nodeId fileName:(NSString *)fileName tempFolderName:(NSString *)tempFolderName;
- (NSDictionary *)getPage:(NSNumber *)nodeId title:(NSString *)title version:(NSNumber *)version;
- (void)copyPageAttachments:(NSNumber *)templateNodeId templateTitle:(NSString *)templateTitle nodeId:(NSNumber *)nodeId title:(NSString *)title;
- (NSArray *)getChildren:(NSNumber *)groupId nodeId:(NSNumber *)nodeId head:(BOOL)head parentTitle:(NSString *)parentTitle;
- (NSNumber *)getRecentChangesCount:(NSNumber *)groupId nodeId:(NSNumber *)nodeId;
- (NSNumber *)getPagesCount:(NSNumber *)groupId userId:(NSNumber *)userId nodeId:(NSNumber *)nodeId status:(NSNumber *)status;
- (void)restorePageFromTrash:(NSNumber *)resourcePrimKey;
- (void)deletePageAttachment:(NSNumber *)nodeId title:(NSString *)title fileName:(NSString *)fileName;
- (void)movePage:(NSNumber *)nodeId title:(NSString *)title newTitle:(NSString *)newTitle serviceContext:(NSDictionary *)serviceContext;
- (void)deletePage:(NSNumber *)nodeId title:(NSString *)title version:(NSNumber *)version;

@end