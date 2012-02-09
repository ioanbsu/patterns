package com.artigile.patterns.flyweight;

/**
 * @author IoaN, 2/6/12 11:39 AM
 */
public class CoffeeOrderContext {
    private int table;

    public CoffeeOrderContext(int table) {
        this.table = table;
    }

    public int getTable() {
        return table;
    }
}
