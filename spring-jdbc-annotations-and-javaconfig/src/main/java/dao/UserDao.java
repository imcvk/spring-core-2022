package dao;

import entities.User;

import java.util.List;

public interface UserDao {
     int insert(User user);

     int delete(int userId);

     int update(User userId);

     List<User> getAllUsers();

}
