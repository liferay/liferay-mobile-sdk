//------------------------------------------------------------------------------
// <copyright file="HttpUtil.cs">
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
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using Liferay.SDK.Exceptions;

namespace Liferay.SDK.Http
{
	internal static class HttpUtil
	{
		public static async Task<JsonArray> PostAsync(ISession session, JsonArray commands)
		{
			var content = new StringContent(commands.ToString(), Encoding.UTF8, "application/json");
			var requestUri = GetRequestUri(session, "/invoke");

			var response = await session.HttpClient.PostAsync(requestUri, content);

			var obj = await GetJsonResponseAsync(response);

			return (JsonArray)obj;
		}

		public static async Task<object> UploadAsync(ISession session, IDictionary<string, object> command)
		{
			var path = command.Keys.First();
			var parameters = (IDictionary<string, object>)command[path];

			var request = new HttpRequestMessage
			{
				Content = GetMultipartContent(parameters),
				Method = HttpMethod.Post,
				RequestUri = GetRequestUri(session, path)
			};

			var response = await session.HttpClient.SendAsync(request);

			return await GetJsonResponseAsync(response);
		}

		private static async Task<object> GetJsonResponseAsync(HttpResponseMessage response)
		{
			var json = await response.Content.ReadAsStringAsync();

			var obj = SimpleJson.DeserializeObject(json);

			HandleServerException(response, obj);

			return obj;
		}

		private static MultipartFormDataContent GetMultipartContent(IDictionary<string, object> parameters)
		{
			return parameters.Aggregate(
				new MultipartFormDataContent(),
				(multipartContent, kvp) =>
				{
					var key = kvp.Key;
					var value = kvp.Value;

					HttpContent content;

					if (value is Stream)
					{
						content = new StreamContent((Stream)value);
					}
					else
					{
						content = new StringContent(value.ToString(), Encoding.UTF8);
					}

					multipartContent.Add(content, key);

					return multipartContent;
				});
		}

		private static Uri GetRequestUri(ISession session, string path)
		{
			return new Uri(session.Server, "/api/jsonws" + path);
		}

		private static void HandleServerException(HttpResponseMessage response, object obj)
		{
			var status = response.StatusCode;

			if (status == HttpStatusCode.Unauthorized)
			{
				throw new ServerException("Authentication failed");
			}

			if (status != HttpStatusCode.OK)
			{
				throw new ServerException("Request failed. Response code: " + status);
			}

			if (obj is JsonObject)
			{
				var jsonObject = (JsonObject)obj;

				object message;

				if (jsonObject.TryGetValue("exception", out message))
				{
					throw new ServerException((string)message);
				}
			}
		}
	}
}