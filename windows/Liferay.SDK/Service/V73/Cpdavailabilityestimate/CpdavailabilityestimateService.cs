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

namespace Liferay.SDK.Service.V73.Cpdavailabilityestimate
{
	public class CpdavailabilityestimateService : ServiceBase
	{
		public CpdavailabilityestimateService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchCpdAvailabilityEstimateByCpDefinitionIdAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdavailabilityestimate/fetch-cpd-availability-estimate-by-cp-definition-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpdAvailabilityEstimateAsync(long cpdAvailabilityEstimateId, long cpDefinitionId, long commerceAvailabilityEstimateId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpdAvailabilityEstimateId", cpdAvailabilityEstimateId);
			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("commerceAvailabilityEstimateId", commerceAvailabilityEstimateId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdavailabilityestimate/update-cpd-availability-estimate", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}