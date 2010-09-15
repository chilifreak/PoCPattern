package de.test.observer;

public interface Observerable {

  public void register(Observer observer);

  public void remove(Observer observer);

  public void updateObserver();
}
