//------------------------------------------------------------------------------
// <copyright file="UnauthenticatedServiceTest.cs">
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
using System.Threading.Tasks;
using Liferay.SDK.Exceptions;
using Liferay.SDK.Service.V62.Group;
using Microsoft.VisualStudio.TestPlatform.UnitTestFramework;

namespace Liferay.SDK.Test
{
	[TestClass]
	public class UnauthenticatedServiceTest : TestBase
	{
		[TestMethod]
		public async Task TestGetUserSitesUnauthenticated()
		{
			var session = new Session(this.Session.Server);

			var service = new GroupService(session);

			try
			{
				await service.GetUserSitesAsync();

				Assert.Fail();
			}
			catch (ServerException se)
			{
				Assert.AreEqual("Authenticated access required", se.Message);
			}
		}
	}
}
