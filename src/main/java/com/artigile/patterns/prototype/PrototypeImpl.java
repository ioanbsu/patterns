package com.artigile.patterns.prototype;

/**
 * @author IoaN, 2/1/12 3:24 PM
 */
public class PrototypeImpl extends AbstractPrototype{
    private int x;
    
    @Override
    public void setX(int x) {
        this.x=x;
    }

    @Override
    public void printX() {
        System.out.println("Value: "+x);
    }

    @Override
    public int getX() {
        return x;
    }
}
