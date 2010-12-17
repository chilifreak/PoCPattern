package de.test.composite;

public interface Component {

  public void execute();

  void add(Component component);

  Component getChild(int position);

  void remove(int position);

}
