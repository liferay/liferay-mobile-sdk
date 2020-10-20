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

namespace Liferay.SDK.Service.V73.Segmentsexperiment
{
	public class SegmentsexperimentService : ServiceBase
	{
		public SegmentsexperimentService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddSegmentsExperimentAsync(long segmentsExperienceId, long classNameId, long classPK, string name, string description, string goal, string goalTarget, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("goal", goal);
			_parameters.Add("goalTarget", goalTarget);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/add-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSegmentsExperimentAsync(long segmentsExperimentId, string name, string description, string goal, string goalTarget)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentId", segmentsExperimentId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("goal", goal);
			_parameters.Add("goalTarget", goalTarget);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/update-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetSegmentsExperimentAsync(long segmentsExperimentId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentId", segmentsExperimentId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/get-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetSegmentsExperimentAsync(string segmentsExperimentKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentKey", segmentsExperimentKey);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/get-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RunSegmentsExperimentAsync(string segmentsExperimentKey, double confidenceLevel, IDictionary<string, object> segmentsExperienceKeySplitMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentKey", segmentsExperimentKey);
			_parameters.Add("confidenceLevel", confidenceLevel);
			_parameters.Add("segmentsExperienceKeySplitMap", segmentsExperienceKeySplitMap);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/run-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RunSegmentsExperimentAsync(long segmentsExperimentId, double confidenceLevel, IDictionary<string, object> segmentsExperienceIdSplitMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentId", segmentsExperimentId);
			_parameters.Add("confidenceLevel", confidenceLevel);
			_parameters.Add("segmentsExperienceIdSplitMap", segmentsExperienceIdSplitMap);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/run-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchSegmentsExperimentAsync(long segmentsExperienceId, long classNameId, long classPK, IEnumerable<int> statuses)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("statuses", statuses);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/fetch-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchSegmentsExperimentAsync(long groupId, string segmentsExperimentKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("segmentsExperimentKey", segmentsExperimentKey);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/fetch-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteSegmentsExperimentAsync(long segmentsExperimentId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentId", segmentsExperimentId);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/delete-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteSegmentsExperimentAsync(string segmentsExperimentKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentKey", segmentsExperimentKey);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/delete-segments-experiment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsExperienceSegmentsExperimentsAsync(IEnumerable<long> segmentsExperienceIds, long classNameId, long classPK, IEnumerable<int> statuses, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperienceIds", segmentsExperienceIds);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("statuses", statuses);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/get-segments-experience-segments-experiments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateSegmentsExperimentStatusAsync(long segmentsExperimentId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentId", segmentsExperimentId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/update-segments-experiment-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSegmentsExperimentStatusAsync(long segmentsExperimentId, long winnerSegmentsExperienceId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentId", segmentsExperimentId);
			_parameters.Add("winnerSegmentsExperienceId", winnerSegmentsExperienceId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/update-segments-experiment-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSegmentsExperimentStatusAsync(string segmentsExperimentKey, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentKey", segmentsExperimentKey);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/update-segments-experiment-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSegmentsExperimentStatusAsync(string segmentsExperimentKey, string winnerSegmentsExperienceKey, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperimentKey", segmentsExperimentKey);
			_parameters.Add("winnerSegmentsExperienceKey", winnerSegmentsExperienceKey);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/update-segments-experiment-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsExperimentsAsync(long groupId, long classNameId, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/get-segments-experiments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetSegmentsExperimentsAsync(long segmentsExperienceId, long classNameId, long classPK, IEnumerable<int> statuses, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("segmentsExperienceId", segmentsExperienceId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("statuses", statuses);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/segments.segmentsexperiment/get-segments-experiments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}