package com.artigile.patterns.chainofresp.example1;

/**
 * @author IoaN, 2/18/12 12:52 PM
 */
public class EmailLogger extends AbstractLogger {
    public EmailLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }
}
