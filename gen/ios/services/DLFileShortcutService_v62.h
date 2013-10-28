@interface DLFileShortcutService_v62 : NSObject

- (void)deleteFileShortcut:(NSNumber *)fileShortcutId;
- (NSDictionary *)getFileShortcut:(NSNumber *)fileShortcutId;
- (NSDictionary *)updateFileShortcut:(NSNumber *)fileShortcutId folderId:(NSNumber *)folderId toFileEntryId:(NSNumber *)toFileEntryId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addFileShortcut:(NSNumber *)groupId folderId:(NSNumber *)folderId toFileEntryId:(NSNumber *)toFileEntryId serviceContext:(NSDictionary *)serviceContext;

@end