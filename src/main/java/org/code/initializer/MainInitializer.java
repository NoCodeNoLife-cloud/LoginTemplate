package org.code.initializer;
// Copyright (c) 2023, NoCodeNoLife-cloud. All rights reserved.
// Author: nightCrawler ( NoCodeNoLife )
// Created: 2023/10/27 22:12

import lombok.extern.slf4j.Slf4j;
import org.code.config.SecurityConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * MainInitializer
 * @author admin
 */
@Slf4j
public class MainInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{SecurityConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[0];
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
