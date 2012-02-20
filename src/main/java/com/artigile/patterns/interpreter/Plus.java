package com.artigile.patterns.interpreter;

import java.util.Map;

/**
 * @author IoaN, 2/19/12 7:11 PM
 */
public class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Plus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
