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

namespace Liferay.SDK.Service.V73.Ddmstructureversion
{
	public class DdmstructureversionService : ServiceBase
	{
		public DdmstructureversionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetLatestStructureVersionAsync(long structureId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructureversion/get-latest-structure-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetStructureVersionAsync(long structureVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureVersionId", structureVersionId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructureversion/get-structure-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetStructureVersionsAsync(long structureId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructureversion/get-structure-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetStructureVersionsCountAsync(long structureId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmstructureversion/get-structure-versions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}