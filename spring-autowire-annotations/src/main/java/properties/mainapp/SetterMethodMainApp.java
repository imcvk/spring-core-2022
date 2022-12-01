package properties.mainapp;

import properties.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMethodMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("properties-injection-config.xml");
        Employee employee = context.getBean(Employee.class, "employee");
        System.out.println(employee);
    }
}
