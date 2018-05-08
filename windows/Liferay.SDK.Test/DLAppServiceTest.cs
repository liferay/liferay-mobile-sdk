//------------------------------------------------------------------------------
// <copyright file="DLAppServiceTest.cs">
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

using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Liferay.SDK.Exceptions;
using Liferay.SDK.Service.V62.DLApp;
using Microsoft.VisualStudio.TestPlatform.UnitTestFramework;

namespace Liferay.SDK.Test
{
	[TestClass]
	public class DLAppServiceTest : TestBase
	{
		private const string FolderName = "test";

		private const string FolderName2 = "test2";

		private const string MimeType = "text/plain";

		private const long ParentFolderId = 0;

		private const string SourceFileName = "test.properties";

		[TestMethod]
		public async Task TestAddFileEntryBytes()
		{
			var service = new DLAppService(this.Session);
			var repositoryId = GroupId;

			var bytes = Encoding.UTF8.GetBytes("Hello");

			var fileEntry = await service.AddFileEntryAsync(repositoryId, ParentFolderId, SourceFileName, MimeType, SourceFileName, string.Empty, string.Empty, bytes, null);

			Assert.AreEqual(SourceFileName, fileEntry.title);

			await service.DeleteFileEntryAsync(fileEntry.fileEntryId);
		}

		[TestMethod]
		public async Task TestAddFileEntryStream()
		{
			var service = new DLAppService(this.Session);
			var repositoryId = GroupId;

			var bytes = Encoding.UTF8.GetBytes("Hello");
			var stream = new MemoryStream(bytes);

			var fileEntry = await service.AddFileEntryAsync(repositoryId, ParentFolderId, SourceFileName, MimeType, SourceFileName, string.Empty, string.Empty, stream, null);

			Assert.AreEqual(SourceFileName, fileEntry.title);

			await service.DeleteFileEntryAsync(fileEntry.fileEntryId);
		}

		[TestMethod]
		public async Task TestAddFolder()
		{
			var service = new DLAppService(this.Session);
			var repositoryId = GroupId;

			var folder = await service.AddFolderAsync(repositoryId, ParentFolderId, FolderName, string.Empty, null);

			Assert.AreEqual(FolderName, folder.name);

			var count = await service.GetFoldersCountAsync(repositoryId, ParentFolderId, 0, false);

			Assert.AreEqual(1, count);

			await this.DeleteFolder();
		}

		[TestMethod]
		public async Task TestAddFoldersBatch()
		{
			var batch = new BatchSession(this.Session);

			var service = new DLAppService(batch);
			var repositoryId = GroupId;

			await service.AddFolderAsync(repositoryId, ParentFolderId, FolderName, string.Empty, null);

			await service.AddFolderAsync(repositoryId, ParentFolderId, FolderName2, string.Empty, null);

			var array = await batch.InvokeAsync();

			Assert.AreEqual(FolderName, array.ElementAt(0).name);
			Assert.AreEqual(FolderName2, array.ElementAt(1).name);

			await this.DeleteFoldersBatch(batch);
		}

		private async Task DeleteFolder()
		{
			var service = new DLAppService(this.Session);
			var repositoryId = GroupId;

			await service.DeleteFolderAsync(repositoryId, ParentFolderId, FolderName);

			try
			{
				await service.GetFolderAsync(repositoryId, ParentFolderId, FolderName);

				Assert.Fail();
			}
			catch (ServerException se)
			{
				Assert.IsTrue(se.Message.StartsWith("No DLFolder exists with the key"));
			}
		}

		private async Task DeleteFoldersBatch(BatchSession batch)
		{
			var service = new DLAppService(batch);
			var repositoryId = GroupId;

			await service.DeleteFolderAsync(repositoryId, ParentFolderId, FolderName);
			await service.DeleteFolderAsync(repositoryId, ParentFolderId, FolderName2);

			var array = await batch.InvokeAsync();

			Assert.AreEqual(2, array.Count());
		}
	}
}