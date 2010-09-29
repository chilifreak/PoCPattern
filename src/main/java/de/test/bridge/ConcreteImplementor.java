package de.test.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteImplementor
  implements Implementor {

  private static final Logger LOG = LoggerFactory.getLogger(ConcreteImplementor.class);

  @Override
  public void drinkWhiskyTheScottishWay() {
    LOG.debug("Drink during day and night!");
  }

}
