package com.artigile.patterns.command;

/**
 * @author IoaN, 2/18/12 2:43 PM
 */
public class Light {
    public Light() {
    }

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}
