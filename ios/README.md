![Liferay Mobile SDK logo](../logo.png)

# Liferay iOS SDK

* [Sample](#sample)
* [Setup](#setup)
	* [Manually](#manually)
	* [CocoaPods](#cocoapods)
* [Compatibility](#compatibility)
	* [Liferay](#liferay)
	* [iOS](#ios)
* [Use](#use)
	* [Basics](#basics)
		* [Unauthenticated session](#unauthenticated-session)
		* [Storing credentials](#storing-credentials)
	* [Asynchronous](#asynchronous)
		* [Blocks](#blocks)
	* [Batch](#batch)
	* [Non-primitive arguments](#non-primitive-arguments)
		* [OrderByComparator](#orderbycomparator)
		* [ServiceContext](#servicecontext)
		* [Binaries](#binaries)

## Sample

Check out the [iOS sample
app](https://github.com/brunofarache/liferay-mobile-sdk-sample-ios). It's a
Contacts app that lists all Liferay users and shows contact details about them.
It contains many examples on how to use the Liferay Mobile SDK and it's a good
way to learn how to use the Liferay Mobile SDK to build your own native
applications.

## Setup

#### Manually

1. [Download](https://github.com/liferay/liferay-mobile-sdk/releases/) the
latest version of `liferay-ios-sdk.zip`.

2. Unzip the file into your Xcode project. 

3. Within Xcode, right click on your project and click on *Add Files to
'Project Name'*.

4. Add both `core` and `v62` folders. The `v62` folder name can change for each
Liferay version. In this example, the SDK is built for Liferay 6.2.

5. The iOS SDK requires [AFNetworking 2.5.3](https://github.com/AFNetworking/AFNetworking/releases/tag/2.5.3).
Make sure its source code is added to your project.

#### CocoaPods

1. You need CocoaPods installed.

2. Create a file called `Podfile` in your project and add the following line:

	```ruby
	pod 'Liferay-iOS-SDK'
	```
3. Run `$ pod install`.

4. This will download the latest version of the SDK and create a .xcworkspace
file, use that file to open your project in Xcode.

5. If you are importing dependencies as frameworks (`use_frameworks!` in Podfile),
you need to import the `LRMobileSDK` module like this:

	```objective-c
	@import LRMobileSDK; // (Objective-C)
	import LRMobileSDK // (Swift)
	```

For more information on how CocoaPods works, read their
[documentation](http://guides.cocoapods.org/using/index.html).

CocoaPods will download all the necessary dependencies and configure your
workspace when you run `$ pod install`.

## Compatibility

#### Liferay

Each Liferay Mobile SDK is designed to work with a specific Liferay Portal
version. Because of that, its version scheme reflects the compatible Liferay
version.

For example, Liferay Mobile SDK 6.2.0.1 is built to work with Liferay Portal
6.2.0, while Liferay Mobile SDK 7.0.0.1 will work with Liferay Portal 7.0.0.

The fourth integer in the version (6.2.0.x) is related to internal Liferay
Mobile SDK versions. For example, if a bug is found on 6.2.0.1, we will
release a version called 6.2.0.2 with the bug fix.

This doesn't mean you can't support several Liferay versions in the same
app though. You can add to your project both versions 6.2.0.1 and 7.0.0.1.
There won't be conflicts because service classes names are suffixed with
their version number as well: *_v62.m, *_v7.m, etc.

To find out which Liferay versions you are connecting to, use the
`[LRPortalVersionUtil getPortalVersion:…]` method.

#### iOS

The Liferay iOS SDK is compatible with iOS versions 7.0 and up. It may work with
older versions, but these are the versions we use to run our unit tests.

## Use

#### Basics

1.  Create a `Session` with the user credentials:

	```objective-c
	#import "LRBasicAuthentication.h"
	#import "LRSession.h"
	
	LRSession *session = [[LRSession alloc] initWithServer:@"http://localhost:8080" authentication:[[LRBasicAuthentication alloc] initWithUsername:@"test@liferay.com" password:@"test"]];
	```

	The first parameter is the URL of the Liferay instance you are connecting
	to. In this case, the emulator and Liferay are running in the same machine.

	The second parameter is the user credentials for authentication. You need to
	provide the user's email address, screen name or user ID. It depends on which
	authentication method your Liferay instance is using. Along with that, you
	need to provide the user's password.

	As the name indicates, `LRBasicAuthentication` uses Basic Authentication to 
	authenticate each service call. The Mobile SDK also supports OAuth
	authentication as long as the OAuth Provider portlet is deployed to your Liferay
	Portal. To learn how to do OAuth authentication with the Mobile SDK, check the
	[OAuth sample app](https://github.com/brunofarache/liferay-ios-sdk-oauth).

	> Be careful to use these credentials on a production Liferay instance. If
	you're using the administrator credentials, you have permission to call any
	service and can change any data by accident. 

	If you are building a login view for your app, you can use the SignIn utility
	class to check if the credentials given by the user are valid or not.

	```objective-c
	#import "LRSignIn.h"

	[session
		onSuccess:^(id result) {
			user = result;
			[monitor signal];
		}
	 	onFailure:^(NSError *e) {
			error = e;
			[monitor signal];
		}
	];

	[LRSignIn signInWithSession:session callback:session.callback error:&error];
	```

	The Mobile SDK doesn't keep any persistent connection or session with the
	server. Each request is sent with the user credentials. The SignIn class
	is just a way to return the user information after a successful sign-in.

2. Check which Liferay services you need in order to build your app by
navigating to
[http://localhost:8080/api/jsonws](http://localhost:8080/api/jsonws). This page
lists all available portal services and plugin services.

3.  If you are building a blogs app, for example, you can import
`BlogsEntryService`.

	```objective-c
	#import "LRBlogsEntryService_v62.h"
	```

	Since the SDK is built for a specific Liferay version, service class names
	have the Liferay version they are built for. In this case, it's `_v62`,
	which means this SDK is built for Liferay 6.2. You can use several SDKs at
	the same time to support different Liferay versions.

4. Create an `LRBlogsEntryService_v62` object and make a service call.

	```objective-c
	LRBlogsEntryService_v62 *service = [[LRBlogsEntryService_v62 alloc] initWithSession:session];

	NSError *error;
	NSArray *entries = [service getGroupEntriesWithGroupId:1084 status:0 start:-1 end:-1 error:&error];
	```
	
	It fetches all blog entries from the `Guest` site, which, in this example,
	has `groupId` equal to 10184.
	
	This is a basic example of a synchronous service call; the method will only
	return after the request is finished.
	
	Service method return types can be `void`, `NSString`, `NSArray`,
	`NSDictionary`, `NSNumber`, and `BOOL`.

	> Many service methods require `groupId` as a parameter. You can get the
	user's groups by calling `[LRGroupService_v62 getUserSites:&error]`.

##### Unauthenticated session

It's also possible to create a `LRSession` instance that has no credential
information. You need to use the constructor that accepts the server URL only:

```objective-c
LRSession *session = [[LRSession alloc] initWithServer:@"http://localhost:8080"];
```

However, most portal remote methods don't accept unauthenticated remote calls,
you will get a `Authentication access required` exception message in most cases.

This will only work if the remote method on the portal or your plugin has the
`@AccessControlled` annotation just before the method:

```java
import com.liferay.portal.security.ac.AccessControlled;

public class FooServiceImpl extends FooServiceBaseImpl {

@AccessControlled(guestAccessEnabled = true)
public void bar() { ... }
```

##### Storing credentials

You can persist credentials with `LRCredentialStorage`, it will safely save
username and password in the key chain:

```objective-c
[LRCredentialStorage storeCredentialForServer:@"http://localhost:8080" username:@"test@liferay.com" password:@"test"];
```

After credentials are stored, you can retrieve them with:

```objective-c
NSURLCredential *credential = [LRCredentialStorage getCredential];
```

Or directly create a `LRSession` instance with:

```objective-c
LRSession *session = [LRCredentialStorage getSession];
```

Check [CredentialStorageTest.m](Test/Portal/CredentialStorageTest.m) for more
examples.

#### Asynchronous
	
The SDK allows asynchronous HTTP requests; all you need to do is set a callback
to the session object. Set it back to `nil` if you want to make synchronous
requests again.
	
The first thing you need to do is create a class that conforms to the
`LRCallback` protocol. For example:
	
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
	
If a server side exception or a connection error occurs during the request, the
`onFailure` method will be called with an `NSError` instance that contains
information about the error.
	
Since the request is asynchronous, `getGroupEntriesWithGroupId` returns
immediately with nil, and the `onSuccess` method of your callback is invoked
instead with the results once the request has finished successfully.

As you can see, the `onSuccess` result parameter is not typed. You need to check
the service method signature in order to figure out which type you can cast to
safely. In this example, the `getGroupEntriesWithGroupId` method returns a
`NSArray`, so you can cast to this type:

```objective-c
- (void)onSuccess:(id)result {
	NSArray *entries = (NSArray *)result;
}
```

`onSuccess` is called on the main UI thread after the request has finished.

##### Blocks

It is also possible to use Objective-C blocks as callbacks:

```objective-c
LRSession *session = [[LRSession alloc] initWithServer:@"http://localhost:8080" username:@"test@liferay.com" password:@"test"];

[session
	onSuccess:^(id result) {
		// Called after request has finished successfully
	}
	onFailure:^(NSError *e) {
		// Implement error handling code
	}
];

LRGroupService_v62 *service = [[LRGroupService_v62 alloc] initWithSession:session];

NSError *error;
[service getUserSites:&error];
```

Do not set a `LRCallback` to the session in this case, otherwise it will get
overriden. Blocks support works the same way as described in the previous
section.

#### Batch

The SDK allows sending requests using batch processing, which can be much more
efficient in some cases. For example, you want to delete 10 blog entries at the
same time; instead of making one request for each delete call, you can create a
batch of calls and send them all together.

```objective-c
#import "LRBatchSession.h"

LRBatchSession *batch = [[LRBatchSession alloc] initWithServer:@"http://localhost:8080" username:@"test@liferay.com" password:@"test"];
LRBlogsEntryService_v62 *service = [[LRBlogsEntryService_v62 alloc] initWithSession:batch];
NSError *error;

[service deleteEntryWithEntryId:1 error:&error];
[service deleteEntryWithEntryId:2 error:&error];
[service deleteEntryWithEntryId:3 error:&error];

NSArray *entries = [batch invoke:&error];
```

First, create an `LRBatchSession` session. You can either pass credentials or
another `session` to the constructor. This is useful when you already have a
`session` object and want to reuse the same credentials.

Then, make the service calls as usual; as with asynchronous calls, these methods
will return nil right away.

Finally, call `[batch invoke:&error]`; it will return an `NSArray` containing the
results for each service call. Since there are three `deleteEntryWithEntryId`
calls, the entries array will contain three objects. The order of the results
matches the order of the service calls.

If you want to make batch calls asynchronously, set the callback to the session
as usual:

```objective-c
[batch setCallback:callback];
```

The return type for batch calls is always an `NSArray`.

#### Non-primitive arguments

There are some special cases in which service methods arguments are not
primitives. In these cases, you should use `LRJSONObjectWrapper`, for example:

```objective-c
LRJSONObjectWrapper *wrapper = [[LRJSONObjectWrapper alloc] initWithJSONObject:[NSDictionary dictionary]];
```

You must pass a dictionary containing the object properties and their values. On
the server side, your object will be instantiated and setters for each property
will called with the values from the dictionary.

There are some other cases in which server service methods require interfaces or
abstract classes arguments. Since it's impossible for the SDK to guess which
implementation you want to use, you must initialize `LRJSONObjectWrapper` with
the className, like that:

```objective-c
LRJSONObjectWrapper *wrapper = [[LRJSONObjectWrapper alloc] initWithClassName:@"com.example.MyClass" jsonObject:[NSDictionary dictionary]];
```

The server will look for the class name in its classpath and instantiate the
object for you, then call setters just like the previous example.
`OrderByComparator` is a good example, more about that bellow.

##### OrderByComparator

On the server side, `OrderByComparator` is an abstract class, because of that,
you must pass the name of a class that implements it, for example:

```objective-c
NSString *className = @"com.liferay.portlet.bookmarks.util.comparator.EntryNameComparator";

LRJSONObjectWrapper *orderByComparator = [[LRJSONObjectWrapper alloc] initWithClassName:className jsonObject:[NSDictionary dictionary]];
```

If the service you are calling accepts `null` for a comparator argument, just
pass `nil` to the service call.

You probably want to set the ascending property for a comparator. Unfortunately,
as of Liferay 6.2, most Liferay `OrderByComparator` implementations don't have a
setter for this property and it's not possible to set from the SDK. This will be
fixed in future portal versions.

However, if you have a custom `OrderByComparator` that has a setter for
ascending you can do:

```objective-c
NSString *className = @"com.example.MyOrderByComparator";

NSDictionary *jsonObject = @{
	@"ascending": @(YES)
};

LRJSONObjectWrapper *orderByComparator = [[LRJSONObjectWrapper alloc] initWithClassName:className jsonObject:jsonObject];
```

For more examples, take a look at this test case: [OrderByComparatorTest.m](Test/Portal/OrderByComparatorTest.m).

##### ServiceContext

`ServiceContext` is a special case because most Liferay services methods require
it, however, you are not required to pass it to the SDK, you can just pass
`nil`. The server will create a `ServiceContext` instance with default values
for you.

If there is some property you want to set for `ServiceContext` you can do:

```objective-c
NSDictionary *jsonObject = @{
	@"addGroupPermissions": @(YES),
	@"addGuestPermissions": @(YES)
};

LRJSONObjectWrapper *serviceContext = [[LRJSONObjectWrapper alloc] initWithJSONObject:jsonObject];
```

For more examples, take a look at this test case: [ServiceContextTest.m](Test/Portal/ServiceContextTest.m).

##### Binaries

Some Liferay services require binary argument types such as `NSData` and
`LRUploadData`.

The SDK converts `NSData` instances to NSStrings before sending the POST
request, for example, `[@"hello" dataUsingEncoding:NSUTF8StringEncoding]`
becomes a JSON array like `"[104,101,108,108,111]"`. The SDK does that for you
so you don't have worry about it, you just need to pass the `NSData` to the
method.

You need to be careful while using such methods though, because you are
allocating memory for the whole `NSData` and may have memory issues if content
is large.

Some other portal service methods require `java.io.File`, in these cases the SDK
requires `LRUploadData` instead.

Here are examples on how to create `LRUploadData` instances:

```objective-c
LRUploadData *upload = [[LRUploadData alloc] initWithData:data fileName:@"file.png" mimeType:@"image/png"]
```

```objective-c
LRUploadData *upload = [[LRUploadData alloc] initWithInputStream:is length:length fileName:@"file.png" mimeType:@"image/png"];
```

The first constructor accepts a `NSData` argument, while the second accepts
`NSInputStream`.

As you can see, you also need to pass the file's mime type and name. `lenght` is
the size in bytes of the content being sent.

The SDK will send a multipart form request to the portal. On the server side, a
`File` instance will be created and sent to the service method you are calling.

In case you want to listen for upload progress to create a progress bar, you can
create a `LRProgressDelegate` delegate and set to `LRUploadData` object, its
`onProgressBytes` method will be called for each byte chunk sent, it will pass
the bytes that were sent, the total number of bytes sent for far and the total
size of the request. For example:

```objective-c
@interface ProgressDelegate : NSObject <LRProgressDelegate>

@end

@implementation ProgressDelegate

- (void)onProgressBytes:(NSUInteger)bytes sent:(long long)sent
		total:(long long)total {

	// bytes contains the byte values that were sent.
	// sent will contain the total number of bytes sent.
	// total will contain the total size of the request in bytes.

}

@end
```

For more examples on this subject, check this test case: [FileUploadTest.m](Test/Portal/FileUploadTest.m).
