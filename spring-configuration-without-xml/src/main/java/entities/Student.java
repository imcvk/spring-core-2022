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
public class Student {
    private int rollNo;
    private String name, emailId, city, state, country;

    public void study() {
        System.out.println("Student is studying");
    }

    public void printStudentDetails() {
        System.out.println(
                "RollNo:" + rollNo+"\n" +
                        "Name:" + name+"\n" +
                        "EmailId:" + emailId+"\n" +
                        "City:" + city+"\n" +
                        "State:" + state+"\n" +
                        "Country:" + country
        );
    }
}
