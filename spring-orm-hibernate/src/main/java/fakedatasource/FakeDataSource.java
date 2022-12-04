package fakedatasource;

import com.github.javafaker.Faker;
import entities.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FakeDataSource {
    private Faker faker;

    FakeDataSource(Faker faker) {
        this.faker = faker;
    }

    public int getUserId() {
        return faker.number().numberBetween(9999, 99999);
    }

    private String fName = null, lName = null, emailId = null, city = null, state = null, country = null, phNo = null;

    public String getCity() {
        city = faker.address().city();
        return city;
    }

    public String getState() {
        state = faker.address().state();
        return state;
    }

    public String getCountry() {
        country = faker.address().country();
        return country;
    }

    public String getEmailId(String name) {
        return name.replace(" ", ".") + "@gmail.com";
    }

    public String getPhNo() {
        phNo = faker.phoneNumber().cellPhone();
        return phNo;
    }

    public String getAddress() {
        return faker.address().fullAddress();
    }

    public String getDesignation() {
        return faker.company().profession();
    }

    public String getCollegeName() {
        return faker.university().name();
    }

    public String getFullName() {
        fName = faker.name().firstName();
        lName = faker.name().lastName();
        return fName + " " + lName;
    }

    public Student getRandomStudent() {
        Student s = new Student();
        s.setId(getUserId());
        s.setName(getFullName());
        s.setEmailId(getEmailId(s.getName()));
        s.setPhoneNo(getPhNo());
        s.setUniversity(getCollegeName());
        s.setAddress(getAddress());
        return s;
    }

}
