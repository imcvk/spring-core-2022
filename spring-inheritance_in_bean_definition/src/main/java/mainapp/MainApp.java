package mainapp;

import entities.License;
import entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        User user = applicationContext.getBean(User.class, "user");
        License license = applicationContext.getBean(License.class, "license");
        System.out.println(user);
        System.out.println(license);
    }
}
