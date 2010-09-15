package de.test.builder;

import org.junit.Test;

import de.test.command.Light;
import de.test.command.Switch;
import de.test.command.SwitchLightOn;

import static junit.framework.Assert.*;

public class CommandTest {

  @Test
  public void pressSwitch() {
    // Receiver
    Light light = new Light();

    assertFalse(light.isLight());

    // Command
    SwitchLightOn command = new SwitchLightOn(light);

    // Invoker
    Switch mySwitch = new Switch(command);

    mySwitch.swichLightOn();

    assertTrue(light.isLight());
  }

}
