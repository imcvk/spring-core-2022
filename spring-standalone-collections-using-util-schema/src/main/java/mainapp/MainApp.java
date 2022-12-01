package mainapp;

import bean.Student;
import bean.Teacher;
import net.datafaker.Tea;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = context.getBean("student", Student.class);
        student.printStudentDetails();
        Teacher teacher = context.getBean("teacher", Teacher.class);
        teacher.printTeacherDetails();
    }
}
