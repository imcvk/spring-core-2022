package mainapp;

import entities.User;
import fakedatasource.FakeDataSource;
import jdbc.dao.UserDAOImplUsingJdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Using_JdbcTemplate {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-demo-config.xml");
        UserDAOImplUsingJdbcTemplate userDAO = context.getBean(UserDAOImplUsingJdbcTemplate.class);
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        User user = fakeDataSource.constructUserObject();
        Scanner sc = new Scanner(System.in);

        userDAO.insert(fakeDataSource.constructUserObject());
//        int userid = sc.nextInt();
//        user.setUserId(userid);
//        userDAO.update(user);
//        userDAO.delete(userid);
        //      System.out.println(userDAO.getUser(79098));
        userDAO.getAllUsers().stream().forEach(System.out::println);
    }
}
