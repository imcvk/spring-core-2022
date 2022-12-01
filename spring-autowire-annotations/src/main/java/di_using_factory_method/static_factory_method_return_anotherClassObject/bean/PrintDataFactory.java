package di_using_factory_method.static_factory_method_return_anotherClassObject.bean;

public class PrintDataFactory {
    public static PrintData getPrintData() {
        return new PrintData();
    }
}
