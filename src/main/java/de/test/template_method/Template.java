package de.test.template_method;

public abstract class Template {

  public void enjoyWhisky() {
    pour();
    nose();
    taste();
  }

  public abstract void pour();

  public abstract void nose();

  public abstract void taste();

}
