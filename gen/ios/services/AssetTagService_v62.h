@interface AssetTagService_v62 : NSObject

- (NSDictionary *)getJsonGroupTags:(NSNumber *)groupId name:(NSString *)name start:(NSNumber *)start end:(NSNumber *)end;
- (void)deleteTag:(NSNumber *)tagId;
- (NSNumber *)getGroupTagsCount:(NSNumber *)groupId;
- (NSDictionary *)getTag:(NSNumber *)tagId;
- (void)deleteTags:(NSArray *)tagIds;
- (void)mergeTags:(NSArray *)fromTagIds toTagId:(NSNumber *)toTagId overrideProperties:(BOOL)overrideProperties;
- (NSArray *)getTags:(NSNumber *)groupId classNameId:(NSNumber *)classNameId name:(NSString *)name start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSDictionary *)updateTag:(NSNumber *)tagId name:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getGroupsTags:(NSArray *)groupIds;
- (NSNumber *)getTagsCount:(NSNumber *)groupId name:(NSString *)name tagProperties:(NSArray *)tagProperties;
- (NSDictionary *)getGroupTagsDisplay:(NSNumber *)groupId name:(NSString *)name start:(NSNumber *)start end:(NSNumber *)end;
- (NSArray *)getGroupTags:(NSNumber *)groupId start:(NSNumber *)start end:(NSNumber *)end obc:(NSDictionary *)obc;
- (NSDictionary *)search:(NSArray *)groupIds name:(NSString *)name tagProperties:(NSArray *)tagProperties start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)addTag:(NSString *)name tagProperties:(NSArray *)tagProperties serviceContext:(NSDictionary *)serviceContext;

@end