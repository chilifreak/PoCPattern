package de.test;

import org.junit.Test;

import de.test.chainofresponsibilitiy.CommandRequest;
import de.test.chainofresponsibilitiy.ConcreteDirectorHandler;
import de.test.chainofresponsibilitiy.ConcreteManagerHandler;

public class ChainOfResponsibilityTest {

  @Test
  public void testChain() {

    ConcreteDirectorHandler director = new ConcreteDirectorHandler();
    ConcreteManagerHandler manager = new ConcreteManagerHandler();

    manager.setSuccessor(director);

    manager.processRequest(new CommandRequest(0, 10d, "General"));

    manager.processRequest(new CommandRequest(0, 5001d, "General"));

  }

}
