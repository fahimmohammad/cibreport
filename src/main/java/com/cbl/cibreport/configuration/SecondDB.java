package com.cbl.cibreport.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SecondDB {
    @Value("${second.datasource.driverClassName}")
    private String driverClassName;
    @Value("${second.datasource.username}")
    private String username;
    @Value("${second.datasource.password}")
    private String password;
    @Value("${second.datasource.url}")
    private String url;
    @Bean(name = "secondDataSource")
    @ConfigurationProperties(prefix = "second.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().driverClassName(driverClassName)
                .url(url)
                .username(username)
                .password(password)
                .build();
    }
}
