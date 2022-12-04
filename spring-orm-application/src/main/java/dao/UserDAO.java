package dao;

import entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDAO {
    HibernateTemplate hibernateTemplate;

    @Transactional
    public void insert(User user) {
        hibernateTemplate.persist(user);
    }

    public User getUser(int id) {
        return hibernateTemplate.get(User.class, id);
    }

    public void delete(int id) {
        hibernateTemplate.delete(getUser(id));
    }

    public List<User> getAllUser() {
        return hibernateTemplate.loadAll(User.class);
    }
    @Transactional
    public void updateUser(User user) {
        hibernateTemplate.update(user);
        System.out.println(hibernateTemplate.get(User.class,user.getUserId()));
    }
}
