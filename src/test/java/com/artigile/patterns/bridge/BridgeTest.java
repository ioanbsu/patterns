package com.artigile.patterns.bridge;

import org.junit.Test;

/**
 * @author IoaN, 2/8/12 4:29 PM
 */
public class BridgeTest {

    @Test
    public void testBridge() {
        Shape[] shapes = new Shape[]{
                new CircleShape(new DrawingAPIImpl1(), 1, 2, 3),
                new CircleShape(new DrawingAPIImpl2(), 5, 4, 2)
        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
