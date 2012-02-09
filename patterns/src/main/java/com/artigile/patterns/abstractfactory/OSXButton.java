package com.artigile.patterns.abstractfactory;

/**
 * @author IoaN, 2/1/12 12:00 PM
 */
public class OSXButton implements Button {
    @Override
    public void sayWhichButtonYouAre() {
        System.out.println("OSX button");
    }
}
