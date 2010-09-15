package de.test;

import org.junit.Test;

import de.test.template_method.TasteBowmore;
import de.test.template_method.Template;

public class TemplateTest {

  @Test
  public void drinkWhisky() {
    Template testee = new TasteBowmore();

    testee.enjoyWhisky();
  }

}
