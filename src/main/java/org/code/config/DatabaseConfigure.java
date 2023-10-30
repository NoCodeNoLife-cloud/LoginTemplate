package org.code.config;
// Copyright (c) 2023, NoCodeNoLife-cloud. All rights reserved.
// Author: nightCrawler ( NoCodeNoLife )
// Created: 2023/10/28 00:39

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * DatabaseConfigure class is used to configure the database.
 * <p>
 * It provides a Bean for creating and configuring data sources.
 * @author admin
 */
@Slf4j
@Configuration
public class DatabaseConfigure {


	/**
	 * The dataSource method is used to create a new data source.
	 * It uses PooledDataSource to create a new data source that is connected to a local MySQL database.
	 * @return Returnsa new PooledDataSource object.
	 */
	@Bean
	public DataSource dataSource() {
		return new PooledDataSource("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/test", "root", "123456");// This is the database used for spring security
	}
}
