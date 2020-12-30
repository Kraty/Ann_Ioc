package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 一个配置类，作用与xml相同
 * spring中的新注解
 * Configuration
 * 作用：指定当前类为一个配置类
 * Component-scan
 * 作用：指定spring创建容器时要扫描的包
 * Bean
 * 把当前方法的返回值作为bean对象存入spring容器中
 */

@Configuration
@ComponentScan(basePackages = "com.waq")
public class SpringConfiguration {

    @Bean(name = "runner")
    @Scope(scopeName = "prototype")
    public QueryRunner createQueryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    @Bean("dataSource")
    public DataSource createDataSource() throws PropertyVetoException {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/eesy?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("789,,wang");
        return dataSource;

    }

}
