package de.test.builder;

public abstract class AbstractBuilder {

  protected Product whisky;

  public Product getWhisky() {
    return whisky;
  }

  public void createNewWhisky() {
    whisky = new Product();
  }

  public abstract void buildName();

  public abstract void buildAge();

  public abstract void buildDistiller();

}
