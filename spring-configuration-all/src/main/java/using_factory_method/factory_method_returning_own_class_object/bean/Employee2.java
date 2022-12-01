package using_factory_method.factory_method_returning_own_class_object.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee2 {
    private int empId;
    private String name;

    public static Employee2 getEmployee2() {
        return new Employee2();
    }
}
