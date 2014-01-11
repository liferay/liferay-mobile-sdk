## Table of Contents

* [What's the Liferay Mobile SDK?](#whats-the-liferay-mobile-sdk)
* [Liferay Android SDK](android/README.md)
* [Liferay iOS SDK](ios/README.md)
* [Generating SDKs for custom services](#generating-sdks-for-custom-services)
	* [Configuring the SDK Builder](#configuring-the-sdk-builder)
	* [Building a Liferay Android SDK](#building-a-liferay-android-sdk)
	* [Building a Liferay iOS SDK](#building-a-liferay-android-sdk)

## What's the Liferay Mobile SDK?

With the Liferay Mobile SDK, you can quickly build native mobile apps that
integrate with your different Liferay Portal instances.

Internally, it's a wrapper for Liferay JSON Web Services...but it's much more!
It takes care of authentication, makes RESTful requests (synchronously or
asynchronously), parses JSON results, handles server side exceptions, etc.

It not only helps you to access all of Liferay Portal's out-of-the-box web
services, but also any web services of custom plugins or portlets
built with Liferay's Service Builder.

For the moment, we provide support for Android and iOS apps. But since the
Liferay Mobile SDK is an extensible system, we plan to make SDKs for
other platforms, like PhoneGap or Titanium, in the near future.

Currently, the Liferay Mobile SDK is compatible with Liferay Portal 6.2 and
later.

The project is divided in 2 sections: the SDK (for Android) and a SDK Builder.
The SDK Builder is a code generator that discovers which services are available
for a given portal instance and produces most of the code of the SDK. It's
template based, that's how we will be able to extend the SDK to other platforms.

## Liferay Android SDK

Check the Android SDK documentation [here](android/README.md).

## Liferay iOS SDK

Check the iOS SDK documentation [here](ios/README.md).

## Generating SDKs for Custom Services

The SDK Builder enables you to generate SDKs for custom portlets. Think of it as
a Service Builder on the client side; it generates code that allows your mobile
app to access a portlet's custom services.

In order for the SDK Builder to discover a portlet's remote services, the
portlet's services must be made available and be accompanied by a Web Service
Deployment Descriptor (WSDD).

If you're developing the portlet, follow these steps to implement remote
services for your portlet and make them accessible to the SDK Builder:

1. Set `remote-service="true"` in your portlet's service.xml and run `ant
build-service`.

2. Implement your remote services in the generated `FooServiceImpl.java` class
and run `ant build-service` again. 

3. Run `ant build-wsdd` to build your Web Service Deployment Descriptor (WSDD).
The SDK Builder relies on the WSDD to discover your portlet's remote services.
So, make sure to run `ant build-wsdd` before deploying your portlet.

4. Run `ant deploy` to deploy your portlet.

Now, you are ready to use the SDK Builder to generate your custom SDK.

You will be able to invoke your service's methods, like `FooService.bar();`,
from your mobile app. The Liferay Mobile SDK takes care of making JSON Web
Services requests to your portlet.

### Configuring the SDK Builder

If you haven't done so already, download the Mobile SDK source code:

```sh
git clone git@github.com:liferay/liferay-mobile-sdk.git
```

The SDK Builder is invoked using Ant. But, running the target to build an SDK,
you must set some properties so that the SDK Builder can communicate with your
portlet services and create an SDK for your mobile platform. Follow these steps
to specify these properties:

1. Create a file in the root folder called `build.${user.name}.properties`,
where `${user.name}` is your computer user name. If you can't figure out your
user name, just change `build.properties` directly.

2. Here are the important properties:

	```
url=http://localhost:8080
context=
filter=
package=com.liferay.mobile.android
destination=gen
	```

	Change them accordingly:
	* `url` should point to your Liferay instance.

	* `context` is your portlet web context. Say for example you are generating
	an SDK for Liferay's Calendar portlet, which is generally deployed to the
	`calendar-portlet` context, then you should set your context value to
	`context=calendar-portlet`. Under the hood, the SDK Builder will try to
	access `http://localhost:8080/calendar-portlet/api/jsonws?discover` to find
	out which services are available for this portlet. Check if this URL is
	working before running the SDK. If it's not running, you may have forgotten
	to run `ant build-wsdd` on the portlet.

	* `filter` is used to filter on a single entity's services. If your portlet
	has several service entities, as defined in its `service.xml` file, select
	just one of those entities to filter on. For example, the Calendar portlet
	has entities such as `CalendarBooking` and `CalendarResource`. To
	to generate an SDK the for the `CalendarBooking` entity, set the filter's
	value to `calendarbooking`. The SDK Builder will then do 
	the request to the following URL:
	`http://localhost:8080/calendar-portlet/api/jsonws?discover=/calendarbooking/*`.

	* `package` (Android only) is used to generated the root package name
	classes. The Liferay version is appended to the end of this package name,
	like `com.liferay.mobile.android.v62`, to ensure there's no package name
	collision if you are using the SDK with several Liferay versions at the same
	time.

	* `destination` is the root folder to which your generated files will be
	saved. By default, Android files are saved to `gen/android/src` and iOS
	files are saved to `gen/ios`.
	
	The only property that you generally want to change is `context`, all others
	are for specific cases.

Now that you've configured the SDK Builder, you're ready to build a platform
specific SDK for the portlet's remote services. 

### Building a Liferay Android SDK

1. From the root folder, run `ant -f build-android.xml`, to generate the
services classes into the `gen` folder. In order to build a `.jar` file
containing the generated service and utility classes, run `ant -f
build-android.xml jar`. This saves the `.jar` file at
`dist/android/liferay-android-sdk.jar`.

2. You are ready to use the `liferay-android-sdk.jar` in your Android project
and have no external dependencies.

To learn how to use the Liferay Android SDK, see the [Liferay Android SDK
documentation](android/README.md).

### Building a Liferay iOS SDK

1. From the root folder, run `ant -f build-ios.xml`, to generate the services
classes into the `gen/ios` folder. In order to generate a `.zip` file containing
the generated service and utility classes, run `ant -f build-ios.xml zip`. The
`.zip` file is created at `dist/ios/liferay-ios-sdk.zip`.

2. You are ready to use `liferay-ios-sdk.zip` in your iOS project. Simply unzip
it and add all the files to your XCode project. The SDK is free of any
external dependencies.

To learn how to use the Liferay iOS SDK, see the [Liferay iOS SDK
documentation](ios/README.md).