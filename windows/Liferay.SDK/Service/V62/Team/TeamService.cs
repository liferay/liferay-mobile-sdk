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

namespace Liferay.SDK.Service.V62.Team
{
	public class TeamService : ServiceBase
	{
		public TeamService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddTeamAsync(long groupId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/team/add-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteTeamAsync(long teamId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);

			var _command = new JsonObject()
			{
				{ "/team/delete-team", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetGroupTeamsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/team/get-group-teams", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetTeamAsync(long teamId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);

			var _command = new JsonObject()
			{
				{ "/team/get-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetTeamAsync(long groupId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/team/get-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserTeamsAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/team/get-user-teams", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserTeamsAsync(long userId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/team/get-user-teams", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<bool> HasUserTeamAsync(long userId, long teamId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("teamId", teamId);

			var _command = new JsonObject()
			{
				{ "/team/has-user-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> UpdateTeamAsync(long teamId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("teamId", teamId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/team/update-team", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}