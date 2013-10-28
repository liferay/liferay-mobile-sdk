@interface DDLRecordSetService_v62 : NSObject

- (void)deleteRecordSet:(NSNumber *)recordSetId;
- (NSDictionary *)getRecordSet:(NSNumber *)recordSetId;
- (NSDictionary *)updateMinDisplayRows:(NSNumber *)recordSetId minDisplayRows:(NSNumber *)minDisplayRows serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateRecordSet:(NSNumber *)groupId ddmStructureId:(NSNumber *)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(NSNumber *)minDisplayRows serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addRecordSet:(NSNumber *)groupId ddmStructureId:(NSNumber *)ddmStructureId recordSetKey:(NSString *)recordSetKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap minDisplayRows:(NSNumber *)minDisplayRows scope:(NSNumber *)scope serviceContext:(NSDictionary *)serviceContext;

@end