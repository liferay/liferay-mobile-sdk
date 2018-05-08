//------------------------------------------------------------------------------
// <copyright file="JsonObjectWrapper.cs">
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
using System.Text;
using System.Threading.Tasks;

namespace Liferay.SDK
{
	public class JsonObjectWrapper
	{
		private JsonObject jsonObject = new JsonObject();

		public JsonObjectWrapper()
			: this(null)
		{
		}

		public JsonObjectWrapper(string className)
		{
			this.ClassName = className;
		}

		public string ClassName { get; private set; }

		public dynamic JsonObject
		{
			get
			{
				return this.jsonObject;
			}
		}

		internal void Mangle(JsonObject parameters, string name, string className)
		{
			this.AddClassName(parameters, name, className);
			this.AddJsonObject(parameters, name);
		}

		private void AddClassName(JsonObject parameters, string name, string className)
		{
			if (!string.IsNullOrWhiteSpace(this.ClassName))
			{
				className = this.ClassName;
			}

			parameters.Add("+" + name, className);
		}

		private void AddJsonObject(JsonObject parameters, string name)
		{
			foreach (var kvp in this.jsonObject)
			{
				string key = string.Format("{0}.{1}", name, kvp.Key);

				parameters.Add(key, kvp.Value);
			}
		}
	}
}