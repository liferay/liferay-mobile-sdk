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

package com.liferay.mobile.sdk.java;

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Path;
import com.liferay.mobile.sdk.BaseBuilder;
import com.liferay.mobile.sdk.http.Action;
import com.liferay.mobile.sdk.http.Discovery;
import com.liferay.mobile.sdk.http.Parameter;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.liferay.mobile.android.v2.Param;

import java.util.List;

import javax.lang.model.element.Modifier;

/**
 * @author Bruno Farache
 */
public class JavaBuilder extends BaseBuilder {

	@Override
	public void build(
			Discovery discovery, List<Action> actions, String packageName,
			int version, String filter, String destination)
		throws Exception {

		JavaUtil util = new JavaUtil();

		AnnotationSpec servicePathAnnotation = AnnotationSpec
			.builder(Path.class)
			.addMember("value", "$S", "/" + filter)
			.build();

		TypeSpec.Builder service = TypeSpec
			.interfaceBuilder(util.getServiceClassName(filter))
			.addModifiers(Modifier.PUBLIC)
			.addAnnotation(servicePathAnnotation);

		for (Action action : actions) {
			String path = action.getPath();
			String methodName = util.getMethodName(path);
			path = path.substring(path.lastIndexOf("/"));

			AnnotationSpec methodPathAnnotation = AnnotationSpec
				.builder(Path.class)
				.addMember("value", "$S", path)
				.build();

			TypeName returnType = ParameterizedTypeName.get(
				Call.class, util.returnType(action.getResponse()));

			MethodSpec.Builder method = MethodSpec.methodBuilder(methodName)
				.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
				.addAnnotation(methodPathAnnotation)
				.returns(returnType);

			for (Parameter parameter : action.getParameters()) {
				String parameterName = parameter.getName();

				AnnotationSpec parameterAnnotation = AnnotationSpec
					.builder(Param.class)
					.addMember("value", "$S", parameterName)
					.build();

				ParameterSpec param = ParameterSpec
					.builder(util.type(parameter.getType()), parameterName)
					.addAnnotation(parameterAnnotation)
					.build();

				method.addParameter(param);
			}

			service.addMethod(method.build());
		}

		JavaFile file = JavaFile.builder("com.liferay.mobile", service.build())
			.build();

		String output = file.toString();
		System.out.println(output);
	}

}