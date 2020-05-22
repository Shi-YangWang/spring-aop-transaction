package com.bunny.aop;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;

@Configuration
public class TransactionManagerConfig {

    @Autowired
    private DruidDataSource dataSource;

    @Bean
    public TransactionManager getTx() {
        return new DataSourceTransactionManager(dataSource);
    }
}
