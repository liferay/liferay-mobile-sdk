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

namespace Liferay.SDK.Service.V62.LayoutBranch
{
	public class LayoutBranchService : ServiceBase
	{
		public LayoutBranchService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddLayoutBranchAsync(long layoutRevisionId, string name, string description, bool master, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutRevisionId", layoutRevisionId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("master", master);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutbranch/add-layout-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteLayoutBranchAsync(long layoutBranchId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutBranchId", layoutBranchId);

			var _command = new JsonObject()
			{
				{ "/layoutbranch/delete-layout-branch", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> UpdateLayoutBranchAsync(long layoutBranchId, string name, string description, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutBranchId", layoutBranchId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutbranch/update-layout-branch", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}