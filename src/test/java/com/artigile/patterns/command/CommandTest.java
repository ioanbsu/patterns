package com.artigile.patterns.command;

import org.junit.Test;

/**
 * @author IoaN, 2/18/12 2:45 PM
 */
public class CommandTest {

    @Test
    public void testCommand() {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        Switch s = new Switch();
        s.storeAndExecute(switchUp);
        s.storeAndExecute(switchDown);

    }

}
