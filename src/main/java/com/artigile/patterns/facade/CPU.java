package com.artigile.patterns.facade;

/**
 * @author IoaN, 2/6/12 12:23 PM
 */
public class CPU {

    public void freeze(){
        System.out.println("freezing CPU");
    }

    public void jump(long position){
        System.out.println("Jumping to position "+position);
    }

    public void execute(){
        System.out.println("Executing");
    }
}
