//------------------------------------------------------------------------------
// <copyright file="BatchSession.cs">
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
using System.Threading.Tasks;
using Liferay.SDK.Http;

namespace Liferay.SDK
{
	public class BatchSession : Session
	{
		private JsonArray commands = new JsonArray();

		public BatchSession(ISession session)
			: base(session)
		{
		}

		public BatchSession(Uri server, string username, string password)
			: base(server, username, password)
		{
		}

		public async Task<IEnumerable<dynamic>> InvokeAsync()
		{
			try
			{
				return await HttpUtil.PostAsync(this, this.commands);
			}
			finally
			{
				this.commands.Clear();
			}
		}

		public override Task<object> InvokeAsync(IDictionary<string, object> command)
		{
			this.commands.Add(command);

			return Task.FromResult<object>(null);
		}

		public override Task<object> UploadAsync(IDictionary<string, object> command)
		{
			throw new InvalidOperationException("Can't batch upload requests");
		}
	}
}