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

namespace Liferay.SDK.Service.V62.PortletPreferences
{
	public class PortletPreferencesService : ServiceBase
	{
		public PortletPreferencesService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteArchivedPreferencesAsync(long portletItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portletItemId", portletItemId);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/delete-archived-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestoreArchivedPreferencesAsync(long groupId, IDictionary<string, object> layout, string portletId, IDictionary<string, object> portletItem, IDictionary<string, object> preferences)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layout", layout);
			_parameters.Add("portletId", portletId);
			_parameters.Add("portletItem", portletItem);
			_parameters.Add("preferences", preferences);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/restore-archived-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestoreArchivedPreferencesAsync(long groupId, IDictionary<string, object> layout, string portletId, long portletItemId, IDictionary<string, object> preferences)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("layout", layout);
			_parameters.Add("portletId", portletId);
			_parameters.Add("portletItemId", portletItemId);
			_parameters.Add("preferences", preferences);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/restore-archived-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestoreArchivedPreferencesAsync(long groupId, string name, IDictionary<string, object> layout, string portletId, IDictionary<string, object> preferences)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("layout", layout);
			_parameters.Add("portletId", portletId);
			_parameters.Add("preferences", preferences);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/restore-archived-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateArchivePreferencesAsync(long userId, long groupId, string name, string portletId, IDictionary<string, object> preferences)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("portletId", portletId);
			_parameters.Add("preferences", preferences);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/update-archive-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}