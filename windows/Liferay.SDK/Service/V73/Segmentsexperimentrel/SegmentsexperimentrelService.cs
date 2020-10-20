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

namespace Liferay.SDK.Service.V73.Segmentsexperimentrel
{
	public class SegmentsexperimentrelService : ServiceBase
	{
		public SegmentsexperimentrelService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsExperimentRelsAsync(long segmentsExperimentId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentId", segmentsExperimentId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperimentrel/get-segments-experiment-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddSegmentsExperimentRelAsync(long segmentsExperimentId, long segmentsExperienceId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentId", segmentsExperimentId);
			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperimentrel/add-segments-experiment-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSegmentsExperimentRelAsync(long segmentsExperimentRelId, double split)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentRelId", segmentsExperimentRelId);
			_parameters.Add("split", split);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperimentrel/update-segments-experiment-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSegmentsExperimentRelAsync(long segmentsExperimentRelId, string name, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentRelId", segmentsExperimentRelId);
			_parameters.Add("name", name);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperimentrel/update-segments-experiment-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteSegmentsExperimentRelAsync(long segmentsExperimentRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentRelId", segmentsExperimentRelId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperimentrel/delete-segments-experiment-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetSegmentsExperimentRelAsync(long segmentsExperimentId, long segmentsExperienceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentId", segmentsExperimentId);
			_parameters.Add("segmentsExperienceId", segmentsExperienceId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperimentrel/get-segments-experiment-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}