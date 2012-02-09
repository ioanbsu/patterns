package com.artigile.patterns.builder;

/**
 * @author IoaN, 2/1/12 12:31 PM
 */
public interface Builder {
    
    Product build();
    Builder buildPartA(String s);

    Builder buildPartB(String partB);
}
