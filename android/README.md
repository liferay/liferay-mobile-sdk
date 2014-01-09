## Table of Contents

* [Liferay Android SDK](#liferay-android-sdk)
	* [Sample](#sample)
	* [Setup](#setup)
	* [Use](#use)
		* [Asynchronous](#asynchronous)
		* [Batch](#batch)

## Liferay Android SDK

### Sample

Check out the [Android sample app](https://github.com/brunofarache/liferay-mobile-sdk-sample-android). It's a Contacts app that lists all Liferay users and shows contact details about them. It contains many examples on how to use the Liferay Mobile SDK and it's a good way to learn how to use the Liferay Mobile SDK to build your own native applications.

### Setup

1. [Download](https://github.com/liferay/liferay-mobile-sdk/releases/) the latest version of `liferay-android-sdk.jar`. If you want to debug the SDK source code, you can also download `liferay-android-sdk-sources.jar` and attach the source code to your IDE project.

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

	BatchSessionImpl batch = new BatchSessionImpl(session);
	BlogsEntryService service = new BlogsEntryService(batch);
		
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
