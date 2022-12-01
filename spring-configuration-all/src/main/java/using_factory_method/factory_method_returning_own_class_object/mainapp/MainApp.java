package using_factory_method.factory_method_returning_own_class_object.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_factory_method.factory_method_returning_own_class_object.bean.Employee2;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("factory_method_returning_own_class_object.xml");
        Employee2 employee2=context.getBean(Employee2.class);
        System.out.println(employee2);
    }
}
