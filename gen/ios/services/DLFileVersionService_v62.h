@interface DLFileVersionService_v62 : NSObject

- (NSDictionary *)getFileVersion:(NSNumber *)fileVersionId;
- (NSDictionary *)getLatestFileVersion:(NSNumber *)fileEntryId;
- (NSArray *)getFileVersions:(NSNumber *)fileEntryId status:(NSNumber *)status;
- (NSNumber *)getFileVersionsCount:(NSNumber *)fileEntryId status:(NSNumber *)status;

@end