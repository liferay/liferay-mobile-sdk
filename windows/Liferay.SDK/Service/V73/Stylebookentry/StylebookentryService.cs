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

namespace Liferay.SDK.Service.V73.Stylebookentry
{
	public class StylebookentryService : ServiceBase
	{
		public StylebookentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateNameAsync(long styleBookEntryId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("styleBookEntryId", styleBookEntryId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/update-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddStyleBookEntryAsync(long groupId, string name, string styleBookEntryKey, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("styleBookEntryKey", styleBookEntryKey);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/add-style-book-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddStyleBookEntryAsync(long groupId, string frontendTokensValues, string name, string styleBookEntryKey, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("frontendTokensValues", frontendTokensValues);
			_parameters.Add("name", name);
			_parameters.Add("styleBookEntryKey", styleBookEntryKey);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/add-style-book-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateStyleBookEntryAsync(long styleBookEntryId, string frontendTokensValues, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("styleBookEntryId", styleBookEntryId);
			_parameters.Add("frontendTokensValues", frontendTokensValues);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/update-style-book-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DiscardDraftStyleBookEntryAsync(long styleBookEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("styleBookEntryId", styleBookEntryId);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/discard-draft-style-book-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CopyStyleBookEntryAsync(long groupId, long styleBookEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("styleBookEntryId", styleBookEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/copy-style-book-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteStyleBookEntryAsync(JsonObjectWrapper styleBookEntry)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "styleBookEntry", "$languageUtil.getJSONWrapperClassName($parameter.type)", styleBookEntry);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/delete-style-book-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteStyleBookEntryAsync(long styleBookEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("styleBookEntryId", styleBookEntryId);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/delete-style-book-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateDefaultStyleBookEntryAsync(long styleBookEntryId, bool defaultStyleBookEntry)
		{
			var _parameters = new JsonObject();

			_parameters.Add("styleBookEntryId", styleBookEntryId);
			_parameters.Add("defaultStyleBookEntry", defaultStyleBookEntry);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/update-default-style-book-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFrontendTokensValuesAsync(long styleBookEntryId, string frontendTokensValues)
		{
			var _parameters = new JsonObject();

			_parameters.Add("styleBookEntryId", styleBookEntryId);
			_parameters.Add("frontendTokensValues", frontendTokensValues);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/update-frontend-tokens-values", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePreviewFileEntryIdAsync(long styleBookEntryId, long previewFileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("styleBookEntryId", styleBookEntryId);
			_parameters.Add("previewFileEntryId", previewFileEntryId);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/update-preview-file-entry-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> PublishDraftAsync(long styleBookEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("styleBookEntryId", styleBookEntryId);

			var _command = new JsonObject()
			{
				{ "/stylebook.stylebookentry/publish-draft", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}