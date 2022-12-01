package using_xml_autowire_annotation.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_xml_autowire_annotation.bean.Employee1;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("using_xml_autowire_annotation.xml");
        Employee1 e=context.getBean(Employee1.class,"employee1");
        System.out.println(e);
    }
}
