@interface BookmarksFolderService_v62 : NSObject

- (void)deleteFolder:(NSNumber *)folderId includeTrashedEntries:(BOOL)includeTrashedEntries;
- (void)unsubscribeFolder:(NSNumber *)groupId folderId:(NSNumber *)folderId;
- (NSDictionary *)getFolder:(NSNumber *)folderId;
- (NSNumber *)getFoldersAndEntriesCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status;
- (void)subscribeFolder:(NSNumber *)groupId folderId:(NSNumber *)folderId;
- (NSArray *)getFoldersAndEntries:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)moveFolderToTrash:(NSNumber *)folderId;
- (NSArray *)getFolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId;
- (NSDictionary *)updateFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description mergeWithParentFolder:(BOOL)mergeWithParentFolder serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getSubfolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId recurse:(BOOL)recurse;
- (NSArray *)getFolders:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (void)restoreFolderFromTrash:(NSNumber *)folderId;
- (NSDictionary *)moveFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId;
- (NSNumber *)getFoldersCount:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status;
- (NSDictionary *)addFolder:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)moveFolderFromTrash:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId;

@end