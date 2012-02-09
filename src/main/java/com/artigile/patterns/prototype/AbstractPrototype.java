package com.artigile.patterns.prototype;

/**
 * @author IoaN, 2/1/12 3:23 PM
 */
public abstract class AbstractPrototype implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public abstract void setX(int x);

    public abstract void printX();

    public abstract int getX();
}
