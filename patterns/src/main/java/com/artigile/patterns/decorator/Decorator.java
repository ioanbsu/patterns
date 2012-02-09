package com.artigile.patterns.decorator;

/**
 * @author IoaN, 2/8/12 4:49 PM
 */
public abstract class Decorator implements Component {

    protected Component component;

    protected Decorator(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
