package de.test;

import org.junit.Test;

import de.test.bridge.Abstraction;
import de.test.bridge.ConcreteImplementor;
import de.test.bridge.Implementor;
import de.test.bridge.RefinedAbstraction;

public class BridgeTest {

  @Test
  public void buildBridge() {
    // change implementor for other implementations
    Implementor implementor = new ConcreteImplementor();
    Abstraction abstraction = new RefinedAbstraction(implementor);
    abstraction.tasteWhisky();
  }

}
