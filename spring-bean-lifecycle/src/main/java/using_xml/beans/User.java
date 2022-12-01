package using_xml.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String name;


    public void init() throws Exception {
        System.out.println("init invoked");
    }

    public void destroy() throws Exception {
        System.out.println("destroy invoked");
    }
}
