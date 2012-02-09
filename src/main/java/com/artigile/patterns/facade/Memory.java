package com.artigile.patterns.facade;

/**
 * @author IoaN, 2/6/12 12:24 PM
 */
public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Loading data " + data + " tp position " + position);
    }
}
