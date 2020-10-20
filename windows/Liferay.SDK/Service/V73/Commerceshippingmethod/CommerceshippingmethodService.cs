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

namespace Liferay.SDK.Service.V73.Commerceshippingmethod
{
	public class CommerceshippingmethodService : ServiceBase
	{
		public CommerceshippingmethodService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchCommerceShippingMethodAsync(long groupId, string engineKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("engineKey", engineKey);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/fetch-commerce-shipping-method", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShippingMethodsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/get-commerce-shipping-methods", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShippingMethodsAsync(long groupId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/get-commerce-shipping-methods", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShippingMethodsAsync(long groupId, long commerceCountryId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/get-commerce-shipping-methods", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateCommerceShippingMethodAsync(long commerceShippingMethodId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, Stream imageFile, double priority, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("imageFile", imageFile);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/update-commerce-shipping-method", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SetActiveAsync(long commerceShippingMethodId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/set-active", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CreateCommerceShippingMethodAsync(long commerceShippingMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/create-commerce-shipping-method", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceAddressRestrictionAsync(long commerceShippingMethodId, long commerceCountryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/add-commerce-address-restriction", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceAddressRestrictionAsync(long userId, long groupId, long commerceShippingMethodId, long commerceCountryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("commerceCountryId", commerceCountryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/add-commerce-address-restriction", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceShippingMethodAsync(long userId, long groupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, Stream imageFile, string engineKey, double priority, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("imageFile", imageFile);
			_parameters.Add("engineKey", engineKey);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/add-commerce-shipping-method", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceShippingMethodAsync(long commerceShippingMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/get-commerce-shipping-method", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAddressRestrictionsAsync(long commerceShippingMethodId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/get-commerce-address-restrictions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceAddressRestrictionsCountAsync(long commerceShippingMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/get-commerce-address-restrictions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteCommerceAddressRestrictionAsync(long commerceAddressRestrictionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAddressRestrictionId", commerceAddressRestrictionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/delete-commerce-address-restriction", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceAddressRestrictionsAsync(long commerceShippingMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/delete-commerce-address-restrictions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceShippingMethodAsync(long commerceShippingMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/delete-commerce-shipping-method", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetCommerceShippingMethodsCountAsync(long groupId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingmethod/get-commerce-shipping-methods-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}