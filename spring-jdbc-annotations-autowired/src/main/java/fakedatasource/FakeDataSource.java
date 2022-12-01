package fakedatasource;

import com.github.javafaker.Faker;
import entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FakeDataSource {
    private Faker faker;



    public int getUserId() {
        return faker.number().numberBetween(9999, 99999);
    }

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getCity() {
        return faker.address().city();
    }

    public String getState() {
        return faker.address().state();
    }

    public String getCountry() {
        return faker.address().country();
    }

    public User constructUserObject() {
        User user = new User();
        user.setUserId(getUserId());
        user.setFirstName(getFirstName());
        user.setLastName(getLastName());
        user.setEmailID(user.getFirstName() + user.getLastName() + "@gmail.com");
        user.setCity(getCity());
        user.setState(getState());
        user.setCountry(getCountry());
        user.setUserName(user.getUserId() + user.getFirstName());
        return user;
    }
}
