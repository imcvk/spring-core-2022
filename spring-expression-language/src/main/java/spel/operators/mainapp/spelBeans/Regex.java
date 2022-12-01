package spel.operators.mainapp.spelBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Regex {
    @Value("#{'100' matches '\\d+' }") // true
    private boolean validNumericStringResult;

    @Value("#{'100fghdjf' matches '\\d+' }") // false
    private boolean invalidNumericStringResult;

    @Value("#{'valid alphabetic string' matches '[a-zA-Z\\s]+' }") // true
    private boolean validAlphabeticStringResult;

    @Value("#{'invalid alphabetic string #$1' matches '[a-zA-Z\\s]+' }") // false
    private boolean invalidAlphabeticStringResult;

//    @Value("#{someBean.someValue matches '\d+'}") // true if someValue contains only digits
//    private boolean validNumericValue;

    public Regex() {
    }

    public Regex(boolean validNumericStringResult, boolean invalidNumericStringResult, boolean validAlphabeticStringResult, boolean invalidAlphabeticStringResult) {
        this.validNumericStringResult = validNumericStringResult;
        this.invalidNumericStringResult = invalidNumericStringResult;
        this.validAlphabeticStringResult = validAlphabeticStringResult;
        this.invalidAlphabeticStringResult = invalidAlphabeticStringResult;
    }

    public boolean isValidNumericStringResult() {
        return validNumericStringResult;
    }

    public void setValidNumericStringResult(boolean validNumericStringResult) {
        this.validNumericStringResult = validNumericStringResult;
    }

    public boolean isInvalidNumericStringResult() {
        return invalidNumericStringResult;
    }

    public void setInvalidNumericStringResult(boolean invalidNumericStringResult) {
        this.invalidNumericStringResult = invalidNumericStringResult;
    }

    public boolean isValidAlphabeticStringResult() {
        return validAlphabeticStringResult;
    }

    public void setValidAlphabeticStringResult(boolean validAlphabeticStringResult) {
        this.validAlphabeticStringResult = validAlphabeticStringResult;
    }

    public boolean isInvalidAlphabeticStringResult() {
        return invalidAlphabeticStringResult;
    }

    public void setInvalidAlphabeticStringResult(boolean invalidAlphabeticStringResult) {
        this.invalidAlphabeticStringResult = invalidAlphabeticStringResult;
    }

    @Override
    public String toString() {
        return "Regex{" +
                "validNumericStringResult=" + validNumericStringResult +
                ", invalidNumericStringResult=" + invalidNumericStringResult +
                ", validAlphabeticStringResult=" + validAlphabeticStringResult +
                ", invalidAlphabeticStringResult=" + invalidAlphabeticStringResult +
                '}';
    }
}
