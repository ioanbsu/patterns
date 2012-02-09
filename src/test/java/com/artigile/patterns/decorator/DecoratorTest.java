package com.artigile.patterns.decorator;

import org.junit.Test;

/**
 * @author IoaN, 2/8/12 4:53 PM
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        Decorator decorator1 = new ConcreteDecorator1(new ComponentImpl());
        Decorator decorator2 = new ConcreteDecorator2(new ComponentImpl());
        decorator1.operation();
        decorator2.operation();
    }
}
