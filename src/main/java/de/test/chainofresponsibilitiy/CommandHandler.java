package de.test.chainofresponsibilitiy;

public abstract class CommandHandler {

  protected final double base = 500;
  protected CommandHandler successor;

  public void setSuccessor(CommandHandler successor) {
    this.successor = successor;
  }

  abstract void processRequest(CommandRequest request);

}
