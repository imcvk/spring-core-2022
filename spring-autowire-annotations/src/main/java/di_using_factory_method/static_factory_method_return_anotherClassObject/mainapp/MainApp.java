package di_using_factory_method.static_factory_method_return_anotherClassObject.mainapp;

import di_using_factory_method.static_factory_method_return_anotherClassObject.bean.PrintData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("staticFactoryMethod-config.xml");
        PrintData printData = context.getBean(PrintData.class, "user");
        printData.print();
    }
}
