@interface ListTypeService_v62 : NSObject

- (void)validate:(NSNumber *)listTypeId classNameId:(NSNumber *)classNameId type:(NSString *)type;
- (NSArray *)getListTypes:(NSString *)type;
- (NSDictionary *)getListType:(NSNumber *)listTypeId;

@end