package de.test.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores the states.
 * 
 * @author u094915<br />
 *         $LastChangedBy: $<br />
 *         $Rev: $<br />
 *         $LastChangedDate: $
 */
public class Caretaker {

  private List<Object> savedStates = new ArrayList<Object>();

  public void addMemento(Object m) {
    savedStates.add(m);
  }

  public Object getMemento(int index) {
    return savedStates.get(index);
  }
}
