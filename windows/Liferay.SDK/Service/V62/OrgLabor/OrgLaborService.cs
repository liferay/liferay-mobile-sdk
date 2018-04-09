//------------------------------------------------------------------------------
// <copyright file="OrgLaborService.cs">
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

namespace Liferay.SDK.Service.V62.OrgLabor
{
	public class OrgLaborService : ServiceBase
	{
		public OrgLaborService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddOrgLaborAsync(long organizationId, int typeId, int sunOpen, int sunClose, int monOpen, int monClose, int tueOpen, int tueClose, int wedOpen, int wedClose, int thuOpen, int thuClose, int friOpen, int friClose, int satOpen, int satClose)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("typeId", typeId);
			_parameters.Add("sunOpen", sunOpen);
			_parameters.Add("sunClose", sunClose);
			_parameters.Add("monOpen", monOpen);
			_parameters.Add("monClose", monClose);
			_parameters.Add("tueOpen", tueOpen);
			_parameters.Add("tueClose", tueClose);
			_parameters.Add("wedOpen", wedOpen);
			_parameters.Add("wedClose", wedClose);
			_parameters.Add("thuOpen", thuOpen);
			_parameters.Add("thuClose", thuClose);
			_parameters.Add("friOpen", friOpen);
			_parameters.Add("friClose", friClose);
			_parameters.Add("satOpen", satOpen);
			_parameters.Add("satClose", satClose);

			var _command = new JsonObject()
			{
				{ "/orglabor/add-org-labor", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteOrgLaborAsync(long orgLaborId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("orgLaborId", orgLaborId);

			var _command = new JsonObject()
			{
				{ "/orglabor/delete-org-labor", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetOrgLaborAsync(long orgLaborId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("orgLaborId", orgLaborId);

			var _command = new JsonObject()
			{
				{ "/orglabor/get-org-labor", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetOrgLaborsAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/orglabor/get-org-labors", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateOrgLaborAsync(long orgLaborId, int typeId, int sunOpen, int sunClose, int monOpen, int monClose, int tueOpen, int tueClose, int wedOpen, int wedClose, int thuOpen, int thuClose, int friOpen, int friClose, int satOpen, int satClose)
		{
			var _parameters = new JsonObject();

			_parameters.Add("orgLaborId", orgLaborId);
			_parameters.Add("typeId", typeId);
			_parameters.Add("sunOpen", sunOpen);
			_parameters.Add("sunClose", sunClose);
			_parameters.Add("monOpen", monOpen);
			_parameters.Add("monClose", monClose);
			_parameters.Add("tueOpen", tueOpen);
			_parameters.Add("tueClose", tueClose);
			_parameters.Add("wedOpen", wedOpen);
			_parameters.Add("wedClose", wedClose);
			_parameters.Add("thuOpen", thuOpen);
			_parameters.Add("thuClose", thuClose);
			_parameters.Add("friOpen", friOpen);
			_parameters.Add("friClose", friClose);
			_parameters.Add("satOpen", satOpen);
			_parameters.Add("satClose", satClose);

			var _command = new JsonObject()
			{
				{ "/orglabor/update-org-labor", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}