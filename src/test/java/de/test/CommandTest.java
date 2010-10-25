package de.test;

import org.junit.Test;

import de.test.command.Light_Receiver;
import de.test.command.SwitchLightOn;

public class CommandTest {

  @Test
  public void testSwitchOn() {
    Light_Receiver light = new Light_Receiver();

    // Delegate execution to another object. Separation of concerns. :-)
    SwitchLightOn switchLightOn = new SwitchLightOn(light);
    switchLightOn.execute();

  }

}
