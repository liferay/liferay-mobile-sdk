/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#import "LRKbcommentService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRKbcommentService_v72

- (NSDictionary *)deleteKbCommentWithKbComment:(LRJSONObjectWrapper *)kbComment error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
	}];

	[self mangleWrapperWithParams:_params name:@"kbComment" className:@"com.liferay.knowledge.base.model.KBComment" wrapper:kbComment];

	NSDictionary *_command = @{@"/kb.kbcomment/delete-kb-comment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)deleteKbCommentWithKbCommentId:(long long)kbCommentId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbCommentId": @(kbCommentId)
	}];

	NSDictionary *_command = @{@"/kb.kbcomment/delete-kb-comment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getKbCommentWithKbCommentId:(long long)kbCommentId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbCommentId": @(kbCommentId)
	}];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbCommentsWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK status:(int)status start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"obc" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBComment>" wrapper:obc];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbCommentsWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"obc" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBComment>" wrapper:obc];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbCommentsWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbCommentsWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"obc" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBComment>" wrapper:obc];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbCommentsWithGroupId:(long long)groupId start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"obc" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBComment>" wrapper:obc];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getKbCommentsWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK status:(int)status start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"status": @(status),
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getKbCommentsCountWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getKbCommentsCountWithGroupId:(long long)groupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId)
	}];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getKbCommentsCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"status": @(status)
	}];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getKbCommentsCountWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"className": [self checkNull: className],
		@"classPK": @(classPK)
	}];

	NSDictionary *_command = @{@"/kb.kbcomment/get-kb-comments-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateStatusWithKbCommentId:(long long)kbCommentId status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbCommentId": @(kbCommentId),
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbcomment/update-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateKbCommentWithKbCommentId:(long long)kbCommentId classNameId:(long long)classNameId classPK:(long long)classPK content:(NSString *)content serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbCommentId": @(kbCommentId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"content": [self checkNull: content],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbcomment/update-kb-comment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateKbCommentWithKbCommentId:(long long)kbCommentId classNameId:(long long)classNameId classPK:(long long)classPK content:(NSString *)content status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"kbCommentId": @(kbCommentId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"content": [self checkNull: content],
		@"status": @(status),
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/kb.kbcomment/update-kb-comment": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end