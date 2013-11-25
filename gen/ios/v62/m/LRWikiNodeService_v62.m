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

#import "LRWikiNodeService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRWikiNodeService_v62

- (NSDictionary *)addNodeWithName:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikinode/add-node": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteNodeWithNodeId:(long long)nodeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/delete-node": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getNodeWithNodeId:(long long)nodeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/get-node": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getNodeWithGroupId:(long long)groupId name:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name
	};

	NSDictionary *_command = @{@"/wikinode/get-node": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getNodesWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/wikinode/get-nodes": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getNodesWithGroupId:(long long)groupId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/wikinode/get-nodes": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getNodesWithGroupId:(long long)groupId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/wikinode/get-nodes": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getNodesWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/wikinode/get-nodes": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getNodesCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/wikinode/get-nodes-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getNodesCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/wikinode/get-nodes-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)moveNodeToTrashWithNodeId:(long long)nodeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/move-node-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)restoreNodeFromTrashWithNodeId:(long long)nodeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/restore-node-from-trash": _params};

	[self.session invoke:_command error:error];
}

- (void)subscribeNodeWithNodeId:(long long)nodeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/subscribe-node": _params};

	[self.session invoke:_command error:error];
}

- (void)unsubscribeNodeWithNodeId:(long long)nodeId error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/unsubscribe-node": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateNodeWithNodeId:(long long)nodeId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikinode/update-node": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end