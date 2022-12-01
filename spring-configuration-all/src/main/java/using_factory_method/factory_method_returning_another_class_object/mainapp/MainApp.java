package using_factory_method.factory_method_returning_another_class_object.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_factory_method.factory_method_returning_another_class_object.bean.Employee3;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("factory_method_returning_another_class_object.xml");
        Employee3 employee3 =context.getBean(Employee3.class);
        System.out.println(employee3);
    }
}
