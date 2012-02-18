package com.artigile.patterns.chainofresp.example1;

/**
 * @author IoaN, 2/18/12 12:54 PM
 */
public class StderrLogger extends AbstractLogger {
    public StderrLogger(int mask) {
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.err.println("Sending to stderr: " + msg);
    }
}
