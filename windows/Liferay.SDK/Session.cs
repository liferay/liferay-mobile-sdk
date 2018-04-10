//------------------------------------------------------------------------------
// <copyright file="Session.cs">
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
using System.Linq;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;
using Liferay.SDK.Http;

namespace Liferay.SDK
{
	public class Session : ISession
	{
		public const int DefaultConnectionTimeout = 15000;

		public Session(ISession session)
			: this(session.Server, session.UserName, session.Password, session.ConnectionTimeout)
		{
		}

		public Session(Uri server, int connectionTimeout = DefaultConnectionTimeout)
			: this(server, null, null, connectionTimeout)
		{
		}

		public Session(Uri server, string userName, string password, int connectionTimeout = DefaultConnectionTimeout)
		{
			this.Server = server;
			this.UserName = userName;
			this.Password = password;
			this.ConnectionTimeout = connectionTimeout;

			this.HttpClient = this.GetHttpClient();
		}

		public int ConnectionTimeout { get; private set; }

		public HttpClient HttpClient { get; private set; }

		public string Password { get; private set; }

		public Uri Server { get; private set; }

		public string UserName { get; private set; }

		public virtual async Task<object> InvokeAsync(IDictionary<string, object> command)
		{
			var commands = new JsonArray(1);

			commands.Add(command);

			var array = await HttpUtil.PostAsync(this, commands);

			return array.First();
		}

		public virtual async Task<object> UploadAsync(IDictionary<string, object> command)
		{
			return await HttpUtil.UploadAsync(this, command);
		}

		protected virtual AuthenticationHeaderValue GetAuthorizationHeader()
		{
			if (string.IsNullOrWhiteSpace(this.UserName) || string.IsNullOrWhiteSpace(this.Password))
			{
				return null;
			}

			var authorization = Convert.ToBase64String(Encoding.UTF8.GetBytes(string.Format("{0}:{1}", this.UserName, this.Password)));

			return new AuthenticationHeaderValue("Basic", authorization);
		}

		protected virtual HttpClient GetHttpClient()
		{
			var httpClient = new HttpClient();

			httpClient.DefaultRequestHeaders.Authorization = this.GetAuthorizationHeader();

			httpClient.Timeout = new TimeSpan(0, 0, 0, 0, this.ConnectionTimeout);

			return httpClient;
		}
	}
}