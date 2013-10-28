@interface LayoutPrototypeService_v62 : NSObject

- (NSDictionary *)updateLayoutPrototype:(NSNumber *)layoutPrototypeId nameMap:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active serviceContext:(NSDictionary *)serviceContext;
- (void)deleteLayoutPrototype:(NSNumber *)layoutPrototypeId;
- (NSArray *)search:(NSNumber *)companyId active:(NSDictionary *)active obc:(NSDictionary *)obc;
- (NSDictionary *)addLayoutPrototype:(NSDictionary *)nameMap description:(NSString *)description active:(BOOL)active serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getLayoutPrototype:(NSNumber *)layoutPrototypeId;

@end