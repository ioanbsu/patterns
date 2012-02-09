package com.artigile.patterns.abstractfactory;

/**
 * @author IoaN, 2/1/12 11:59 AM
 */
public class WinButtonFactory implements AbstractFactory{

    @Override
    public WinButton createButton() {
        return new WinButton();
    }

}
