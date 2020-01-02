package com.tutorial.jpa.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.tutorial.jpa.repository.secondary")
public class MysqlDbConfig {

	@Bean(name="secondary")
	@ConfigurationProperties(prefix = "spring.booking.datasource")
	public DataSource mysqlDataSource() {
		return DataSourceBuilder.create().build();
	}

}
