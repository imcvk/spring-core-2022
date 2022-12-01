package qualifier.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qualifier.bean.Employee;

public class SetterMethodMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("qualifier-config.xml");
        Employee employee = context.getBean(Employee.class, "employee");
        System.out.println(employee);
    }
}
