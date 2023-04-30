package com.cbl.cibreport.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class FirstDB {
        @Value("${spring.datasource.driverClassName}")
        private String driverClassName;
        @Value("${spring.datasource.username}")
        private String username;
        @Value("${spring.datasource.password}")
        private String password;
        @Value("${spring.datasource.url}")
        private String url;
        @Bean(name = "firstDataSource")
        @Primary
        @ConfigurationProperties(prefix = "spring.datasource")
        public DataSource dataSource() {
            return DataSourceBuilder.create().driverClassName(driverClassName)
                    .url(url)
                    .username(username)
                    .password(password)
                    .build();
        }
}
