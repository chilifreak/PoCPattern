package de.test;

import org.junit.Test;

import de.test.memento.Caretaker;
import de.test.memento.Originator;

public class MementoTest {

  @Test
  public void resurrect() {
    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();
    originator.set("State1");
    originator.set("State2");

    // get memento to save in caretaker
    caretaker.addMemento(originator.saveToMemento());

    originator.set("State3");
    caretaker.addMemento(originator.saveToMemento());

    originator.set("State4");
    caretaker.addMemento(originator.saveToMemento());

    originator.restoreFromMemento(caretaker.getMemento(1));

  }
}
