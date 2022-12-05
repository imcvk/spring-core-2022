package mainapp;

import config.AnnotationConfig;
import dao.StudentDAO;
import entities.Student;
import fakedatasource.FakeDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        StudentDAO studentDAO = context.getBean(StudentDAO.class);
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);

        boolean active = true;
        while (active) {
            System.out.println(
                    "1: Insert" + " " +
                            "2:Display All" + " " +
                            "3:Display Single" + " " +
                            "4:Delete" + " " +
                            "5:Update" + " " +
                            "6:Exit"
            );
            try {
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1://insert
                        int r = studentDAO.insert(fakeDataSource.getRandomStudent());
                        System.out.println("Inserted...");
                        break;
                    case 2://Display All
                        List<Student> students = studentDAO.getAllStudents();
                        students.stream().forEach(System.out::println);
                        break;
                    case 3://Display single
                        System.out.println("Enter id to display student");
                        int id = sc.nextInt();
                        Student student = studentDAO.getStudent(id);
                        System.out.println(student);
                        break;
                    case 4://delete
                        System.out.println("Enter id to delete student");
                        int idTODelete = sc.nextInt();
                        studentDAO.delete(idTODelete);
                        break;
                    case 5:
                        System.out.println("Update operation");
                        System.out.println("Enter userid to update:");
                        int userId = sc.nextInt();
                        Student student1 = fakeDataSource.getRandomStudent();
                        student1.setId(userId);
                        studentDAO.update(student1);
                        break;
                    case 6:
                        active = false;
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}