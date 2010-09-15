package de.test.command;

/**
 * Invoker of the command {@link SwitchLightOn}
 * 
 * @author u094915<br />
 *         $LastChangedBy: $<br />
 *         $Rev: $<br />
 *         $LastChangedDate: $
 */
public class Switch {

  private Command command;

  public Switch(Command command) {
    this.command = command;
  }

  public void swichLightOn() {
    command.execute();
  }

}
