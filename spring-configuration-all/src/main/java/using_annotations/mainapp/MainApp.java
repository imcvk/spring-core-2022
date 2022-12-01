package using_annotations.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import using_annotations.bean.Employee5;
import using_annotations.config.BeanConfig;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        Employee5 employee5=context.getBean(Employee5.class);
        System.out.println(employee5);

    }
}
