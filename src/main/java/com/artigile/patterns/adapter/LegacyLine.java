package com.artigile.patterns.adapter;

/**
 * @author IoaN, 2/1/12 4:09 PM
 */
public class LegacyLine {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("drawing line: " + x1 + " " + y1 + " " + x2 + " " + y2);
    }
}
