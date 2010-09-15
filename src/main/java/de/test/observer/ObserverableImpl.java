package de.test.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverableImpl
  implements Observerable {

  private ArrayList<Observer> observers = new ArrayList<Observer>();

  @Override
  public void register(Observer observer) {
    observers.add(observer);

  }

  @Override
  public void remove(Observer observer) {
    observers.remove(observer);

  }

  @Override
  public void updateObserver() {
    Iterator<Observer> iterator = observers.iterator();
    while (iterator.hasNext()) {
      Observer observer = iterator.next();
      observer.notify(this);
    }

  }

}
