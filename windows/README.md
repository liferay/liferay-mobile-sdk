![Liferay Mobile SDK logo](../logo.png)

# Liferay Windows SDK

* [Setup](#setup)
	* [Manually](#manually)
	* [Package Manager UI](#package-manager-ui)
* [Compatibility](#compatibility)
	* [Liferay](#liferay)
* [Use](#use)

## Setup

#### Manually

1. [Download](https://www.nuget.org/packages/Liferay.SDK/) the latest version
of `Liferay.SDK.nupkg`.

2. Within your C# project, install the NuGet as a local NuGet.

3. Start using it!

If you want to know other ways to install a NuGet package, please see 
[this documentation](https://docs.microsoft.com/en-us/nuget/consume-packages/ways-to-install-a-package).

#### Package Manager UI

If you are using Visual Studio, you can use the Package Manager UI to install
the NuGet package as a dependency to your project. All versions are available at
[NuGet.org](https://www.nuget.org/packages/Liferay.SDK/).


## Compatibility

#### Liferay

Each Liferay Mobile SDK is designed to work with a specific Liferay Portal
version. Because of that, its version scheme reflects the compatible Liferay
version.

For example, Liferay Mobile SDK 6.2.0.1 is built to work with Liferay Portal
6.2.0, while Liferay Mobile SDK 7.0.0 will work with Liferay Portal 7.0.0.

The fourth integer in the version (6.2.0.x) is related to internal Liferay
Mobile SDK versions. For example, if a bug is found on 6.2.0.1, we will
release a version called 6.2.0.2 with the bug fix.

This doesn't mean you can't support several Liferay versions in the same
app though. You can add to your classpath both versions 6.2.0.1 and 7.0.0.
There won't be conflicts because service classes packages are separated by
their version number as well: V62, V70, V71, etc.

## Use

The Liferay Windows SDK is an almost line-by-line port of the Android
version, so more detailed information about usage can be found at [this page](../android#use).

1. Create a `Session` with the user credentials:

		using Liferay.SDK;

		var session = new Session(new Uri("http://localhost:8080"), "test@liferay.com", "test");

2. Import the service you need, for example:

		using Liferay.SDK.Service.V62.BlogsEntry;

3. Create a `BlogsEntryService` object and make a service call:

		var service = new BlogsEntryService(session);
		
		var entries = await service.GetGroupEntriesAsync(10184, 0, -1, -1);

	Service methods are asynchronous and follow the *async/await* approach.
	Return types can be primitive types, `dynamic` objects or
	`IEnumerable<dynamic>` collections. So, it is easy to navigate the results
	of the service calls and read the properties of the returned objects:

		foreach (var entry in entries)
		{
			Console.WriteLine(entry.title);
		}

### Batch

The SDK allows sending requests using batch processing, which can be much more
efficient in some cases. Read [DLAppServiceTest.cs](https://github.com/liferay/liferay-mobile-sdk/blob/master/windows/Liferay.SDK.Test/DLAppServiceTest.cs)
to find an example on how to create a batch of calls and send them all together.

### Non-primitive arguments

There are some special cases in which service methods arguments are not
primitives. In these cases, you should use `JsonObjectWrapper`. Read
[OrderByComparatorTest.cs](https://github.com/Ithildir/liferay-sdk-builder-windows/blob/master/windows/Liferay.SDK.Test/OrderByComparatorTest.cs)
and [ServiceContextTest.cs](https://github.com/Ithildir/liferay-sdk-builder-windows/blob/master/windows/Liferay.SDK.Test/ServiceContextTest.cs)
to find examples on how to use non-primitive arguments in service methods.

### Binaries

Some Liferay services require argument types such as byte arrays (`byte[]`) and 
Streams (`System.IO.Stream`). Read [DLAppServiceTest.cs](https://github.com/Ithildir/liferay-mobile-sdk/blob/master/windows/Liferay.SDK.Test/DLAppServiceTest.cs)
to find an example on how to send binary data to the portal.