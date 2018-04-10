/**
 * Copyright (c) 2014-present Andrea Di Giorgi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.mobile.sdk.windows;

import com.liferay.mobile.sdk.BaseBuilder;
import com.liferay.mobile.sdk.http.Action;
import com.liferay.mobile.sdk.http.Discovery;
import com.liferay.mobile.sdk.util.CharPool;
import com.liferay.mobile.sdk.util.LanguageUtil;
import com.liferay.mobile.sdk.util.Validator;
import com.liferay.mobile.sdk.velocity.VelocityUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.tools.generic.EscapeTool;

/**
 * @author Andrea Di Giorgi
 */
public class WindowsSDKBuilder extends BaseBuilder {

	@Override
	public void build(
			Discovery discovery, List<Action> actions, String packageName,
			int version, String filter, String destination)
			throws Exception {

		copyResource("windows", destination);
		generateService(
				discovery, actions, packageName, version, filter, destination);
	}

	protected void copyJarResource(
			JarURLConnection jarConnection, File destinationDir)
			throws IOException {

		String jarConnectionEntryName = jarConnection.getEntryName();
		JarFile jarFile = jarConnection.getJarFile();

		Enumeration<JarEntry> enu = jarFile.entries();

		while (enu.hasMoreElements()) {
			JarEntry jarEntry = enu.nextElement();
			String jarEntryName = jarEntry.getName();

			if (jarEntryName.startsWith(jarConnectionEntryName)) {
				String fileName = jarEntryName;

				if (fileName.startsWith(jarConnectionEntryName)) {
					fileName = fileName.substring(
							jarConnectionEntryName.length());
				}

				File file = new File(destinationDir, fileName);

				if (jarEntry.isDirectory()) {
					file.mkdirs();
				}
				else {
					InputStream is = null;

					try {
						is = jarFile.getInputStream(jarEntry);

						FileUtils.copyInputStreamToFile(is, file);
					}
					finally {
						IOUtils.closeQuietly(is);
					}
				}
			}
		}
	}

	protected void copyResource(String name, String destination)
			throws IOException {

		File destinationDir = new File(destination);

		destinationDir = destinationDir.getAbsoluteFile();

		URL sourceURL = getClass().getResource(CharPool.SLASH + name);
		URLConnection sourceConnection = sourceURL.openConnection();

		if (sourceConnection instanceof JarURLConnection) {
			copyJarResource((JarURLConnection)sourceConnection, destinationDir);
		}
		else {
			File sourceDir = new File(sourceURL.getPath());

			FileUtils.copyDirectory(sourceDir, destinationDir);
		}

		Iterator<File> itr = FileUtils.iterateFiles(
				destinationDir, new String[] {"copy"}, true);

		while (itr.hasNext()) {
			File file = itr.next();

			String cleanPath = FilenameUtils.removeExtension(
					file.getAbsolutePath());

			File cleanFile = new File(cleanPath);

			if (!cleanFile.exists()) {
				FileUtils.moveFile(file, new File(cleanPath));
			}
			else {
				file.delete();
			}
		}
	}

	protected void generateService(
			Discovery discovery, List<Action> actions, String packageName,
			int version, String filter, String destination)
			throws Exception {

		StringBuilder sb = new StringBuilder();

		if (Validator.isNotNull(destination)) {
			sb.append(destination);

			if (!destination.endsWith("/")) {
				sb.append(CharPool.SLASH);
			}
		}

		sb.append("Liferay.SDK/Service");
		destination = sb.toString();

		packageName = "Liferay.SDK.Service";

		VelocityContext context = getVelocityContext(
				discovery, actions, packageName, version, filter);

		String templatePath = "templates/windows/service.vm";
		String filePath = getServiceFilePath(
				context, version, destination, filter);

		VelocityUtil.generate(context, templatePath, filePath, true);
	}

	protected String getServiceFilePath(
			VelocityContext context, int version, String destination,
			String filter) {

		String className = (String)context.get(CLASS_NAME);
		CSharpUtil cSharpUtil = (CSharpUtil)context.get(LANGUAGE_UTIL);

		StringBuilder sb = new StringBuilder();

		sb.append(destination);
		sb.append("/V");
		sb.append(version);
		sb.append(CharPool.SLASH);
		sb.append(cSharpUtil.getServicePackageName(filter));
		sb.append(CharPool.SLASH);

		File file = new File(sb.toString());
		file.mkdirs();

		sb.append(className);
		sb.append(".cs");

		return sb.toString();
	}

	protected VelocityContext getVelocityContext(
			Discovery discovery, List<Action> actions, String packageName,
			int version, String filter) {

		VelocityContext context = new VelocityContext();

		CSharpUtil cSharpUtil = new CSharpUtil();

		StringBuilder sb = new StringBuilder(packageName);

		sb.append(".V");
		sb.append(version);
		sb.append(CharPool.PERIOD);
		sb.append(cSharpUtil.getServicePackageName(filter));

		packageName = sb.toString();

		context.put(CLASS_NAME, cSharpUtil.getServiceClassName(filter));
		context.put(DISCOVERY, discovery);
		context.put(ACTIONS, actions);
		context.put(ESCAPE_TOOL, new EscapeTool());
		context.put(JSON_OBJECT_WRAPPER, CSharpUtil.JSON_OBJECT_WRAPPER);
		context.put(LANGUAGE_UTIL, cSharpUtil);
		context.put(PACKAGE, packageName);
		context.put(STREAM, CSharpUtil.STREAM);
		context.put(VOID, LanguageUtil.VOID);

		return context;
	}

	protected static final String PACKAGE = "package";

	protected static final String STREAM = "STREAM";

}