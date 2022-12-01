package spel.operators.mainapp.spelBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RelationalAndLogicalOperators {
    @Value("#{1 == 1}") // true
    private boolean equal;

    @Value("#{1 eq 1}") // true
    private boolean equalAlphabetic;

    @Value("#{1 != 1}") // false
    private boolean notEqual;

    @Value("#{1 ne 1}") // false
    private boolean notEqualAlphabetic;

    @Value("#{1 < 1}") // false
    private boolean lessThan;

    @Value("#{1 lt 1}") // false
    private boolean lessThanAlphabetic;

    @Value("#{1 <= 1}") // true
    private boolean lessThanOrEqual;

    @Value("#{1 le 1}") // true
    private boolean lessThanOrEqualAlphabetic;

    @Value("#{1 > 1}") // false
    private boolean greaterThan;

    @Value("#{1 gt 1}") // false
    private boolean greaterThanAlphabetic;

    @Value("#{1 >= 1}") // true
    private boolean greaterThanOrEqual;

    @Value("#{1 ge 1}") // true
    private boolean greaterThanOrEqualAlphabetic;

    public RelationalAndLogicalOperators(boolean equal, boolean equalAlphabetic, boolean notEqual, boolean notEqualAlphabetic, boolean lessThan, boolean lessThanAlphabetic, boolean lessThanOrEqual, boolean lessThanOrEqualAlphabetic, boolean greaterThan, boolean greaterThanAlphabetic, boolean greaterThanOrEqual, boolean greaterThanOrEqualAlphabetic) {

        this.equal = equal;
        this.equalAlphabetic = equalAlphabetic;
        this.notEqual = notEqual;
        this.notEqualAlphabetic = notEqualAlphabetic;
        this.lessThan = lessThan;
        this.lessThanAlphabetic = lessThanAlphabetic;
        this.lessThanOrEqual = lessThanOrEqual;
        this.lessThanOrEqualAlphabetic = lessThanOrEqualAlphabetic;
        this.greaterThan = greaterThan;
        this.greaterThanAlphabetic = greaterThanAlphabetic;
        this.greaterThanOrEqual = greaterThanOrEqual;
        this.greaterThanOrEqualAlphabetic = greaterThanOrEqualAlphabetic;
    }

    public RelationalAndLogicalOperators() {
    }

    @Override
    public String toString() {
        return "RelationalAndLogicalOperators{" +
                "\nequal=" + equal +
                "\n equalAlphabetic=" + equalAlphabetic +
                "\n notEqual=" + notEqual +
                "\n notEqualAlphabetic=" + notEqualAlphabetic +
                "\n lessThan=" + lessThan +
                "\n lessThanAlphabetic=" + lessThanAlphabetic +
                "\n lessThanOrEqual=" + lessThanOrEqual +
                "\n lessThanOrEqualAlphabetic=" + lessThanOrEqualAlphabetic +
                "\n greaterThan=" + greaterThan +
                "\n greaterThanAlphabetic=" + greaterThanAlphabetic +
                "\n greaterThanOrEqual=" + greaterThanOrEqual +
                "\n greaterThanOrEqualAlphabetic=" + greaterThanOrEqualAlphabetic +
                '}';
    }

    public boolean isEqual() {
        return equal;
    }

    public void setEqual(boolean equal) {
        this.equal = equal;
    }

    public boolean isEqualAlphabetic() {
        return equalAlphabetic;
    }

    public void setEqualAlphabetic(boolean equalAlphabetic) {
        this.equalAlphabetic = equalAlphabetic;
    }

    public boolean isNotEqual() {
        return notEqual;
    }

    public void setNotEqual(boolean notEqual) {
        this.notEqual = notEqual;
    }

    public boolean isNotEqualAlphabetic() {
        return notEqualAlphabetic;
    }

    public void setNotEqualAlphabetic(boolean notEqualAlphabetic) {
        this.notEqualAlphabetic = notEqualAlphabetic;
    }

    public boolean isLessThan() {
        return lessThan;
    }

    public void setLessThan(boolean lessThan) {
        this.lessThan = lessThan;
    }

    public boolean isLessThanAlphabetic() {
        return lessThanAlphabetic;
    }

    public void setLessThanAlphabetic(boolean lessThanAlphabetic) {
        this.lessThanAlphabetic = lessThanAlphabetic;
    }

    public boolean isLessThanOrEqual() {
        return lessThanOrEqual;
    }

    public void setLessThanOrEqual(boolean lessThanOrEqual) {
        this.lessThanOrEqual = lessThanOrEqual;
    }

    public boolean isLessThanOrEqualAlphabetic() {
        return lessThanOrEqualAlphabetic;
    }

    public void setLessThanOrEqualAlphabetic(boolean lessThanOrEqualAlphabetic) {
        this.lessThanOrEqualAlphabetic = lessThanOrEqualAlphabetic;
    }

    public boolean isGreaterThan() {
        return greaterThan;
    }

    public void setGreaterThan(boolean greaterThan) {
        this.greaterThan = greaterThan;
    }

    public boolean isGreaterThanAlphabetic() {
        return greaterThanAlphabetic;
    }

    public void setGreaterThanAlphabetic(boolean greaterThanAlphabetic) {
        this.greaterThanAlphabetic = greaterThanAlphabetic;
    }

    public boolean isGreaterThanOrEqual() {
        return greaterThanOrEqual;
    }

    public void setGreaterThanOrEqual(boolean greaterThanOrEqual) {
        this.greaterThanOrEqual = greaterThanOrEqual;
    }

    public boolean isGreaterThanOrEqualAlphabetic() {
        return greaterThanOrEqualAlphabetic;
    }

    public void setGreaterThanOrEqualAlphabetic(boolean greaterThanOrEqualAlphabetic) {
        this.greaterThanOrEqualAlphabetic = greaterThanOrEqualAlphabetic;
    }
}
