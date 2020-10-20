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

namespace Liferay.SDK.Service.V73.Layoutpagetemplatestructure
{
	public class LayoutpagetemplatestructureService : ServiceBase
	{
		public LayoutpagetemplatestructureService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateLayoutPageTemplateStructureAsync(long groupId, long classNameId, long classPK, long segmentsExperienceId, string data)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			_parameters.Add("data", data);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatestructure/update-layout-page-template-structure", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPageTemplateStructureDataAsync(long groupId, long plid, long segmentsExperienceId, string data)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("plid", plid);
			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			_parameters.Add("data", data);

			var _command = new JsonObject()
			{
				{ "/layout.layoutpagetemplatestructure/update-layout-page-template-structure-data", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}