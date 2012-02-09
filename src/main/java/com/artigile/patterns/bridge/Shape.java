package com.artigile.patterns.bridge;

/**
 * @author IoaN, 2/8/12 4:21 PM
 */
public abstract class Shape {

    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();

    public abstract void resizeByPercentage(double pct);

}
