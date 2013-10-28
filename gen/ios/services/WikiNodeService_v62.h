@interface WikiNodeService_v62 : NSObject

- (void)deleteNode:(NSNumber *)nodeId;
- (NSDictionary *)addNode:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)restoreNodeFromTrash:(NSNumber *)nodeId;
- (void)unsubscribeNode:(NSNumber *)nodeId;
- (void)importPages:(NSNumber *)nodeId importer:(NSString *)importer inputStreams:(NSArray *)inputStreams options:(NSDictionary *)options;
- (NSDictionary *)updateNode:(NSNumber *)nodeId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getNode:(NSNumber *)groupId name:(NSString *)name;
- (NSDictionary *)moveNodeToTrash:(NSNumber *)nodeId;
- (void)subscribeNode:(NSNumber *)nodeId;

@end