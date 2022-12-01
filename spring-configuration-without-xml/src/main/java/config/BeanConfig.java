package config;

import entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "entities")
public class BeanConfig {

    @Bean(value = "student")
    public static Student getStudent() {
        return new Student(891151, "Ramesh", "ramesh@gmail.com", "Pune", "MH", "India");

    }
}
