@interface SCFrameworkVersionService_v62 : NSObject

- (NSDictionary *)getFrameworkVersion:(NSNumber *)frameworkVersionId;
- (NSDictionary *)addFrameworkVersion:(NSString *)name url:(NSString *)url active:(BOOL)active priority:(NSNumber *)priority serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateFrameworkVersion:(NSNumber *)frameworkVersionId name:(NSString *)name url:(NSString *)url active:(BOOL)active priority:(NSNumber *)priority;
- (NSArray *)getFrameworkVersions:(NSNumber *)groupId active:(BOOL)active start:(NSNumber *)start end:(NSNumber *)end;
- (void)deleteFrameworkVersion:(NSNumber *)frameworkVersionId;

@end