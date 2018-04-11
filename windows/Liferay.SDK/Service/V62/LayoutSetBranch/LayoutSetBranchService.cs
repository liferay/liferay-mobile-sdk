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

namespace Liferay.SDK.Service.V62.LayoutSetBranch
{
	public class LayoutSetBranchService : ServiceBase
	{
		public LayoutSetBranchService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddLayoutSetBranchAsync(long groupId, bool privateLayout, string name, string description, bool master, long copyLayoutSetBranchId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("master", master);
			_parameters.Add("copyLayoutSetBranchId", copyLayoutSetBranchId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/add-layout-set-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteLayoutSetBranchAsync(long layoutSetBranchId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetBranchId", layoutSetBranchId);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/delete-layout-set-branch", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetLayoutSetBranchesAsync(long groupId, bool privateLayout)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/get-layout-set-branches", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> MergeLayoutSetBranchAsync(long layoutSetBranchId, long mergeLayoutSetBranchId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetBranchId", layoutSetBranchId);
			_parameters.Add("mergeLayoutSetBranchId", mergeLayoutSetBranchId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/merge-layout-set-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateLayoutSetBranchAsync(long groupId, long layoutSetBranchId, string name, string description, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layoutSetBranchId", layoutSetBranchId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetbranch/update-layout-set-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}