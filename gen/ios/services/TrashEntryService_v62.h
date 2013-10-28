@interface TrashEntryService_v62 : NSObject

- (NSDictionary *)restoreEntry:(NSNumber *)entryId overrideClassPK:(NSNumber *)overrideClassPK name:(NSString *)name;
- (void)deleteEntry:(NSString *)className classPK:(NSNumber *)classPK;
- (void)moveEntry:(NSString *)className classPK:(NSNumber *)classPK destinationContainerModelId:(NSNumber *)destinationContainerModelId serviceContext:(NSDictionary *)serviceContext;
- (void)deleteEntries:(NSNumber *)groupId;
- (NSDictionary *)getEntries:(NSNumber *)groupId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;

@end