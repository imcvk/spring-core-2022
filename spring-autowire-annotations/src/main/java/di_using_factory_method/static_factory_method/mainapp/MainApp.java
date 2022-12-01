package di_using_factory_method.static_factory_method.mainapp;

import di_using_factory_method.static_factory_method.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("staticFactoryMethod-config.xml");
        User user = context.getBean(User.class, "user");
        user.userMessage();
    }
}
