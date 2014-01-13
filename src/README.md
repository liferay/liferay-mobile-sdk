## Table of Contents

* [Generating SDKs for Custom Portlet Services](#generating-sdks-for-custom-portlet-services)
    * [Setting Up Portlet's Remote Services](#setting-up-portlets-remote-services)
        * [Building a Liferay Android SDK](#building-a-liferay-android-sdk)
        * [Building a Liferay iOS SDK](#building-a-liferay-android-sdk)

## Generating SDKs for Custom Portlet Services

The Liferay Mobile SDK project comes with an SDK Builder that generates the
Liferay Mobile SDK for the Android and iOS platforms. Think of it as a Service
Builder on the client side; it generates code that allows your mobile app to
access your portlet's custom services. It is template-based, making it easy to
extend to various mobile platforms. In the near future we plan to make SDKs
for more platforms, like PhoneGap or Titanium. The SDK Builder generates client
libraries that allow your native mobile apps to invoke remote web services of a
portal instance and any of it's custom portlets built with Liferay's [Service
Builder](http://www.liferay.com/documentation/liferay-portal/6.2/development/-/ai/generating-your-service-layer-liferay-portal-6-2-dev-guide-04-en).

### Setting Up Portlet's Remote Services

In order for the SDK Builder to discover a portlet's remote services, the
portlet's services must be made available and be accompanied by a Web Service
Deployment Descriptor (WSDD).

If you're in the process of developing the portlet, see [Generating Your Service
Layer](http://www.liferay.com/documentation/liferay-portal/6.2/development/-/ai/generating-your-service-layer-liferay-portal-6-2-dev-guide-04-en)
for in-depth instructions on implementing remote services. For your convenience,
the following steps outline how to implement remote services for your portlet
and make them available for the SDK Builder to discover: 

1. Set your entity's `remote-service="true"` in your portlet's `service.xml`
file and run `ant build-service`.

2. Implement your remote services in the generated `[Entity]ServiceImpl.java`
source files and run `ant build-service` again. 

3. Run `ant build-wsdd` to build your Web Service Deployment Descriptor (WSDD).
The SDK Builder relies on the WSDD to discover your portlet's remote services;
so make sure to run `ant build-wsdd` before deploying your portlet.

4. Run `ant deploy` to deploy your portlet with its WSDD.

Now, you are ready to use the SDK Builder to generate a custom portlet SDK for
developing your mobile app. You'll be able to invoke your service's methods,
like `[Entity]Service.bar();`, from your mobile app. The Liferay Mobile SDK takes
care of making JSON Web Services requests to your portlet.

Next, let's configure the SDK builder for building your custom portlet SDK.

### Configuring the SDK Builder

In order to user the SDK Builder, you'll need to have the Liferay Mobile SDK
project on your local machine. If you haven't done so already, download the
Mobile SDK project using Git: 

```sh
git clone git@github.com:liferay/liferay-mobile-sdk.git
```

The SDK Builder is invoked using Ant. But, before building an SDK, you must set
some properties so that the SDK Builder can communicate with your portlet
services and create an SDK specific to your mobile platform. Follow these steps
to set these properties:

1. Create a file in the root folder called `build.${user.name}.properties`,
where `${user.name}` is your computer user name. If you can't figure out your
user name, just change `build.properties` directly.

2. Here are the important properties to set:

	* `url` - The URL to your Liferay instance.

	* `context` - Your portlet's web context. Say for example you are generating
	an SDK for Liferay's Calendar portlet, which is generally deployed to the
	`calendar-portlet` context, then you should set your context value to
	`context=calendar-portlet`. Under the hood, the SDK Builder will try to
	access `http://localhost:8080/calendar-portlet/api/jsonws?discover` to find
	out which services are available for this portlet. Check in a browser if
	this URL is working before running the SDK. If it's not running, you may
	have forgotten to run `ant build-wsdd` on the portlet.

	* `filter` - Specifies your portlet's entities whose services to access; a
	blank value indicates the services of all of the portlet's entities. For
	example, the Calendar portlet has entities such as `CalendarBooking` and
	`CalendarResource`. To generate an SDK the for only the `CalendarBooking`
	entity, set the filter's value to `calendarbooking`, all in lowercase. The
	SDK Builder will then make requests to the
	`http://localhost:8080/calendar-portlet/api/jsonws?discover=/calendarbooking/*`.
	If you set `filter=`, specifying no filter value, the remote services of
	*all* of the portlet's entities will be made available to your mobile SDK.

	* `package` - On Android, this is the package to which your SDK's classes
	are written. The iOS platform does not use packages. Note, that the Liferay
	Portal version is appended to the end of the package name. So, if you
	specified `com.liferay.mobile.android` as your package, the SDK
	Builder appends the Liferay Portal version (e.g., `v62`) to it, 
	like `com.liferay.mobile.android.v62`. Appending the Liferay Portal version
	prevents collisions between classes with the same names written for
	different versions of Liferay Portal.

	* `destination` - Specifies the root folder in which to save your generated
	files. The default destination root folder is `gen`. On Android, the files
	are saved to `[destination]/android/src`. On iOS, the files are saved to
	`[destination]/ios`.

Here's an example of configuring the SDK Builder to generate a mobile SDK for
a portlet with a web context value `my-portlet`:

    url=http://localhost:8080
    context=my-portlet
    filter=
    package=com.mycompany.mobile.android
    destination=gen

Now that you've configured the SDK Builder, you're ready to build a platform
specific SDK for your portlet's remote services. 

#### Building a Liferay Android SDK

To build the service related source files for your Liferay Android SDK, run the
following command from the `liferay-mobile-sdk` project's root folder:

    ant -f build-android.xml

The source files are written to your `[destination]/android/src` folder.

To build a `.jar` file containing the generated service and utility classes, run
the following command:

    ant -f build-android.xml jar

The `liferay-android-sdk.jar` file is written to your `dist/android/` folder.
You're ready to use the `liferay-android-sdk.jar` in your Android project and
have no external dependencies.

To learn how to use the Liferay Android SDK, see the [Liferay Android SDK
documentation](android/README.md).

#### Building a Liferay iOS SDK

To build the service related source files for your Liferay iOS SDK, run the
following command from the `liferay-mobile-sdk` project's root folder:

    ant -f build-ios.xml

The source files are written to your `[destination]/ios` folder.

To build a `.zip` file containing the generated service and utility classes, run
the following command:

    ant -f build-ios.xml zip

The `liferay-ios-sdk.jar` file is written to your `dist/ios` folder. You're
ready to use the contents of your `liferay-ios-sdk.zip` file in your iOS
project. Simply unzip its contents and add all of the files to your XCode
project. The SDK is free of any external dependencies.

To learn how to use the Liferay iOS SDK, see the [Liferay iOS SDK
documentation](ios/README.md).