package de.test;

import org.junit.Test;

import de.test.state.StateContext;

public class StateTest {

  @Test
  public void changeState() {
    StateContext ctx = new StateContext();
    ctx.enjoyWhisky();
    ctx.enjoyWhisky();
    ctx.enjoyWhisky();
    ctx.enjoyWhisky();
    ctx.enjoyWhisky();
  }

}
