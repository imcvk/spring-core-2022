package spel.ParsingExpressionsProgrammatically;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SPEL_Parsing_Demo {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();
        //demo
        Expression expression = expressionParser.parseExpression("Chaitanya");
        System.out.println(expression.getExpressionString());
        expression = expressionParser.parseExpression("vfdgdfg");
        System.out.println(expression.getExpressionString());
    }
}

