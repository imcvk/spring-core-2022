package using_programmatic_approach.mainapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_programmatic_approach.beans.User2;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User2 user = context.getBean(User2.class, "User2");
        System.out.println(user);
        context.close();
    }
}
