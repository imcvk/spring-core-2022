package constructor.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import constructor.bean.Employee;

public class ConstructorMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-config.xml");
        Employee employee = context.getBean(Employee.class, "employee");
        System.out.println(employee);
    }
}
