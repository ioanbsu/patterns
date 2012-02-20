package com.artigile.patterns.interpreter;

import java.util.Map;

/**
 * @author IoaN, 2/19/12 7:10 PM
 */
public interface Expression {
    public int interpret(Map<String,Expression> variables);
}
