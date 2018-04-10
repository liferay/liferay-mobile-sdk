//------------------------------------------------------------------------------
// <copyright file="ScreensDDLRecordService.cs">
//    Copyright (c) 2014 Andrea Di Giorgi. All rights reserved.
//
//    This library is free software; you can redistribute it and/or modify it
//    under the terms of the GNU Lesser General Public License as published by
//    the Free Software Foundation; either version 2.1 of the License, or (at
//    your option) any later version.
//
//    This library is distributed in the hope that it will be useful, but
//    WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
//    or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
//    License for more details.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/liferay/liferay-mobile-sdk</website>
//------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V70.ScreensDDLRecord
{
	public class ScreensDDLRecordService : ServiceBase
	{
		public ScreensDDLRecordService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetAssetEntriesAsync(long companyId, long groupId, string portletItemName, string locale, int max)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("portletItemName", portletItemName);
			_parameters.Add("locale", locale);
			_parameters.Add("max", max);

			var _command = new JsonObject()
			{
				{ "/screens.screensassetentry/get-asset-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAssetEntriesAsync(JsonObjectWrapper assetEntryQuery, string locale)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "assetEntryQuery", "$languageUtil.getJSONWrapperClassName($parameter.type)", assetEntryQuery);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensassetentry/get-asset-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetAssetEntryAsync(long entryId, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensassetentry/get-asset-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetAssetEntryAsync(string className, long classPK, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensassetentry/get-asset-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommentAsync(long commentId, string body)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commentId", commentId);
			_parameters.Add("body", body);

			var _command = new JsonObject()
			{
				{ "/screens.screenscomment/update-comment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommentAsync(string className, long classPK, string body)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("body", body);

			var _command = new JsonObject()
			{
				{ "/screens.screenscomment/add-comment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommentsAsync(string className, long classPK, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/screens.screenscomment/get-comments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommentsCountAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/screens.screenscomment/get-comments-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetCommentAsync(long commentId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commentId", commentId);

			var _command = new JsonObject()
			{
				{ "/screens.screenscomment/get-comment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetDdlRecordAsync(long ddlRecordId, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordId", ddlRecordId);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetDdlRecordsAsync(long ddlRecordSetId, string locale, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordSetId", ddlRecordSetId);
			_parameters.Add("locale", locale);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-records", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetDdlRecordsAsync(long ddlRecordSetId, long userId, string locale, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordSetId", ddlRecordSetId);
			_parameters.Add("userId", userId);
			_parameters.Add("locale", locale);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-records", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetDdlRecordsCountAsync(long ddlRecordSetId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordSetId", ddlRecordSetId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-records-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetDdlRecordsCountAsync(long ddlRecordSetId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddlRecordSetId", ddlRecordSetId);

			var _command = new JsonObject()
			{
				{ "/screens.screensddlrecord/get-ddl-records-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetDdmStructureVersionAsync(long structureId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("structureId", structureId);

			var _command = new JsonObject()
			{
				{ "/screens.screensddmstructureversion/get-ddm-structure-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<string> GetJournalArticleContentAsync(long groupId, string articleId, long ddmTemplateId, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("articleId", articleId);
			_parameters.Add("ddmTemplateId", ddmTemplateId);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensjournalarticle/get-journal-article-content", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetJournalArticleContentAsync(long classPK, long ddmTemplateId, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("ddmTemplateId", ddmTemplateId);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensjournalarticle/get-journal-article-content", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<string> GetJournalArticleContentAsync(long classPK, string locale)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("locale", locale);

			var _command = new JsonObject()
			{
				{ "/screens.screensjournalarticle/get-journal-article-content", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<dynamic> GetRatingsEntriesAsync(long assetEntryId, int ratingsLength)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetEntryId", assetEntryId);
			_parameters.Add("ratingsLength", ratingsLength);

			var _command = new JsonObject()
			{
				{ "/screens.screensratingsentry/get-ratings-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRatingsEntriesAsync(long classPK, string className, int ratingsLength)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("className", className);
			_parameters.Add("ratingsLength", ratingsLength);

			var _command = new JsonObject()
			{
				{ "/screens.screensratingsentry/get-ratings-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRatingsEntryAsync(long classPK, string className, double score, int ratingsLength)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("className", className);
			_parameters.Add("score", score);
			_parameters.Add("ratingsLength", ratingsLength);

			var _command = new JsonObject()
			{
				{ "/screens.screensratingsentry/update-ratings-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteRatingsEntryAsync(long classPK, string className, int ratingsLength)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classPK", classPK);
			_parameters.Add("className", className);
			_parameters.Add("ratingsLength", ratingsLength);

			var _command = new JsonObject()
			{
				{ "/screens.screensratingsentry/delete-ratings-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}