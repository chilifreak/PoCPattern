package de.test;

import org.junit.Test;

import de.test.mediator.Consumer;
import de.test.mediator.Mediator;
import de.test.mediator.Producer;

/**
 * see http://en.wikipedia.org/wiki/Mediator_pattern
 * 
 * @author u094915<br />
 *         $LastChangedBy: $<br />
 *         $Rev: $<br />
 *         $LastChangedDate: $
 */
public class MediatorTest {

  @Test
  public void mediate() {
    Mediator mb = new Mediator();
    new Producer(mb).start();
    new Producer(mb).start();
    new Consumer(mb).start();
    new Consumer(mb).start();
    new Consumer(mb).start();
    new Consumer(mb).start();

  }

}
