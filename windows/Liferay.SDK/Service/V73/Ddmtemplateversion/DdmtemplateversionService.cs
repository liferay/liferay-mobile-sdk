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

namespace Liferay.SDK.Service.V73.Ddmtemplateversion
{
	public class DdmtemplateversionService : ServiceBase
	{
		public DdmtemplateversionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetLatestTemplateVersionAsync(long templateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplateversion/get-latest-template-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetTemplateVersionAsync(long templateVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateVersionId", templateVersionId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplateversion/get-template-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTemplateVersionsAsync(long templateId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplateversion/get-template-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetTemplateVersionsCountAsync(long templateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplateversion/get-template-versions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}