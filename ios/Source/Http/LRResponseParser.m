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

#import "LRResponseParser.h"

#import "LRBatchSession.h"
#import "LRError.h"

const int LR_HTTP_STATUS_OK = 200;
const int LR_HTTP_STATUS_UNAUTHORIZED = 401;

/**
 * @author Bruno Farache
 */
@implementation LRResponseParser

+ (id)parse:(id)data response:(NSURLResponse *)response url:(NSURL *)url
		error:(NSError **)error {

	long statusCode = [(NSHTTPURLResponse *)response statusCode];
	NSURL *responseURL = [response URL];

	*error = [self _checkHttpError:statusCode];

	if (*error) {
		return nil;
	}

	if ([data isKindOfClass:[NSData class]]) {
		return [self _parse:data requestUrl:url responseUrl:responseURL
			error:error];
	}
	else {
		*error = [self _checkPortalException:data requestUrl:url
			responseUrl:responseURL];

		if (*error) {
			return nil;
		}

		return data;
	}
}

+ (NSError *)_checkHttpError:(long)statusCode {
	NSError *error;

	if (statusCode == LR_HTTP_STATUS_UNAUTHORIZED) {
		error = [LRError errorWithCode:LRErrorCodeUnauthorized
			description:@"wrong-credentials"];
	}
	else if (statusCode != LR_HTTP_STATUS_OK) {
		error = [LRError errorWithCode:statusCode description:@"http-error"];
	}

	return error;
}

+ (NSError *)_checkPortalException:(id)json requestUrl:(NSURL *)requestUrl
		responseUrl:(NSURL *)responseUrl {

	if (![json isKindOfClass:[NSDictionary class]]) {
		return nil;
	}

	NSString *exception = [json objectForKey:@"exception"];

	if (!exception) {
		return nil;
	}

	NSString *type = [json objectForKey:@"type"];
	NSError *error;

	if (type) {
		NSDictionary *userInfo = @{
			NSLocalizedFailureReasonErrorKey: exception
		};

		error = [LRError errorWithCode:LRErrorCodePortalException
			description:type userInfo:userInfo];
	}
	else if(![requestUrl isEqual:responseUrl]) {
		NSDictionary *userInfo = @{
			NSURLErrorKey: responseUrl
		};

		error = [LRError errorWithCode:LRErrorCodeRedirect
			description:@"url-has-moved" userInfo:userInfo];
	}
	else {
		error = [LRError errorWithCode:LRErrorCodePortalException
			description:exception];
	}

	return error;
}

+ (id)_parse:(NSData *)data requestUrl:(NSURL *)requestUrl
		responseUrl:(NSURL *)responseUrl error:(NSError **)error {

	NSError *parseError;
	
	id json = [NSJSONSerialization JSONObjectWithData:data options:0
		error:&parseError];

	if (parseError) {
		NSDictionary *userInfo = @{
			NSUnderlyingErrorKey:parseError
		};

		*error = [LRError errorWithCode:LRErrorCodeParse
			description:@"json-parsing-error" userInfo:userInfo];
	}
	else {
		*error = [self _checkPortalException:json requestUrl:requestUrl
			responseUrl:responseUrl];
	}

	if (*error) {
		return nil;
	}

	return json;
}

@end