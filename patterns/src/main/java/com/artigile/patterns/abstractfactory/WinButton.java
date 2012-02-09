package com.artigile.patterns.abstractfactory;

/**
 * @author IoaN, 2/1/12 12:00 PM
 */
public class WinButton implements Button {
    @Override
    public void sayWhichButtonYouAre() {
        System.out.println("windows button");
    }
}
