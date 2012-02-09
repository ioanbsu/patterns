package com.artigile.patterns.facade;

import org.junit.Test;

/**
 * @author IoaN, 2/6/12 12:28 PM
 */
public class FacadeTest {

    @Test
    public void testFacade(){
       Computer computer=new Computer();
        computer.startComputer();
    }
}
