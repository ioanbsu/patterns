package com.artigile.patterns.interpreter;

import java.util.Map;

/**
 * @author IoaN, 2/19/12 7:12 PM
 */
public class Minus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Minus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}
