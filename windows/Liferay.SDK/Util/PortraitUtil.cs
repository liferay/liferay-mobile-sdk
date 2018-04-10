//------------------------------------------------------------------------------
// <copyright file="PortraitUtil.cs">
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
using System.IO;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

namespace Liferay.SDK.Util
{
	public static class PortraitUtil
	{
		public static async Task<Stream> DownloadPortraitAsync(ISession session, Uri portraitUri, DateTimeOffset? modifiedSince)
		{
			var request = new HttpRequestMessage(HttpMethod.Get, portraitUri);

			request.Headers.IfModifiedSince = modifiedSince;

			var response = await session.HttpClient.SendAsync(request);

			response.EnsureSuccessStatusCode();

			return await response.Content.ReadAsStreamAsync();
		}

		public static Uri GetPortraitUriAsync(ISession session, bool male, long portraitId)
		{
			StringBuilder sb = new StringBuilder();

			sb.Append(session.Server);
			sb.Append("/image/user_");

			if (male)
			{
				sb.Append("male");
			}
			else
			{
				sb.Append("female");
			}

			sb.Append("_portrait?img_id=");
			sb.Append(portraitId);

			return new Uri(sb.ToString());
		}
	}
}