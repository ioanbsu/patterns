package com.artigile.patterns.adapter;

/**
 * @author IoaN, 2/1/12 4:10 PM
 */
public class LegacyRectangle {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("drawing rectangle: " + x1 + " " + y1 + " " + x2 + " " + y2);
    }
}
