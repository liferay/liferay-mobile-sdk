## Table of Contents

* [What's the Liferay Mobile SDK?](#whats-the-liferay-mobile-sdk)
* [Liferay Android SDK](android/README.md)
* [Liferay iOS SDK](ios/README.md)
* [Generating SDKs for custom services](#generating-sdks-for-custom-services)
	* [About](#about)
	* [Use](#use)
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

Check the Android SDK documentation [here](android/README.md).

## Liferay iOS SDK

Check the iOS SDK documentation [here](ios/README.md).

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
	git clone git@github.com:liferay/liferay-mobile-sdk.git
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
