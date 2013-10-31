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
@interface MembershipRequestService_v62 : BaseService

- (NSDictionary *)addMembershipRequest:(long)groupId comments:(NSString *)comments serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getMembershipRequest:(long)membershipRequestId;
- (void)updateStatus:(long)membershipRequestId reviewComments:(NSString *)reviewComments statusId:(int)statusId serviceContext:(NSDictionary *)serviceContext;
- (void)deleteMembershipRequests:(long)groupId statusId:(int)statusId;

@end