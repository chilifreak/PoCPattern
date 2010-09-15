package de.test.decorator;

public abstract class AbstractDecorator
  implements Component {

  protected Component component;

  public AbstractDecorator(Component component) {
    this.component = component;
  }

}
