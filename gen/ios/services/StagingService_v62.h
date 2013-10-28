@interface StagingService_v62 : NSObject

- (NSDictionary *)validateStagingRequest:(NSNumber *)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap;
- (NSNumber *)createStagingRequest:(NSNumber *)groupId checksum:(NSString *)checksum;
- (void)cleanUpStagingRequest:(NSNumber *)stagingRequestId;
- (void)updateStagingRequest:(NSNumber *)stagingRequestId fileName:(NSString *)fileName bytes:(NSArray *)bytes;
- (void)publishStagingRequest:(NSNumber *)stagingRequestId privateLayout:(BOOL)privateLayout parameterMap:(NSDictionary *)parameterMap;

@end