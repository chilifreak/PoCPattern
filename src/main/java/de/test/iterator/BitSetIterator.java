package de.test.iterator;

import java.util.BitSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BitSetIterator
  implements Iterator<Boolean> {

  private final BitSet bitset;
  private int index = 0;

  public BitSetIterator(BitSet bitset) {
    this.bitset = bitset;
  }

  public boolean hasNext() {
    return index < bitset.length();
  }

  public Boolean next() {
    if (index >= bitset.length()) {
      throw new NoSuchElementException();
    }
    boolean b = bitset.get(index++);
    return new Boolean(b);
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }

}
