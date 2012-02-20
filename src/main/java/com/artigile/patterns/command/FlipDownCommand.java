package com.artigile.patterns.command;

/**
 * @author IoaN, 2/18/12 2:44 PM
 */
public class FlipDownCommand implements Command{
    private Light theLight;

       public FlipDownCommand(Light light) {
          this.theLight = light;
       }

       public void execute() {
          theLight.turnOff();
       }

}
