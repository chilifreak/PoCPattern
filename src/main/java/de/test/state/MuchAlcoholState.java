package de.test.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuchAlcoholState
  implements State {

  private static final Logger LOG = LoggerFactory.getLogger(MuchAlcoholState.class);

  @Override
  public void enjoyWhisky(StateContext ctx) {
    LOG.debug("Tastes jummy jummy ... (HIGH) ");
    LOG.debug("Honk");
    ctx.setNewState(new LowAlcoholState());
  }

}
