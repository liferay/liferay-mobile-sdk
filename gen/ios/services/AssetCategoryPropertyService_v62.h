@interface AssetCategoryPropertyService_v62 : NSObject

- (NSArray *)getCategoryPropertyValues:(NSNumber *)companyId key:(NSString *)key;
- (void)deleteCategoryProperty:(NSNumber *)categoryPropertyId;
- (NSDictionary *)updateCategoryProperty:(NSNumber *)categoryPropertyId key:(NSString *)key value:(NSString *)value;
- (NSDictionary *)addCategoryProperty:(NSNumber *)entryId key:(NSString *)key value:(NSString *)value;
- (NSArray *)getCategoryProperties:(NSNumber *)entryId;

@end