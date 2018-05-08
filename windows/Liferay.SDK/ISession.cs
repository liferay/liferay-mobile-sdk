//------------------------------------------------------------------------------
// <copyright file="ISession.cs">
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
using System.Net.Http;
using System.Threading.Tasks;

namespace Liferay.SDK
{
	public interface ISession
	{
		int ConnectionTimeout { get; }

		HttpClient HttpClient { get; }

		string Password { get; }

		Uri Server { get; }

		string UserName { get; }

		Task<object> InvokeAsync(IDictionary<string, object> command);

		Task<object> UploadAsync(IDictionary<string, object> command);
	}
}