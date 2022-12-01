package spel.operators.mainapp.spelBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Arithmetic_Operator_SpringSPEL {
    @Value("#{19 + 1}") // 20
    private double add;

    @Value("#{'String1 ' + 'string2'}") // "String1 string2"
    private String addString;

    @Value("#{20 - 1}") // 19
    private double subtract;

    @Value("#{10 * 2}") // 20
    private double multiply;

    @Value("#{36 / 2}") // 19
    private double divide;

    @Value("#{36 div 2}") // 18, the same as for / operator
    private double divideAlphabetic;

    @Value("#{37 % 10}") // 7
    private double modulo;

    @Value("#{37 mod 10}") // 7, the same as for % operator
    private double moduloAlphabetic;

    @Value("#{2 ^ 9}") // 512
    private double powerOf;

    @Value("#{(2 + 2) * 2 + 9}") // 17
    private double brackets;

    public Arithmetic_Operator_SpringSPEL(double add, String addString, double subtract, double multiply, double divide, double divideAlphabetic, double modulo, double moduloAlphabetic, double powerOf, double brackets) {
        this.add = add;
        this.addString = addString;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
        this.divideAlphabetic = divideAlphabetic;
        this.modulo = modulo;
        this.moduloAlphabetic = moduloAlphabetic;
        this.powerOf = powerOf;
        this.brackets = brackets;
    }

    public Arithmetic_Operator_SpringSPEL() {
    }

    public double getAdd() {
        return add;
    }

    public void setAdd(double add) {
        this.add = add;
    }

    public String getAddString() {
        return addString;
    }

    public void setAddString(String addString) {
        this.addString = addString;
    }

    public double getSubtract() {
        return subtract;
    }

    public void setSubtract(double subtract) {
        this.subtract = subtract;
    }

    public double getMultiply() {
        return multiply;
    }

    public void setMultiply(double multiply) {
        this.multiply = multiply;
    }

    public double getDivide() {
        return divide;
    }

    public void setDivide(double divide) {
        this.divide = divide;
    }

    public double getDivideAlphabetic() {
        return divideAlphabetic;
    }

    public void setDivideAlphabetic(double divideAlphabetic) {
        this.divideAlphabetic = divideAlphabetic;
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }

    public double getModuloAlphabetic() {
        return moduloAlphabetic;
    }

    public void setModuloAlphabetic(double moduloAlphabetic) {
        this.moduloAlphabetic = moduloAlphabetic;
    }

    public double getPowerOf() {
        return powerOf;
    }

    public void setPowerOf(double powerOf) {
        this.powerOf = powerOf;
    }

    public double getBrackets() {
        return brackets;
    }

    public void setBrackets(double brackets) {
        this.brackets = brackets;
    }

    @Override
    public String toString() {
        return "Arithmetic_Operator_SpringSPEL{" +
                "\nadd=" + add +
                "\n addString='" + addString + '\'' +
                "\n subtract=" + subtract +
                "\n multiply=" + multiply +
                "\n divide=" + divide +
                "\n divideAlphabetic=" + divideAlphabetic +
                "\n modulo=" + modulo +
                "\n moduloAlphabetic=" + moduloAlphabetic +
                "\n powerOf=" + powerOf +
                "\n brackets=" + brackets +
                '}';
    }
}
