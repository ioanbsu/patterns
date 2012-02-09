package com.artigile.patterns.prototype;

import org.junit.Test;

/**
 * @author IoaN, 2/1/12 3:25 PM
 */
public class PrototypeTest {

    @Test
    public void testPtorotype() throws CloneNotSupportedException {
        AbstractPrototype prototype1=new PrototypeImpl();
        prototype1.setX(1000);
        AbstractPrototype prototype2= (AbstractPrototype) prototype1.clone();
        prototype1.setX(prototype1.getX()+10);
        System.out.println(prototype1.getX());
        System.out.println(prototype2.getX());
    }
}
