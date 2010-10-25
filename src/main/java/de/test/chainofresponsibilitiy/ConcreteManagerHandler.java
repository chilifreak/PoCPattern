package de.test.chainofresponsibilitiy;

public class ConcreteManagerHandler
  extends CommandHandler {

  private final double ALLOWABLE = 10 * super.base;

  @Override
  public void processRequest(CommandRequest request) {

    if (request.getAmount() < ALLOWABLE) {
      System.out.println("Manager will approve $" + request.getAmount());
    } else if (successor != null) {
      System.out.println("Delegated to successor");
      successor.processRequest(request);
    }

  }

}
