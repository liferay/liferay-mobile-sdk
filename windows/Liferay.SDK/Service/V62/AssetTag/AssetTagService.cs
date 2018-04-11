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

namespace Liferay.SDK.Service.V62.AssetTag
{
	public class AssetTagService : ServiceBase
	{
		public AssetTagService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddTagAsync(string name, IEnumerable<string> tagProperties, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("tagProperties", tagProperties);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assettag/add-tag", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteTagAsync(long tagId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tagId", tagId);

			var _command = new JsonObject()
			{
				{ "/assettag/delete-tag", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteTagsAsync(IEnumerable<long> tagIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tagIds", tagIds);

			var _command = new JsonObject()
			{
				{ "/assettag/delete-tags", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetGroupTagsAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/assettag/get-group-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupTagsAsync(long groupId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			var _command = new JsonObject()
			{
				{ "/assettag/get-group-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupTagsCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/assettag/get-group-tags-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetGroupTagsDisplayAsync(long groupId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/get-group-tags-display", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupsTagsAsync(IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/assettag/get-groups-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetJsonGroupTagsAsync(long groupId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/get-json-group-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetTagAsync(long tagId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tagId", tagId);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tag", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(long groupId, long classNameId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(long groupId, string name, IEnumerable<string> tagProperties, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("tagProperties", tagProperties);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(IEnumerable<long> groupIds, string name, IEnumerable<string> tagProperties, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("name", name);
			_parameters.Add("tagProperties", tagProperties);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetTagsAsync(long groupId, long classNameId, string name, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetTagsCountAsync(long groupId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetTagsCountAsync(long groupId, long classNameId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetTagsCountAsync(long groupId, string name, IEnumerable<string> tagProperties)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("tagProperties", tagProperties);

			var _command = new JsonObject()
			{
				{ "/assettag/get-tags-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task MergeTagsAsync(long fromTagId, long toTagId, bool overrideProperties)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fromTagId", fromTagId);
			_parameters.Add("toTagId", toTagId);
			_parameters.Add("overrideProperties", overrideProperties);

			var _command = new JsonObject()
			{
				{ "/assettag/merge-tags", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task MergeTagsAsync(IEnumerable<long> fromTagIds, long toTagId, bool overrideProperties)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fromTagIds", fromTagIds);
			_parameters.Add("toTagId", toTagId);
			_parameters.Add("overrideProperties", overrideProperties);

			var _command = new JsonObject()
			{
				{ "/assettag/merge-tags", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long groupId, string name, IEnumerable<string> tagProperties, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("tagProperties", tagProperties);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(IEnumerable<long> groupIds, string name, IEnumerable<string> tagProperties, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("name", name);
			_parameters.Add("tagProperties", tagProperties);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assettag/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateTagAsync(long tagId, string name, IEnumerable<string> tagProperties, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tagId", tagId);
			_parameters.Add("name", name);
			_parameters.Add("tagProperties", tagProperties);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/assettag/update-tag", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}