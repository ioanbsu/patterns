package com.artigile.patterns.abstractfactory;

/**
 * @author IoaN, 2/1/12 11:59 AM
 */
public class OSXButtonFactory implements AbstractFactory {
    @Override
    public OSXButton createButton() {
        return new OSXButton();
    }
}
