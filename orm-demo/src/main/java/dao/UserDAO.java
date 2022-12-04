package dao;

import entities.User;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDAO {
    HibernateTemplate hibernateTemplate;
@Transactional
    public int insert(User u) {
        return (int) hibernateTemplate.save(u);
    }
}
