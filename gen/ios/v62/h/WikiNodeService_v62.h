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
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface WikiNodeService_v62 : BaseService

- (void)deleteNode:(long)nodeId;
- (NSDictionary *)addNode:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)restoreNodeFromTrash:(long)nodeId;
- (void)unsubscribeNode:(long)nodeId;
- (void)importPages:(long)nodeId importer:(NSString *)importer inputStreams:(NSArray *)inputStreams options:(NSDictionary *)options;
- (int)getNodesCount:(long)groupId status:(int)status;
- (NSDictionary *)updateNode:(long)nodeId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getNode:(long)groupId name:(NSString *)name;
- (NSDictionary *)moveNodeToTrash:(long)nodeId;
- (NSArray *)getNodes:(long)groupId status:(int)status start:(int)start end:(int)end;
- (void)subscribeNode:(long)nodeId;

@end