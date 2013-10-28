@interface LayoutSetBranchService_v62 : NSObject

- (void)deleteLayoutSetBranch:(NSNumber *)layoutSetBranchId;
- (NSArray *)getLayoutSetBranches:(NSNumber *)groupId privateLayout:(BOOL)privateLayout;
- (NSDictionary *)addLayoutSetBranch:(NSNumber *)groupId privateLayout:(BOOL)privateLayout name:(NSString *)name description:(NSString *)description master:(BOOL)master copyLayoutSetBranchId:(NSNumber *)copyLayoutSetBranchId serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateLayoutSetBranch:(NSNumber *)groupId layoutSetBranchId:(NSNumber *)layoutSetBranchId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)mergeLayoutSetBranch:(NSNumber *)layoutSetBranchId mergeLayoutSetBranchId:(NSNumber *)mergeLayoutSetBranchId serviceContext:(NSDictionary *)serviceContext;

@end