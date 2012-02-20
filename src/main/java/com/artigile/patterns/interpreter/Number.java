package com.artigile.patterns.interpreter;

import java.util.Map;

/**
 * @author IoaN, 2/19/12 7:11 PM
 */
public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}
