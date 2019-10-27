package com.pereirafrederic.retroshare.config;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfig {

	@Autowired
	private DataSource dataSource;

	@Bean
	Flyway flyway() {

		Flyway flyway = Flyway.configure().baselineOnMigrate(true)
				.dataSource(dataSource).load();
		flyway.migrate();

		return flyway;
	}
}