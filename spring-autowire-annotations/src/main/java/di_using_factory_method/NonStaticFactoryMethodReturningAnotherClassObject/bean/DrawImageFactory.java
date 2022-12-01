package di_using_factory_method.NonStaticFactoryMethodReturningAnotherClassObject.bean;

public class DrawImageFactory {
    public static DrawImage getDrawImage() {
        return new DrawImage();
    }
}
