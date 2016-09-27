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

#import "LRCookieSignIn.h"
#import "LRBasicAuthentication.h"
#import "LRHttpUtil.h"
#import "LRCookieAuthentication.h"

const int AUTH_TOKEN_LENGTH = 8;

/**
 * @author Victor Galán
 */
@implementation LRCookieSignIn

+ (void)signInWithSession:(LRSession *)session callback:(id<LRCookieCallback>)callback {
	[[NSHTTPCookieStorage sharedHTTPCookieStorage]
			setCookieAcceptPolicy:NSHTTPCookieAcceptPolicyAlways];
	
	id<LRAuthentication> authentication = session.authentication;

	if (!authentication) {
		[NSException raise:@"" format:@"Session authentication can't be null"];
	}

	if (![authentication isKindOfClass:[LRBasicAuthentication class]]) {
		[NSException raise:@"" format:@"Can't sign in if authentication " \
			"implementation is not BasicAuthentication"];
	}

	LRBasicAuthentication *basicAuthentication = (LRBasicAuthentication *) authentication;

	NSMutableURLRequest *request = [NSMutableURLRequest requestWithURL:
			[self _getLoginURL: session.server]];

	NSData *body = [self _getBody:basicAuthentication];
	NSString *postLength = [NSString stringWithFormat:@"%d",(int)[body length]];

	[request setValue:postLength forHTTPHeaderField:@"Content-Length"];
	[request addValue:@"application/x-www-form-urlencoded" forHTTPHeaderField:@"Content-Type"];
	[request setHTTPMethod:LR_POST];
	[request setHTTPBody:body];

	NSURLSessionTask *task = [[NSURLSession sharedSession] dataTaskWithRequest:request
			completionHandler:^(NSData * _Nullable data, NSURLResponse * _Nullable response, NSError * _Nullable error) {

				if (error != nil) {
					[callback onFailure:error];
					return;
				}

				NSString *authToken = [self _getAuthToken:data];

				NSString *cookieHeader = [self _getHttpCookies:
						[NSHTTPCookieStorage sharedHTTPCookieStorage] requestURL:request.URL];

				[[NSHTTPCookieStorage sharedHTTPCookieStorage]
						setCookieAcceptPolicy:NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain];

				LRCookieAuthentication *auth = [[LRCookieAuthentication alloc]
						initWithAuthToken:authToken cookieHeader:cookieHeader];

				LRSession *cookieSession = [[LRSession alloc] initWithServer:session.server
						authentication:auth];

				[callback onSuccess:cookieSession];
	}];
	
	[task resume];
}

+ (NSURL *)_getLoginURL:(NSString *)server {
	if (![server hasSuffix:@"/"]) {
		server = [server stringByAppendingString:@"/"];
	}

	return [NSURL URLWithString:[server stringByAppendingString:@"c/portal/login"]];
}

+ (NSData *)_getBody:(LRBasicAuthentication *)basicAuthentication {

	NSString *bodyString = [NSString stringWithFormat:@"login=%@&password=%@",
			basicAuthentication.username, basicAuthentication.password];

	return [bodyString dataUsingEncoding:NSASCIIStringEncoding];
}

+ (NSString *)_getAuthToken:(NSData * )htmlData {
	NSString *html = [[NSString alloc]initWithData:htmlData encoding:NSUTF8StringEncoding];

	NSRange range = [html rangeOfString:@"Liferay.authToken=\""];

	return [html substringWithRange:NSMakeRange(range.location + range.length, AUTH_TOKEN_LENGTH)];
}

+ (NSString *)_getHttpCookies:(NSHTTPCookieStorage *)storage requestURL:(NSURL *)requestURL {
	NSArray* allCookies = [storage cookiesForURL:requestURL];

	NSMutableString *cookieHeader = [NSMutableString string];
	
	for(NSHTTPCookie *cookie in allCookies) {
		[cookieHeader appendFormat:@"%@=%@;", cookie.name, cookie.value];
	}

	return cookieHeader;
}

@end
