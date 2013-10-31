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

#import "WikiNodeService_v62.h"

/**
 * author Bruno Farache
 */
@implementation WikiNodeService_v62

- (void)deleteNode:(long)nodeId {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/delete-node": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)addNode:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikinode/add-node": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)restoreNodeFromTrash:(long)nodeId {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/restore-node-from-trash": _params};

	[self.session invoke:_command];
}

- (void)unsubscribeNode:(long)nodeId {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/unsubscribe-node": _params};

	[self.session invoke:_command];
}

- (void)importPages:(long)nodeId importer:(NSString *)importer inputStreams:(NSArray *)inputStreams options:(NSDictionary *)options {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"importer": importer,
		@"inputStreams": inputStreams,
		@"options": options
	};

	NSDictionary *_command = @{@"/wikinode/import-pages": _params};

	[self.session invoke:_command];
}

- (int)getNodesCount:(long)groupId status:(int)status {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/wikinode/get-nodes-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)updateNode:(long)nodeId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/wikinode/update-node": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getNode:(long)groupId name:(NSString *)name {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name
	};

	NSDictionary *_command = @{@"/wikinode/get-node": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)moveNodeToTrash:(long)nodeId {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/move-node-to-trash": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getNodes:(long)groupId status:(int)status start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/wikinode/get-nodes": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)subscribeNode:(long)nodeId {
	NSDictionary *_params = @{
		@"nodeId": @(nodeId)
	};

	NSDictionary *_command = @{@"/wikinode/subscribe-node": _params};

	[self.session invoke:_command];
}

@end