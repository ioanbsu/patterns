package com.artigile.patterns.builder;

import org.junit.Test;

/**
 * @author IoaN, 2/1/12 12:37 PM
 */
public class BuilderTest {

    @Test
    public void testBuilderPattern() {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        director.construct();
        Product product = concreteBuilder.build();
        System.out.println(product.getSomeValue1());
        System.out.println(product.getSomeValue2());
    }
}
