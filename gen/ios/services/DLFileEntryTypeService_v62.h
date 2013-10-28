@interface DLFileEntryTypeService_v62 : NSObject

- (void)updateFileEntryType:(NSNumber *)fileEntryTypeId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext;
- (NSNumber *)searchCount:(NSNumber *)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType;
- (NSNumber *)getFileEntryTypesCount:(NSArray *)groupIds;
- (NSArray *)search:(NSNumber *)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords includeBasicFileEntryType:(BOOL)includeBasicFileEntryType start:(NSNumber *)start end:(NSNumber *)end orderByComparator:(NSDictionary *)orderByComparator;
- (NSArray *)getFolderFileEntryTypes:(NSArray *)groupIds folderId:(NSNumber *)folderId inherited:(BOOL)inherited;
- (NSDictionary *)addFileEntryType:(NSNumber *)groupId fileEntryTypeKey:(NSString *)fileEntryTypeKey nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmStructureIds:(NSArray *)ddmStructureIds serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getFileEntryTypes:(NSArray *)groupIds start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)getFileEntryType:(NSNumber *)fileEntryTypeId;
- (void)deleteFileEntryType:(NSNumber *)fileEntryTypeId;

@end