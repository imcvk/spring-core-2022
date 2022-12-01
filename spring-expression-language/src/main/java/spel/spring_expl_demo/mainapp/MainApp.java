package spel.spring_expl_demo.mainapp;

import spel.spring_expl_demo.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student=context.getBean(Student.class,"student");
        System.out.println(student);
    }
}
