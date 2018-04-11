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

		public async Task RestoreArchivedPreferencesAsync(long groupId, JsonObjectWrapper layout, string portletId, JsonObjectWrapper portletItem, JsonObjectWrapper preferences)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			this.MangleWrapper(_parameters, "layout", "com.liferay.portal.model.Layout", layout);
			_parameters.Add("portletId", portletId);
			this.MangleWrapper(_parameters, "portletItem", "com.liferay.portal.model.PortletItem", portletItem);
			this.MangleWrapper(_parameters, "preferences", "javax.portlet.PortletPreferences", preferences);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/restore-archived-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestoreArchivedPreferencesAsync(long groupId, JsonObjectWrapper layout, string portletId, long portletItemId, JsonObjectWrapper preferences)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			this.MangleWrapper(_parameters, "layout", "com.liferay.portal.model.Layout", layout);
			_parameters.Add("portletId", portletId);
			_parameters.Add("portletItemId", portletItemId);
			this.MangleWrapper(_parameters, "preferences", "javax.portlet.PortletPreferences", preferences);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/restore-archived-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestoreArchivedPreferencesAsync(long groupId, string name, JsonObjectWrapper layout, string portletId, JsonObjectWrapper preferences)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			this.MangleWrapper(_parameters, "layout", "com.liferay.portal.model.Layout", layout);
			_parameters.Add("portletId", portletId);
			this.MangleWrapper(_parameters, "preferences", "javax.portlet.PortletPreferences", preferences);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/restore-archived-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateArchivePreferencesAsync(long userId, long groupId, string name, string portletId, JsonObjectWrapper preferences)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("portletId", portletId);
			this.MangleWrapper(_parameters, "preferences", "javax.portlet.PortletPreferences", preferences);

			var _command = new JsonObject()
			{
				{ "/portletpreferences/update-archive-preferences", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}