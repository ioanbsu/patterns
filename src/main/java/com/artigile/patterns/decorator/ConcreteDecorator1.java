package com.artigile.patterns.decorator;

/**
 * @author IoaN, 2/8/12 4:51 PM
 */
public class ConcreteDecorator1 extends Decorator {


    protected ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("concrete Decorator 1 behaviour");
    }
}
