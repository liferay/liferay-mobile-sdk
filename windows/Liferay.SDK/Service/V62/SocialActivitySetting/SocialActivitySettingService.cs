//------------------------------------------------------------------------------
// <copyright file="SocialActivitySettingService.cs">
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

namespace Liferay.SDK.Service.V62.SocialActivitySetting
{
	public class SocialActivitySettingService : ServiceBase
	{
		public SocialActivitySettingService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetActivityDefinitionAsync(long groupId, string className, int activityType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("activityType", activityType);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-activity-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetActivityDefinitionsAsync(long groupId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-activity-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetActivitySettingsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-activity-settings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetJsonActivityDefinitionsAsync(long groupId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/get-json-activity-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task UpdateActivitySettingAsync(long groupId, string className, bool enabled)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("enabled", enabled);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/update-activity-setting", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateActivitySettingAsync(long groupId, string className, int activityType, JsonObjectWrapper activityCounterDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("activityType", activityType);
			this.MangleWrapper(_parameters, "activityCounterDefinition", "com.liferay.portlet.social.model.SocialActivityCounterDefinition", activityCounterDefinition);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/update-activity-setting", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateActivitySettingsAsync(long groupId, string className, int activityType, IEnumerable<object> activityCounterDefinitions)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("activityType", activityType);
			_parameters.Add("activityCounterDefinitions", activityCounterDefinitions);

			var _command = new JsonObject()
			{
				{ "/socialactivitysetting/update-activity-settings", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}