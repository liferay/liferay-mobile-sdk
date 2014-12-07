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

#import "LRCredentialStorage.h"
#import "LRValidator.h"

static NSString *const KEY_SERVER = @"server";

static NSUserDefaults *_userDefaults;

/**
 * @author Bruno Farache
 * @author Jose M. Navarro
 */
@implementation LRCredentialStorage

+ (void)initialize {
	if (!_userDefaults) {
		_userDefaults = [NSUserDefaults standardUserDefaults];
	}
}

+ (NSURLCredential *)getCredential {
	NSURLProtectionSpace *protectionSpace = [self
		_getProtectionSpaceForServer:[self _getServer]];

	NSDictionary *credential = [[NSURLCredentialStorage sharedCredentialStorage]
		credentialsForProtectionSpace:protectionSpace];

	return credential[credential.keyEnumerator.nextObject];
}

+ (LRSession *)getSession {
	NSString *server = [self _getServer];

	NSURLCredential *credential = [self getCredential];
	NSString *username = credential.user;
	NSString *password = credential.password;

	return [[LRSession alloc] initWithServer:server username:username
		password:password];
}

+ (void)removeCredential {
	NSURLCredential *credential = [self getCredential];

	NSURLProtectionSpace *protectionSpace = [self
		_getProtectionSpaceForServer:[self _getServer]];

	[[NSURLCredentialStorage sharedCredentialStorage]
		removeCredential:credential forProtectionSpace:protectionSpace];

	[_userDefaults removeObjectForKey:KEY_SERVER];
	[_userDefaults synchronize];
}

+ (void)storeCredentialForServer:(NSString *)server
		username:(NSString *)username password:(NSString *)password {

	NSURLCredential *credential = [NSURLCredential credentialWithUser:username
		password:password persistence:NSURLCredentialPersistencePermanent];

	NSURLProtectionSpace *protectionSpace = [self
		_getProtectionSpaceForServer:server];

	[[NSURLCredentialStorage sharedCredentialStorage]
		setCredential:credential forProtectionSpace:protectionSpace];

	[self _storeServer:server];
}

+ (NSURLProtectionSpace *)_getProtectionSpaceForServer:(NSString *)server {
	if (![LRValidator isEmpty:server]) {
		return nil;
	}

	NSURL *url = [NSURL URLWithString:server];
	NSString *host = url.host;
	NSInteger port = [url.port integerValue];
	NSString *protocol = url.scheme;
	NSString *method = NSURLAuthenticationMethodHTTPDigest;

	return [[NSURLProtectionSpace alloc] initWithHost:host port:port
		protocol:protocol realm:nil authenticationMethod:method];
}

+ (NSString *)_getServer {
	return [_userDefaults stringForKey:KEY_SERVER];
}

+ (void)_storeServer:(NSString *)server {
	[_userDefaults setObject:server forKey:KEY_SERVER];
	[_userDefaults synchronize];
}

@end