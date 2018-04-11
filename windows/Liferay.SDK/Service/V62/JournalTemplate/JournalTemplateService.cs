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

namespace Liferay.SDK.Service.V62.JournalTemplate
{
	public class JournalTemplateService : ServiceBase
	{
		public JournalTemplateService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddTemplateAsync(long groupId, string templateId, bool autoTemplateId, string structureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string xsl, bool formatXsl, string langType, bool cacheable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("templateId", templateId);
			_parameters.Add("autoTemplateId", autoTemplateId);
			_parameters.Add("structureId", structureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("xsl", xsl);
			_parameters.Add("formatXsl", formatXsl);
			_parameters.Add("langType", langType);
			_parameters.Add("cacheable", cacheable);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/add-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddTemplateAsync(long groupId, string templateId, bool autoTemplateId, string structureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string xsl, bool formatXsl, string langType, bool cacheable, bool smallImage, string smallImageURL, Stream smallFile, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("templateId", templateId);
			_parameters.Add("autoTemplateId", autoTemplateId);
			_parameters.Add("structureId", structureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("xsl", xsl);
			_parameters.Add("formatXsl", formatXsl);
			_parameters.Add("langType", langType);
			_parameters.Add("cacheable", cacheable);
			_parameters.Add("smallImage", smallImage);
			_parameters.Add("smallImageURL", smallImageURL);
			_parameters.Add("smallFile", smallFile);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/add-template", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CopyTemplateAsync(long groupId, string oldTemplateId, string newTemplateId, bool autoTemplateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("oldTemplateId", oldTemplateId);
			_parameters.Add("newTemplateId", newTemplateId);
			_parameters.Add("autoTemplateId", autoTemplateId);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/copy-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteTemplateAsync(long groupId, string templateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("templateId", templateId);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/delete-template", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetStructureTemplatesAsync(long groupId, string structureId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("structureId", structureId);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/get-structure-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetTemplateAsync(long groupId, string templateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("templateId", templateId);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/get-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetTemplateAsync(long groupId, string templateId, bool includeGlobalTemplates)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("templateId", templateId);
			_parameters.Add("includeGlobalTemplates", includeGlobalTemplates);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/get-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, string templateId, string structureId, string structureIdComparator, string name, string description, bool andOperator, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("templateId", templateId);
			_parameters.Add("structureId", structureId);
			_parameters.Add("structureIdComparator", structureIdComparator);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, string keywords, string structureId, string structureIdComparator, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("structureId", structureId);
			_parameters.Add("structureIdComparator", structureIdComparator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, string keywords, string structureId, string structureIdComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("structureId", structureId);
			_parameters.Add("structureIdComparator", structureIdComparator);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, string templateId, string structureId, string structureIdComparator, string name, string description, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("templateId", templateId);
			_parameters.Add("structureId", structureId);
			_parameters.Add("structureIdComparator", structureIdComparator);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateTemplateAsync(long groupId, string templateId, string structureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string xsl, bool formatXsl, string langType, bool cacheable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("templateId", templateId);
			_parameters.Add("structureId", structureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("xsl", xsl);
			_parameters.Add("formatXsl", formatXsl);
			_parameters.Add("langType", langType);
			_parameters.Add("cacheable", cacheable);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/update-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateTemplateAsync(long groupId, string templateId, string structureId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string xsl, bool formatXsl, string langType, bool cacheable, bool smallImage, string smallImageURL, Stream smallFile, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("templateId", templateId);
			_parameters.Add("structureId", structureId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("xsl", xsl);
			_parameters.Add("formatXsl", formatXsl);
			_parameters.Add("langType", langType);
			_parameters.Add("cacheable", cacheable);
			_parameters.Add("smallImage", smallImage);
			_parameters.Add("smallImageURL", smallImageURL);
			_parameters.Add("smallFile", smallFile);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journaltemplate/update-template", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}
	}
}