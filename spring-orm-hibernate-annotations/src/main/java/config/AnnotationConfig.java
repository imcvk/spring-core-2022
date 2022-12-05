package config;

import com.github.javafaker.Faker;
import dao.StudentDAO;
import entities.Student;
import fakedatasource.FakeDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"dao", "entities", "fakedatasource"})
@EnableTransactionManagement
public class AnnotationConfig {
    @Bean(name = "fakeDataSource")
    public FakeDataSource getFakeDataSource() {
        return new FakeDataSource(new Faker());
    }

    @Bean(name = "datasource")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springdemo");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    public Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL55Dialect");
        properties.put("hibernate.show_sql", true);
        properties.put("hibernate.hbm2ddl.auto", "update");
        return properties;
    }

    @Bean
    public LocalSessionFactoryBean getLocalSessionFactoryBean() {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(getDataSource());
        localSessionFactoryBean.setAnnotatedClasses(Student.class);
        localSessionFactoryBean.setHibernateProperties(getHibernateProperties());
       // localSessionFactoryBean.setAnnotatedPackages("dao");
        return localSessionFactoryBean;
    }

    @Bean
    public HibernateTemplate getHibernateTemplate() {
        HibernateTemplate hibernateTemplate = new HibernateTemplate();
        hibernateTemplate.setSessionFactory(getLocalSessionFactoryBean().getObject());
        return hibernateTemplate;
    }

    @Bean
    public StudentDAO getStudentDao() {
        return new StudentDAO(getHibernateTemplate());
    }

    @Bean
    public HibernateTransactionManager getHibernateTransactionManager() {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(getLocalSessionFactoryBean().getObject());
        return hibernateTransactionManager;
    }
}

