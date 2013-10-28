@interface DDLRecordService_v62 : NSObject

- (NSDictionary *)addRecord:(NSNumber *)groupId recordSetId:(NSNumber *)recordSetId displayIndex:(NSNumber *)displayIndex fieldsMap:(NSDictionary *)fieldsMap serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getRecord:(NSNumber *)recordId;
- (NSDictionary *)updateRecord:(NSNumber *)recordId majorVersion:(BOOL)majorVersion displayIndex:(NSNumber *)displayIndex fields:(NSDictionary *)fields mergeFields:(BOOL)mergeFields serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)deleteRecordLocale:(NSNumber *)recordId locale:(NSString *)locale serviceContext:(NSDictionary *)serviceContext;

@end