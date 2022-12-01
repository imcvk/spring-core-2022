package main;

import entities.Student;
import config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        Student student=context.getBean(Student.class);
        System.out.println(student);
        student.study();
        student.printStudentDetails();
    }
}
