@interface JournalStructureService_v62 : NSObject

- (NSArray *)getStructures:(NSArray *)groupIds;
- (NSNumber *)searchCount:(NSNumber *)companyId groupIds:(NSArray *)groupIds structureId:(NSString *)structureId name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator;
- (NSDictionary *)copyStructure:(NSNumber *)groupId oldStructureId:(NSString *)oldStructureId newStructureId:(NSString *)newStructureId autoStructureId:(BOOL)autoStructureId;
- (NSDictionary *)updateStructure:(NSNumber *)groupId structureId:(NSString *)structureId parentStructureId:(NSString *)parentStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addStructure:(NSNumber *)groupId structureId:(NSString *)structureId autoStructureId:(BOOL)autoStructureId parentStructureId:(NSString *)parentStructureId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap xsd:(NSString *)xsd serviceContext:(NSDictionary *)serviceContext;
- (void)deleteStructure:(NSNumber *)groupId structureId:(NSString *)structureId;
- (NSDictionary *)getStructure:(NSNumber *)groupId structureId:(NSString *)structureId includeGlobalStructures:(BOOL)includeGlobalStructures;
- (NSArray *)search:(NSNumber *)companyId groupIds:(NSArray *)groupIds structureId:(NSString *)structureId name:(NSString *)name description:(NSString *)description andOperator:(BOOL)andOperator start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;

@end