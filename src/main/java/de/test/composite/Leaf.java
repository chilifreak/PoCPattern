package de.test.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Leaf
  implements Component {

  private String name;

  private static final Logger LOG = LoggerFactory.getLogger(Leaf.class);

  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public void execute() {
    LOG.debug("Reached lead  " + name + " ...");
  }

}
