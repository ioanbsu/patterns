package com.artigile.patterns.bridge;

/**
 * @author IoaN, 2/8/12 4:19 PM
 */
public class DrawingAPIImpl2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double raduis) {
        System.out.println("circle implementation 2");
    }
}
