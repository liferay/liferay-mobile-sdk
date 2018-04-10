/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V70.ScreensDDMStructureVersion
{
	public class ScreensDDMStructureVersionService : ServiceBase
	{
		public ScreensDDMStructureVersionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetDdmStructureVersionAsync(long structureId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);

			var _command = new JsonObject()
			{
				{ "/screens.screensddmstructureversion/get-ddm-structure-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}