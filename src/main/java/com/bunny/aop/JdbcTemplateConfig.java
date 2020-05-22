package com.bunny.aop;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcTemplateConfig {

    @Autowired
    private DruidDataSource source;

    @Bean
    public JdbcTemplate getTemplate() {
        return new JdbcTemplate(source);
    }
}
