//------------------------------------------------------------------------------
// <copyright file="MBThreadService.cs">
//    Copyright (c) 2014-present Andrea Di Giorgi
//
//    Permission is hereby granted, free of charge, to any person obtaining a
//    copy of this software and associated documentation files (the "Software"),
//    to deal in the Software without restriction, including without limitation
//    the rights to use, copy, modify, merge, publish, distribute, sublicense,
//    and/or sell copies of the Software, and to permit persons to whom the
//    Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in
//    all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
//    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//    DEALINGS IN THE SOFTWARE.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V70.MBThread
{
	public class MBThreadService : ServiceBase
	{
		public MBThreadService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetGroupThreadsAsync(long groupId, long userId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupThreadsAsync(long groupId, long userId, int status, bool subscribed, bool includeAnonymous, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("subscribed", subscribed);
			_parameters.Add("includeAnonymous", includeAnonymous);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupThreadsAsync(long groupId, long userId, long modifiedDate, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("modifiedDate", modifiedDate);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupThreadsAsync(long groupId, long userId, int status, bool subscribed, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("subscribed", subscribed);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetGroupThreadsCountAsync(long groupId, long userId, long modifiedDate, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("modifiedDate", modifiedDate);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupThreadsCountAsync(long groupId, long userId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupThreadsCountAsync(long groupId, long userId, int status, bool subscribed)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("subscribed", subscribed);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupThreadsCountAsync(long groupId, long userId, int status, bool subscribed, bool includeAnonymous)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("status", status);
			_parameters.Add("subscribed", subscribed);
			_parameters.Add("includeAnonymous", includeAnonymous);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-group-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetThreadsCountAsync(long groupId, long categoryId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-threads-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> MoveThreadAsync(long categoryId, long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/move-thread", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveThreadFromTrashAsync(long categoryId, long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryId", categoryId);
			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/move-thread-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveThreadToTrashAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/move-thread-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RestoreThreadFromTrashAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/restore-thread-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> SplitThreadAsync(long messageId, string subject, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("messageId", messageId);
			_parameters.Add("subject", subject);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/mbthread/split-thread", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> LockThreadAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/lock-thread", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnlockThreadAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/unlock-thread", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteThreadAsync(long threadId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("threadId", threadId);

			var _command = new JsonObject()
			{
				{ "/mbthread/delete-thread", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetThreadsAsync(long groupId, long categoryId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/get-threads", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> SearchAsync(long groupId, long creatorUserId, long startDate, long endDate, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long groupId, long creatorUserId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/mbthread/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}