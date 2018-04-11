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

namespace Liferay.SDK.Service.V62.Layout
{
	public class LayoutService : ServiceBase
	{
		public LayoutService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddLayoutAsync(long groupId, bool privateLayout, long parentLayoutId, string name, string title, string description, string type, bool hidden, string friendlyURL, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("name", name);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("hidden", hidden);
			_parameters.Add("friendlyURL", friendlyURL);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/add-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutAsync(long groupId, bool privateLayout, long parentLayoutId, IDictionary<string, string> localeNamesMap, IDictionary<string, string> localeTitlesMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> keywordsMap, IDictionary<string, string> robotsMap, string type, bool hidden, string friendlyURL, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("localeNamesMap", localeNamesMap);
			_parameters.Add("localeTitlesMap", localeTitlesMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("keywordsMap", keywordsMap);
			_parameters.Add("robotsMap", robotsMap);
			_parameters.Add("type", type);
			_parameters.Add("hidden", hidden);
			_parameters.Add("friendlyURL", friendlyURL);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/add-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutAsync(long groupId, bool privateLayout, long parentLayoutId, IDictionary<string, string> localeNamesMap, IDictionary<string, string> localeTitlesMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> keywordsMap, IDictionary<string, string> robotsMap, string type, string typeSettings, bool hidden, IDictionary<string, string> friendlyURLMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("localeNamesMap", localeNamesMap);
			_parameters.Add("localeTitlesMap", localeTitlesMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("keywordsMap", keywordsMap);
			_parameters.Add("robotsMap", robotsMap);
			_parameters.Add("type", type);
			_parameters.Add("typeSettings", typeSettings);
			_parameters.Add("hidden", hidden);
			_parameters.Add("friendlyURLMap", friendlyURLMap);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/add-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLayoutAsync(long plid, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/delete-layout", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteLayoutAsync(long groupId, bool privateLayout, long layoutId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/delete-layout", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteTempFileEntryAsync(long groupId, string fileName, string tempFolderName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fileName", fileName);
			_parameters.Add("tempFolderName", tempFolderName);

			var _command = new JsonObject()
			{
				{ "/layout/delete-temp-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<byte[]> ExportLayoutsAsync(long groupId, bool privateLayout, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (byte[])_obj;
		}

		public async Task<byte[]> ExportLayoutsAsync(long groupId, bool privateLayout, IEnumerable<long> layoutIds, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIds", layoutIds);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (byte[])_obj;
		}

		public async Task<Stream> ExportLayoutsAsFileAsync(long groupId, bool privateLayout, IEnumerable<long> layoutIds, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIds", layoutIds);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (Stream)_obj;
		}

		public async Task<long> ExportLayoutsAsFileInBackgroundAsync(string taskName, long groupId, bool privateLayout, IEnumerable<long> layoutIds, IDictionary<string, object> parameterMap, long startDate, long endDate, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIds", layoutIds);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/layout/export-layouts-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<byte[]> ExportPortletInfoAsync(long companyId, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (byte[])_obj;
		}

		public async Task<byte[]> ExportPortletInfoAsync(long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (byte[])_obj;
		}

		public async Task<Stream> ExportPortletInfoAsFileAsync(string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (Stream)_obj;
		}

		public async Task<Stream> ExportPortletInfoAsFileAsync(long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (Stream)_obj;
		}

		public async Task<long> ExportPortletInfoAsFileInBackgroundAsync(string taskName, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportPortletInfoAsFileInBackgroundAsync(string taskName, long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, long startDate, long endDate, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/layout/export-portlet-info-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAncestorLayoutsAsync(long plid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);

			var _command = new JsonObject()
			{
				{ "/layout/get-ancestor-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetDefaultPlidAsync(long groupId, long scopeGroupId, string portletId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("portletId", portletId);

			var _command = new JsonObject()
			{
				{ "/layout/get-default-plid", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetDefaultPlidAsync(long groupId, long scopeGroupId, bool privateLayout, string portletId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("scopeGroupId", scopeGroupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("portletId", portletId);

			var _command = new JsonObject()
			{
				{ "/layout/get-default-plid", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetLayoutByUuidAndGroupIdAsync(string uuid, long groupId, bool privateLayout)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);

			var _command = new JsonObject()
			{
				{ "/layout/get-layout-by-uuid-and-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<string> GetLayoutNameAsync(long groupId, bool privateLayout, long layoutId, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/layout/get-layout-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutReferencesAsync(long companyId, string portletId, string preferencesKey, string preferencesValue)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("preferencesKey", preferencesKey);
			_parameters.Add("preferencesValue", preferencesValue);

			var _command = new JsonObject()
			{
				{ "/layout/get-layout-references", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutsAsync(long groupId, bool privateLayout)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);

			var _command = new JsonObject()
			{
				{ "/layout/get-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutsAsync(long groupId, bool privateLayout, long parentLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);

			var _command = new JsonObject()
			{
				{ "/layout/get-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetLayoutsAsync(long groupId, bool privateLayout, long parentLayoutId, bool incomplete, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("incomplete", incomplete);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/layout/get-layouts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetLayoutsCountAsync(long groupId, bool privateLayout, long parentLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);

			var _command = new JsonObject()
			{
				{ "/layout/get-layouts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<string>> GetTempFileEntryNamesAsync(long groupId, string tempFolderName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("tempFolderName", tempFolderName);

			var _command = new JsonObject()
			{
				{ "/layout/get-temp-file-entry-names", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task ImportLayoutsAsync(long groupId, bool privateLayout, IDictionary<string, object> parameterMap, byte[] bytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("bytes", bytes);

			var _command = new JsonObject()
			{
				{ "/layout/import-layouts", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task ImportLayoutsAsync(long groupId, bool privateLayout, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-layouts", _parameters }
			};

			await this.Session.UploadAsync(_command);
		}

		public async Task<long> ImportLayoutsInBackgroundAsync(string taskName, long groupId, bool privateLayout, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-layouts-in-background", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (long)_obj;
		}

		public async Task ImportPortletInfoAsync(string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-portlet-info", _parameters }
			};

			await this.Session.UploadAsync(_command);
		}

		public async Task ImportPortletInfoAsync(long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-portlet-info", _parameters }
			};

			await this.Session.UploadAsync(_command);
		}

		public async Task ImportPortletInfoInBackgroundAsync(string taskName, string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-portlet-info-in-background", _parameters }
			};

			await this.Session.UploadAsync(_command);
		}

		public async Task<long> ImportPortletInfoInBackgroundAsync(string taskName, long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("taskName", taskName);
			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/import-portlet-info-in-background", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (long)_obj;
		}

		public async Task SchedulePublishToLiveAsync(long sourceGroupId, long targetGroupId, bool privateLayout, IDictionary<string, object> layoutIdMap, IDictionary<string, object> parameterMap, string scope, long startDate, long endDate, string groupName, string cronText, long schedulerStartDate, long schedulerEndDate, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sourceGroupId", sourceGroupId);
			_parameters.Add("targetGroupId", targetGroupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIdMap", layoutIdMap);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("scope", scope);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("groupName", groupName);
			_parameters.Add("cronText", cronText);
			_parameters.Add("schedulerStartDate", schedulerStartDate);
			_parameters.Add("schedulerEndDate", schedulerEndDate);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/layout/schedule-publish-to-live", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SchedulePublishToRemoteAsync(long sourceGroupId, bool privateLayout, IDictionary<string, object> layoutIdMap, IDictionary<string, object> parameterMap, string remoteAddress, int remotePort, string remotePathContext, bool secureConnection, long remoteGroupId, bool remotePrivateLayout, long startDate, long endDate, string groupName, string cronText, long schedulerStartDate, long schedulerEndDate, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sourceGroupId", sourceGroupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutIdMap", layoutIdMap);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("remoteAddress", remoteAddress);
			_parameters.Add("remotePort", remotePort);
			_parameters.Add("remotePathContext", remotePathContext);
			_parameters.Add("secureConnection", secureConnection);
			_parameters.Add("remoteGroupId", remoteGroupId);
			_parameters.Add("remotePrivateLayout", remotePrivateLayout);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("groupName", groupName);
			_parameters.Add("cronText", cronText);
			_parameters.Add("schedulerStartDate", schedulerStartDate);
			_parameters.Add("schedulerEndDate", schedulerEndDate);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/layout/schedule-publish-to-remote", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SetLayoutsAsync(long groupId, bool privateLayout, long parentLayoutId, IEnumerable<long> layoutIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("layoutIds", layoutIds);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/set-layouts", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnschedulePublishToLiveAsync(long groupId, string jobName, string groupName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("jobName", jobName);
			_parameters.Add("groupName", groupName);

			var _command = new JsonObject()
			{
				{ "/layout/unschedule-publish-to-live", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnschedulePublishToRemoteAsync(long groupId, string jobName, string groupName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("jobName", jobName);
			_parameters.Add("groupName", groupName);

			var _command = new JsonObject()
			{
				{ "/layout/unschedule-publish-to-remote", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateLayoutAsync(long groupId, bool privateLayout, long layoutId, long parentLayoutId, IDictionary<string, string> localeNamesMap, IDictionary<string, string> localeTitlesMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> keywordsMap, IDictionary<string, string> robotsMap, string type, bool hidden, string friendlyURL, JsonObjectWrapper iconImage, byte[] iconBytes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("localeNamesMap", localeNamesMap);
			_parameters.Add("localeTitlesMap", localeTitlesMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("keywordsMap", keywordsMap);
			_parameters.Add("robotsMap", robotsMap);
			_parameters.Add("type", type);
			_parameters.Add("hidden", hidden);
			_parameters.Add("friendlyURL", friendlyURL);
			this.MangleWrapper(_parameters, "iconImage", "java.lang.Boolean", iconImage);
			_parameters.Add("iconBytes", iconBytes);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/update-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutAsync(long groupId, bool privateLayout, long layoutId, long parentLayoutId, IDictionary<string, string> localeNamesMap, IDictionary<string, string> localeTitlesMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> keywordsMap, IDictionary<string, string> robotsMap, string type, bool hidden, IDictionary<string, string> friendlyURLMap, JsonObjectWrapper iconImage, byte[] iconBytes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("parentLayoutId", parentLayoutId);
			_parameters.Add("localeNamesMap", localeNamesMap);
			_parameters.Add("localeTitlesMap", localeTitlesMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("keywordsMap", keywordsMap);
			_parameters.Add("robotsMap", robotsMap);
			_parameters.Add("type", type);
			_parameters.Add("hidden", hidden);
			_parameters.Add("friendlyURLMap", friendlyURLMap);
			this.MangleWrapper(_parameters, "iconImage", "java.lang.Boolean", iconImage);
			_parameters.Add("iconBytes", iconBytes);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layout/update-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutAsync(long groupId, bool privateLayout, long layoutId, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/layout/update-layout", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLookAndFeelAsync(long groupId, bool privateLayout, long layoutId, string themeId, string colorSchemeId, string css, bool wapTheme)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("themeId", themeId);
			_parameters.Add("colorSchemeId", colorSchemeId);
			_parameters.Add("css", css);
			_parameters.Add("wapTheme", wapTheme);

			var _command = new JsonObject()
			{
				{ "/layout/update-look-and-feel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateNameAsync(long plid, string name, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/layout/update-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateNameAsync(long groupId, bool privateLayout, long layoutId, string name, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/layout/update-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateParentLayoutIdAsync(long plid, long parentPlid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("parentPlid", parentPlid);

			var _command = new JsonObject()
			{
				{ "/layout/update-parent-layout-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateParentLayoutIdAsync(long groupId, bool privateLayout, long layoutId, long parentLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("parentLayoutId", parentLayoutId);

			var _command = new JsonObject()
			{
				{ "/layout/update-parent-layout-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateParentLayoutIdAndPriorityAsync(long plid, long parentPlid, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("parentPlid", parentPlid);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/layout/update-parent-layout-id-and-priority", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePriorityAsync(long plid, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/layout/update-priority", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePriorityAsync(long groupId, bool privateLayout, long layoutId, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/layout/update-priority", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePriorityAsync(long groupId, bool privateLayout, long layoutId, long nextLayoutId, long previousLayoutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("layoutId", layoutId);
			_parameters.Add("nextLayoutId", nextLayoutId);
			_parameters.Add("previousLayoutId", previousLayoutId);

			var _command = new JsonObject()
			{
				{ "/layout/update-priority", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ValidateImportLayoutsFileAsync(long groupId, bool privateLayout, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("privateLayout", privateLayout);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/validate-import-layouts-file", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ValidateImportPortletInfoAsync(long plid, long groupId, string portletId, IDictionary<string, object> parameterMap, Stream file)
		{
			var _parameters = new JsonObject();

			_parameters.Add("plid", plid);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletId", portletId);
			_parameters.Add("parameterMap", parameterMap);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/layout/validate-import-portlet-info", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}
	}
}