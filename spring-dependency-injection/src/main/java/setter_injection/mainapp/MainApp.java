package setter_injection.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import setter_injection.beans.User;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setter_injection.xml");
        User user = applicationContext.getBean(User.class, "user");
        System.out.println("In setter injection");
        System.out.println(user);
    }
}
