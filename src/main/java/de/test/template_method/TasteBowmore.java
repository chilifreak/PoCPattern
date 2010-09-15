package de.test.template_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TasteBowmore
  extends Template {

  private static final Logger LOG = LoggerFactory.getLogger(TasteBowmore.class);

  @Override
  public void nose() {
    LOG.debug("Nosing...");
  }

  @Override
  public void pour() {
    LOG.debug("Give him a chance...");
  }

  @Override
  public void taste() {
    LOG.debug("Here come the malt ...");
  }

}
