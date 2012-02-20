package com.artigile.patterns.interpreter;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author IoaN, 2/19/12 7:13 PM
 */
public class InterpreterTest {

    @Test
    public void testInterpreter() {
        String expression = "w x z - +";
        Evaluator sentence = new Evaluator(expression);
        Map<String, Expression> variables = new HashMap<String, Expression>();
        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));
        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
