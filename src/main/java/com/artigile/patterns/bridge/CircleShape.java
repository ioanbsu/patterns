package com.artigile.patterns.bridge;

/**
 * @author IoaN, 2/8/12 4:24 PM
 */
public class CircleShape extends Shape {

    private double x, y, radius;

    public CircleShape(DrawingAPI drawingAPI, double x, double y, double radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double pct) {
         radius *=pct;
    }

}
