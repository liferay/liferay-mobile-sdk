# Liferay Mobile SDK

With Liferay Mobile SDK, you can quickly build native mobile apps that integrate with Liferay instances and connect to portal or plugins web services.

It's a wrapper for Liferay JSON Web Services. It takes care of authentication, makes RESTful requests (synchronously or asynchronously), parses JSON results, handles server side exceptions, etc.

Currently, it only supports Android, but it's extensible and we plan to make it available for other platforms in the near future, like iOS and PhoneGap.

It's compatible Liferay Portal 6.2 and later. It not only helps you to access portal web services but also any custom plugins or portlets that were built with Liferay's Service Builder.

The project is divided in 2: the SDK itself (for Android) and a SDK Builder. The Builder is a code generator that discovers which services are available for a given portal instance and produces most of the code of the SDK. It's template based, that's how we are able to extend the SDK to other platforms.


## Liferay Android SDK

Check out the [Android sample app](https://github.com/brunofarache/liferay-mobile-sdk-sample-android). It's a Contacts app that lists all Liferay users and shows contact details about them. It contains many examples on how to use the Liferay Android SDK and it's a good way to learn how to use the SDK.

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
