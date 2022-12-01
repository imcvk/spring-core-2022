package using_only_xml.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_only_xml.bean.Employee;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("xmlConfig.xml");
        Employee e=context.getBean(Employee.class,"employee");
        System.out.println(e);
    }
}
