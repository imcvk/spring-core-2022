package spel.operators.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spel.operators.mainapp.spelBeans.AccessingListAndMapObjects;
import spel.operators.mainapp.spelBeans.Regex;

public class MainAppSpringSPEL {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        System.out.println("---------------------------------Arithmetic operations--------------------------------------");
//        System.out.println(context.getBean(Arithmetic_Operator_SpringSPEL.class));
//        System.out.println("--------------------------------------------------------------------------------------------");
//        System.out.println("---------------------------------Relational and Logical Operators---------------------------");
//        System.out.println(context.getBean(RelationalAndLogicalOperators.class));
//        System.out.println("--------------------------------------------------------------------------------------------");
//        System.out.println("---------------------------------Logical Operators------------------------------------------");
//        System.out.println(context.getBean(LogicalOperators.class));
//        System.out.println("--------------------------------------------------------------------------------------------");
//        System.out.println("---------------------------------Logical Operators------------------------------------------");
//          System.out.println(context.getBean(ConditionalOperator.class));
//          System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(context.getBean(Regex.class));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(context.getBean(AccessingListAndMapObjects.class));
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
