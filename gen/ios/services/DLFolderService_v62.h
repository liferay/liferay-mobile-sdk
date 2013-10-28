@interface DLFolderService_v62 : NSObject

- (NSNumber *)getMountFoldersCount:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId;
- (NSArray *)getFoldersAndFileEntriesAndFileShortcuts:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSDictionary *)getFolder:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name;
- (BOOL)hasInheritableLock:(NSNumber *)folderId;
- (NSDictionary *)lockFolder:(NSNumber *)folderId owner:(NSString *)owner inheritable:(BOOL)inheritable expirationTime:(NSNumber *)expirationTime;
- (NSArray *)getFolders:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status includeMountfolders:(BOOL)includeMountfolders start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (BOOL)isFolderLocked:(NSNumber *)folderId;
- (NSNumber *)getFoldersCount:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId status:(NSNumber *)status includeMountfolders:(BOOL)includeMountfolders;
- (void)unlockFolder:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name lockUuid:(NSString *)lockUuid;
- (NSArray *)getMountFolders:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (BOOL)hasFolderLock:(NSNumber *)folderId;
- (NSNumber *)getFileEntriesAndFileShortcutsCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status mimeTypes:(NSArray *)mimeTypes;
- (NSArray *)getFolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId;
- (BOOL)verifyInheritableLock:(NSNumber *)folderId lockUuid:(NSString *)lockUuid;
- (NSDictionary *)moveFolder:(NSNumber *)folderId parentFolderId:(NSNumber *)parentFolderId serviceContext:(NSDictionary *)serviceContext;
- (NSNumber *)getFoldersAndFileEntriesAndFileShortcutsCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status mimeTypes:(NSArray *)mimeTypes includeMountFolders:(BOOL)includeMountFolders;
- (NSDictionary *)addFolder:(NSNumber *)groupId repositoryId:(NSNumber *)repositoryId mountPoint:(BOOL)mountPoint parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)refreshFolderLock:(NSString *)lockUuid companyId:(NSNumber *)companyId expirationTime:(NSNumber *)expirationTime;
- (NSArray *)getSubfolderIds:(NSNumber *)groupId folderId:(NSNumber *)folderId recurse:(BOOL)recurse;
- (void)deleteFolder:(NSNumber *)groupId parentFolderId:(NSNumber *)parentFolderId name:(NSString *)name;
- (NSArray *)getFileEntriesAndFileShortcuts:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)updateFolder:(NSNumber *)folderId name:(NSString *)name description:(NSString *)description defaultFileEntryTypeId:(NSNumber *)defaultFileEntryTypeId fileEntryTypeIds:(NSArray *)fileEntryTypeIds overrideFileEntryTypes:(BOOL)overrideFileEntryTypes serviceContext:(NSDictionary *)serviceContext;

@end