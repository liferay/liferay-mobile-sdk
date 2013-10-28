@interface BookmarksEntryService_v62 : NSObject

- (NSDictionary *)moveEntryToTrash:(NSNumber *)entryId;
- (NSDictionary *)search:(NSNumber *)groupId creatorUserId:(NSNumber *)creatorUserId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (NSArray *)getEntries:(NSNumber *)groupId folderId:(NSNumber *)folderId start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator;
- (void)restoreEntryFromTrash:(NSNumber *)entryId;
- (NSNumber *)getEntriesCount:(NSNumber *)groupId folderId:(NSNumber *)folderId status:(NSNumber *)status;
- (NSDictionary *)moveEntryFromTrash:(NSNumber *)entryId parentFolderId:(NSNumber *)parentFolderId;
- (NSDictionary *)moveEntry:(NSNumber *)entryId parentFolderId:(NSNumber *)parentFolderId;
- (NSNumber *)getFoldersEntriesCount:(NSNumber *)groupId folderIds:(NSArray *)folderIds;
- (NSArray *)getGroupEntries:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)openEntry:(NSNumber *)entryId;
- (NSDictionary *)addEntry:(NSNumber *)groupId folderId:(NSNumber *)folderId name:(NSString *)name url:(NSString *)url description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)deleteEntry:(NSNumber *)entryId;
- (NSDictionary *)getEntry:(NSNumber *)entryId;
- (NSNumber *)getGroupEntriesCount:(NSNumber *)groupId userId:(NSNumber *)userId rootFolderId:(NSNumber *)rootFolderId;
- (NSDictionary *)updateEntry:(NSNumber *)entryId groupId:(NSNumber *)groupId folderId:(NSNumber *)folderId name:(NSString *)name url:(NSString *)url description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)subscribeEntry:(NSNumber *)entryId;
- (void)unsubscribeEntry:(NSNumber *)entryId;

@end