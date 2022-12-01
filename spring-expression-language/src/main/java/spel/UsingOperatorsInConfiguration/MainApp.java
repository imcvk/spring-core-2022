package spel.UsingOperatorsInConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("UsingOperatorsInConfiguration.xml");
        SpelOperators spelOperators=context.getBean(SpelOperators.class,"spelOperators");
        System.out.println(spelOperators);
    }
}
