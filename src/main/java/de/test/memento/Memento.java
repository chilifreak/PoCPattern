package de.test.memento;

/**
 * Hides implementation details.
 * 
 * @author u094915<br />
 *         $LastChangedBy: $<br />
 *         $Rev: $<br />
 *         $LastChangedDate: $
 */
public class Memento {
  private final String state;

  public Memento(String stateToSave) {
    state = stateToSave;
  }

  public String getSavedState() {
    return state;
  }
}