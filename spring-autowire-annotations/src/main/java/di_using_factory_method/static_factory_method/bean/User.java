package di_using_factory_method.static_factory_method.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    public static User user = new User();
    private int userid;
    private String name;

    public static User getUser() {
        return user;
    }

    public void userMessage() {
        System.out.println("In userMessage method");
    }
}
