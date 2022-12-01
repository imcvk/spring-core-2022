package configuration;

import bean.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "bean")
public class BeanConfiguration {

    @Bean
    public Address getAddress() {
        return new Address();
    }
}
