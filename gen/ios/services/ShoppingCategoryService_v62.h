@interface ShoppingCategoryService_v62 : NSObject

- (NSDictionary *)addCategory:(NSNumber *)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)deleteCategory:(NSNumber *)categoryId;
- (NSDictionary *)getCategory:(NSNumber *)categoryId;
- (void)getSubcategoryIds:(NSArray *)categoryIds groupId:(NSNumber *)groupId categoryId:(NSNumber *)categoryId;
- (NSArray *)getCategories:(NSNumber *)groupId parentCategoryId:(NSNumber *)parentCategoryId start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)updateCategory:(NSNumber *)categoryId parentCategoryId:(NSNumber *)parentCategoryId name:(NSString *)name description:(NSString *)description mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(NSDictionary *)serviceContext;
- (NSNumber *)getCategoriesCount:(NSNumber *)groupId parentCategoryId:(NSNumber *)parentCategoryId;

@end