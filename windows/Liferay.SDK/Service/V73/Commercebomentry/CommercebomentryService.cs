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

namespace Liferay.SDK.Service.V73.Commercebomentry
{
	public class CommercebomentryService : ServiceBase
	{
		public CommercebomentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceBomEntryAsync(long userId, int number, string cpInstanceUuid, long cProductId, long commerceBOMDefinitionId, double positionX, double positionY, double radius)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("number", number);
			_parameters.Add("cpInstanceUuid", cpInstanceUuid);
			_parameters.Add("cProductId", cProductId);
			_parameters.Add("commerceBOMDefinitionId", commerceBOMDefinitionId);
			_parameters.Add("positionX", positionX);
			_parameters.Add("positionY", positionY);
			_parameters.Add("radius", radius);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomentry/add-commerce-bom-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceBomEntryAsync(long commerceBOMEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMEntryId", commerceBOMEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomentry/delete-commerce-bom-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCommerceBomEntriesAsync(long commerceBOMDefinitionId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMDefinitionId", commerceBOMDefinitionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomentry/get-commerce-bom-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceBomEntriesCountAsync(long commerceBOMDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMDefinitionId", commerceBOMDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomentry/get-commerce-bom-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceBomEntryAsync(long commerceBOMEntryId, int number, string cpInstanceUuid, long cProductId, double positionX, double positionY, double radius)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMEntryId", commerceBOMEntryId);
			_parameters.Add("number", number);
			_parameters.Add("cpInstanceUuid", cpInstanceUuid);
			_parameters.Add("cProductId", cProductId);
			_parameters.Add("positionX", positionX);
			_parameters.Add("positionY", positionY);
			_parameters.Add("radius", radius);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomentry/update-commerce-bom-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceBomEntryAsync(long commerceBOMEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceBOMEntryId", commerceBOMEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercebomentry/get-commerce-bom-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}