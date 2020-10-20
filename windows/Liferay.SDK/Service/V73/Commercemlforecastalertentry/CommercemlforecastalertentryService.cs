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

namespace Liferay.SDK.Service.V73.Commercemlforecastalertentry
{
	public class CommercemlforecastalertentryService : ServiceBase
	{
		public CommercemlforecastalertentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateStatusAsync(long userId, long commerceMLForecastAlertEntryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceMLForecastAlertEntryId", commerceMLForecastAlertEntryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/commerce.commercemlforecastalertentry/update-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAboveThresholdCommerceMlForecastAlertEntriesAsync(long companyId, long userId, int status, double relativeChange, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("relativeChange", relativeChange);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercemlforecastalertentry/get-above-threshold-commerce-ml-forecast-alert-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetAboveThresholdCommerceMlForecastAlertEntriesCountAsync(long companyId, long userId, int status, double relativeChange)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("relativeChange", relativeChange);

			var _command = new JsonObject()
			{
				{ "/commerce.commercemlforecastalertentry/get-above-threshold-commerce-ml-forecast-alert-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetBelowThresholdCommerceMlForecastAlertEntriesAsync(long companyId, long userId, int status, double relativeChange, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("relativeChange", relativeChange);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercemlforecastalertentry/get-below-threshold-commerce-ml-forecast-alert-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetBelowThresholdCommerceMlForecastAlertEntriesCountAsync(long companyId, long userId, int status, double relativeChange)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("relativeChange", relativeChange);

			var _command = new JsonObject()
			{
				{ "/commerce.commercemlforecastalertentry/get-below-threshold-commerce-ml-forecast-alert-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceMlForecastAlertEntriesCountAsync(long companyId, long userId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/commerce.commercemlforecastalertentry/get-commerce-ml-forecast-alert-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceMlForecastAlertEntriesAsync(long companyId, long userId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercemlforecastalertentry/get-commerce-ml-forecast-alert-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}