package setter_methods.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import setter_methods.bean.Employee;

public class SetterMethodMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setter-method-config.xml");
        Employee employee = context.getBean(Employee.class, "employee");
        System.out.println(employee);
    }
}
