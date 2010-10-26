package de.test.mediator;

public class Consumer
  extends Thread {

  private Mediator med;
  private int id;
  private static int num = 1;

  public Consumer(Mediator m) {
    med = m;
    id = num++;
  }

  @Override
  public void run() {
    while (true) {
      // consume message from mediator
      System.out.print("c" + id + "-" + med.retrieveMessage() + "  ");
    }
  }

}
