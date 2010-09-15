package de.test.builder;

public class Director {

  private AbstractBuilder builder;

  public void setBuilder(AbstractBuilder builder) {
    this.builder = builder;
  }

  public Product getWhisky() {
    return builder.getWhisky();
  }

  public void constructWhisky() {
    builder.createNewWhisky();
    builder.buildAge();
    builder.buildName();
    builder.buildDistiller();
  }

}
