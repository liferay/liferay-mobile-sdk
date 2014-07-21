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

#import "LRHttpUtil.h"
#import "LRPortalVersionUtil.h"

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
	return [self getPortalVersionWithURL:session.server error:error];
}

+ (int)getPortalVersionWithURL:(NSString *)URL error:(NSError **)error {
	NSNumber *version = [_versions objectForKey:URL];

	if (version) {
		return [version intValue];
	}

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
		[_versions setObject:version forKey:URL];
	}

	return [version intValue];
}

@end