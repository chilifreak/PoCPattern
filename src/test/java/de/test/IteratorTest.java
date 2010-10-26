package de.test;

import java.util.BitSet;

import org.junit.Test;

import de.test.iterator.BitSetIterator;

public class IteratorTest {

  @Test
  public void iterate() {
    // create BitSet and set some bits 
    BitSet bitset = new BitSet();
    bitset.set(1);
    bitset.set(3400);
    bitset.set(20);
    bitset.set(47);
    for (BitSetIterator iter = new BitSetIterator(bitset); iter.hasNext();) {
      Boolean b = iter.next();
      String tf = (b.booleanValue() ? "T" : "F");
      System.out.print(tf);
    }
  }

}
