package config;

import org.springframework.context.annotation.*;

/**
 * 一个配置类，作用与xml相同
 * spring中的新注解
 * Configuration
 * 作用：指定当前类为一个配置类
 * Component-scan
 * 作用：指定spring创建容器时要扫描的包
 * Bean
 * 作用：把当前方法的返回值作为bean对象存入spring容器中
 * Import
 * 作用：导入其他的配置类
 * PropertySource
 * 作用：用于指定properties文件的位置
 */

@Configuration
@ComponentScan(basePackages = "com.waq")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {
}
