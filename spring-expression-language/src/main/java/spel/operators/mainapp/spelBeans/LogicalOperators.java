package spel.operators.mainapp.spelBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LogicalOperators {
    @Value("#{250 > 200 and 200 < 4000}") // true
    private boolean andAlphabetic;

    @Value("#{400 > 300 || 150 < 100}") // true
    private boolean or;

    @Value("#{400 > 300 or 150 < 100}") // true
    private boolean orAlphabetic;

    @Value("#{!true}") // false
    private boolean not;

    @Value("#{not true}") // false
    private boolean notAlphabetic;

    public LogicalOperators() {
    }

    public LogicalOperators(boolean andAlphabetic, boolean or, boolean orAlphabetic, boolean not, boolean notAlphabetic) {
        this.andAlphabetic = andAlphabetic;
        this.or = or;
        this.orAlphabetic = orAlphabetic;
        this.not = not;
        this.notAlphabetic = notAlphabetic;
    }

    public boolean isAndAlphabetic() {
        return andAlphabetic;
    }

    public void setAndAlphabetic(boolean andAlphabetic) {
        this.andAlphabetic = andAlphabetic;
    }

    public boolean isOr() {
        return or;
    }

    public void setOr(boolean or) {
        this.or = or;
    }

    public boolean isOrAlphabetic() {
        return orAlphabetic;
    }

    public void setOrAlphabetic(boolean orAlphabetic) {
        this.orAlphabetic = orAlphabetic;
    }

    public boolean isNot() {
        return not;
    }

    public void setNot(boolean not) {
        this.not = not;
    }

    public boolean isNotAlphabetic() {
        return notAlphabetic;
    }

    public void setNotAlphabetic(boolean notAlphabetic) {
        this.notAlphabetic = notAlphabetic;
    }

    @Override
    public String toString() {
        return "LogicalOperators{" +
                "\nandAlphabetic=" + andAlphabetic +
                "\n or=" + or +
                "\n orAlphabetic=" + orAlphabetic +
                "\n not=" + not +
                "\n notAlphabetic=" + notAlphabetic +
                '}';
    }
}
