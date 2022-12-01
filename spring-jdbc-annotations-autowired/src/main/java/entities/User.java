package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class User {
    private int userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String emailID;
    private String city;
    private String state;
    private String country;

}
