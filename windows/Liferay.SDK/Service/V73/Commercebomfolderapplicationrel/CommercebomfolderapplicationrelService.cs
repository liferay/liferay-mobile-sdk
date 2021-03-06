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

namespace Liferay.SDK.Service.V73.Commercebomfolderapplicationrel
{
	public class CommercebomfolderapplicationrelService : ServiceBase
	{
		public CommercebomfolderapplicationrelService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteCommerceBomFolderApplicationRelAsync(long commerceBOMFolderApplicationRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMFolderApplicationRelId", commerceBOMFolderApplicationRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolderapplicationrel/delete-commerce-bom-folder-application-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommerceBomFolderApplicationRelAsync(long userId, long commerceBOMFolderId, long commerceApplicationModelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceBOMFolderId", commerceBOMFolderId);
			_parameters.Add("commerceApplicationModelId", commerceApplicationModelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolderapplicationrel/add-commerce-bom-folder-application-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceBomFolderApplicationRelsByCamIdAsync(long commerceApplicationModelId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationModelId", commerceApplicationModelId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-by-cam-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceBomFolderApplicationRelsByCommerceBomFolderIdAsync(long commerceBOMFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMFolderId", commerceBOMFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-by-commerce-bom-folder-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceBomFolderApplicationRelsCountByCamIdAsync(long commerceApplicationModelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationModelId", commerceApplicationModelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-count-by-cam-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceBomFolderApplicationRelsCountByCommerceBomFolderIdAsync(long commerceBOMFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMFolderId", commerceBOMFolderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-count-by-commerce-bom-folder-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}