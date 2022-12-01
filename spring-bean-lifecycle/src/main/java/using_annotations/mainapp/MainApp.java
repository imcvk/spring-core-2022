package using_annotations.mainapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_annotations.beans.User3;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleUsingAnnotations_config.xml");
        User3 user3 = context.getBean(User3.class, "user3");
        System.out.println(user3);
        context.close();
    }
}
