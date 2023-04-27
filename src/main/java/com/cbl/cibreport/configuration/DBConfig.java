package com.cbl.cibreport.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DBConfig {
    @Bean(name = "firstDataSource")
    @ConfigurationProperties("spring.firstdatasource")
    @Primary
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondDatasource")
    @ConfigurationProperties("spring.seconddatasource")
    public DataSource dataSource2(){
        return DataSourceBuilder.create().build();
    }
}
