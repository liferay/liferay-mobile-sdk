@interface LayoutSetPrototypeService_v62 : NSObject

- (NSDictionary *)updateLayoutSetPrototype:(NSNumber *)layoutSetPrototypeId nameMap:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext;
- (void)deleteLayoutSetPrototype:(NSNumber *)layoutSetPrototypeId;
- (NSArray *)search:(NSNumber *)companyId active:(NSDictionary *)active obc:(NSDictionary *)obc;
- (NSDictionary *)addLayoutSetPrototype:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active layoutsUpdateable:(BOOL)layoutsUpdateable serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getLayoutSetPrototype:(NSNumber *)layoutSetPrototypeId;

@end