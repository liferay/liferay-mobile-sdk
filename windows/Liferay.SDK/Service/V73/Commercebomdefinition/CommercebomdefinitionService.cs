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

namespace Liferay.SDK.Service.V73.Commercebomdefinition
{
	public class CommercebomdefinitionService : ServiceBase
	{
		public CommercebomdefinitionService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCommerceBomDefinitionsAsync(long commerceBOMFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMFolderId", commerceBOMFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomdefinition/get-commerce-bom-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceBomDefinitionsCountAsync(long commerceBOMFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMFolderId", commerceBOMFolderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomdefinition/get-commerce-bom-definitions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteCommerceBomDefinitionAsync(long commerceBOMDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMDefinitionId", commerceBOMDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomdefinition/delete-commerce-bom-definition", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateCommerceBomDefinitionAsync(long commerceBOMDefinitionId, long cpAttachmentFileEntryId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMDefinitionId", commerceBOMDefinitionId);
			_parameters.Add("cpAttachmentFileEntryId", cpAttachmentFileEntryId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomdefinition/update-commerce-bom-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceBomDefinitionAsync(long userId, long commerceBOMFolderId, long cpAttachmentFileEntryId, string name, string friendlyUrl)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceBOMFolderId", commerceBOMFolderId);
			_parameters.Add("cpAttachmentFileEntryId", cpAttachmentFileEntryId);
			_parameters.Add("name", name);
			_parameters.Add("friendlyUrl", friendlyUrl);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomdefinition/add-commerce-bom-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceBomDefinitionAsync(long commerceBOMDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMDefinitionId", commerceBOMDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomdefinition/get-commerce-bom-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}