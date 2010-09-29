package de.test.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RefinedAbstraction
  implements Abstraction {

  private static final Logger LOG = LoggerFactory.getLogger(RefinedAbstraction.class);
  private Implementor implementor;

  public RefinedAbstraction(Implementor implementor) {
    this.implementor = implementor;
  }

  @Override
  public void tasteWhisky() {
    LOG.debug("Delegating ...");
    implementor.drinkWhiskyTheScottishWay();
  }

}
