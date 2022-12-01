package using_programmatic_approach.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User2 implements DisposableBean, InitializingBean {
    private int id;
    private String name;

    public void destroy() throws Exception {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(
                "Bean User2 has been "
                        + "instantiated and I'm the "
                        + "init() method");
    }
}
