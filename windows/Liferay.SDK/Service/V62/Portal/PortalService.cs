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

namespace Liferay.SDK.Service.V62.Portal
{
	public class PortalService : ServiceBase
	{
		public PortalService(ISession session)
			: base(session)
		{
		}

		public async Task<string> GetAutoDeployDirectoryAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/get-auto-deploy-directory", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<long> GetBuildNumberAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/get-build-number", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task TestAddClassNameAndTestTransactionPortletBar_PortalRollbackAsync(string transactionPortletBarText)
		{
			var _parameters = new JsonObject();

			_parameters.Add("transactionPortletBarText", transactionPortletBarText);

			var _command = new JsonObject()
			{
				{ "/portal/test-add-class-name-and-test-transaction-portlet-bar_-portal-rollback", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task TestAddClassNameAndTestTransactionPortletBar_PortletRollbackAsync(string transactionPortletBarText)
		{
			var _parameters = new JsonObject();

			_parameters.Add("transactionPortletBarText", transactionPortletBarText);

			var _command = new JsonObject()
			{
				{ "/portal/test-add-class-name-and-test-transaction-portlet-bar_-portlet-rollback", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task TestAddClassNameAndTestTransactionPortletBar_SuccessAsync(string transactionPortletBarText)
		{
			var _parameters = new JsonObject();

			_parameters.Add("transactionPortletBarText", transactionPortletBarText);

			var _command = new JsonObject()
			{
				{ "/portal/test-add-class-name-and-test-transaction-portlet-bar_-success", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task TestAddClassName_RollbackAsync(string classNameValue)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameValue", classNameValue);

			var _command = new JsonObject()
			{
				{ "/portal/test-add-class-name_-rollback", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task TestAddClassName_SuccessAsync(string classNameValue)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameValue", classNameValue);

			var _command = new JsonObject()
			{
				{ "/portal/test-add-class-name_-success", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task TestAutoSyncHibernateSessionStateOnTxCreationAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/test-auto-sync-hibernate-session-state-on-tx-creation", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task TestDeleteClassNameAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/test-delete-class-name", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> TestGetBuildNumberAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/test-get-build-number", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task TestGetUserIdAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/test-get-user-id", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<bool> TestHasClassNameAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/portal/test-has-class-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}
	}
}