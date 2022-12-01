package spel.operators.mainapp.spelBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConditionalOperator {
    @Value("#{2 > 5 ? 'a' : 'b'}") // "a"
    private String ternary;

    public ConditionalOperator() {
    }

    public ConditionalOperator(String ternary) {
        this.ternary = ternary;
    }

    public String getTernary() {
        return ternary;
    }

    public void setTernary(String ternary) {
        this.ternary = ternary;
    }

    @Override
    public String toString() {
        return "ConditionalOperator{" +
                "ternary='" + ternary + '\'' +
                '}';
    }
}
