package com.artigile.patterns.adapter;

/**
 * @author IoaN, 2/1/12 4:11 PM
 */
public class Rectangle implements Shape{
    private LegacyRectangle legacyRectangle=new LegacyRectangle();

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        legacyRectangle.draw(x1,y1,x2,y2);
    }
}
