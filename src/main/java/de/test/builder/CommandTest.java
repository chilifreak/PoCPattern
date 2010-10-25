package de.test.builder;

import org.junit.Test;

import de.test.command.Light_Receiver;
import de.test.command.Switch_Invoker;
import de.test.command.SwitchLightOn;

import static junit.framework.Assert.*;

public class CommandTest {

  @Test
  public void pressSwitch() {
    // Receiver
    Light_Receiver light = new Light_Receiver();

    assertFalse(light.isLight());

    // Command
    SwitchLightOn command = new SwitchLightOn(light);

    // Invoker
    Switch_Invoker mySwitch = new Switch_Invoker(command);

    mySwitch.swichLightOn();

    assertTrue(light.isLight());
  }

}
