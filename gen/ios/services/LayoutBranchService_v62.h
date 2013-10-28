@interface LayoutBranchService_v62 : NSObject

- (NSDictionary *)addLayoutBranch:(NSNumber *)layoutRevisionId name:(NSString *)name description:(NSString *)description master:(BOOL)master serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateLayoutBranch:(NSNumber *)layoutBranchId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)deleteLayoutBranch:(NSNumber *)layoutBranchId;

@end