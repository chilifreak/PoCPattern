package de.test;

import org.junit.Test;

import de.test.composite.Compositum;
import de.test.composite.Leaf;

public class CompositeTest {

  @Test
  public void buildUpTree() {
    Compositum compositum = new Compositum("middle");
    Compositum anotherCompositum = new Compositum("root");

    Leaf leaf = new Leaf("1");
    Leaf anotherLeaf = new Leaf("2");

    compositum.add(leaf);
    compositum.add(anotherLeaf);

    anotherCompositum.add(compositum);

    anotherCompositum.execute();

  }

}
