package config;

import com.github.javafaker.Faker;
import dao.UserDAOImplUsingJdbcTemplate;

import fakedatasource.FakeDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"entities", "fakedatasource"})
public class Config {

    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springdemo");
        return dataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public FakeDataSource getFakeDataSource() {
        return new FakeDataSource(new Faker());
    }

    @Bean
    public UserDAOImplUsingJdbcTemplate getUserDAOImplUsingJdbcTemplate() {
        UserDAOImplUsingJdbcTemplate userDAOImplUsingJdbcTemplate = new UserDAOImplUsingJdbcTemplate();
        userDAOImplUsingJdbcTemplate.setJdbcTemplate(getJdbcTemplate());
        return userDAOImplUsingJdbcTemplate;
    }
}
