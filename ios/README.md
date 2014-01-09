## Table of Contents

* [Liferay iOS SDK](#liferay-ios-sdk)
	* [Sample](#sample)
	* [Setup](#setup)
	* [Use](#use)
		* [Asynchronous](#asynchronous)
		* [Batch](#batch)

## Liferay iOS SDK

### Sample

Check out the [iOS sample app](https://github.com/brunofarache/liferay-mobile-sdk-sample-ios). It's a Contacts app that lists all Liferay users and shows contact details about them. It contains many examples on how to use the Liferay Mobile SDK and it's a good way to learn how to use the Liferay Mobile SDK to build your own native applications.

### Setup

1. [Download](https://github.com/liferay/liferay-mobile-sdk/releases/) the latest version of `liferay-ios-sdk.zip`.

2. Unzip the file into your XCode project. 

3. Within XCode, right click on your project and click on "Add Files to 'Your Project Name'".

4. Add both `core` and `v62` folders. The `v62` folder name can change for each Liferay version, in this example, the SDK is built for Liferay 6.2.

### Use

1. Create a `Session` with the user credentials:

	```objective-c
	#import "LRSession.h"
	
	LRSession *session = [[LRSession alloc] init:@"http://localhost:8080" username:@"test@liferay.com" password:@"test"];
	```

	The first parameter is the URL of the Liferay instance you are connecting to. In this case, emulator and Liferay are running in the same machine.

	The second parameter is either the user's email address, screen name or userId. It depends on which authentication method your Liferay instance is using. The default authentication method is by user's email address.

	The third parameter is the user's password.

	> Be careful to use these credentials on a production Liferay instance, they are typically the administrator credentials, which means you have permission to call any service and change any data.


2. Check which Liferay services you need in order to build your app by going to [http://localhost:8080/api/jsonws](http://localhost:8080/api/jsonws). This page lists all available portal service as well plugins services.


3. If you are building a blogs app, for example, you can import `BlogsEntryService`.

	```objective-c
	#import "LRBlogsEntryService_v62.h"
	```

	Since the SDK is built for a specific Liferay version, service classes names have the Liferay version they are built for. In this case it's `_v62`, which means this SDK is built for Liferay 6.2. You can use several SDKs at the same time to support different Liferay versions.

4. Create a `LRBlogsEntryService_v62` object and make a service call.

	```objective-c
	LRBlogsEntryService_v62 *service = [[LRBlogsEntryService_v62 alloc] init:session];

	NSError *error;
	NSArray *entries = [service getGroupEntriesWithGroupId:1084 status:0 start:-1 end:-1 error:&error];
	```
	
	It fetches all blog entries from the `Guest` site, which in this example has groupId equals to 10184.
	
	This is an basic example of a synchronous service call, the method will only return after the request is finished.
	
	Service methods return types can be `void`, `NSString`, `NSArray`, `NSDictionary`, `NSNumber` and `BOOL`.

	> Many service methods require groupId as a parameter, you can get the user's groups by calling `[LRGroupService_v62 getUserSites:&error]`.

	#### Asynchronous
	
	The SDK allows asynchronous HTTP requests, all you need to do is to set a callback to the session object.  Set it back to `nil` if you want to make synchronous requests again.
	
	First thing you need to do is to create a class that conforms to the `LRCallback` protocol, for example:
	
	```objective-c
	#import "LRCallback.h"

	@interface BlogsEntriesCallback : NSObject <LRCallback>

	@end
	```

	```objective-c
	#import "BlogsEntriesCallback.h"

	@implementation BlogsEntriesCallback

	- (void)onFailure:(NSError *)error {
		// Implement error handling code
	}

	- (void)onSuccess:(id)result {
		// Called after request has finished successfully
	}

	@end
	```

	Then, set this callback to the session and call your service as usual:

	```objective-c
	BlogsEntriesCallback *callback = [[BlogsEntriesCallback alloc] init];
	
	[session setCallback:callback];
	[service getGroupEntriesWithGroupId:1084 status:0 start:-1 end:-1 error:&error];
	```
	
	If a server side exception or a connection error occurs during the request, `onFailure` method will be called with a `NSError` instance that contains information about the error.
	
	Since the request is asynchronous, `getGroupEntriesWithGroupId` returns immediately with nil, the `onSuccess` method of your callback is called instead with the results once the request has finished successfully.

	As you can see, the `onSuccess` result parameter is not typed. You need to check the service method signature in order to figure out which type you can cast to safely. In this example, the `getGroupEntriesWithGroupId` method returns a `NSArray`, so you can cast to this type:

	```objective-c
	- (void)onSuccess:(id)result {
		NSArray *entries = (NSArray *)result;
	}
	```	
	`onSuccess` is called on the main UI thread after the request has finished.

	#### Batch
	
	The SDK allows sending requests in batch, this can be much more efficient in some cases. Say for example you want to delete 10 blog entries at the same time, instead of making one request for each delete call, you can create a batch of calls and send them all together.
	
	```objective-c
	#import "LRBatchSession.h"

	LRBatchSession *batch = [[LRBatchSession alloc] init:@"http://localhost:8080" username:@"test@liferay.com" password:@"test"];
	LRBlogsEntryService_v62 *service = [[LRBlogsEntryService_v62 alloc] init:batch];
	NSError *error;
	
	[service deleteEntryWithEntryId:1 error:&error];
	[service deleteEntryWithEntryId:2 error:&error];
	[service deleteEntryWithEntryId:3 error:&error];
	
	NSArray *entries = [batch invoke:&error];
	```
	
	First, create a `LRBatchSession` session. You can either pass credentials or another `session` to the constructor, this is useful when you already have a `session` object and want to reuse the same credentials.
	
	Then, make the service calls as usual, as with asynchronous calls, these methods will return nil right away.
	
	Finally, call `[batch invoke:&error]`, it will return a NSArray containing the results for each service call. Since there were 3 `deleteEntryWithEntryId` calls, the entries array will contain 3 objects. The order of the results will match the order of the service calls.
	
	If you want to make batch calls asynchronously, set the callback to the session as usual:
	
	```objective-c
	[batch setCallback:callback];
	```

	The return type for batch calls is always a NSArray.
