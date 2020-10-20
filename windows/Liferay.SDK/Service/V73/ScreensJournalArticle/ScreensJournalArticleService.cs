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

namespace Liferay.SDK.Service.V73.ScreensJournalArticle
{
	public class ScreensJournalArticleService : ServiceBase
	{
		public ScreensJournalArticleService(ISession session)
			: base(session)
		{
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
	}
}