package de.test.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteDecorator
  extends AbstractDecorator {

  private static Logger LOG = LoggerFactory.getLogger(ConcreteDecorator.class);

  public ConcreteDecorator(Component component) {
    super(component);
  }

  @Override
  public void bookWhisky() {
    LOG.debug("Called " + this);
    // execute origin logic
    super.component.bookWhisky();
  }

}
