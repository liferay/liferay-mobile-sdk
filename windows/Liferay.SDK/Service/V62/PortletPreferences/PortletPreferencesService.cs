//------------------------------------------------------------------------------
// <copyright file="PortletPreferencesService.cs">
//    Copyright (c) 2014-present Andrea Di Giorgi
//
//    Permission is hereby granted, free of charge, to any person obtaining a
//    copy of this software and associated documentation files (the "Software"),
//    to deal in the Software without restriction, including without limitation
//    the rights to use, copy, modify, merge, publish, distribute, sublicense,
//    and/or sell copies of the Software, and to permit persons to whom the
//    Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in
//    all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
//    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//    DEALINGS IN THE SOFTWARE.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

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