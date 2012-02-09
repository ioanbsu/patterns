package com.artigile.patterns.abstractfactory;

import com.artigile.patterns.builder.Product;
import org.junit.Test;

/**
 * @author IoaN, 2/1/12 12:02 PM
 */

public class AbstractFactoryTest{

    @Test
    public void testAbstractFactory(){
       sayButton(new OSXButtonFactory());
       sayButton(new WinButtonFactory());
    }
    
    private void sayButton(AbstractFactory abstractFactory){
        abstractFactory.createButton().sayWhichButtonYouAre();
    }
}
