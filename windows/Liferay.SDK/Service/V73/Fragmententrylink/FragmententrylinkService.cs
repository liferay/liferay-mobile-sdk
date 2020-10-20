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

namespace Liferay.SDK.Service.V73.Fragmententrylink
{
	public class FragmententrylinkService : ServiceBase
	{
		public FragmententrylinkService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddFragmentEntryLinkAsync(long groupId, long originalFragmentEntryLinkId, long fragmentEntryId, long segmentsExperienceId, long classNameId, long classPK, string css, string html, string js, string configuration, string editableValues, string namespace, int position, string rendererKey, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("originalFragmentEntryLinkId", originalFragmentEntryLinkId);
			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("css", css);
			_parameters.Add("html", html);
			_parameters.Add("js", js);
			_parameters.Add("configuration", configuration);
			_parameters.Add("editableValues", editableValues);
			_parameters.Add("namespace", namespace);
			_parameters.Add("position", position);
			_parameters.Add("rendererKey", rendererKey);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententrylink/add-fragment-entry-link", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFragmentEntryLinkAsync(long groupId, long originalFragmentEntryLinkId, long fragmentEntryId, long segmentsExperienceId, long plid, string css, string html, string js, string configuration, string editableValues, string namespace, int position, string rendererKey, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("originalFragmentEntryLinkId", originalFragmentEntryLinkId);
			_parameters.Add("fragmentEntryId", fragmentEntryId);
			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			_parameters.Add("plid", plid);
			_parameters.Add("css", css);
			_parameters.Add("html", html);
			_parameters.Add("js", js);
			_parameters.Add("configuration", configuration);
			_parameters.Add("editableValues", editableValues);
			_parameters.Add("namespace", namespace);
			_parameters.Add("position", position);
			_parameters.Add("rendererKey", rendererKey);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententrylink/add-fragment-entry-link", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryLinkAsync(long fragmentEntryLinkId, string editableValues)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryLinkId", fragmentEntryLinkId);
			_parameters.Add("editableValues", editableValues);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententrylink/update-fragment-entry-link", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFragmentEntryLinkAsync(long fragmentEntryLinkId, string editableValues, bool updateClassedModel)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryLinkId", fragmentEntryLinkId);
			_parameters.Add("editableValues", editableValues);
			_parameters.Add("updateClassedModel", updateClassedModel);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententrylink/update-fragment-entry-link", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteFragmentEntryLinkAsync(long fragmentEntryLinkId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryLinkId", fragmentEntryLinkId);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententrylink/delete-fragment-entry-link", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateFragmentEntryLinksAsync(long groupId, long classNameId, long classPK, IEnumerable<long> fragmentEntryIds, string editableValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("fragmentEntryIds", fragmentEntryIds);
			_parameters.Add("editableValues", editableValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententrylink/update-fragment-entry-links", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateFragmentEntryLinksAsync(long groupId, long plid, IEnumerable<long> fragmentEntryIds, string editableValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("plid", plid);
			_parameters.Add("fragmentEntryIds", fragmentEntryIds);
			_parameters.Add("editableValues", editableValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententrylink/update-fragment-entry-links", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateFragmentEntryLinksAsync(IDictionary<string, object> fragmentEntryLinksEditableValuesMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fragmentEntryLinksEditableValuesMap", fragmentEntryLinksEditableValuesMap);

			var _command = new JsonObject()
			{
				{ "/fragment.fragmententrylink/update-fragment-entry-links", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}