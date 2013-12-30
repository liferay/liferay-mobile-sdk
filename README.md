## Table of Contents

* [What's the Liferay Mobile SDK?](#whats-the-liferay-mobile-sdk)
* [Liferay Android SDK](#liferay-android-sdk)
	* [Sample](#sample)
	* [Setup](#setup)
	* [Use](#use)
		* [Asynchronous](#asynchronous)
		* [Batch](#batch)
* [Generating SDKs for custom services](#generating-sdks-for-custom-services)
	* [About](#about)
	* [Use](#use-1)
		* [Ant task](#ant-task)
			* [Android](#android)
			* [iOS](#ios)


## What's the Liferay Mobile SDK?

With the Liferay Mobile SDK, you can quickly build native mobile apps that integrate with your different Liferay Portal instances.

Internally, it's a wrapper for Liferay JSON Web Services...but it is much more! It takes care of authentication, makes RESTful requests (synchronously or asynchronously), parses JSON results, handles server side exceptions, etc.

It does not only help you to access all out-of-the-box Liferay Portal web services, but also any custom plugins or portlets that were built with Liferay's Service Builder.

For the moment we provide support for Android and iOS apps, but it's an extensible system and we plan to make it available for other platforms in the near future like PhoneGap or Titanium.

Currently it is compatible with Liferay Portal 6.2 and later. 

The project is divided in 2 sections: the SDK (for Android) and a SDK Builder. The SDK Builder is a code generator that discovers which services are available for a given portal instance and produces most of the code of the SDK. It's template based, that's how we will be able to extend the SDK to other platforms.

## Liferay Android SDK

### Sample

Check out the [Android sample app](https://github.com/brunofarache/liferay-mobile-sdk-sample-android). It's a Contacts app that lists all Liferay users and shows contact details about them. It contains many examples on how to use the Liferay Mobile SDK and it's a good way to learn how to use the Liferay Mobile SDK to build your own native applications.

### Setup

1. [Download](https://github.com/brunofarache/liferay-mobile-sdk/releases/) the latest version of `liferay-android-sdk.jar`. If you want to debug the SDK source code, you can also download `liferay-android-sdk-sources.jar` and attach the source code to your IDE project.

2. Within your Android project, drop the jar into the `/libs` folder. Android Developer Tools should automatically add this jar to your classpath, if you are using a different IDE, make sure this jar is added to the project classpath.

3. Import the necessary classes and start using it!

### Use

1. Create a `Session` with the user credentials:

	```java
	import com.liferay.mobile.android.service.Session;
	import com.liferay.mobile.android.service.SessionImpl;
	
	Session session = new SessionImpl("http://10.0.2.2:8080", "test@liferay.com", "test");
	```

	The first parameter is the URL of the Liferay instance you are connecting to. If you are running your app on an Android Emulator `http://10.0.2.2:8080` is equivalent to `http://localhost:8080`, it points to your local Liferay instance. In this case, emulator and Liferay are running in the same machine.

	The second parameter is either the user's email address, screen name or userId. It depends on which authentication method your Liferay instance is using. The default authentication method is by user's email address.

	The third parameter is the user's password.

	> Be careful to use these credentials on a production Liferay instance, they are typically the administrator credentials, which means you have permission to call any service and change any data.


2. Check which Liferay services you need in order to build your app by going to [http://localhost:8080/api/jsonws](http://localhost:8080/api/jsonws). This page lists all available portal service as well plugins services.


3. If you are building a blogs app, for example, you can import `BlogsEntryService`.

	```java
	import com.liferay.mobile.android.v62.blogsentry.BlogsEntryService;
	```

	Since the SDK is built for a specific Liferay version, service classes are separate by their package name, in this case `.v62`, which means this SDK is built for Liferay 6.2. You can use several SDKs at the same time to support different Liferay versions.

4. Create a `BlogsEntryService` object and make a service call.

	```java
	BlogsEntryService service = new BlogsEntryService(session);

	JSONArray jsonArray = service.getGroupEntries(10184, 0, 0, -1, -1);
	```
	
	It fetches all blog entries from the `Guest` site, which in this example has groupId equals to 10184.
	
	This is an basic example of a synchronous service call, the method will only return after the request is finished.
	
	Service methods return types can be `void`, `String`, `JSONArray`, `JSONObject` and primitive type wrappers: `Boolean`, `Integer`, `Long` and `Double`.

	> Many service methods require groupId as a parameter, you can get the user's groups by calling the `getUserSites()` method from `GroupService`.

	#### Asynchronous
	
	Android doesn't allow synchronous HTTP requests like the above from the main UI thread, you can only make them from different threads, for example, from within a AsyncTask instance.
	
	The SDK can help you to make asynchronous HTTP requests if you don't want to create an AsyncTask yourself. It makes the service call from an AsyncTask and you can pass a callback that will be called after the request finishes.
	
	Set a callback class implementation to the session, while the callback is not null, all the following services calls will be asynchronous, set it back to null if you want to make synchronous calls again.
	
	```java
	import com.liferay.mobile.android.task.callback.AsyncTaskCallback;
	import com.liferay.mobile.android.task.callback.typed.JSONArrayAsyncTaskCallback;
	
	AsyncTaskCallback callback = new JSONArrayAsyncTaskCallback() {
	
		public void onFailure(Exception exception) {
			// Implement exception handling code
		}

		public void onSuccess(JSONArray result) {
			// Called after request has finished successfully
		}
	
	};
	
	session.setCallback(callback);
	service.getGroupEntries(10184, 0, 0, -1, -1);
	```
	
	If an exception happens during the request, `onFailure` method will be called. It can be either a connection exception (a request timeout, for example) or a `ServerException`.
	
	When a `ServerException` happens, it's because something went wrong on the server side. For example, if you pass a `groupId` that doesn't exist, the portal will complain about it and the SDK will wrap the error message with a `ServerException`.
	
	There are many `AsyncTaskCallback` implementations, one for each service method return type: `JSONObjectAsyncTaskCallback`, `JSONArrayAsyncTaskCallback`, `StringAsyncTaskCallback`, `BooleanAsyncTaskCallback`, `IntegerAsyncTaskCallback`, `LongAsyncTaskCallback` and `DoubleAsyncTaskCallback`. Pick the appropriate implementation, in the example above, since `getGroupEntries` returns a JSONArray, you must use a `JSONArrayAsyncTaskCallback` instance.
	
	It's also possible to use a generic `AsyncTaskCallback` implementation called `GenericAsyncTaskCallback`, you must implement a transform method and handle parsing by yourself.
	
	> If you still don't want to use any of these callbacks, you can implement `AsyncTaskCallback` directly, but be careful, you should always get the first element of the JSONArray passed as parameter to the `onPostExecute(JSONArray jsonArray)` method, i.e. `jsonArray.get(0)`.
	
	`onSuccess` is called on the main UI thread after the request has finished.
	
	Since the request is asynchronous, `service.getGroupEntries` will return right away, with a null object, the result will be passed to the callback `onSuccess` method instead.
	
	#### Batch
	
	The SDK allows sending requests in batch, this can be much more efficient in some cases. Say for example you want to delete 10 blog entries at the same time, instead of making one request for each delete call, you can create a batch of calls and send them all together.
	
	```java
	import com.liferay.mobile.android.service.BatchSessionImpl;

	BatchSessionImpl batch = new BatchSessionImpl("http://10.0.2.2:8080", "test@liferay.com", "test");
	BlogsEntryService service = new BlogsEntryService(session);
		
	service.deleteEntry(1);
	service.deleteEntry(2);
	service.deleteEntry(3);
	
	JSONArray jsonArray = batch.invoke();
	```
	
	First, create a `BatchSessionImpl` session. You can either pass credentials or another `session` to the constructor, this is useful when you already have a `session` object and want to reuse the same credentials.
	
	Then, make the service calls as usual, as with asynchronous calls, these methods will return a null object right away.
	
	Finally, call the `invoke()` from the session object, it will return a JSONArray containing the results for each service call. Since there were 3 `deleteEntry` calls, the jsonArray will contain 3 objects. The order of the results will match the order of the service calls.
	
	If you want to make batch calls asynchronously, set the callback as a `BatchAsyncTaskCallback` instance:
	
	```java
	import com.liferay.mobile.android.task.callback.BatchAsyncTaskCallback;

	batch.setCallback(new BatchAsyncTaskCallback() {
			
		public void onFailure(Exception exception) {
		}
		
		public void onSuccess(JSONArray results) {
			// The result is always a JSONArray 
		}

	});
	```

	As you can see, the return type is always a JSONArray.

## Generating SDKs for custom services

### About

With the SDK Builder, you can generate SDKs for custom portlets. Think it as a Service Builder on the client side, it generates code that allows your mobile app to access your own custom services.

First thing you need to do is to build your services with Service Builder:

1. Set `remote-service="true"` in your portlet's service.xml

2. Run `ant build-service` and implement your remote services in the generated `FooServiceImpl.java`

3. Run `ant build-service` again and finally run `ant build-wsdd`.This last step is very important, the SDK Builder won't be able to figure out which services are remotely available if you don't run `ant build-wsdd` before deploying the portlet.

4. After deploying your portlet (`ant deploy`), you are ready to use the SDK Builder to generate your custom SDK.

You will be able to do things like `FooService.bar();` from your mobile app, Liferay Mobile SDK will take care of making the JSON Web Services request to your portlet.

### Use

#### Ant task

1. Download the Mobile SDK source code:

	```sh
	git clone git@github.com:brunofarache/liferay-mobile-sdk.git
	```

2. Create a file in the root folder called `build.${user.name}.properties`, where `${user.name}` is your computer user name. If you can't figure out your user name, just change `build.properties` directly.

3. Here are the important properties:

	```
url=http://localhost:8080
context=
filter=
package=com.liferay.mobile.android
destination=gen
	```

	Change them accordingly:
	* `url` should point to your Liferay instance.

	* `context` is your portlet web context. Say for example you are generating a SDK for Liferay's Calendar portlet, this portlet is generally deployed to the `calendar-portlet` context, then you should set `context=calendar-portlet`. Under the hood, the SDK Builder will try to access `http://localhost:8080/calendar-portlet/api/jsonws?discover` to find out which services are available for this portlet. Check if this URL is working before running the SDK, if it's not, check the [About](#about) section, you probably forgot to run `ant build-wsdd`.

	* `filter` is used to filter which entities services will be available. If your service.xml has several entities, you can create a SDK for a given entity only. For example, the Calendar portlet has entities such as `CalendarBooking` and `CalendarResource`, if you want to generate a SDK only for `CalendarBooking`, set it to `filter=calendarbooking`. Builder will do the request to the following URL: `http://localhost:8080/calendar-portlet/api/jsonws?discover=/calendarbooking/*`.

	* `package` (Android only) is used to generated the root package name classes. The Liferay version is appended to the end of this package name, for example `com.liferay.mobile.android.v62`. This way, there's no package name collision if you are using the SDK with several Liferay versions at the same time.

	* `destination` is the root folder to which your generated files will be saved. Android files will be saved by default to `gen/android/src` and iOS to `gen/ios`.
	
	The only property that you generally want to change is `context`, all others are for specific cases.

##### Android

1. From the root folder, run `ant -f build-android.xml`, this will generate the services classes into the `gen` folder. In order to build a jar file containing the generated service and utility classes, run `ant -f build-android.xml jar`, the jar file will be created at `dist/android/liferay-android-sdk.jar`.

2. You are ready to use `liferay-android-sdk.jar` in your Android project, no other external dependencies are needed.

##### iOS

1. From the root folder, run `ant -f build-ios.xml`, this will generate the services classes into the `gen/ios` folder. In order to generate a zip file containing the generated service and utility classes, run `ant -f build-ios.xml zip`, the zip file will be created at `dist/ios/liferay-ios-sdk.zip`.

2. You are ready to use `liferay-ios-sdk.zip` in your iOS project, unzip and add all files to your XCode project, no other external dependencies are needed.
