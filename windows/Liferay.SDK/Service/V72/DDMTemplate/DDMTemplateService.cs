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

namespace Liferay.SDK.Service.V72.DDMTemplate
{
	public class DDMTemplateService : ServiceBase
	{
		public DDMTemplateService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, long groupId, long classNameId, long classPK, long resourceClassNameId, string keywords, string type, string mode, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, long groupId, long classNameId, long classPK, long resourceClassNameId, string name, string description, string type, string mode, string language, int status, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("status", status);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, IEnumerable<long> classPKs, long resourceClassNameId, string name, string description, string type, string mode, string language, int status, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("classPKs", classPKs);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("status", status);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, IEnumerable<long> classPKs, long resourceClassNameId, string keywords, string type, string mode, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("classPKs", classPKs);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> CopyTemplateAsync(long templateId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/copy-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CopyTemplateAsync(long templateId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/copy-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> CopyTemplatesAsync(long classNameId, long oldClassPK, long resourceClassNameId, long newClassPK, string type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("oldClassPK", oldClassPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("newClassPK", newClassPK);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/copy-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddTemplateAsync(long groupId, long classNameId, long classPK, long resourceClassNameId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string mode, string language, string script, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("script", script);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/add-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddTemplateAsync(long groupId, long classNameId, long classPK, long resourceClassNameId, string templateKey, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string mode, string language, string script, bool cacheable, bool smallImage, string smallImageURL, Stream smallImageFile, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
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
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/add-template", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTemplatesByClassPkAsync(long companyId, long groupId, long classPK, long resourceClassNameId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-templates-by-class-pk", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTemplatesByStructureClassNameIdAsync(long groupId, long structureClassNameId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("structureClassNameId", structureClassNameId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-templates-by-structure-class-name-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetTemplatesByStructureClassNameIdCountAsync(long groupId, long structureClassNameId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("structureClassNameId", structureClassNameId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-templates-by-structure-class-name-id-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task RevertTemplateAsync(long templateId, string version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/revert-template", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateTemplateAsync(long templateId, long classPK, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string mode, string language, string script, bool cacheable, bool smallImage, string smallImageURL, Stream smallImageFile, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/update-template", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateTemplateAsync(long templateId, long classPK, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string type, string mode, string language, string script, bool cacheable, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/update-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetTemplateAsync(long groupId, long classNameId, string templateKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("templateKey", templateKey);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetTemplateAsync(long groupId, long classNameId, string templateKey, bool includeAncestorTemplates)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("templateKey", templateKey);
			_parameters.Add("includeAncestorTemplates", includeAncestorTemplates);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetTemplateAsync(long templateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchTemplateAsync(long groupId, long classNameId, string templateKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("templateKey", templateKey);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/fetch-template", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, IEnumerable<long> classPKs, long resourceClassNameId, string name, string description, string type, string mode, string language, int status, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("classPKs", classPKs);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("status", status);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, long classNameId, long classPK, long resourceClassNameId, string name, string description, string type, string mode, string language, int status, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("language", language);
			_parameters.Add("status", status);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, long groupId, long classNameId, long classPK, long resourceClassNameId, string keywords, string type, string mode, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> classNameIds, IEnumerable<long> classPKs, long resourceClassNameId, string keywords, string type, string mode, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("classNameIds", classNameIds);
			_parameters.Add("classPKs", classPKs);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTemplatesAsync(long companyId, long groupId, long classNameId, long classPK, long resourceClassNameId, string type, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("type", type);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTemplatesAsync(long companyId, long groupId, long classNameId, long classPK, long resourceClassNameId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTemplatesAsync(long companyId, long groupId, long classNameId, long classPK, long resourceClassNameId, bool includeAncestorTemplates, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("includeAncestorTemplates", includeAncestorTemplates);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTemplatesAsync(long companyId, long groupId, long classNameId, long resourceClassNameId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTemplatesAsync(long companyId, long groupId, long classNameId, long classPK, long resourceClassNameId, string type, string mode, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("resourceClassNameId", resourceClassNameId);
			_parameters.Add("type", type);
			_parameters.Add("mode", mode);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/get-templates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteTemplateAsync(long templateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("templateId", templateId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmtemplate/delete-template", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}