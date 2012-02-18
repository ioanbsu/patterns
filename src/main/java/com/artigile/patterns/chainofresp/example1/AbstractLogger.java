package com.artigile.patterns.chainofresp.example1;

/**
 * @author IoaN, 2/18/12 12:49 PM
 */
abstract public class AbstractLogger {
    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;

    // The next element in the chain of responsibility
    protected AbstractLogger next;

    public AbstractLogger setNext(AbstractLogger log) {
        next = log;
        return log;
    }

    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }

    abstract protected void writeMessage(String msg);
}
