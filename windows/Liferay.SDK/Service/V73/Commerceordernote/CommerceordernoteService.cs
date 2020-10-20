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

namespace Liferay.SDK.Service.V73.Commerceordernote
{
	public class CommerceordernoteService : ServiceBase
	{
		public CommerceordernoteService(ISession session)
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
				{ "/commerce.commerceordernote/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceOrderNoteAsync(long commerceOrderId, string content, bool restricted, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("content", content);
			_parameters.Add("restricted", restricted);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/add-commerce-order-note", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceOrderNotesAsync(long commerceOrderId, bool restricted)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("restricted", restricted);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/get-commerce-order-notes", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceOrderNotesAsync(long commerceOrderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/get-commerce-order-notes", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceOrderNotesCountAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/get-commerce-order-notes-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceOrderNotesCountAsync(long commerceOrderId, bool restricted)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("restricted", restricted);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/get-commerce-order-notes-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderNoteAsync(long commerceOrderNoteId, string content, bool restricted)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderNoteId", commerceOrderNoteId);
			_parameters.Add("content", content);
			_parameters.Add("restricted", restricted);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/update-commerce-order-note", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceOrderNoteAsync(long commerceOrderNoteId, long commerceOrderId, string content, bool restricted, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderNoteId", commerceOrderNoteId);
			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("content", content);
			_parameters.Add("restricted", restricted);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/upsert-commerce-order-note", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceOrderNoteAsync(long commerceOrderNoteId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderNoteId", commerceOrderNoteId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/get-commerce-order-note", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceOrderNoteAsync(long commerceOrderNoteId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderNoteId", commerceOrderNoteId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/delete-commerce-order-note", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceOrderNoteAsync(long commerceOrderNoteId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderNoteId", commerceOrderNoteId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceordernote/fetch-commerce-order-note", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}