package com.artigile.patterns.decorator;

/**
 * @author IoaN, 2/8/12 4:49 PM
 */
public class ComponentImpl implements Component {
    @Override
    public void operation() {
        System.out.println("operation of concrete component");
    }
}
