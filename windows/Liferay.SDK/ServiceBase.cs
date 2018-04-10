//------------------------------------------------------------------------------
// <copyright file="ServiceBase.cs">
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

namespace Liferay.SDK
{
	public abstract class ServiceBase
	{
		protected const string OrderByComparator = "com.liferay.portal.kernel.util.OrderByComparator";

		protected const string ServiceContext = "com.liferay.portal.service.ServiceContext";

		protected ServiceBase(ISession session)
		{
			this.Session = session;
		}

		public ISession Session { get; private set; }

		internal void MangleWrapper(JsonObject parameters, string name, string className, JsonObjectWrapper wrapper)
		{
			if (wrapper == null)
			{
				if (!className.Equals(ServiceContext))
				{
					parameters.Add(name, null);
				}

				return;
			}

			wrapper.Mangle(parameters, name, className);
		}
	}
}