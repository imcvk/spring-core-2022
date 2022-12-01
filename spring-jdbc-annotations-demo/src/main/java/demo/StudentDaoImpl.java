package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDaoImpl implements StudentDao {
    JdbcTemplate jdbcTemplate;
    String insert = "insert into student values(?,?)";

    public int insert(Student s) {
      return   jdbcTemplate.update(insert, s.getRollNo(), s.getName());
    }
}
