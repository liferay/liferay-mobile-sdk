@interface MBThreadService_v62 : NSObject

- (NSNumber *)getGroupThreadsCount:(NSNumber *)groupId userId:(NSNumber *)userId status:(NSNumber *)status subscribed:(BOOL)subscribed includeAnonymous:(BOOL)includeAnonymous;
- (NSDictionary *)moveThreadFromTrash:(NSNumber *)categoryId threadId:(NSNumber *)threadId;
- (NSDictionary *)moveThreadToTrash:(NSNumber *)threadId;
- (void)deleteThread:(NSNumber *)threadId;
- (void)restoreThreadFromTrash:(NSNumber *)threadId;
- (void)unlockThread:(NSNumber *)threadId;
- (NSDictionary *)moveThread:(NSNumber *)categoryId threadId:(NSNumber *)threadId;
- (NSArray *)getThreads:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)splitThread:(NSNumber *)messageId subject:(NSString *)subject serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getGroupThreads:(NSNumber *)groupId userId:(NSNumber *)userId status:(NSNumber *)status subscribed:(BOOL)subscribed includeAnonymous:(BOOL)includeAnonymous start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)lockThread:(NSNumber *)threadId;
- (NSNumber *)getThreadsCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId status:(NSNumber *)status;
- (NSDictionary *)search:(NSNumber *)groupId creatorUserId:(NSNumber *)creatorUserId startDate:(NSNumber *)startDate endDate:(NSNumber *)endDate status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;

@end