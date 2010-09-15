package de.test.builder;

public class BowmoreBuilder
  extends AbstractBuilder {

  @Override
  public void buildAge() {
    whisky.setAge("12");

  }

  @Override
  public void buildDistiller() {
    whisky.setDistiller("Bowmore");

  }

  @Override
  public void buildName() {
    whisky.setName("Darkest");

  }

}
