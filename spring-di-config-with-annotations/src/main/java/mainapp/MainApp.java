package mainapp;

import bean.Student;
import configuration.BeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Student student=context.getBean(Student.class);
        System.out.println(student);
    }
}
