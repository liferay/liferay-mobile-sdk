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

namespace Liferay.SDK.Service.V73.Commercepricemodifierrel
{
	public class CommercepricemodifierrelService : ServiceBase
	{
		public CommercepricemodifierrelService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<long>> GetClassPKsAsync(long commercePriceModifierRelId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierRelId", commercePriceModifierRelId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-class-p-ks", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<dynamic> AddCommercePriceModifierRelAsync(long commercePriceModifierId, string className, long classPK, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/add-commerce-price-modifier-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommercePriceModifierRelAsync(long commercePriceModifierRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierRelId", commercePriceModifierRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/delete-commerce-price-modifier-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommercePriceModifierRelAsync(long commercePriceModifierId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/fetch-commerce-price-modifier-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesCommercePriceModifierRelsAsync(long commercePriceModifierId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-categories-commerce-price-modifier-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCategoriesCommercePriceModifierRelsCountAsync(long commercePriceModifierId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-categories-commerce-price-modifier-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceModifierRelsAsync(long commercePriceModifierRelId, string className, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierRelId", commercePriceModifierRelId);
			_parameters.Add("className", className);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-commerce-price-modifier-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceModifierRelsAsync(long commercePriceModifierRelId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierRelId", commercePriceModifierRelId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-commerce-price-modifier-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePriceModifierRelsCountAsync(long commercePriceModifierRelId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierRelId", commercePriceModifierRelId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-commerce-price-modifier-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceModifiersRelsAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-commerce-price-modifiers-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePricingClassesCommercePriceModifierRelsAsync(long commercePriceModifierId, string title, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("title", title);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-commerce-pricing-classes-commerce-price-modifier-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePricingClassesCommercePriceModifierRelsCountAsync(long commercePriceModifierId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-commerce-pricing-classes-commerce-price-modifier-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionsCommercePriceModifierRelsAsync(long commercePriceModifierId, string name, string languageId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-cp-definitions-commerce-price-modifier-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpDefinitionsCommercePriceModifierRelsCountAsync(long commercePriceModifierId, string name, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-cp-definitions-commerce-price-modifier-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetCommercePriceModifierRelAsync(long commercePriceModifierRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierRelId", commercePriceModifierRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifierrel/get-commerce-price-modifier-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}