package using_annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import using_annotations.bean.Address;
import using_annotations.bean.Employee5;

@Configuration
@ComponentScan("using_annotations.bean")
public class BeanConfig {
    @Bean
    public static Employee5 getEmployee5() {
        return new Employee5();
    }

    @Bean
    public Address getAddress() {
        return new Address("Pune", "MH", "IND");
    }
}

