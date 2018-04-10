//------------------------------------------------------------------------------
// <copyright file="PortalVersionUtil.cs">
//    Copyright (c) 2014 Andrea Di Giorgi. All rights reserved.
//
//    This library is free software; you can redistribute it and/or modify it
//    under the terms of the GNU Lesser General Public License as published by
//    the Free Software Foundation; either version 2.1 of the License, or (at
//    your option) any later version.
//
//    This library is distributed in the hope that it will be useful, but
//    WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
//    or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
//    License for more details.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Threading.Tasks;

namespace Liferay.SDK.Util
{
	public static class PortalVersionUtil
	{
		private static HttpClient httpClient = new HttpClient();
		private static IDictionary<Uri, int> versions = new ConcurrentDictionary<Uri, int>();

		public static Task<int> GetPortalVersionAsync(ISession session)
		{
			return GetPortalVersionAsync(session.Server);
		}

		public static async Task<int> GetPortalVersionAsync(Uri uri)
		{
			int version;

			if (versions.TryGetValue(uri, out version))
			{
				return version;
			}

			var request = new HttpRequestMessage(HttpMethod.Head, uri);

			var response = await httpClient.SendAsync(request);

			IEnumerable<string> portalHeaders;

			if (!response.Headers.TryGetValues("Liferay-Portal", out portalHeaders))
			{
				return PortalVersion.Unknown;
			}

			var portalField = portalHeaders.First();

			var indexOfBuild = portalField.IndexOf("Build");

			if (indexOfBuild == -1)
			{
				return PortalVersion.Unknown;
			}

			string buildNumber = portalField.Substring(indexOfBuild + 6, 4);

			version = int.Parse(buildNumber);

			versions.Add(uri, version);

			return version;
		}
	}
}