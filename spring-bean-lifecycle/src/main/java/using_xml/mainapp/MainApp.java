package using_xml.mainapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_xml.beans.User;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("using_xml_config.xml");
        User user = context.getBean(User.class, "User");
        System.out.println(user);
        context.close();
    }
}
