package com.chl.boot.datasource.config;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/4/1 22:27
 */
@Configuration
@MapperScan(basePackages = "com.ycshang.boot.datasource.mapper.secondary",
        sqlSessionTemplateRef = "secondarySqlSessionTemplate")
public class SecondaryDataSourceConfig {

    @Bean(name = "secondaryDataSource")
    //@ConfigurationProperties(prefix = "spring.datasource.secondary")
    @ConfigurationProperties(prefix = "secondarydb")
    public DataSource secondaryDataSource() {
        return new AtomikosDataSourceBean();
        //return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondarySqlSessionFactory")
    public SqlSessionFactory secondarySqlSessionFactory(
            @Qualifier("secondaryDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //设置XML文件存放位置
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapper/secondary/*.xml"));
        return bean.getObject();
    }

    //@Bean(name = "secondaryTransactionManager")
    //public DataSourceTransactionManager secondaryTransactionManager(
    //        @Qualifier("secondaryDataSource") DataSource dataSource) {
    //    return new DataSourceTransactionManager(dataSource);
    //}

    @Bean(name = "secondarySqlSessionTemplate")
    public SqlSessionTemplate secondarySqlSessionTemplate(
            @Qualifier("secondarySqlSessionFactory") SqlSessionFactory sqlSessionFactory)
            throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}