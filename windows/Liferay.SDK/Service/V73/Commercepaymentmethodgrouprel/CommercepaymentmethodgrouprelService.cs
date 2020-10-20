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

namespace Liferay.SDK.Service.V73.Commercepaymentmethodgrouprel
{
	public class CommercepaymentmethodgrouprelService : ServiceBase
	{
		public CommercepaymentmethodgrouprelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> SetActiveAsync(long commercePaymentMethodGroupRelId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/set-active", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceAddressRestrictionAsync(long classPK, long commerceCountryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("commerceCountryId", commerceCountryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/add-commerce-address-restriction", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceAddressRestrictionAsync(long userId, long groupId, long classPK, long commerceCountryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("commerceCountryId", commerceCountryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/add-commerce-address-restriction", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAddressRestrictionsAsync(long classPK, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-address-restrictions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceAddressRestrictionsCountAsync(long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-address-restrictions-count", _parameters }
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
				{ "/commerce.commercepaymentmethodgrouprel/delete-commerce-address-restriction", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceAddressRestrictionsAsync(long commercePaymentMethodGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/delete-commerce-address-restrictions", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommercePaymentMethodGroupRelAsync(long userId, long groupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, Stream imageFile, string engineKey, double priority, bool active)
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
				{ "/commerce.commercepaymentmethodgrouprel/add-commerce-payment-method-group-rel", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommercePaymentMethodGroupRelAsync(long commercePaymentMethodGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/delete-commerce-payment-method-group-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommercePaymentMethodGroupRelAsync(long groupId, string engineKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("engineKey", engineKey);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/fetch-commerce-payment-method-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommercePaymentMethodGroupRelAsync(long commercePaymentMethodGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommercePaymentMethodGroupRelAsync(long groupId, string engineKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("engineKey", engineKey);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePaymentMethodGroupRelsAsync(long groupId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePaymentMethodGroupRelsAsync(long groupId, bool active, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePaymentMethodGroupRelsAsync(long groupId, long commerceCountryId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePaymentMethodGroupRelsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePaymentMethodGroupRelsAsync(long groupId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePaymentMethodGroupRelsAsync(long groupId, bool active, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePaymentMethodGroupRelsCountAsync(long groupId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommercePaymentMethodGroupRelsCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommercePaymentMethodGroupRelAsync(long commercePaymentMethodGroupRelId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, Stream imageFile, double priority, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("imageFile", imageFile);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepaymentmethodgrouprel/update-commerce-payment-method-group-rel", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}
	}
}