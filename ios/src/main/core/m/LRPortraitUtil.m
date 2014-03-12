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

#import "LRPortraitUtil.h"

/**
 * @author Bruno Farache
 */
@implementation LRPortraitUtil

+ (NSString *)downloadPortrait:(LRSession *)session
		portraitURL:(NSString *)portraitURL data:(NSData **)data {

	return
		[self downloadPortrait:session portraitURL:portraitURL data:data
			modifiedDate:nil];
}

+ (NSString *)downloadPortrait:(LRSession *)session
		portraitURL:(NSString *)portraitURL data:(NSData **)data
		modifiedDate:(NSString *)modifiedDate {

	NSString* lastModified;

	NSMutableURLRequest *request =
		[[NSMutableURLRequest alloc]
			initWithURL:[NSURL URLWithString:portraitURL]];

	[request setHTTPMethod:GET];
	[request setTimeoutInterval:session.connectionTimeout];

	if (modifiedDate) {
		[request setValue:modifiedDate forHTTPHeaderField:IF_MODIFIED_SINCE];
	}

	NSHTTPURLResponse *response;

	*data =
		[NSURLConnection sendSynchronousRequest:request
			returningResponse:&response error:nil];

	int status = response.statusCode;

	if (status == STATUS_OK) {
		NSDictionary *headers = [response allHeaderFields];
		lastModified = [headers valueForKey:LAST_MODIFIED];
	}

	return lastModified;
}

+ (NSString *)getPortraitURL:(LRSession *)session male:(BOOL)male
		portraitId:(long long)portraitId {

	return [self getPortraitURL:session male:male portraitId:portraitId
		uuid:nil];
}

+ (NSString *)getPortraitURL:(LRSession *)session male:(BOOL)male
		portraitId:(long long)portraitId uuid:(NSString *)uuid {

	NSString *gender = male ? @"male" : @"female";

	NSString *portraitURL =
		[NSString stringWithFormat:@"%@/image/user_%@_portrait?img_id=%lld",
			session.server, gender, portraitId];

	NSError *error;
	int version = [LRHttpUtil getPortalVersion:session error:&error];

	if (!error && version > V_6_2) {
		portraitURL = [self appendToken:portraitURL uuid:uuid];
	}

	return portraitURL;
}

+ (NSString *)appendToken:(NSString *)portraitURL uuid:(NSString *)uuid {
	if (!uuid) {
		return portraitURL;
	}

	NSString *token = [self sha1:uuid];

	return [NSString stringWithFormat:@"%@&img_id_token=%@",
		portraitURL, token];
}

+ (NSString *)sha1:(NSString *)input {
	unsigned char result[CC_SHA1_DIGEST_LENGTH];
	const char *string = [input UTF8String];

	CC_SHA1(string, strlen(string), result);

	NSData *data = [[NSData alloc] initWithBytes:result length:(sizeof result)];
	return [data base64Encoding];
}

@end