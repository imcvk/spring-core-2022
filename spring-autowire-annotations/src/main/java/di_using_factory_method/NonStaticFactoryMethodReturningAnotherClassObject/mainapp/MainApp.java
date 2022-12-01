package di_using_factory_method.NonStaticFactoryMethodReturningAnotherClassObject.mainapp;

import di_using_factory_method.NonStaticFactoryMethodReturningAnotherClassObject.bean.DrawImage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("staticFactoryMethod-config.xml");
        DrawImage drawImage = context.getBean(DrawImage.class, "DrawImage");
        drawImage.draw();
    }
}
