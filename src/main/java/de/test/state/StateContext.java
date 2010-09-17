package de.test.state;

public class StateContext {

  private State actualState;

  public StateContext() {
    actualState = new LowAlcoholState();
  }

  public void setNewState(State newState) {
    this.actualState = newState;
  }

  public void enjoyWhisky() {
    actualState.enjoyWhisky(this);
  }

}
