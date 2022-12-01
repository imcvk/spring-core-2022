package mainapp;

import config.Config;
import dao.UserDAOImplUsingJdbcTemplate;
import entities.User;
import fakedatasource.FakeDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        UserDAOImplUsingJdbcTemplate userDAOImplUsingJdbcTemplate = context.getBean(UserDAOImplUsingJdbcTemplate.class);
        User user = fakeDataSource.constructUserObject();
        userDAOImplUsingJdbcTemplate.insert(user);
    }
}
