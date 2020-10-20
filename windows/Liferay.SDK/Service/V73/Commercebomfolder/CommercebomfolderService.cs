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

namespace Liferay.SDK.Service.V73.Commercebomfolder
{
	public class CommercebomfolderService : ServiceBase
	{
		public CommercebomfolderService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceBomFolderAsync(long userId, long parentCommerceBOMFolderId, string name, bool logo, byte[] logoBytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("parentCommerceBOMFolderId", parentCommerceBOMFolderId);
			_parameters.Add("name", name);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolder/add-commerce-bom-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceBomFolderAsync(long commerceBOMFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMFolderId", commerceBOMFolderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolder/delete-commerce-bom-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateCommerceBomFolderAsync(long commerceBOMFolderId, string name, bool logo, byte[] logoBytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMFolderId", commerceBOMFolderId);
			_parameters.Add("name", name);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolder/update-commerce-bom-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceBomFolderAsync(long commerceBOMFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMFolderId", commerceBOMFolderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolder/get-commerce-bom-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceBomFoldersAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolder/get-commerce-bom-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceBomFoldersAsync(long companyId, long parentCommerceBOMFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentCommerceBOMFolderId", parentCommerceBOMFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolder/get-commerce-bom-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceBomFoldersCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolder/get-commerce-bom-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceBomFoldersCountAsync(long companyId, long parentCommerceBOMFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("parentCommerceBOMFolderId", parentCommerceBOMFolderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomfolder/get-commerce-bom-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}