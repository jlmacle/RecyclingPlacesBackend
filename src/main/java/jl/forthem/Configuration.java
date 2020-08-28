package jl.forthem;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("org.postgresql.Driver");
		dataSourceBuilder.url(System.getenv("DB_URL"));
		dataSourceBuilder.password(System.getenv("DB_PASSWORD"));
		dataSourceBuilder.username(System.getenv("DB_USERNAME"));
		return dataSourceBuilder.build();
		
	}
	
	

}
