package de.test;

import org.junit.Test;

import de.test.flyweight.FlyweightClient;

import static junit.framework.Assert.*;

public class FlyweightTest {

  @Test
  public void stringtest() {
    String fly = "fly", weight = "weight";
    String fly2 = "fly", weight2 = "weight";
    assertTrue(fly == fly2); // fly and fly2 refer to the same String instance

    assertTrue(weight == weight2); // weight and weight2 also refer to

    // the same String instance
    String distinctString = fly + weight;

    // flyweight and "flyweight" do not refer to the same instance
    assertFalse(distinctString == "flyweight");

    //  The intern() method returns a flyweight
    String flyweight = (fly + weight).intern();
    assertTrue(flyweight == "flyweight");
  }

  /**
   * see:
   * http://www.oodesign.com/flyweight-pattern-wargame-example-java-sourcecode
   * .html
   */
  @Test
  public void testSoldierFlyweight() {
// start war 

    // draw war terrain 

    // create 5 soldiers:
    FlyweightClient warSoldiers[] = {new FlyweightClient(), new FlyweightClient(), new FlyweightClient(),
      new FlyweightClient(), new FlyweightClient() };

    // move each soldier to his location 
    // take user input to move each soldier 
    FlyweightClient flyweightClient1 = warSoldiers[0];
    flyweightClient1.moveSoldier(17, 2112);

    //  take user input to move each soldier 
    warSoldiers[1].moveSoldier(137, 112);

    // note that there is only one SoldierImp ( flyweight Imp)
    // for all the 5 soldiers 
    // Soldier Client size is small due to the small state it maintains
    // SoliderImp size might be large or might be small 
    // however we saved memory costs of creating 5 Soldier representations

  }

}
