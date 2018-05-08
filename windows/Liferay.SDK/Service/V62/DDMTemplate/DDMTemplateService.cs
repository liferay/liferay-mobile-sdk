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

namespace Liferay.SDK.Service.V62.DDMTemplate
{
	public class DDMTemplateService : ServiceBase
	{
		public DDMTemplateService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddTemplateAsync(long groupId, long classNameId, long classPK, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string mode, string language, string script, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("script", script);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/add-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddTemplateAsync(long groupId, long classNameId, long classPK, string templateKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string mode, string language, string script, bool cacheable, bool smallImage, string smallImageURL, IDictionary<string, object> smallImageFile, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("templateKey", templateKey);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("script", script);
			_parameters.Add("cacheable", cacheable);
			_parameters.Add("smallImage", smallImage);
			_parameters.Add("smallImageURL", smallImageURL);
			_parameters.Add("smallImageFile", smallImageFile);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/add-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CopyTemplateAsync(long templateId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/copy-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CopyTemplateAsync(long templateId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/copy-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CopyTemplatesAsync(long classNameId, long classPK, long newClassPK, string type, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("newClassPK", newClassPK);
			_parameters.Add("type", type);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/copy-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteTemplateAsync(long templateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/delete-template", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> FetchTemplateAsync(long groupId, long classNameId, string templateKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("templateKey", templateKey);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/fetch-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetTemplateAsync(long templateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetTemplateAsync(long groupId, long classNameId, string templateKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("templateKey", templateKey);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetTemplateAsync(long groupId, long classNameId, string templateKey, bool includeGlobalTemplates)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("templateKey", templateKey);
			_parameters.Add("includeGlobalTemplates", includeGlobalTemplates);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetTemplatesAsync(long groupId, long classNameId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetTemplatesAsync(long groupId, long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetTemplatesAsync(long groupId, long classNameId, long classPK, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetTemplatesAsync(long groupId, long classNameId, long classPK, string type, string mode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetTemplatesByClassPkAsync(long groupId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-templates-by-class-pk", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetTemplatesByStructureClassNameIdAsync(long groupId, long structureClassNameId, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("structureClassNameId", structureClassNameId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-templates-by-structure-class-name-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetTemplatesByStructureClassNameIdCountAsync(long groupId, long structureClassNameId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("structureClassNameId", structureClassNameId);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/get-templates-by-structure-class-name-id-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, long groupId, long classNameId, long classPK, string keywords, string type, string mode, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, IEnumerable<long> classPKs, string keywords, string type, string mode, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("classPKs", classPKs);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, long groupId, long classNameId, long classPK, string name, string description, string type, string mode, string language, bool andOperator, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, IEnumerable<long> classPKs, string name, string description, string type, string mode, string language, bool andOperator, int start, int end, IDictionary<string, object> orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("classPKs", classPKs);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("orderByComparator", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, long classNameId, long classPK, string name, string description, string type, string mode, string language, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, IEnumerable<long> classPKs, string name, string description, string type, string mode, string language, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("classPKs", classPKs);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, long classNameId, long classPK, string keywords, string type, string mode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, IEnumerable<long> classPKs, string keywords, string type, string mode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("classPKs", classPKs);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateTemplateAsync(long templateId, long classPK, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string mode, string language, string script, bool cacheable, bool smallImage, string smallImageURL, IDictionary<string, object> smallImageFile, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("script", script);
			_parameters.Add("cacheable", cacheable);
			_parameters.Add("smallImage", smallImage);
			_parameters.Add("smallImageURL", smallImageURL);
			_parameters.Add("smallImageFile", smallImageFile);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddmtemplate/update-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}