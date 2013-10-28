@interface AssetTagPropertyService_v62 : NSObject

- (NSArray *)getTagProperties:(NSNumber *)tagId;
- (NSDictionary *)updateTagProperty:(NSNumber *)tagPropertyId key:(NSString *)key value:(NSString *)value;
- (NSDictionary *)addTagProperty:(NSNumber *)tagId key:(NSString *)key value:(NSString *)value;
- (NSArray *)getTagPropertyValues:(NSNumber *)companyId key:(NSString *)key;
- (void)deleteTagProperty:(NSNumber *)tagPropertyId;

@end