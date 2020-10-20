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

namespace Liferay.SDK.Service.V73.Translationentry
{
	public class TranslationentryService : ServiceBase
	{
		public TranslationentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddOrUpdateTranslationEntryAsync(long groupId, string languageId, JsonObjectWrapper infoItemReference, JsonObjectWrapper infoItemFieldValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("languageId", languageId);
			this.MangleWrapper(_parameters, "infoItemReference", "$languageUtil.getJSONWrapperClassName($parameter.type)", infoItemReference);
			this.MangleWrapper(_parameters, "infoItemFieldValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", infoItemFieldValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/translation.translationentry/add-or-update-translation-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddOrUpdateTranslationEntryAsync(long groupId, JsonObjectWrapper infoItemReference, string content, string contentType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			this.MangleWrapper(_parameters, "infoItemReference", "$languageUtil.getJSONWrapperClassName($parameter.type)", infoItemReference);
			_parameters.Add("content", content);
			_parameters.Add("contentType", contentType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/translation.translationentry/add-or-update-translation-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}