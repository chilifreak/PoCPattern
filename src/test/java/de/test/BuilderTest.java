package de.test;

import org.junit.Test;
import static junit.framework.Assert.*;

import de.test.builder.AbstractBuilder;
import de.test.builder.BowmoreBuilder;
import de.test.builder.Director;
import de.test.builder.Product;

public class BuilderTest {

  @Test
  public void buildWhisky() {
    AbstractBuilder builder = new BowmoreBuilder();
    Director director = new Director();
    director.setBuilder(builder);
    director.constructWhisky();
    Product bowmore = director.getWhisky();
    assertNotNull("Product was null", bowmore);
    assertEquals("Got wrong name", "Darkest", bowmore.getName());
  }
}
