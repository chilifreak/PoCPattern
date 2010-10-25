package de.test.chainofresponsibilitiy;

public class ConcreteDirectorHandler
  extends CommandHandler {

  private final double ALLOWABLE = 20 * base;

  @Override
  public void processRequest(CommandRequest request) {
    if (request.getAmount() < ALLOWABLE) {
      System.out.println("Director will approve $" + request.getAmount());
    } else if (successor != null) {
      successor.processRequest(request);
    }

  }

}
