package di_using_factory_method.static_factory_method_return_anotherClassObject.bean;

public class PrintData implements Printable {
    @Override
    public void print() {
        System.out.println("Implementing print from printable");
    }
}
