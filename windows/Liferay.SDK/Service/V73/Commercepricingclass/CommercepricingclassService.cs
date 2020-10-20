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

namespace Liferay.SDK.Service.V73.Commercepricingclass
{
	public class CommercepricingclassService : ServiceBase
	{
		public CommercepricingclassService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchByExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommercePricingClassAsync(long userId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/add-commerce-pricing-class", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommercePricingClassAsync(long userId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/add-commerce-pricing-class", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCommercePricingClassAsync(long commercePricingClassId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/delete-commerce-pricing-class", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommercePricingClassAsync(long commercePricingClassId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/fetch-commerce-pricing-class", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommercePricingClassAsync(long commercePricingClassId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/get-commerce-pricing-class", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCommercePricingClassCountByCpDefinitionIdAsync(long cpDefinitionId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/get-commerce-pricing-class-count-by-cp-definition-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePricingClassesAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/get-commerce-pricing-classes", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePricingClassesCountAsync(long cpDefinitionId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/get-commerce-pricing-classes-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommercePricingClassesCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/get-commerce-pricing-classes-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> SearchCommercePricingClassesAsync(long companyId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/search-commerce-pricing-classes", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchCommercePricingClassesByCpDefinitionIdAsync(long cpDefinitionId, string title, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("title", title);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/search-commerce-pricing-classes-by-cp-definition-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateCommercePricingClassAsync(long commercePricingClassId, long userId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("userId", userId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/update-commerce-pricing-class", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommercePricingClassExternalReferenceCodeAsync(long commercePricingClassId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/update-commerce-pricing-class-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommercePricingClassAsync(long commercePricingClassId, long userId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePricingClassId", commercePricingClassId);
			_parameters.Add("userId", userId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricingclass/upsert-commerce-pricing-class", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}