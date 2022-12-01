package constructor_injection.mainapp;

import constructor_injection.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("constructor_injection.xml");
        User user=applicationContext.getBean(User.class,"user");
        System.out.println(user);
    }
}
