package using_annotations.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User3 {
    private int id;
    private String name;

    @PostConstruct
    public void init() throws Exception {
        System.out.println("init invoked using annotations");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("destroy invoked using annotations");
    }
}
