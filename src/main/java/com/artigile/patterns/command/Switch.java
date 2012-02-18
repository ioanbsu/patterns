package com.artigile.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IoaN, 2/18/12 2:41 PM
 */
public class Switch {

    private List<Command> history = new ArrayList<Command>();

    public Switch() {
    }

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd);
        cmd.execute();
    }
}
