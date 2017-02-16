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
#import "LRCookieAuthentication.h"
#import "LRError.h"
#import "LRHttpUtil.h"

const int AUTH_TOKEN_LENGTH = 8;

@interface LRCookieSignIn()

@property (nonatomic) BOOL retried;

@end

/**
 * @author Victor Galán
 */
@implementation LRCookieSignIn

- (instancetype) init {
	self = [super init];

	if (self) {
		self.retried = NO;
	}

	return self;
}

- (void)signInWithSession:(LRSession *)session
		callback:(id<LRCookieCallback>)callback {

	[[NSHTTPCookieStorage sharedHTTPCookieStorage]
		setCookieAcceptPolicy:NSHTTPCookieAcceptPolicyAlways];

	id<LRAuthentication> authentication = session.authentication;

	if (!authentication) {
		[NSException raise:@"" format:@"Session authentication can't be null"];
	}

	NSString *username, *password;

	if ([authentication isKindOfClass:[LRBasicAuthentication class]]) {
		LRBasicAuthentication *basicAuth = authentication;
		username = basicAuth.username;
		password = basicAuth.password;
	}
	else if ([authentication isKindOfClass:[LRCookieAuthentication class]]){
		LRCookieAuthentication *cookieAuth = authentication;
		username = cookieAuth.username;
		password = cookieAuth.password;
	}
	else {
		[NSException raise:@""
			format:@"Can't sign in if authentication implementation is not " \
			"BasicAuthentication or CookieAuthentication"];
	}

	NSMutableURLRequest *request = [NSMutableURLRequest requestWithURL:
		[self _getLoginURL: session.server]];

	NSData *body = [self _getBodyWithUsername:username password:password];
	NSString *postLength = [NSString stringWithFormat:@"%d",(int)[body length]];

	[request setValue:postLength forHTTPHeaderField:@"Content-Length"];
	[request addValue:@"application/x-www-form-urlencoded"
		forHTTPHeaderField:@"Content-Type"];

	[request setHTTPMethod:LR_POST];
	[request setHTTPBody:body];
	NSURLSessionConfiguration *config = [NSURLSessionConfiguration defaultSessionConfiguration];

	NSURLSessionTask *task = [[NSURLSession sharedSession]
		dataTaskWithRequest:request
		completionHandler:^(NSData *data, NSURLResponse *r, NSError *error) {
			if (error != nil) {
				NSHTTPURLResponse *response = r;

				if (response.statusCode == 500) {
					if (!self.retried) {
						self.retried = YES;
						[self signInWithSession:session callback:callback];
						return;
					}

					NSError * error = [LRError errorWithCode:403
						description:@"Failed to get the cookie auth"];

					[callback onFailure:error];
				}
				else {
					[callback onFailure:error];
				}

				return;
			}

			NSString *authToken = [self _getAuthToken:data];

			NSString *cookieHeader = [self
				_getHttpCookies:[NSHTTPCookieStorage sharedHTTPCookieStorage]
				requestURL:request.URL];

			[[NSHTTPCookieStorage sharedHTTPCookieStorage]
				setCookieAcceptPolicy:
					NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain];

			LRCookieAuthentication *auth = [[LRCookieAuthentication alloc]
				initWithAuthToken:authToken cookieHeader:cookieHeader
				username:username password:password];

			LRSession *cookieSession = [[LRSession alloc]
				initWithServer:session.server authentication:auth];

			[callback onSuccess:cookieSession];
		}];
	
	[task resume];
}

- (void) URLSession:(NSURLSession *)session
		task:(NSURLSessionTask *)task
		willPerformHTTPRedirection:(NSHTTPURLResponse *)response
		newRequest:(NSURLRequest *)request
		completionHandler:(void (^)(NSURLRequest * _Nullable))completionHandler {

	NSString *cookies = [self _getHttpCookies:
			[NSHTTPCookieStorage sharedHTTPCookieStorage] requestURL:response.URL];

	NSMutableURLRequest *mutableRequest = request.mutableCopy;

	[mutableRequest addValue:[NSString stringWithFormat:@"%@", cookies] forHTTPHeaderField:@"Cookie"];

	completionHandler(mutableRequest);
}
- (NSString *)_getAuthToken:(NSData *)htmlData {
	NSString *html = [[NSString alloc]initWithData:htmlData
		encoding:NSUTF8StringEncoding];

	NSRange range = [html rangeOfString:@"Liferay.authToken=\""];
	range = NSMakeRange(range.location + range.length, AUTH_TOKEN_LENGTH);

	return [html substringWithRange:range];
}

- (NSData *)_getBodyWithUsername:(NSString *)username password:(NSString *) password {
		password:(NSString *) password {

	NSString *bodyString = [NSString stringWithFormat:@"login=%@&password=%@",
		username, password];

	return [bodyString dataUsingEncoding:NSASCIIStringEncoding];
}

- (NSString *)_getHttpCookies:(NSHTTPCookieStorage *)storage
	   requestURL:(NSURL *)requestURL {

	NSArray *allCookies = [storage cookiesForURL:requestURL];

	NSMutableString *cookieHeader = [NSMutableString string];
	
	for(NSHTTPCookie *cookie in allCookies) {
		[cookieHeader appendFormat:@"%@=%@;", cookie.name, cookie.value];
	}

	return cookieHeader;
}

- (NSURL *)_getLoginURL:(NSString *)server {
	if (![server hasSuffix:@"/"]) {
		server = [server stringByAppendingString:@"/"];
	}

	server = [server stringByAppendingString:@"c/portal/login"];

	return [NSURL URLWithString:server];
}

@end
