/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

#import "LRPortalVersionUtil.h"

#import "LRError.h"
#import "LRHttpUtil.h"
#import "LRPortalService_v62.h"
#import "LRServiceFactory.h"

const int LR_UNKNOWN_VERSION = -1;
const int LR_VERSION_6_2 = 6200;

/**
 * @author Bruno Farache
 */
@implementation LRPortalVersionUtil

static NSMutableDictionary *_versions;

+ (void)initialize {
	if (!_versions) {
		_versions = [[NSMutableDictionary alloc] init];
	}
}

+ (int)getPortalVersion:(LRSession *)session error:(NSError **)error {
	int version = [[_versions objectForKey:session.server] intValue];

	if (version) {
		if (version < LR_VERSION_6_2) {
			[LRHttpUtil setJSONWSPath:@"api/secure/jsonws"];
		}

		return version;
	}

	version = [self _getPortalVersionWithURL:session.server error:error];

	if (*error) {
		return version;
	}

	if (version == LR_UNKNOWN_VERSION) {
		NSError *_error;

		version = [self _getBuildNumber_v62:session error:&_error];

		if (_error.code == LRErrorCodeRedirect) {
			*error = _error;
			return version;
		}

		if (version == LR_UNKNOWN_VERSION) {
			_error = nil;
			version = [self _getBuildNumber_v61:session error:&_error];

			if (_error) {
				*error = _error;
				return version;
			}
		}
	}

	return version;
}

#pragma mark - Private methods

+ (int)_getBuildNumber_v61:(LRSession *)session error:(NSError **)error {
	[LRHttpUtil setJSONWSPath:@"api/secure/jsonws"];

	LRPortalService_v62 *service = [self _getService:session];
	NSNumber *version = [service getBuildNumber:error];

	if (*error) {
		return LR_UNKNOWN_VERSION;
	}

	[_versions setObject:version forKey:session.server];

	return [version intValue];
}

+ (int)_getBuildNumber_v62:(LRSession *) session error:(NSError **)error {
	[LRHttpUtil setJSONWSPath:@"api/jsonws"];

	LRPortalService_v62 *service = [self _getService:session];
	NSNumber *version = [service getBuildNumber:error];

	if (*error) {
		return LR_UNKNOWN_VERSION;
	}

	[_versions setObject:version forKey:session.server];

	return [version intValue];
}

+ (int)_getPortalVersionWithURL:(NSString *)URL error:(NSError **)error {
	NSNumber *version;

	NSMutableURLRequest *request = [[NSMutableURLRequest alloc]
		initWithURL:[NSURL URLWithString:URL]];

	[request setHTTPMethod:LR_HEAD];

	NSHTTPURLResponse *response;

	[NSURLConnection sendSynchronousRequest:request returningResponse:&response
		error:error];

	if (*error) {
		return LR_UNKNOWN_VERSION;
	}

	NSDictionary *headers = [response allHeaderFields];
	NSString *portalHeader = [headers objectForKey:@"Liferay-Portal"];

	if (!portalHeader) {
		return LR_UNKNOWN_VERSION;
	}

	NSRange buildRange;
	NSRange searchRange = NSMakeRange(0, [portalHeader length]);

	buildRange = [portalHeader rangeOfString:@"Build"
		options:NSCaseInsensitiveSearch range:searchRange];

	if (buildRange.location == NSNotFound) {
		return LR_UNKNOWN_VERSION;
	}
	else {
		long index = buildRange.location + buildRange.length;
		NSRange versionRange = NSMakeRange(index, 5);
		NSString *buildNumber = [portalHeader substringWithRange:versionRange];

		version = @([buildNumber intValue]);
	}

	return [version intValue];
}

+ (LRPortalService_v62 *)_getService:(LRSession *)session {
	return (LRPortalService_v62 *)
		[LRServiceFactory getService:[LRPortalService_v62 class]
			session:session];
}

@end