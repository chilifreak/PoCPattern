package de.test.command;

public class SwitchLightOn
  implements Command {

  private Light light;

  public SwitchLightOn(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.switchOn();
  }

}
