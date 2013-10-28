@interface ExpandoValueService_v62 : NSObject

- (NSDictionary *)getData:(NSNumber *)companyId className:(NSString *)className tableName:(NSString *)tableName columnNames:(NSDictionary *)columnNames classPK:(NSNumber *)classPK;
- (void)addValues:(NSNumber *)companyId className:(NSString *)className tableName:(NSString *)tableName classPK:(NSNumber *)classPK attributeValues:(NSDictionary *)attributeValues;
- (NSDictionary *)addValue:(NSNumber *)companyId className:(NSString *)className tableName:(NSString *)tableName columnName:(NSString *)columnName classPK:(NSNumber *)classPK data:(NSDictionary *)data;
- (NSDictionary *)getJsonData:(NSNumber *)companyId className:(NSString *)className tableName:(NSString *)tableName columnName:(NSString *)columnName classPK:(NSNumber *)classPK;

@end