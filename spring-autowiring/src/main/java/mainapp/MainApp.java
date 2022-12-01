package mainapp;

import entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        User user = null;
         user = applicationContext.getBean("user1", User.class);
        System.out.println(user);
        user = applicationContext.getBean("user2", User.class);
        System.out.println(user);
        user = applicationContext.getBean("user3", User.class);
        System.out.println(user);
    }
}
