package de.test.mediator;

public class Producer
  extends Thread {

  private Mediator med;
  private int id;
  private static int num = 1;

  public Producer(Mediator m) {
    med = m;
    id = num++;
  }

  @Override
  public void run() {
    int num;
    while (true) {
      // store message in mediator // not directly
      med.storeMessage(num = (int) (Math.random() * 100));
      System.out.print("p" + id + "-" + num + "  ");
    }
  }

}
