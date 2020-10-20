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

namespace Liferay.SDK.Service.V73.Cpdefinitionvirtualsetting
{
	public class CpdefinitionvirtualsettingService : ServiceBase
	{
		public CpdefinitionvirtualsettingService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCpDefinitionVirtualSettingAsync(string className, long classPK, long fileEntryId, string url, int activationStatus, long duration, int maxUsages, bool useSample, long sampleFileEntryId, string sampleUrl, bool termsOfUseRequired, IDictionary<string, string> termsOfUseContentMap, long termsOfUseJournalArticleResourcePrimKey, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("url", url);
			_parameters.Add("activationStatus", activationStatus);
			_parameters.Add("duration", duration);
			_parameters.Add("maxUsages", maxUsages);
			_parameters.Add("useSample", useSample);
			_parameters.Add("sampleFileEntryId", sampleFileEntryId);
			_parameters.Add("sampleUrl", sampleUrl);
			_parameters.Add("termsOfUseRequired", termsOfUseRequired);
			_parameters.Add("termsOfUseContentMap", termsOfUseContentMap);
			_parameters.Add("termsOfUseJournalArticleResourcePrimKey", termsOfUseJournalArticleResourcePrimKey);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionvirtualsetting/add-cp-definition-virtual-setting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpDefinitionVirtualSettingAsync(string className, long classPK, long fileEntryId, string url, int activationStatus, long duration, int maxUsages, bool useSample, long sampleFileEntryId, string sampleUrl, bool termsOfUseRequired, IDictionary<string, string> termsOfUseContentMap, long termsOfUseJournalArticleResourcePrimKey, bool override, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("url", url);
			_parameters.Add("activationStatus", activationStatus);
			_parameters.Add("duration", duration);
			_parameters.Add("maxUsages", maxUsages);
			_parameters.Add("useSample", useSample);
			_parameters.Add("sampleFileEntryId", sampleFileEntryId);
			_parameters.Add("sampleUrl", sampleUrl);
			_parameters.Add("termsOfUseRequired", termsOfUseRequired);
			_parameters.Add("termsOfUseContentMap", termsOfUseContentMap);
			_parameters.Add("termsOfUseJournalArticleResourcePrimKey", termsOfUseJournalArticleResourcePrimKey);
			_parameters.Add("override", override);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionvirtualsetting/add-cp-definition-virtual-setting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCpDefinitionVirtualSettingAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionvirtualsetting/fetch-cp-definition-virtual-setting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionVirtualSettingAsync(long cpDefinitionVirtualSettingId, long fileEntryId, string url, int activationStatus, long duration, int maxUsages, bool useSample, long sampleFileEntryId, string sampleUrl, bool termsOfUseRequired, IDictionary<string, string> termsOfUseContentMap, long termsOfUseJournalArticleResourcePrimKey, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionVirtualSettingId", cpDefinitionVirtualSettingId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("url", url);
			_parameters.Add("activationStatus", activationStatus);
			_parameters.Add("duration", duration);
			_parameters.Add("maxUsages", maxUsages);
			_parameters.Add("useSample", useSample);
			_parameters.Add("sampleFileEntryId", sampleFileEntryId);
			_parameters.Add("sampleUrl", sampleUrl);
			_parameters.Add("termsOfUseRequired", termsOfUseRequired);
			_parameters.Add("termsOfUseContentMap", termsOfUseContentMap);
			_parameters.Add("termsOfUseJournalArticleResourcePrimKey", termsOfUseJournalArticleResourcePrimKey);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionvirtualsetting/update-cp-definition-virtual-setting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionVirtualSettingAsync(long cpDefinitionVirtualSettingId, long fileEntryId, string url, int activationStatus, long duration, int maxUsages, bool useSample, long sampleFileEntryId, string sampleUrl, bool termsOfUseRequired, IDictionary<string, string> termsOfUseContentMap, long termsOfUseJournalArticleResourcePrimKey, bool override, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionVirtualSettingId", cpDefinitionVirtualSettingId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("url", url);
			_parameters.Add("activationStatus", activationStatus);
			_parameters.Add("duration", duration);
			_parameters.Add("maxUsages", maxUsages);
			_parameters.Add("useSample", useSample);
			_parameters.Add("sampleFileEntryId", sampleFileEntryId);
			_parameters.Add("sampleUrl", sampleUrl);
			_parameters.Add("termsOfUseRequired", termsOfUseRequired);
			_parameters.Add("termsOfUseContentMap", termsOfUseContentMap);
			_parameters.Add("termsOfUseJournalArticleResourcePrimKey", termsOfUseJournalArticleResourcePrimKey);
			_parameters.Add("override", override);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitionvirtualsetting/update-cp-definition-virtual-setting", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}