package com.itheima.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.password}")
    private String password;

    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner getRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    @Bean(name = "dataSource")
    public DataSource getDa(){
        try {
            ComboPooledDataSource cpd = new ComboPooledDataSource();
            System.out.println(driver);
            cpd.setDriverClass(driver);

            System.out.println(url);
            cpd.setJdbcUrl(url);

            System.out.println(user);
            cpd.setUser(user);

            System.out.println(password);
            cpd.setPassword(password);
            return  cpd;
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }
    }
}
