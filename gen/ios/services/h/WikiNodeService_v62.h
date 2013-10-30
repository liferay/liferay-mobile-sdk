/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

#import <Foundation/Foundation.h>

/**
 * author Bruno Farache
 */
@interface WikiNodeService_v62 : NSObject

- (void)deleteNode:(NSNumber *)nodeId;
- (NSDictionary *)addNode:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)restoreNodeFromTrash:(NSNumber *)nodeId;
- (void)unsubscribeNode:(NSNumber *)nodeId;
- (void)importPages:(NSNumber *)nodeId importer:(NSString *)importer inputStreams:(NSArray *)inputStreams options:(NSDictionary *)options;
- (NSNumber *)getNodesCount:(NSNumber *)groupId status:(NSNumber *)status;
- (NSDictionary *)updateNode:(NSNumber *)nodeId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getNode:(NSNumber *)groupId name:(NSString *)name;
- (NSDictionary *)moveNodeToTrash:(NSNumber *)nodeId;
- (NSArray *)getNodes:(NSNumber *)groupId status:(NSNumber *)status start:(NSNumber *)start end:(NSNumber *)end;
- (void)subscribeNode:(NSNumber *)nodeId;

@end