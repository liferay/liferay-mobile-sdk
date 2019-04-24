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

namespace Liferay.SDK.Service.V72.Commentmanagerjsonws
{
	public class CommentmanagerjsonwsService : ServiceBase
	{
		public CommentmanagerjsonwsService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteCommentAsync(long commentId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commentId", commentId);

			var _command = new JsonObject()
			{
				{ "/comment.commentmanagerjsonws/delete-comment", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetCommentsCountAsync(long groupId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/comment.commentmanagerjsonws/get-comments-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<bool> HasDiscussionAsync(long groupId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/comment.commentmanagerjsonws/has-discussion", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task SubscribeDiscussionAsync(long groupId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/comment.commentmanagerjsonws/subscribe-discussion", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeDiscussionAsync(long groupId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/comment.commentmanagerjsonws/unsubscribe-discussion", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> UpdateCommentAsync(string className, long classPK, long commentId, string subject, string body)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("commentId", commentId);
			_parameters.Add("subject", subject);
			_parameters.Add("body", body);

			var _command = new JsonObject()
			{
				{ "/comment.commentmanagerjsonws/update-comment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> AddCommentAsync(long groupId, string className, long classPK, string body)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("body", body);

			var _command = new JsonObject()
			{
				{ "/comment.commentmanagerjsonws/add-comment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommentsAsync(long groupId, string className, long classPK, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/comment.commentmanagerjsonws/get-comments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommentsAsync(long commentId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commentId", commentId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/comment.commentmanagerjsonws/get-comments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}