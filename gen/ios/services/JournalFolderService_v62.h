@interface JournalFolderService_v62 : NSObject

- (NSArray *)getFolders:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)moveFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getFoldersAndArticles:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSDictionary *)moveFolderFromTrash:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId serviceContext:(NSDictionary *)serviceContext;
- (void)restoreFolderFromTrash:(NSNumber *)folderId;
- (void)deleteFolder:(NSNumber *)folderId includeTrashedEntries:(BOOL)includeTrashedEntries;
- (NSDictionary *)updateFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description mergeWithParentFolder:(BOOL)mergeWithParentFolder serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getSubfolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId recurse:(BOOL)recurse;
- (NSDictionary *)addFolder:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getFolder:(NSNumber *)folderId;
- (NSNumber *)getFoldersAndArticlesCount:(NSNumber *)groupId folderIds:(NSArray *)folderIds status:(NSNumber *)status;
- (NSDictionary *)moveFolderToTrash:(NSNumber *)folderId;
- (NSArray *)getFolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId;
- (NSNumber *)getFoldersCount:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status;

@end