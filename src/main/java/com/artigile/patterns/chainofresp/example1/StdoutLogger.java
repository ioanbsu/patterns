package com.artigile.patterns.chainofresp.example1;

/**
 * @author IoaN, 2/18/12 12:50 PM
 */
public class StdoutLogger extends AbstractLogger {
    public StdoutLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Writing to stdout: " + msg);
    }
}
