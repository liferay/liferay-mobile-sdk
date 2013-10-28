@interface AssetVocabularyService_v62 : NSObject

- (NSDictionary *)addVocabulary:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getJsonGroupVocabularies:(NSNumber *)groupId name:(NSString *)name start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSArray *)getVocabularies:(NSArray *)vocabularyIds;
- (NSNumber *)getGroupVocabulariesCount:(NSNumber *)groupId name:(NSString *)name;
- (NSArray *)getCompanyVocabularies:(NSNumber *)companyId;
- (NSDictionary *)getVocabulary:(NSNumber *)vocabularyId;
- (NSDictionary *)updateVocabulary:(NSNumber *)vocabularyId title:(NSString *)title titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap settings:(NSString *)settings serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getGroupVocabularies:(NSNumber *)groupId name:(NSString *)name start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSArray *)getGroupsVocabularies:(NSArray *)groupIds className:(NSString *)className;
- (NSDictionary *)getGroupVocabulariesDisplay:(NSNumber *)groupId name:(NSString *)name start:(NSNumber *)start end:(NSNumber *)end addDefaultVocabulary:(BOOL)addDefaultVocabulary obc:(NSDictionary *)obc;
- (void)deleteVocabulary:(NSNumber *)vocabularyId;
- (NSArray *)deleteVocabularies:(NSArray *)vocabularyIds serviceContext:(NSDictionary *)serviceContext;

@end