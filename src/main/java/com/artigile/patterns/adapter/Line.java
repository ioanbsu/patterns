package com.artigile.patterns.adapter;

/**
 * @author IoaN, 2/1/12 4:11 PM
 */
public class Line  implements  Shape{

   private LegacyLine legacyLine=new LegacyLine();
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        legacyLine.draw(x1,y1,x2,y2);
    }
}
