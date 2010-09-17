package de.test.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LowAlcoholState
  implements State {

  private static final Logger LOG = LoggerFactory.getLogger(LowAlcoholState.class);

  @Override
  public void enjoyWhisky(StateContext ctx) {
    LOG.debug("Tastes jummy ... (LOW) ");
    ctx.setNewState(new MuchAlcoholState());
  }

}
