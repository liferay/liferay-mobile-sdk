@interface ShoppingItemService_v62 : NSObject

- (NSNumber *)getCategoriesItemsCount:(NSNumber *)groupId categoryIds:(NSArray *)categoryIds;
- (NSDictionary *)getItem:(NSNumber *)itemId;
- (void)deleteItem:(NSNumber *)itemId;
- (NSDictionary *)addItem:(NSNumber *)groupId categoryId:(NSNumber *)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(NSNumber *)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext;
- (NSNumber *)getItemsCount:(NSNumber *)groupId categoryId:(NSNumber *)categoryId;
- (NSDictionary *)updateItem:(NSNumber *)itemId groupId:(NSNumber *)groupId categoryId:(NSNumber *)categoryId sku:(NSString *)sku name:(NSString *)name description:(NSString *)description properties:(NSString *)properties fieldsQuantities:(NSString *)fieldsQuantities requiresShipping:(BOOL)requiresShipping stockQuantity:(NSNumber *)stockQuantity featured:(BOOL)featured sale:(NSDictionary *)sale smallImage:(BOOL)smallImage smallImageURL:(NSString *)smallImageURL smallFile:(NSDictionary *)smallFile mediumImage:(BOOL)mediumImage mediumImageURL:(NSString *)mediumImageURL mediumFile:(NSDictionary *)mediumFile largeImage:(BOOL)largeImage largeImageURL:(NSString *)largeImageURL largeFile:(NSDictionary *)largeFile itemFields:(NSArray *)itemFields itemPrices:(NSArray *)itemPrices serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getItems:(NSNumber *)groupId categoryId:(NSNumber *)categoryId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (void)addBookItems:(NSNumber *)groupId categoryId:(NSNumber *)categoryId isbns:(NSArray *)isbns;
- (NSArray *)getItemsPrevAndNext:(NSNumber *)itemId obc:(NSDictionary *)obc;

@end