![Liferay Mobile SDK logo](../logo.png)

# Liferay Android SDK

* [Sample](#sample)
* [Setup](#setup)
	* [Manually](#manually)
	* [Gradle](#gradle)
* [Compatibility](#compatibility)
	* [Liferay](#liferay)
	* [Android](#android)
* [Use](#use)
	* [Unauthenticated session](#unauthenticated-session)
	* [Asynchronous](#asynchronous)
	* [Batch](#batch)
	* [Non-primitive arguments](#non-primitive-arguments)
		* [OrderByComparator](#orderbycomparator)
		* [ServiceContext](#servicecontext)
		* [Binaries](#binaries)
* [Troubleshooting](#troubleshooting)

## Sample

Check out the [Android sample
app](https://github.com/brunofarache/liferay-mobile-sdk-sample-android). It's a
Contacts app that lists all Liferay users and shows contact details about them.
It contains many examples on how to use the Liferay Mobile SDK and it's a good
way to learn how to use the Liferay Mobile SDK to build your own native
applications.

## Setup

#### Manually

1. [Download](https://github.com/liferay/liferay-mobile-sdk/releases/) the
latest version of `liferay-android-sdk.jar`.

2. Within your Android project, copy the JAR into your project's `/libs` folder.
Android Developer Tools should automatically add this JAR to your classpath.

3. You will also need to download and copy these dependencies to the `/libs`
folder: [httpclient-android-4.3.3.jar](http://search.maven.org/remotecontent?filepath=org/apache/httpcomponents/httpclient-android/4.3.3/httpclient-android-4.3.3.jar)
and [httpmime-4.3.3.jar](http://search.maven.org/remotecontent?filepath=org/apache/httpcomponents/httpmime/4.3.3/httpmime-4.3.3.jar).

4. Start using it!

#### Gradle

If your Android project is using Gradle as the build system, you can add Liferay
Android SDK as a dependency to your project, all versions are available at
JCenter and Maven Central repositories:

```groovy
repositories {
	jcenter()
	mavenCentral()
}

dependencies {
	compile group: 'com.liferay.mobile', name: 'liferay-android-sdk', version: '6.2.0.+'
}
```

You can do the same and add to your pom.xml if you are using Maven:

```xml
<dependency>
    <groupId>com.liferay.mobile</groupId>
    <artifactId>liferay-android-sdk</artifactId>
    <version>LATEST</version>
</dependency>
```

Gradle and Maven will download all the necessary dependencies before building
your project.

> If you get errors such as `Duplicate files copied in APK META-INF/NOTICE`
> when building with Gradle, add this to your `build.gradle` file:
> ```groovy
> android {
> 	...
> 	packagingOptions {
>		exclude 'META-INF/LICENSE'
>		exclude 'META-INF/NOTICE'
> 	}
>	...
> }
> ```

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
app though. You can add to your classpath both versions 6.2.0.1 and 7.0.0.1.
There won't be conflicts because service classes packages are separated by
their version number as well: *.v62, *.v7, etc.

To find out which Liferay versions you are connecting to, use the
`PortalVersionUtil.getPortalVersion(…)` method.

#### Android

The Liferay Android SDK is compatible with Android versions 2.3.3 and up. It may
work with older versions, but these are the versions we use to run our unit
tests.

## Use

1. Create a `Session` with the user credentials:

	```java
	import com.liferay.mobile.android.auth.basic.BasicAuthentication;
	import com.liferay.mobile.android.service.Session;
	import com.liferay.mobile.android.service.SessionImpl;
	
	Session session = new SessionImpl("http://10.0.2.2:8080", new BasicAuthentication("test@liferay.com", "test"));
	```

	The first parameter is the URL of the Liferay instance you are connecting
	to. If you are running your app on an Android Emulator, it points to your
	local Liferay instance. In this case, `http://10.0.2.2:8080` is equivalent
	to `http://localhost:8080`, which means the emulator and Liferay are running
	in the same machine.

	The second parameter is the user credentials for authentication. You need to
	provide the user's email address, screen name or user ID. It depends on which
	authentication method your Liferay instance is using. Along with that, you
	need to provide the user's password.

	As the name indicates, `BasicAuthentication` uses Basic Authentication to 
	authenticate each service call. The Mobile SDK also supports OAuth
	authentication as long as the OAuth Provider portlet is deployed to your Liferay
	Portal. To learn how to do OAuth authentication with the Mobile SDK, check the
	[OAuth sample app](https://github.com/brunofarache/liferay-android-sdk-oauth).

	> Be careful to use these credentials on a production Liferay instance. If
	you're using the administrator credentials, you have permission to call any
	service and can change any data by accident.

	If you are building a login view for your app, you can use the SignIn utility
	class to check if the credentials given by the user are valid or not.

	```java
	import com.liferay.mobile.android.auth.SignIn;

	SignIn.signIn(session, new JSONObjectAsyncTaskCallback() {

		@Override
		public void onSuccess(JSONObject userJSONObject) {
			System.out.println("Successful sign-in, user details: " + userJSONObject)
		}

		@Override
		public void onFailure(Exception e) {
			e.printStackTrace();
		}

	});
	```

	The Mobile SDK doesn't keep any persistent connection or session with the
	server. Each request is sent with the user credentials (except for OAuth).
	The SignIn class is just a way to return the user information after a successful
	sign-in.

2. Check which Liferay services you need in order to build your app by
navigating to
[http://localhost:8080/api/jsonws](http://localhost:8080/api/jsonws). This page
lists all available portal services and plugin services.

3. If you are building a blogs app, for example, you can import
`BlogsEntryService`. 

	```java
	import com.liferay.mobile.android.v62.blogsentry.BlogsEntryService;
	```

	Since the SDK is built for a specific Liferay version, service classes are
	separated by their package name. In this case, it's `.v62`, which means this
	SDK is built for Liferay 6.2. You can use several SDKs at the same time to
	support different Liferay versions.

4. Create a `BlogsEntryService` object and make a service call.

	```java
	BlogsEntryService service = new BlogsEntryService(session);

	JSONArray jsonArray = service.getGroupEntries(10184, 0, 0, -1, -1);
	```
	
	It fetches all blog entries from the `Guest` site, which, in this example,
	has `groupId` equal to 10184.
	
	This is a basic example of a synchronous service call; the method will only
	return after the request is finished.
	
	Service method return types can be `void`, `String`, `JSONArray`, and
	`JSONObject`. Primitive type wrappers can be `Boolean`, `Integer`,
	`Long`, and `Double`.

	> Many service methods require `groupId` as a parameter. You can get the
	user's groups by calling the `getUserSites()` method from `GroupService`.

#### Unauthenticated session

It's also possible to create a `Session` instance that has no credential
information. You need to use the constructor that accepts the server URL only:

```java
Session session = new SessionImpl("http://10.0.2.2:8080");
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

#### Asynchronous

Android doesn't allow synchronous HTTP requests, like we demonstrated above,
from the main UI thread. You can only make them from different threads; for
example, from within an `AsyncTask` instance.

The SDK can help you make asynchronous HTTP requests if you don't want to create
an `AsyncTask` yourself. It makes the service call from an AsyncTask and you can
pass a callback that is invoked after the request finishes.

Set a callback class implementation to the session and all the following
service calls will be asynchronous. Set it back to null if you want to make
synchronous calls again.

```java
import com.liferay.mobile.android.callback.Callback;
import com.liferay.mobile.android.callback.typed.JSONArrayCallback;

AsyncTaskCallback callback = new JSONArrayCallback() {

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

If an exception occurs during the request, the `onFailure` method is called. It
can be either a connection exception (e.g., a request timeout) or a
`ServerException`.

When a `ServerException` occurs, it's because something went wrong on the
server side. For example, if you pass a `groupId` that doesn't exist, the portal
will complain about it and the SDK will wrap the error message with a
`ServerException`.

There are many `AsyncTaskCallback` implementations, one for each service method
return type: `JSONObjectAsyncTaskCallback`, `JSONArrayAsyncTaskCallback`,
`StringAsyncTaskCallback`, `BooleanAsyncTaskCallback`,
`IntegerAsyncTaskCallback`, `LongAsyncTaskCallback`, and
`DoubleAsyncTaskCallback`. Pick the appropriate implementation for your service
method return type. In the example above, since `getGroupEntries` returns a
JSONArray, you must use the `JSONArrayAsyncTaskCallback` instance.

It's also possible to use a generic `AsyncTaskCallback` implementation called
`GenericAsyncTaskCallback`. For this implementation, you must implement a
transform method and handle JSON parsing by yourself.

> If you still don't want to use any of these callbacks, you can implement
`AsyncTaskCallback` directly, but be careful, you should always get the first
element of the JSONArray passed as a parameter to the `onPostExecute(JSONArray
jsonArray)` method (i.e., `jsonArray.get(0)`).

The `onSuccess` method is called on the main UI thread after the request has
finished.

Since the request is asynchronous, `service.getGroupEntries` returns
immediately with a null object. The result will be passed to the callback
`onSuccess` method instead.

#### Batch

The SDK allows sending requests using batch processing, which can be much more
efficient in some cases. For example, you want to delete 10 blog entries at
the same time; instead of making one request for each delete call, you can
create a batch of calls and send them all together.

```java
import com.liferay.mobile.android.service.BatchSessionImpl;

BatchSessionImpl batch = new BatchSessionImpl(session);
BlogsEntryService service = new BlogsEntryService(batch);
	
service.deleteEntry(1);
service.deleteEntry(2);
service.deleteEntry(3);

JSONArray jsonArray = batch.invoke();
```

First, create a `BatchSessionImpl` session. You can either pass credentials or
another `session` to the constructor. This is useful when you already have a
`session` object and want to reuse the same credentials.

Then, make the service calls as usual; as with asynchronous calls, these methods
return a null object right away.

Finally, call the `invoke()` method from the session object. It returns a
`JSONArray` containing the results for each service call. Since there are three
`deleteEntry` calls, the `jsonArray` contains three objects. The order of the
results matches the order of the service calls.

If you want to make batch calls asynchronously, set the callback as a
`BatchAsyncTaskCallback` instance:

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

As you can see, the return type is always a `JSONArray`.

#### Non-primitive arguments

There are some special cases in which service methods arguments are not
primitives. In these cases, you should use `JSONObjectWrapper`, for example:

```java
JSONObjectWrapper wrapper = new JSONObjectWrapper(new JSONObject());
```

You must pass a JSON containing the object properties and their values. On
the server side, your object will be instantiated and setters for each property
will called with the values from the JSON you passed.

There are some other cases in which server service methods require interfaces or
abstract classes arguments. Since it's impossible for the SDK to guess which
implementation you want to use, you must initialize `JSONObjectWrapper` with
the className, like that:

```java
JSONObjectWrapper wrapper = new JSONObjectWrapper(className, new JSONObject());
```

The server will look for the class name in its classpath and instantiate the
object for you, then call setters just like the previous example.
`OrderByComparator` is a good example, more about that bellow.

##### OrderByComparator

On the server side, `OrderByComparator` is an abstract class, because of that,
you must pass the name of a class that implements it, for example:

```java
String className = "com.liferay.portlet.bookmarks.util.comparator.EntryNameComparator";

JSONObjectWrapper orderByComparator = new JSONObjectWrapper(className, new JSONObject());
```

If the service you are calling accepts `null` for a comparator argument, just
pass `null` to the service call.

You probably want to set the ascending property for a comparator. Unfortunately,
as of Liferay 6.2, most Liferay `OrderByComparator` implementations don't have a
setter for this property and it's not possible to set from the SDK. This will be
fixed in future portal versions.

However, if you have a custom `OrderByComparator` that has a setter for
ascending you can do:

```java
String className = "com.example.MyOrderByComparator";

JSONObject jsonObject = new JSONObject();
jsonObject.put("ascending", true);

JSONObjectWrapper orderByComparator = new JSONObjectWrapper(className, jsonObject);
```

For more examples, take a look at this test case: [OrderByComparatorTest.java](src/test/java/com/liferay/mobile/sdk/test/portal/OrderByComparatorTest.java).

##### ServiceContext

`ServiceContext` is a special case because most Liferay services methods require
it, however, you are not required to pass it to the SDK, you can just pass
`null`. The server will create a `ServiceContext` instance with default values
for you.

If there is some property you want to set for `ServiceContext` you can do:

```java
JSONObject jsonObject = new JSONObject();
jsonObject.put("addGroupPermissions", true);
jsonObject.put("addGuestPermissions", true);

JSONObjectWrapper serviceContext = new JSONObjectWrapper(jsonObject);
```

For more examples, take a look at this test case: [ServiceContextTest.java](src/test/java/com/liferay/mobile/sdk/test/portal/ServiceContextTest.java).

##### Binaries

Some Liferay services require argument types such as byte arrays (`byte[]`) and
Files (`java.io.File`).

The SDK converts byte arrays to Strings before sending the POST request, for
example, `"hello".getBytes("UTF-8")` becomes a JSON array like
`"[104,101,108,108,111]"`. The SDK does that for you so you don't have worry
about it, you just need to pass the byte array to the method.

You need to be careful while using such methods though, because you are
allocating memory for the whole byte array and may have memory issues if content
is large.

Some other portal service methods require `java.io.File`, in these cases the
SDK requires `InputStreamBody` instead.

Here's an example on how to create `InputStreamBody` instances:

```java
InputStream is = context.getAssets().open("file.png");
InputStreamBody file = new InputStreamBody(is, "image/png", "file.png");
```

That is, you need to create an `InputStream` and pass it to the
`InputStreamBody` constructor along with the file's mime type and name.

The SDK will send a multipart form request to the portal. On the server side, a
`File` instance will be created and sent to the service method you are calling.

Every service that makes upload return a `AsyncTask` instance, you can use that
to cancel the upload if needed.

In case you want to listen for upload progress to create a progress bar, you can
create a `UploadProgressAsyncTaskCallback` callback and set to the current
`Session` object, its `onProgress` method will be called for each byte chunk
sent, it will pass the total number of uploaded bytes so far. For example:

```java
session.setCallback(

	new UploadProgressAsyncTaskCallback<JSONObject>() {

		(...)

		public void onProgress(int totalBytes) {
			// This method will be called for each byte chunk sent.
			// The totalBytes argument will contain the total number
			// of uploaded bytes, from 0 to the total size of the
			// request.
		}
		
		(...)

	}

);
```

For more examples on this subject, check these test cases: [DLAppServiceTest.java](src/test/java/com/liferay/mobile/sdk/test/portal/DLAppServiceTest.java) (aadFileEntry* methods)
and [UploadFileUtil.java](https://github.com/brunofarache/liferay-android-sdk-sample/blob/master/src/com/liferay/mobile/sample/util/UploadFileUtil.java).


## Troubleshooting

If you are having trouble the use the Liferay Android SDK, check out the
[sample app](https://github.com/brunofarache/liferay-mobile-sdk-sample-android),
it contains good examples on how to use it and serves as a good starting point.

The SDK has [unit tests](https://github.com/liferay/liferay-mobile-sdk/tree/master/android/src/test/java/com/liferay/mobile/sdk/test/portal)
that cover the most important parts and we use it daily in production-ready
apps, do some research before posting questions to [our forum](https://www.liferay.com/community/forums/-/message_boards/category/33008690)
, there are good chances there's something wrong with your code and not the SDK.

It helps a lot if you know the Android basics.

If you really got stuck, post the question to [our forum](https://www.liferay.com/community/forums/-/message_boards/category/33008690),
we will try to answer as soon as possible. If there's something missing in the
documentation, let us know!

Found a bug or want to suggest an improvement? File a ticket to our [Jira project](https://issues.liferay.com/browse/MOBILESDK)
or create a GitHub [issue](https://github.com/liferay/liferay-mobile-sdk/issues).

We will list in this section the most common mistakes and questions:


> Exception: "org.apache.http.conn.HttpHostConnectException: Connection
> to `http://10.0.2.2:8080` refused"

The SDK needs access to the internet in order to make requests to your portal
instance, even if you are running the portal locally. This is common to the
majority of the Android apps out there. You need to add this permission to
AndroidManifest.xml in order to fix it:

```xml
<manifest...>
	<uses-permission android:name="android.permission.INTERNET" />
...
</manifest>
```


> Build error: "Duplicate files copied in APK META-INF/NOTICE"

See the [Gradle](#gradle) section.


> How can I use the SDK with custom portlet services that I've developed?

See the SDK Builder [documentation](https://github.com/liferay/liferay-mobile-sdk/blob/master/builder/README.md)


> Do I need to use the Liferay IDE integration in order to use the SDK?

No, you can use it with Android Studio or any other IDE you want, there's no
requirement to use the Liferay IDE.


> Exception: android.os.NetworkOnMainThreadException

You are trying to make a request from your app main thread, this will freeze
the user's interaction with the app. Check the [Asynchronous](#asynchronous)
section.


> I don't know which portal APIs exist and how to use them.

Check the [http://localhost:8080/api/jsonws](http://localhost:8080/api/jsonws)
page. From there you can see which services are available, which parameters are
needed and even simulate requests. If you are having trouble to invoke services
from this page, you will also have trouble to invoke from the SDK.
