package de.test.flyweight;

public class FlyweightImp
  implements Flyweight {

  // private Object soldierGraphicalRepresentation;

  /**
   * Note that this method accepts soldier location Soldier Location is
   * Extrinsic and no reference to previous location or new location is
   * maintained inside the flyweight implementation
   */
  @Override
  public void moveSoldier(int previousLocationX, int previousLocationY, int newLocationX, int newLocationY) {

    // delete soldier representation from previous location 
    // then render soldier representation in new location   
  }

}
