package mainapp;

import dao.UserDAO;
import entities.User;
import fakedatasource.FakeDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        UserDAO userDAO = context.getBean(UserDAO.class);
       // FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
userDAO.insert(new User(45454,"abc","Pune"));
    }
}
