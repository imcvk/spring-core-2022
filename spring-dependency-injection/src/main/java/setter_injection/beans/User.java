package setter_injection.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {
    private int id;
    private String name;
    private String emailId;
    private List<Integer> phoneNumbers;
    private Set<String> addresses;
    private Map<String, String> vehicles;
    private Laptop laptop;
}
