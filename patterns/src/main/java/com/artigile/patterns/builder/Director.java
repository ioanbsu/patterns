package com.artigile.patterns.builder;

/**
 * @author IoaN, 2/1/12 12:38 PM
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
       builder.buildPartA("part A").buildPartB("part B");
    }
}
