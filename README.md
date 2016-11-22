![Liferay Mobile SDK logo](https://raw.githubusercontent.com/liferay/liferay-mobile-sdk/master/logo.png)

# Liferay Android SDK

* [What's new?](#whats-new)
* [Setup](#setup)
* [Basics](#basics)
* [Asynchronous](#asynchronous)
* [Config](#config)
* [Request Cancelation](#request-cancelation)
* [Void Return Types](#void-return-types)
* [JSON Deserialization](#json-deserialization)
* [Remote Methods Parameters](#remote-methods-parameters)
* [Unauthenticated Requests](#unauthenticated-requests)
* [Batch](#batch)
* [RxJava](#rxjava)

## What's new

Check this [presentation](https://speakerdeck.com/sgosantos/whats-new-in-liferay-mobile-sdk-2-dot-0-for-android) about what's new in Liferay Android SDK 2.0.

## Setup

Add Liferay Android SDK as a dependency to your project:

```groovy
repositories {
	jcenter()
}

dependencies {
	compile group: 'com.liferay.mobile', name: 'liferay-mobile-sdk', version: '2.0.1'
}
```

This library can be used in any Java project, even non-Android projects, there's
no dependency on Android.

## Basics

1. Create an interface to access some portal's remote API:

	```java
	import com.liferay.mobile.sdk.Call;
	import com.liferay.mobile.sdk.annotation.Param;
	import com.liferay.mobile.sdk.annotation.Path;
	import org.json.JSONArray;

	@Path("/group")
	public interface GroupService {

		@Path("/get-user-sites-groups")
		Call<JSONArray> getUserSitesGroups();

	}
	```

2. We provide all exising portal services in another package, if you want to
have access to them, add this dependency to your project as well:

	```groovy
	dependencies {
		compile group: 'com.liferay.mobile', name: 'liferay-mobile-sdk-services', version: '1.0'
	}
	```

	It contains prebuilt interfaces for both [Liferay Portal 6.2 and 7.0](https://github.com/brunofarache/liferay-sdk-builder/tree/master/services/src/main/java/com/liferay/mobile/sdk).

	Alternatively, you can also use the [SDK Builder](https://github.com/brunofarache/liferay-sdk-builder/tree/master/services/src/main/java/com/liferay/mobile/sdk)
	to generate these interfaces for your custom API. However, it's probably
	simpler for you to build them manually, as described above.

3. Call the remote API:

	```java
	import com.liferay.mobile.sdk.ServiceBuilder;
	import com.liferay.mobile.sdk.Call;
	import com.liferay.mobile.sdk.Config;
	import com.liferay.mobile.sdk.auth.BasicAuthentication;
	import org.json.JSONArray;
	
	GroupService service = ServiceBuilder.build(GroupService.class);
	Call<JSONArray> call = service.getUserSitesGroups();
		
	Config config = new Config.Builder("http://10.0.2.2:8080")
		.auth(new BasicAuthentication("test@liferay.com", "test"))
		.build();

	JSONArray groups = call.execute(config);
	```

## Asynchronous

Android doesn't allow synchronous HTTP requests, like we demonstrated above,
from the main UI thread, you can only make them from different threads.

The SDK can help you make asynchronous HTTP requests, instead of calling
`call.execute(...)`, call `call.async(...)`, passing a `Callback`
implementation like the following:

```java
call.async(config, new Callback<JSONArray>() {

	@Override
	public void onFailure(Exception exception) {
		// Implement exception handling code
	}

	@Override
	public void onSuccess(JSONArray result) {
		// Called after request has finished successfully
	}

});
```

If an exception occurs during the request, the `onFailure` method is called. It
can be either a connection exception (e.g., a request timeout) or a
`ServerException`.

When a `ServerException` occurs, it's because something went wrong on the
server side.

The `onSuccess` and `onFailure` methods are called on the main UI thread after
the request has finished.

## Config

The `Config` object allows the configuration of the following request
properties: server URL, timeout in milliseconds, HTTP headers and a 
`Authentication` instance for handling authentication.

All `Authentication` implementations are available [here](https://github.com/brunofarache/liferay-android-sdk/tree/master/src/main/java/com/liferay/mobile/sdk/auth). The following
authentication mechanisms are supported: basic, digest and cookie
authentication.

`Config` objects are immutable and you can only change them by cloning an
instance first:

```java
Config cloned = config.newBuilder().timeout(1000).build();
```

It's possible to set a global config object. This way you don't need to pass a 
`config` instance every time `call.execute()` or `call.async(...)` are called.

You can set a global config instance like this:

```java
Config.global(config);
```

## Request Cancelation

It can be useful to cancel ongoing requests in case the user wants to cancel a
file upload, for example. You need to hold the `call` instance and call:

```java
Call.cancel(call);
```

## Void Return Types

There are some portal remote methods that return `void`, in this case, you just
need to change the return type to `Call<Response>`:

```java
@Path("/disable-staging")
Call<Response> disableStaging(@Param(name = "groupId") long groupId);
```

You can check the response's `statusCode()` method to confirm if the request
succeeded or not.

## JSON Deserialization

Return types aren't limited to `JSONObject` or `JSONArray` only, you can write
your own POJO and make the method return it. For example, you can write a `Site`
class and use it as a return type:

```java
public class Site {

	String friendlyURL;
	long groupId;

}
```

```java
@Path("/get-user-sites-groups")
Observable<List<Site>> getUserSitesGroups();
```

The SDK uses the [Gson](https://github.com/google/gson) library for serializing
and deserializing objects. If you want to have a custom way of deserializing
JSON, you can register a new type adapter:

```java
public class SiteDeserializer implements JsonDeserializer<Site> {

	@Override
	public Site deserialize(
			JsonElement json, Type type, JsonDeserializationContext context)
		throws JsonParseException {

		// Write your custom deserialization logic
	}

}
```

```java
JSONParser.registerTypeAdapter(Site.class, new SiteDeserializer());
```

## Remote Methods Parameters

## Unauthenticated Requests

It's also possible to create a `Config` instance that has no authentication
information, which will make request as `Guest` to the portal:

```java
Config config = new Config.Builder("http://10.0.2.2:8080").build();
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

## Batch

The SDK allows sending requests using batch processing, which can be much more
efficient in some cases. For example, you want to delete 10 blog entries at
the same time; instead of making one request for each delete call, you can
create a batch of calls and send them all together.

```java
import com.liferay.mobile.sdk.Batch;

// Synchronous

Response response = Batch.execute(config, call1, call2, call3);
String json = response.bodyAsString();

// Asynchronous

Batch.async(config, new Callback<Response>() {

	@Override
	public void onFailure(Exception exception) {
	}

	@Override
	public void onSuccess(Response response) {
		String json = response.bodyAsString();
	}

}, call1, call2, call3);;
```

## RxJava

The SDK supports [RxJava](http://reactivex.io/). If you want to use RxJava,
change the return type from `Call` to `Observable`: 

```java
@Path("/get-user-sites-groups")
Observable<List<Site>> getUserSitesGroups();
```

```java
Observable<List<Site>> observable = service.getUserSitesGroups();

observable
	.subscribeOn(Schedulers.io())
	.observeOn(AndroidSchedulers.mainThread())
	.subscribe(
		new Action1<List<Site>>() {

			@Override
			public void call(List<Site> sites) {
			}

		},
		new Action1<Throwable>() {

			@Override
			public void call(Throwable throwable) {
			}

		}
	);
```

This will use the global config object (`Config.global()`). If you want to use a
specific `Config` instance, cast `Observable` to `CallObservable` and set the
config object:

```java
CallObservable<List<Site>> observable = (CallObservable<List<Site>>)service.getUserSitesGroups();
observable.config(config);
```