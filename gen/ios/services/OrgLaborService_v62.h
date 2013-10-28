@interface OrgLaborService_v62 : NSObject

- (NSArray *)getOrgLabors:(NSNumber *)organizationId;
- (NSDictionary *)addOrgLabor:(NSNumber *)organizationId typeId:(NSNumber *)typeId sunOpen:(NSNumber *)sunOpen sunClose:(NSNumber *)sunClose monOpen:(NSNumber *)monOpen monClose:(NSNumber *)monClose tueOpen:(NSNumber *)tueOpen tueClose:(NSNumber *)tueClose wedOpen:(NSNumber *)wedOpen wedClose:(NSNumber *)wedClose thuOpen:(NSNumber *)thuOpen thuClose:(NSNumber *)thuClose friOpen:(NSNumber *)friOpen friClose:(NSNumber *)friClose satOpen:(NSNumber *)satOpen satClose:(NSNumber *)satClose;
- (void)deleteOrgLabor:(NSNumber *)orgLaborId;
- (NSDictionary *)updateOrgLabor:(NSNumber *)orgLaborId typeId:(NSNumber *)typeId sunOpen:(NSNumber *)sunOpen sunClose:(NSNumber *)sunClose monOpen:(NSNumber *)monOpen monClose:(NSNumber *)monClose tueOpen:(NSNumber *)tueOpen tueClose:(NSNumber *)tueClose wedOpen:(NSNumber *)wedOpen wedClose:(NSNumber *)wedClose thuOpen:(NSNumber *)thuOpen thuClose:(NSNumber *)thuClose friOpen:(NSNumber *)friOpen friClose:(NSNumber *)friClose satOpen:(NSNumber *)satOpen satClose:(NSNumber *)satClose;
- (NSDictionary *)getOrgLabor:(NSNumber *)orgLaborId;

@end