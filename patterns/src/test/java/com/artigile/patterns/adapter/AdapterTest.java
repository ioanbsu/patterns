package com.artigile.patterns.adapter;

import org.junit.Test;

/**
 * @author IoaN, 2/1/12 4:14 PM
 */
public class AdapterTest {
    
    @Test
    public void testAdapter() {
        Line line=new Line();
        Rectangle rectangle=new Rectangle();
        line.draw(1,2,3,4);
        rectangle.draw(4,3,2,1);
    }
}
