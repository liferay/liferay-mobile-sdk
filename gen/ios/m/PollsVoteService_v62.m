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

#import "PollsVoteService_v62.h"

/**
 * author Bruno Farache
 */
@implementation PollsVoteService_v62

- (NSDictionary *)addVote:(NSNumber *)questionId choiceId:(NSNumber *)choiceId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"questionId": questionId,
		@"choiceId": choiceId,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/pollsvote/add-vote": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end