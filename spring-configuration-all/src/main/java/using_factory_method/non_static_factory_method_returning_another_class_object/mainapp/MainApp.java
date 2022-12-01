package using_factory_method.non_static_factory_method_returning_another_class_object.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_factory_method.non_static_factory_method_returning_another_class_object.bean.Employee4;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("nonstatic_factory_method_returning_another_class_object.xml");
        Employee4 employee4=(Employee4) context.getBean("employee4");
        System.out.println(employee4);
    }
}
