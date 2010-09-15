package de.test.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObserverImpl
  implements Observer {

  private static final Logger LOG = LoggerFactory.getLogger(ObserverImpl.class);

  @Override
  public void notify(Object subject) {
    LOG.debug("Called " + this + " with " + subject);
  }

}
