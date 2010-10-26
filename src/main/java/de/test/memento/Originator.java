package de.test.memento;

/**
 * Contains the state or the state information. Contains methods to store an
 * retrieve state information.
 * 
 * @author u094915<br />
 *         $LastChangedBy: $<br />
 *         $Rev: $<br />
 *         $LastChangedDate: $
 */
public class Originator {

  private String state;

  // The class could also contain additional data that is not part of the
  // state saved in the memento.

  public void set(String state) {
    System.out.println("Originator: Setting state to " + state);
    this.state = state;
  }

  public Memento saveToMemento() {
    System.out.println("Originator: Saving to Memento.");
    return new Memento(state);
  }

  public void restoreFromMemento(Object o) {
    if (o instanceof Memento) {
      Memento m = (Memento) o;
      state = m.getSavedState();
      System.out.println("Originator:State after restoring from Memento:" + state);
    }
  }

}
