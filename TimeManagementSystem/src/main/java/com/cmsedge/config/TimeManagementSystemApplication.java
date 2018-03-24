package com.cmsedge.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan("com.cmsedge")
@EnableWebMvc
@EnableAutoConfiguration(exclude = { //
		DataSourceAutoConfiguration.class, //
		DataSourceTransactionManagerAutoConfiguration.class, //
		HibernateJpaAutoConfiguration.class })
public class TimeManagementSystemApplication extends WebMvcConfigurerAdapter {
	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "true");
		SpringApplication.run(TimeManagementSystemApplication.class, args);
		System.out.println("Boot Program started.....");
	}
	//MVC Configuration
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	//Hibernate Configuration
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("spring.datasource.driver-class-name"));
		dataSource.setUrl(environment.getRequiredProperty("spring.datasource.url"));
		dataSource.setUsername(environment.getRequiredProperty("spring.datasource.username"));
		dataSource.setPassword(environment.getRequiredProperty("spring.datasource.password"));
		return dataSource;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) throws Exception {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getProperty("spring.jpa.properties.hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getProperty("spring.jpa.show-sql"));
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setPackagesToScan(new String[] { "com.cmsedge.model" });
		factoryBean.setDataSource(dataSource);
		factoryBean.setHibernateProperties(properties);
		factoryBean.afterPropertiesSet();
		return factoryBean.getObject();
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
}
