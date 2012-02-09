package com.artigile.patterns.decorator;

/**
 * @author IoaN, 2/8/12 4:52 PM
 */
public class ConcreteDecorator2 extends Decorator {

    protected ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("concrete decorator 2 behaviour.");
    }
}
