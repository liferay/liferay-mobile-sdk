@interface JournalTemplateService_v62 : NSObject

- (NSDictionary *)updateTemplate:(NSNumber *)groupId templateId:(NSString *)templateId structureId:(NSString *)structureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsl:(NSString *)xsl formatXsl:(BOOL)formatXsl langType:(NSString *)langType cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)copyTemplate:(NSNumber *)groupId oldTemplateId:(NSString *)oldTemplateId newTemplateId:(NSString *)newTemplateId autoTemplateId:(BOOL)autoTemplateId;
- (void)deleteTemplate:(NSNumber *)groupId templateId:(NSString *)templateId;
- (NSNumber *)searchCount:(NSNumber *)companyId groupIds:(NSArray *)groupIds templateId:(NSString *)templateId structureId:(NSString *)structureId structureIdComparator:(NSString *)structureIdComparator name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator;
- (NSDictionary *)addTemplate:(NSNumber *)groupId templateId:(NSString *)templateId autoTemplateId:(BOOL)autoTemplateId structureId:(NSString *)structureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsl:(NSString *)xsl formatXsl:(BOOL)formatXsl langType:(NSString *)langType cacheable:(BOOL)cacheable smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)search:(NSNumber *)companyId groupIds:(NSArray *)groupIds keywords:(NSString *)keywords structureId:(NSString *)structureId structureIdComparator:(NSString *)structureIdComparator start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSDictionary *)getTemplate:(NSNumber *)groupId templateId:(NSString *)templateId includeGlobalTemplates:(BOOL)includeGlobalTemplates;
- (NSArray *)getStructureTemplates:(NSNumber *)groupId structureId:(NSString *)structureId;

@end