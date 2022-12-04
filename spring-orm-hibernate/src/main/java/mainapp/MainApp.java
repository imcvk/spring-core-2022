package mainapp;

import dao.StudentDAO;
import entities.Student;
import fakedatasource.FakeDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDAO studentDAO = context.getBean("studentdao", StudentDAO.class);
        FakeDataSource fakeDataSource = (FakeDataSource) context.getBean("fakeDataSource");

        System.out.println("1.Add 2.Delete 3.Update 4.Read 5.Read All");

        while (true) {
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
                        for (Student s : students) {
                            System.out.println(s);
                        }
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
                        Student s=fakeDataSource.getRandomStudent();
                        System.out.println("Enter student details to Update");
                        System.out.println("Enter ID:");
                        int idStud = sc.nextInt();
                        System.out.println("Enter Name:");
                        String namestud = sc.next();
                        System.out.println("Enter City:");
                        String cityStud = sc.next();
                        s.setId(idStud);
                        s.setName(namestud);
                        studentDAO.update(s);
                        break;
                    case 6:
                        break;
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}