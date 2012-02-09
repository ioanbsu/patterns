package com.artigile.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IoaN, 2/6/12 11:12 AM
 */
public class CompositeGraphic implements Graphic{

    private List<Graphic> childGraphics=new ArrayList<Graphic>();

    @Override
    public void print() {
        for (Graphic childGraphic : childGraphics) {
            childGraphic.print();
        }
    }

    public void add(Graphic graphic){
        childGraphics.add(graphic);
    }


    public void remove(Graphic graphic){
        childGraphics.remove(graphic);
    }

}
