package de.test.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.rmi.log.LogHandler;

/**
 * Receiver of the command {@link SwitchLightOn}
 * 
 * @author u094915<br />
 *         $LastChangedBy: $<br />
 *         $Rev: $<br />
 *         $LastChangedDate: $
 */

public class Light {

  private static final Logger LOG = LoggerFactory.getLogger(Light.class);

  boolean light;

  public boolean isLight() {
    return light;
  }

  public void setLight(boolean light) {
    this.light = light;
  }

  public void switchOn() {
    light = true;
    LOG.debug("Switched light on.");
  }

  public void switchOff() {
    light = false;
    LOG.debug("Switched light off.");
  }

}
