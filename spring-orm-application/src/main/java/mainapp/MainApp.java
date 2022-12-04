package mainapp;

import dao.UserDAO;
import entities.User;
import fakedatasource.FakeDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        UserDAO userDAO = context.getBean(UserDAO.class);
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(userDAO);
        User user = fakeDataSource.getDummyUser();

        Scanner sc = new Scanner(System.in);
        boolean active = true;
        while (active) {
            System.out.println("Choose operation.");
            int option;
            System.out.println("1.Add   2.Delete    3.Update    4.Show  5.Show all  6.Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add operation");
                    userDAO.insert(user);
                    break;
                case 2:
                    System.out.println("Delete operation");
                    System.out.println("Enter user id to delete:");
                    int userid = sc.nextInt();
                    userDAO.delete(userid);
                    break;
                case 3:
                    System.out.println("Update operation");
                    System.out.println("Enter userid to update:");
                    int userId = sc.nextInt();
                    User user1 = fakeDataSource.getDummyUser();
                    user1.setUserId(userId);
                    userDAO.updateUser(user1);
                    break;
                case 4:
                    System.out.println("Enter userid to fetch:");
                    int id = sc.nextInt();
                    System.out.println(userDAO.getUser(id));
                    break;
                case 5:
                    System.out.println("Show all operation");
                    List<User> users = userDAO.getAllUser();
                    users.stream().forEach(System.out::println);
                    break;
                case 6:
                    active = false;
                    System.out.println("Exiting application");
                    break;
            }

        }
    }
}
