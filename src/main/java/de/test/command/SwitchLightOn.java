package de.test.command;

public class SwitchLightOn
  implements Command {

  private Light_Receiver light;

  public SwitchLightOn(Light_Receiver light) {
    this.light = light;
  }

  @Override
  public void execute() {
    // light.plughIn();
    // light.setOn();
    light.switchOn();
  }

}
