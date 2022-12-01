package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int studentId;
    private List<String> friends;
    private Map<String, String> Courses;
    private Set<String> subjects;
    private Properties studentProperties;

    public void printStudentDetails() {
        System.out.println("Student id:" + studentId);
        System.out.println("All friends:");
        friends.stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        System.out.println("Courses enrolled:");
        Courses.entrySet().stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        System.out.println("All subjects:");
        subjects.stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        System.out.println("Student Properties");
        studentProperties.entrySet().stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
    }
}
