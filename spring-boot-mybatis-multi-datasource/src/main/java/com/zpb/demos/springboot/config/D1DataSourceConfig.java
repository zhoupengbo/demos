package com.zpb.demos.springboot.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.config
 * @Description:
 * @date 2020/7/4 17:19
 */
@Configuration
@MapperScan(basePackages = "com.zpb.demos.springboot.dao.d1", sqlSessionTemplateRef = "d1SqlSessionTemplate")
public class D1DataSourceConfig {

    /**
     * 生成数据源.  @Primary 注解声明为默认数据源
     */
    @Bean(name = "d1DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.d1")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 创建 SqlSessionFactory
     */
    @Bean(name = "d1SqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("d1DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //  bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/d1/*.xml"));
        return bean.getObject();
    }

    /**
     * 配置事务管理
     */
    @Bean(name = "d1TransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("d1DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "d1SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("d1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
