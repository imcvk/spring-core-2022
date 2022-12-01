package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Teacher {
    private int teacherId;
    private List<String> friends;
    private Map<String, String> Courses;
    private Set<String> subjects;
    private Properties teacherProperties;

    public void printTeacherDetails() {
        System.out.println("Teacher id:" + teacherId);
        System.out.println("All friends:");
        friends.stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        System.out.println("Courses Teaching:");
        Courses.entrySet().stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        System.out.println("All subjects teaching:");
        subjects.stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        System.out.println("Teacher Properties");
        teacherProperties.entrySet().stream().forEach(System.out::println);
        System.out.println("-----------------------------------------------");
    }
}
