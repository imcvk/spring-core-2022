package jdbc.dao;

import entities.User;
import lombok.Data;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Data
public class UserDAOImplUsingJdbcTemplate implements UserDao {
    JdbcTemplate jdbcTemplate;
    private String INSERTER = "INSERT INTO USER(USERID,USERNAME,FIRSTNAME,LASTNAME,EMAILID,CITY,STATE,COUNTRY) VALUES(?,?,?,?,?,?,?,?)";
    private String UPDATER = "UPDATE USER SET USERNAME=?,FIRSTNAME=?,LASTNAME=?,EMAILID=?,CITY=?,STATE=?,COUNTRY=? WHERE USERID =?";
    private String DELETER = "DELETE FROM USER WHERE USERID=?";
    private String SELECT = "SELECT * FROM USER WHERE USERID=?";
    private String MULTISELECT = "SELECT * FROM USER";

    public int insert(User user) {
        return jdbcTemplate.update(INSERTER, user.getUserId(), user.getUserName(),
                user.getFirstName(), user.getLastName(), user.getEmailID(), user.getCity(), user.getState(), user.getCountry());
    }

    @Override
    public int delete(int userId) {
        return jdbcTemplate.update(DELETER, userId);
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update(UPDATER, user.getUserName(),
                user.getFirstName(), user.getLastName(), user.getEmailID(), user.getCity(), user.getState(), user.getCountry(), user.getUserId());
    }

    @Override
    public List<User> getAllUsers() {
      return jdbcTemplate.query(MULTISELECT, (rs, rowNum) -> {
          User user = new User();
          user.setUserId(rs.getInt(1));
          user.setUserName(rs.getString(2));
          user.setFirstName(rs.getString(3));
          user.setLastName(rs.getString(4));
          user.setEmailID(rs.getString(5));
          user.setCity(rs.getString(6));
          user.setState(rs.getString(7));
          user.setCountry(rs.getString(8));
          return user;
      });
    }

    /**
     * Using RowMapper to fetch data
     */
    public User getUser(int userid) {

        return jdbcTemplate.queryForObject(SELECT, (rs, rowNum) -> {
            User user = new User();
            user.setUserId(rs.getInt(1));
            user.setUserName(rs.getString(2));
            user.setFirstName(rs.getString(3));
            user.setLastName(rs.getString(4));
            user.setEmailID(rs.getString(5));
            user.setCity(rs.getString(6));
            user.setState(rs.getString(7));
            user.setCountry(rs.getString(8));
            return user;
        }, userid);

    }
}
