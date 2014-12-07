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
 * @author Jose M. Navarro
 * @author Bruno Farache
 */
@implementation LRCredentialStorage

+ (void)initialize {
	if (!_userDefaults) {
		_userDefaults = [NSUserDefaults standardUserDefaults];
	}
}

+ (NSURLCredential *)getCredential {
	NSURLProtectionSpace *protectionSpace = [self
		_getProtectionSpaceForServer:[self getServer]];

	if (!protectionSpace) {
		return nil;
	}

	NSDictionary *credential = [[NSURLCredentialStorage sharedCredentialStorage]
		credentialsForProtectionSpace:protectionSpace];

	if (!credential) {
		return nil;
	}

	return credential[credential.keyEnumerator.nextObject];
}

+ (NSString *)getServer {
	return [_userDefaults stringForKey:KEY_SERVER];
}

+ (LRSession *)getSession {
	NSString *server = [self getServer];
	NSURLCredential *credential = [self getCredential];

	if ([LRValidator isEmpty:server] || !credential) {
		return nil;
	}

	NSString *username = credential.user;
	NSString *password = credential.password;

	return [[LRSession alloc] initWithServer:server username:username
		password:password];
}

+ (void)removeCredential {
	NSURLCredential *credential = [self getCredential];

	NSURLProtectionSpace *protectionSpace = [self
		_getProtectionSpaceForServer:[self getServer]];

	if (!credential || !protectionSpace) {
		return;
	}

	[[NSURLCredentialStorage sharedCredentialStorage]
		removeCredential:credential forProtectionSpace:protectionSpace];

	[_userDefaults removeObjectForKey:KEY_SERVER];
	[_userDefaults synchronize];
}

+ (NSURLCredential *)storeCredentialForServer:(NSString *)server
		username:(NSString *)username password:(NSString *)password {

	if ([LRValidator isEmpty:server] || [LRValidator isEmpty:username] ||
		[LRValidator isEmpty:password]) {

		return nil;
	}

	NSURLCredential *credential = [NSURLCredential credentialWithUser:username
		password:password persistence:NSURLCredentialPersistencePermanent];

	NSURLProtectionSpace *protectionSpace = [self
		_getProtectionSpaceForServer:server];

	[[NSURLCredentialStorage sharedCredentialStorage]
		setCredential:credential forProtectionSpace:protectionSpace];

	[self _storeServer:server];

	return credential;
}

+ (NSURLProtectionSpace *)_getProtectionSpaceForServer:(NSString *)server {
	if ([LRValidator isEmpty:server]) {
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

+ (void)_storeServer:(NSString *)server {
	[_userDefaults setObject:server forKey:KEY_SERVER];
	[_userDefaults synchronize];
}

@end