package de.test.flyweight;

public class FlyweightFactory {

  /**
   * Pool for one soldier only if there are more soldier types this can be an
   * array or list or better a HashMap
   */
  private static Flyweight SOLDIER;

  /**
   * getFlyweight
   * 
   * @return
   */
  public static Flyweight getSoldier() {

    // this is a singleton 
    // if there is no soldier 
    if (SOLDIER == null) {

      // create the soldier 
      SOLDIER = new FlyweightImp();
    }

    // return the only soldier reference
    return SOLDIER;
  }

}
