package com.jpa.manytomany.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.jpa.manytomany.repository")
public class PgDbConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource postgresqlDataSource() {
		return DataSourceBuilder.create().build();
	}

}
