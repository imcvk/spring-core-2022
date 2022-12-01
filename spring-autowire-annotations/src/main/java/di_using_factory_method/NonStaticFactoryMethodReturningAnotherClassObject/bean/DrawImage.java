package di_using_factory_method.NonStaticFactoryMethodReturningAnotherClassObject.bean;

public class DrawImage implements Drawable {

    @Override
    public void draw() {
        System.out.println("Inside draw method from DrawAble interface");
    }
}
