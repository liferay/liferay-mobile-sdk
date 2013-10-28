@interface ExpandoColumnService_v62 : NSObject

- (NSDictionary *)addColumn:(NSNumber *)tableId name:(NSString *)name type:(NSNumber *)type defaultData:(NSDictionary *)defaultData;
- (void)deleteColumn:(NSNumber *)columnId;
- (NSDictionary *)updateTypeSettings:(NSNumber *)columnId typeSettings:(NSString *)typeSettings;
- (NSDictionary *)updateColumn:(NSNumber *)columnId name:(NSString *)name type:(NSNumber *)type defaultData:(NSDictionary *)defaultData;

@end